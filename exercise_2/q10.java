package exercise_2;
import java.util.Scanner;

public class q10 {
	public static boolean CircleCrash(int c1x, int c1y, int c1rad, int c2x, int c2y, int c2rad) {
		// 원 두개의 중심과 반지름을 받아서 겹치는지 판단하는 메소드
		// 두 점의 중심간의 거리(피타고라스 정리)가 두 원의 반지름의 합보다 같거나 크면 겹침
		int tri_x = Math.abs(c1x - c2x);
		int tri_y = Math.abs(c1y - c2y);
		double tri_z = Math.sqrt(tri_x * tri_x + tri_y * tri_y);
		// Math.sqrt(Math.pow(tri_x, 2) + Math.pow(tri_y, 2));
		
		if (tri_z <= c1rad + c2rad)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		int cir1_x = scan.nextInt();
		int cir1_y = scan.nextInt();
		int cir1_rad = scan.nextInt();
		
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		int cir2_x = scan.nextInt();
		int cir2_y = scan.nextInt();
		int cir2_rad = scan.nextInt();
		
		if (CircleCrash(cir1_x, cir1_y, cir1_rad, cir2_x, cir2_y, cir2_rad))
			System.out.print("두 원은 서로 겹친다");
		else
			System.out.print("두 원은 서로 겹치지 않는다.");
	}

}
