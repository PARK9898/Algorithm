import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class programers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Solution s = new Solution();
		int[] result = s.solution(a, b);
		System.out.println(Arrays.toString(result));
	}

}

class Solution {
	public int[] solution(int l, int r) {
		char[] sup = new char[7];
		List<Integer> anslist = new ArrayList<>();
		char a;
		int j;

		for(int i = l; i <= r; i++) {
			String numberString = String.valueOf(i);
			for(int k = 0; k < numberString.length(); k++) {
				a = numberString.charAt(k);
				sup[k] = a;
			}

			for(j = 0; j < 7; j++) {
				if(sup[j] == '0' || sup[j] == '5' || sup[j] == 0) {
					continue;
				} else {
					break;
				}
			}
			if(j == 7) {
				anslist.add(i);
			}
		}

		int[] answer = new int[anslist.size()];

		for(int z = 0; z < anslist.size(); z++) {
			answer[z] = anslist.get(z);
		}
		if(anslist.isEmpty()){
			int [] ans = {-1};
			return ans;
		}else{
			return answer;
		}
	}
}