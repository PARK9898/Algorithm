import java.util.Scanner;

public class Problem1316refactoring2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inp = scanner.nextInt();
		int cnt = 0;
		for(int i = 0 ; i < inp ; i++)
		{
			String Word = scanner.next();
			cnt += GroupWordChecker(Word);
		}
		System.out.println(cnt);
	}

	public static int GroupWordChecker(String str) {
		boolean alp[] = new boolean[26];
		int now;
		int prev = 0;
		for (int i = 0; i < str.length(); i++) {
			now = str.charAt(i);
			if (alp[now - 'a'] == true && now == prev) {
				return 0;
			} else
				alp[now - 'a'] = true;
			now = prev;
		}
		return 1;
	}
}
