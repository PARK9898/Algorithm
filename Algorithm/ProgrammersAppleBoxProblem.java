import static java.util.Collections.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ProgrammersAppleBoxProblem {
	public static void main(String[] args) {

	}
	public static int solution(int k, int m, int[] score) {
		int answer = 0;
		int appleNumber =score.length;
		int boxNumber = appleNumber/m;

		List<Integer> appleList = Arrays.stream(score).boxed().toList();

		appleList.sort(Collections.<Integer>reverseOrder());

		answer += appleList.get(m-1) * m;

		return answer;
	}
}
