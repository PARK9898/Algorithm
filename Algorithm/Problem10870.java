import java.util.Scanner;

public class Problem10870 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println(fibonachi(a));
	}
	public static int fibonachi(int n){
		if(n==1 || n ==0)
			return n;
		else
			return fibonachi(n-2) + fibonachi(n-1);

	}
}
