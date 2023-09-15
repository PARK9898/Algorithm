import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgrammersPaintProblem {
	public static void main(String[] args) {
		int n = 8 , m = 4;
		int[] section = {2,3,6};
		int result = solution(8,4,section);
		System.out.println(result);
	}

	public static int solution(int n, int m, int[] section) {
		var rollerLength = m;
		var wallLength = n;
		var position = 0; // 어디까지 칠해져있는지를 판단
		var rollNumber = 0;
		for(int i = 0; i < section.length; i++) {
			if(section[i] + rollerLength - 1 <= wallLength && section[i] > position) {
				position = section[i] + rollerLength - 1;
				rollNumber++;
			}
			else if(section[i] > position){
					rollNumber++;
					break;
			}
		}
		return rollNumber;
	}//section[i] + roolerLength - 1 -> i 번쨰 기준으로 칠해지는 넓이
}
