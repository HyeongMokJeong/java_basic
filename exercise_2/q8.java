package exercise_2;
import java.util.Scanner;

public class q8 {
	
	public static boolean inRect(int x, int y, int rectx1, int rectx2, int recty1, int recty2) {
	// ��(x, y)�� �簢���� �浹 �˻� �޼ҵ�
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2)){
			return true;
		}
		else return false;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // ��ĳ�� ��ü ����
		
		System.out.print("�� (x1, y1)�� �������� �����Ͽ� �Է��ϼ���.: ");
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		
		System.out.print("�� (x2, y2)�� �������� �����Ͽ� �Է��ϼ���.: ");
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		
		if (inRect(x1, y1, 100, 200, 100, 200)) 
			System.out.printf("(%d, %d), (%d, %d)�� ���簢���� ���� ���簢���� �浹�մϴ�.", x1, y1, x2, y2);
		else {
			if (inRect(x2, y2, 100, 200, 100, 200))
				System.out.printf("(%d, %d), (%d, %d)�� ���簢���� ���� ���簢���� �浹�մϴ�.", x1, y1, x2, y2);
			else
				System.out.println("���簢���� �浹���� �ʽ��ϴ�.");
		}
			
		
	}

}
