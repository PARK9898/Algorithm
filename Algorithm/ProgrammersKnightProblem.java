import java.util.ArrayList;
import java.util.List;

public class ProgrammersKnightProblem {
	public static void main(String[] args) {
		int result;
		result = solution(10,3,2);
		System.out.println(result);
	}

	public static int solution(int number, int limit, int power) {
		int answer = 0;
		int measure = 0;
		List<Integer> measureList = new ArrayList<>();
		for(int i = 1; i <= number; i++) {
			measure = 0;
			for(int j = 1; j * j <= i; j++) {
				if(j * j == i) {
					measure++;
				}
				else if(i % j == 0) {
					measure += 2;
				}
			}
			if(measure <= limit) {
				measureList.add(measure);
			}else {
				measureList.add(power);
			}

		}
		return measureList.stream().mapToInt(Integer::intValue).sum();
	}
}
