import java.util.Scanner;

public class Problem10872 {
	public static void main(String[] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		System.out.println(Fact(a));
	}
	public static int Fact(int n){

		if(n<=1)
			return n;
		else
			return Fact(n-1)*n;
	}
}
