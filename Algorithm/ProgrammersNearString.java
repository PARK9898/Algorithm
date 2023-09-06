public class ProgrammersNearString {
	public static void main(String[] args) {

	}

	public int[] solution(String s) {
		int[] answer = new int[s.length()];
		for(int i = 0; i < s.length(); i++) {
			int min = 10000;
			for(int j = i - 1; j >= 0; j--) {
				if(j == -1) {
					continue;
				}
				if(s.charAt(i) == s.charAt(j))
				{
					min = i - j;
					break;
				}
			}
			if(min == 10000) {
				answer[i] = -1;
			}else {
				answer[i] += min;
			}
		}
		return answer;
	}
}
