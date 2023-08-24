import java.util.Arrays;
import java.util.stream.Stream;

public class ProgrammersRunRace {

	public static void main(String[] args) {


	}
	public String[] solution(String[] players, String[] callings) {
		String[] answer = {};

		for(int i = 0; i < callings.length; i++) {
			for(int j = 0; j < players.length; j++) {
				if(callings[i].equals(players[j]) && j != 0) {
					String a = players[j];
					players[j] = players[j-1];
					players[j-1] = a;
					continue;
				}
			}
		}
		answer = players;

		return answer;
	}
}
