
import java.util.HashMap;
import java.util.Map;


public class ProgrammersRunRace {

	public String[] solution(String[] players, String[] callings) {
		Map<String, Integer> playerIndices = new HashMap<>();

		for (int i = 0; i < players.length; i++) {
			playerIndices.put(players[i], i);
		}
		// 맵에 플레이어 순서대로 넣어준다 리스트가 아님
		for (String calling : callings) {
			int callingIndex = playerIndices.get(calling); // 현재 선수의 위치
			if (callingIndex != 0) {
				String temp = players[callingIndex];
				players[callingIndex] = players[callingIndex - 1];
				players[callingIndex - 1] = temp; // 현재 선수의 위치와 현재 선수 앞의 위치를 바꿔준다.
				playerIndices.put(calling, callingIndex - 1); // 키값을 업데이트 해준다.
				playerIndices.put(players[callingIndex], callingIndex);
			}
		}

		return players;

	}

}
