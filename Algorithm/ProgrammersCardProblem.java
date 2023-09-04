import java.util.HashMap;
import java.util.Map;

public class ProgrammersCardProblem {
	public static void main(String[] args) {
		String[] cards1 = new String[] {"i", "water", "drink"};
		String[] cards2 = new String[] {"want", "to"};
		String[] goal = new String[] {"i", "want", "to", "drink", "water"};
		String ans = solution(cards1,cards2,goal);
		System.out.println(ans);
	}

	public static String solution(String[] cards1, String[] cards2, String[] goal) {
		int i = 0;
		String answer = "";
		Map<String,Integer> goalMap = new HashMap<>();
		for (String s : goal) {
			goalMap.put(s, i);
			i++;
		}
		if(conditionDertermination(cards1,goalMap)&&conditionDertermination(cards2,goalMap)) {
			answer += "Yes";
			return answer;
		}
		answer += "No";
		return answer;
	}

	public static boolean conditionDertermination(String[] cards, Map<String, Integer> goalMap) {
		boolean result = true;
		for(int i = 0; i < cards.length; i++) {
			for(int j = i ; j >= 0; j-- ) {
				if (goalMap.containsKey(cards[i]) && goalMap.containsKey(cards[j])) {
					if (goalMap.get(cards[i]) < goalMap.get(cards[j])) {
						return false;
					}
				}
				if (!goalMap.containsKey(cards[j]) && goalMap.containsKey(cards[i])) {
					return false;
				}
			}
		}
		return result;
	}
}
