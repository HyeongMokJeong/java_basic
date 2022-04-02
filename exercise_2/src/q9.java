package exercise_2;
import java.util.Scanner;

public class q9 {
	public static boolean dotInCir(double mainx, double mainy, double x, double y, double rad) {
		// mainx, mainy는 원의 중심 좌표, x, y는 확인할 점의 위치 좌표, rad는 반지름의 길이
		double lenX = Math.abs(mainx - x); //x변의 길이
		double lenY = Math.abs(mainy - y); //y변의 길이
		double value = Math.sqrt(Math.pow(lenX, 2) + Math.pow(lenY, 2)); // 대각선의 길이
		
		if (value <= rad)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원의 중심과 반지름 입력>>");
		double center_x = scan.nextDouble();
		double center_y = scan.nextDouble();	
		double center_rad = scan.nextDouble();
		
		System.out.print("점 입력>>");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		if (dotInCir(center_x, center_y, x, y, center_rad)) 
			System.out.printf("점 (%.1f, %.1f)는 원 안에 있다.", x, y);
		else
			System.out.printf("점 (%.1f, %.1f)는 원 안에 없다.", x, y);
		
		
	}

}
