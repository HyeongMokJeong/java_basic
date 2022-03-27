package exercise_2;
import java.util.Scanner;

public class q7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // scanner 객체 생성
		
		int x, y; // 입력받을 x,y 좌표값
		
		System.out.print("점 (x,y)의 좌표를 입력하십시오>>");
		x = scan.nextInt();
		y = scan.nextInt();
		
		if (100 <= x && x <= 200 && 100 <= y && y <= 200) 
			System.out.printf("(%d,%d)는 사각형 안에 있습니다.", x, y);
		else
			System.out.printf("(%d,%d)는 사각형 안에 없습니다.", x, y);

	}

}