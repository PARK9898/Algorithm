public class ProgrammersWallPaper {
	public static void main(String[] args) {
		String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
		int[] answer = solution(wallpaper);
		System.out.println(answer[0] + "" + answer[1] + "" + answer[2] + "" + answer[3]);
	}

	public static int[] solution(String[] wallpaper) {
		int length = wallpaper[0].length();
		int hight = wallpaper.length;
		int highestHight = 0, highestLength = 0, lowestHigh = 1000, lowestLength = 1000;

		char[][] wallPaperArr = new char[hight][length];
		for (int i = 0; i < hight; i++) {
			for (int j = 0; j < length; j++) {
				if (wallpaper[i].charAt(j) == '#') {
					highestHight = Math.max(highestHight, i);
					lowestHigh = Math.min(lowestHigh, i);
					highestLength = Math.max(highestLength, j);
					lowestLength = Math.min(lowestLength, j);
				} // 내가 필요한것은 배열 중 제일 왼쪽에 위치한 # 과 제일 아래쪽에 위치한 #
			}
		}
		int[] answer = {lowestHigh, lowestLength, highestHight + 1, highestLength + 1};
		return answer;
	}
}
