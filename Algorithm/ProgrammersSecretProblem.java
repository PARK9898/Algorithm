public class ProgrammersSecretProblem {
	public static void main(String[] args) {
		String answer = "";
		answer= solution("aukks"	,"wbqd",5);
		System.out.println(answer);
	}
	// 조건 1 현재 문자 s.charAt(i) ~ index 까지 검사한 후 만약에 있으면
	// skip 해주고 다음문자를 넣어주고 아니면 그냥 다음 문자를 넣어준다
	public static String solution(String s, String skip, int index) {
		String answer = "";
		// 바꿔줄 비밀문자를 일일이 일단 검사할거임
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int j = 0;
			while (j < index) {
				c += 1;
				if (c > 'z') {
					c -= 26;
				}
				if (!skip.contains(String.valueOf(c))) {
					j++;
				}
			}
			answer += c;
		}
		return answer;
	}
}
