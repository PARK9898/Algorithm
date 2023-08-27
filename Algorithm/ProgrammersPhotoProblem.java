import java.util.HashMap;
import java.util.Map;

public class ProgrammersPhotoProblem {
	public static void main(String[] args) {
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {{"may"},{"kein", "deny", "may"},{"kon", "coni"}};
		int[] answer = solution(name,yearning,photo);
		for (int i : answer) {
			System.out.println(i);
		}
	}
	public static int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < name.length; i++) {
			map.put(name[i],yearning[i]);
		}
		for(int i = 0; i < photo.length; i++) {
			int value = 0;
			for(int j = 0; j <photo[i].length; j++) {
				System.out.println(photo[i][j]);
				if(map.containsKey(photo[i][j])) {
					value += map.get(photo[i][j]);
				}
			}
			answer[i] = value;
		}
		return answer;
	}
}
