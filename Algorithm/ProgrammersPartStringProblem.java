

public class ProgrammersPartStringProblem {
	public static void main(String[] args) {
		String t = "10203";
		String p = "15";
		int a = solution(t,p);
		System.out.println(a);
	}
	public static int solution(String t, String p) {
		int answer = 0;
		int pValue = Integer.parseInt(p);
		for(int i = 0; i <= t.length() - p.length(); i++) {
			String tSubString = "";
			for(int j = 0; j < p.length(); j++) {
				tSubString += t.charAt(i + j);
			}
			if(Integer.parseInt(tSubString) <= pValue) {
				answer++;
			}
		}
		return answer;
	}
}
