import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class ProgrammersHallOfFameProblem {
	public static void main(String[] args) {
		int[] score = {10, 100, 20, 150, 1, 100, 200};
		int[] ans = solution(3,score);
		//System.out.println(ans.toString());// 그냥 ans를 뽑으면 주소값이 나온다
		System.out.println(Arrays.toString(ans)); //이렇게 고쳐줘야 제대로 배열이 출력
	}


	public static int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];
		int[] hallOfFame = new int[k];
		List<Integer> scoreSort = new ArrayList<>();
		for(int i  = 0; i < score.length; i++) {
			scoreSort.add(score[i]);
			Collections.sort(scoreSort , Collections.reverseOrder());
			if (scoreSort.size() <= k) {
				answer[i] = scoreSort.get(scoreSort.size() -1);
			}
			else {
				for (int j = 0; j < k; j++) {
					hallOfFame[j] = scoreSort.get(j);
				}
				answer[i] = hallOfFame[k-1];
			}
		}
		return answer;
	}
}
