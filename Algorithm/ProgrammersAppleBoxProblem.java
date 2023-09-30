

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProgrammersAppleBoxProblem {
	public static void main(String[] args) {
		int k = 4;
		int m  = 3;
		int[] score = {4,1,2,2,4,4,4,4,1,2,4,2};
		int a = solution(k,m,score);
		System.out.println(a);
	}
	public static int solution(int k, int m, int[] score) {
		int answer = 0;
		int appleNumber =score.length;
		int boxNumber = appleNumber/m;

		List<Integer> appleList = Arrays.stream(score).boxed().collect(Collectors.toList());

		Collections.sort(appleList, Comparator.reverseOrder());
		for(int i = 1; i <= boxNumber; i++) {
			int j = m;
			j *= i;
			answer += appleList.get(j - 1) * m;

		}

		return answer;
	}
}
