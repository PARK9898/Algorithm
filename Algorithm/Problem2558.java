import java.util.Scanner;

public class Problem2558 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.printf("%d\n%d\n%d\n%d\n",a*(b%10),a*((b%100)/10),a*(b/100),a*b);
	}
}
