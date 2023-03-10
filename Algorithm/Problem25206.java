import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Problem25206 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Subject> subjects = new ArrayList<Subject>();

		for(Subject s : subjects) {
			String a = scanner.next();
			String[] ch = a.split(" ");
			subjects.add(new Subject(ch[0],ch[1],Integer.parseInt(ch[2]),0 ));
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
	}

	public static class Subject{
		String Subject_name; // 과목명
		String Score; // 과목 평점
		double Time; // 학점
		double ScoreToDouble; //스코어를 더블로 변환

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
