import java.util.Scanner;

public class Problem2884 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		if (H < 0 || H > 23 || M < 0 || M > 60) {
			throw new Exception("잘못된 입력입니다");
		}
		int NH;
		int NM;
		if(M<45 && H>0)
		{
			NH = H-1;
			NM = 60 - (45-M);
		}
		else if(M>=45)
		{
			NH = H;
			NM = M-45;
		}
		else
		{
			NH = 23;
			NM = 60 - (45-M);
		}
		System.out.printf("%d %d",NH,NM);
	}
}
