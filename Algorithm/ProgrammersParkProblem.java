import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ProgrammersParkProblem {
	public static void main(String[] args) {
		String[] park = {"SOOO","OOOO","OOXX"};
		String[] route = {"E 1","E 1","E 1","E 1"};
		int[] result = solution(park,route);
		System.out.println(result[0] + "" + result[1]);
	}
	public static int[] solution(String[] park, String[] routes) {
		int[] answer = {};
		int dogPosition[] = new int[2];
		int length = park[0].length(); // 공원의 가로 길이
		int high = park.length; // 공원의 세로 길이

		// temp 안에 위치를 표시 S = 현재위치 , X = 장애물 , O = 지나 갈 수 있는 경로
		// 이제 루트에 따라서 S의 위치를 변경 해줄거임 S = 밑으로 이동(high +) N = 위로 이동(high -) W = 왼쪽이동(lenght -) E = 오른쪽이동 (lenght +)
		dogPosition = getDogPosition(park,high,length);
		for (String route : routes) {
			String[] parts = route.split(" ");
			String direction = parts[0];
			int moveNumber = Integer.parseInt(parts[1]);
			// 가야하는 방향과 횟수를 차례대로 꺼내줌
			boolean go = true;
			System.out.println(dogPosition[0] + "" + dogPosition[1]);
			switch (direction) {
				case "E": // 가는 길에도 x 가 있으면 안된다 그자리가 무조건 x여야하는것은 아님
					if(dogPosition[1] + moveNumber < length) {
						for(int i = dogPosition[1]; i <= dogPosition[1] + moveNumber ; i++) {
							if(park[dogPosition[0]].charAt(i) == 'X') {
								go = false;
								break;
							}
						}
						if(go) {
							dogPosition[1] += moveNumber;
						}
					}
					break;
				case "W":
					if(dogPosition[1]-moveNumber >= 0) {
						for(int i = dogPosition[1]; i >= dogPosition[1] - moveNumber; i--) {
							if(park[dogPosition[0]].charAt(i) == 'X') {
								go = false;
								break;
							}
						}
						if (go) {
							dogPosition[1] -= moveNumber;
						}
					}
					break;
				case "S":
					if(dogPosition[0]+ moveNumber < high) {
						for(int i = dogPosition[0]; i <= dogPosition[0] + moveNumber; i++) {
							if(park[i].charAt(dogPosition[1]) == 'X') {
								go = false;
								break;
							}
						}
						if(go) {
							dogPosition[0] += moveNumber;
						}
					}
					break;
				case "N":
					if(dogPosition[0]-moveNumber >= 0) {
						for(int i = dogPosition[0]; i >= dogPosition[0] - moveNumber; i--) {
							if(park[i].charAt(dogPosition[1])=='X') {
								go = false;
								break;
							}
						}
						if(go) {
							dogPosition[0] -= moveNumber;
						}
					}
					break;
			}
			System.out.println(dogPosition);
		}
		return dogPosition;
	}

	public static int[] getDogPosition(String[] park, int high, int lenght) {
		int[] nowPosition = new int[2];
		for(int i = 0 ; i < high; i++) {
			for(int j = 0 ; j <lenght ; j++) {
				if(park[i].charAt(j) == 'S') {
					nowPosition[0] = i;
					nowPosition[1] = j; // 현재 강아지의 위치를 반환
				}
			}
		}
		return nowPosition;
	}
}
