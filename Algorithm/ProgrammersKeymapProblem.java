import java.util.HashMap;
import java.util.Map;

public class ProgrammersKeymapProblem {
	public int[] solution(String[] keymap, String[] targets) {
		int[] answer = new int[targets.length] ;
		Map<Character,Integer> map = new HashMap<>();
		int j = 0;
		for (String s : keymap) {
			for(int i = 0; i < s.length(); i++) {
				if(!map.containsKey(s.charAt(i))) {
					map.put(s.charAt(i), i + 1);
				}
				if(map.get(s.charAt(i)) > i + 1) {
					map.put(s.charAt(i), i + 1);
				}
			}
		}// 키맵에 다 넣어줬음
		for (String target : targets) {
			int result = 0;
			for(int i = 0; i < target.length(); i++) {
				if(!map.containsKey(target.charAt(i))) {
					result = -1;
					break;
				}
				if(map.containsKey(target.charAt(i))) {
					result += map.get(target.charAt(i));
				}

			}
			answer[j] = result;
			j++;
		}
		return answer;
	}
}
