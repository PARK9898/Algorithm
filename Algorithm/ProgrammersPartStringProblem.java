import java.util.stream.IntStream;

public class ProgrammersPartStringProblem {
	public static void main(String[] args) {
		String t = "10203";
		String p = "15";
		int a = solution(t,p);
		System.out.println(a);
	}
	public static int solution(String t, String p) {
		int pValue = Integer.parseInt(p);
		int pLength = p.length();

		return (int)IntStream.range(0, t.length() - pLength + 1)
			.mapToObj(i -> t.substring(i, i + pLength))
			.mapToInt(Integer::parseInt)
			.filter(subValue -> subValue <= pValue)
			.count();
	}
}
