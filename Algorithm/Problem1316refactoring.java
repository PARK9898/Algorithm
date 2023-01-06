import java.util.Scanner;

public class Problem1316refactoring {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inp = scanner.nextInt();
		int cnt = 0;
		String Word;
		String[] arr = new String[0];
		for(int i = 0; i<inp ; i++){
			Word = scanner.next();
			arr = Word.split("");
			cnt += GroupWordValidator(arr);
		}
		System.out.println(cnt);
	}

	public static int GroupWordValidator(String[] str){
		boolean y = false;
		for(int x = 0 ; x < str.length ; x++) {
			for (int a = 0; a <str.length; a++) {
				y = WordIsEquals(str,y,x,a);
				if (str[x].equals(str[a]) && a-x >=2 && y) {
					return 0;
					}
				}
			}
		return 1;
		}
	public static boolean WordIsEquals(String[] str, boolean y, int x, int a) {
		int z = x + 1;
		while (z <= a - 1) {
			if (!str[z].equals(str[x])) {
				y = true;
				break;
			} else {
				y = false;
				z++;
			}
		}
		return y;
	}
}
