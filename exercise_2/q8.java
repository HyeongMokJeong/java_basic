package exercise_2;
import java.util.Scanner;

public class q8 {
	
	public static boolean inRect(int x, int y, int rectx1, int rectx2, int recty1, int recty2) {
	// 점(x, y)와 사각형의 충돌 검사 메소드
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2)){
			return true;
		}
		else return false;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 스캐너 객체 생성
		
		System.out.print("점 (x1, y1)을 공백으로 구분하여 입력하세요.: ");
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		
		System.out.print("점 (x2, y2)를 공백으로 구분하여 입력하세요.: ");
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		
		if (inRect(x1, y1, 100, 200, 100, 200)) 
			System.out.printf("(%d, %d), (%d, %d)의 직사각형은 기준 직사각형과 충돌합니다.", x1, y1, x2, y2);
		else {
			if (inRect(x2, y2, 100, 200, 100, 200))
				System.out.printf("(%d, %d), (%d, %d)의 직사각형은 기준 직사각형과 충돌합니다.", x1, y1, x2, y2);
			else
				System.out.println("직사각형과 충돌하지 않습니다.");
		}
			
		
	}

}
