import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem25206 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String strs[] = new String[50];
		double Total_score = 0;

		double Total_Time = 0;

		List<Subject> subjects = new ArrayList<Subject>();

		for(Subject s : subjects) {
			int i = 0;
			strs[i] = bfr.readLine();
			StringTokenizer st = new StringTokenizer(strs[i], " ");
			s.setSubject_name(st.nextToken());
			s.setTime(Double.parseDouble(st.nextToken()));
			s.setScore(st.nextToken());
			i++;
		}

		for(Subject s : subjects) {
			String str = s.getScore();
			switch (str) {
				case "A+":
					s.setScoreToDouble(4.5);
					break;
				case "A0":
					s.setScoreToDouble(4.0);
					break;
				case "B+":
					s.setScoreToDouble(3.5);
					break;
				case "B0":
					s.setScoreToDouble(3.0);
					break;
				case "C+":
					s.setScoreToDouble(2.5);
					break;
				case "C0":
					s.setScoreToDouble(2.0);
					break;
				case "D+":
					s.setScoreToDouble(1.5);
					break;
				case "D0":
					s.setScoreToDouble(1.0);
					break;
				case "F":
					s.setScoreToDouble(0.0);
					break;
			}
		}
		for(Subject s : subjects) {
			if(s.getScore() != "P")
			{
				Total_Time += s.getTime();
				Total_score += s.getScoreToDouble() * s.getTime();
			}
		}

		System.out.println(Total_score/Total_Time);
		bfr.close();
	}

	public static class Subject{
		String Subject_name; // 과목명
		String Score; // 과목 평점
		double Time; // 학점
		double ScoreToDouble; //스코어를 더블로 변환

		public void setSubject_name(String subject_name) {
			Subject_name = subject_name;
		}

		public void setScore(String score) {
			Score = score;
		}

		public void setTime(double time) {
			Time = time;
		}

		public String getSubject_name() {
			return Subject_name;
		}

		public String getScore() {
			return Score;
		}

		public double getTime() {
			return Time;
		}
		public double getScoreToDouble(){
			return ScoreToDouble;
		}

		public void setScoreToDouble(double scoreToDouble) {
			ScoreToDouble = scoreToDouble;
		}

		public Subject(String subject_name, String score, double time, double scoretodouble) {
			Subject_name = subject_name;
			Score = score;
			Time = time;
			ScoreToDouble = scoretodouble;
		}
	}
}
