package exercise_2;
import java.util.Scanner;

public class q9 {
	public static boolean dotInCir(double mainx, double mainy, double x, double y, double rad) {
		// mainx, mainy�� ���� �߽� ��ǥ, x, y�� Ȯ���� ���� ��ġ ��ǥ, rad�� �������� ����
		double lenX = Math.abs(mainx - x); //x���� ����
		double lenY = Math.abs(mainy - y); //y���� ����
		double value = Math.sqrt(Math.pow(lenX, 2) + Math.pow(lenY, 2)); // �밢���� ����
		
		if (value <= rad)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �߽ɰ� ������ �Է�>>");
		double center_x = scan.nextDouble();
		double center_y = scan.nextDouble();	
		double center_rad = scan.nextDouble();
		
		System.out.print("�� �Է�>>");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		if (dotInCir(center_x, center_y, x, y, center_rad)) 
			System.out.printf("�� (%.1f, %.1f)�� �� �ȿ� �ִ�.", x, y);
		else
			System.out.printf("�� (%.1f, %.1f)�� �� �ȿ� ����.", x, y);
		
		
	}

}
