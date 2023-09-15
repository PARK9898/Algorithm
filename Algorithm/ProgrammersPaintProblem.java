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
		int answer = 0;
		Integer[] board = new Integer[n];
		
		int rollNumber = 0;

		for (int i = 0; i < board.length; i++) {
			for(int j = 0; j < section.length; j++) {
				if(section[j] == i) {
					board[i] = 1; // 1은 색칠해야할 색션을 의미한다
				}
			}
		}
		int last = findLast(board);
		for(int i  = 0; i  < board.length; i++) {
			if(board[i] == 1 && i + n < board.length) {
				for(int j = i; j < i + n; j++) {
					if(board[j] == 1) {
						board[j] = 0;
					}
				}
				rollNumber++;
			}
			else if(board[i] == 1 && i + n > board.length) {
				for(int k = last; k > last - n; k--) {
					if(board[k] == 1) {
						board[k] = 0;
					}
				}
				rollNumber++;
				break;
			}
		}
		return rollNumber;
	}

	public static int findLast(Integer[] board) {
		int last = 0;
		for(int i = 0; i < board.length;) {
			if(board[i] == 1) {
				last = i;
			}
		}
		return last;
	}
}
