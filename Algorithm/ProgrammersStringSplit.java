public class ProgrammersStringSplit {
	public static void main(String[] args) {
		String s = "abracadabra";
		int a = solution(s);
		System.out.println(a);
	}
	public static int solution(String s) {
		int answer = 0;
		String stopOrContinue = s;
		while (true) {
			stopOrContinue = splitString(stopOrContinue);
			if(stopOrContinue.equals("no")) {
				answer++;
				break;
			}
			answer++;
		}
		return answer;
	}

	public static String splitString(String s) {
		int position = 0;
		int countFirst = 1;
		int countElse = 0;
		for(int i = 0; i < s.length(); i++) {
			char first = s.charAt(0);
			if (first != s.charAt(i) && i >= 1) {
				countElse++;
				if (countElse == countFirst) {
					position = i;
					if(position == s.length()-1) {
						return "no";
					}
					return s.substring(position + 1);
				}
			} else if (first == s.charAt(i) && i >= 1) {
				countFirst++;
			}
		}
		return "no";
	}
}
// 설계
// 일단 처음 문자열을 받은 다음에 그 문자열이랑 같으면 countFirost++ 해준다
// 그 다음부터 문자열을 계속 받는다 countElse는 다른 문자열일 경우 ++ 헤준다
// 언제까지 ? countFisrt와 coountElse가 같아질때까지 !
// 그리고 만약 그 string 의 마지막 charat 까지 갔는데 countFirst와 countELse가 같아지지 않는다면 answer을 ++ 해준다
