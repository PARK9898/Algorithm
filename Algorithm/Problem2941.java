import java.util.Scanner;

public class Problem2941 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String croatia;
		int count; // 문자열 개수를 저장할 int 형 변수
		croatia = scanner.next();
		croatia = croatia.replace("c=","x");// replace는 특정 문자열을 자신이 원하는 문자열로 교체해준다 해당 크로아티아 문제들을 다 x로 교체
		croatia = croatia.replace("c-","x");
		croatia = croatia.replace("dz=","x");
		croatia = croatia.replace("d-","x");
		croatia = croatia.replace("lj","x");
		croatia = croatia.replace("nj","x");
		croatia = croatia.replace("s=","x");
		croatia = croatia.replace("z=","x");
		count = croatia.length();
		System.out.println(count);

	}
}
