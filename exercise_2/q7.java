package exercise_2;
import java.util.Scanner;

public class q7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // scanner ��ü ����
		
		int x, y; // �Է¹��� x,y ��ǥ��
		
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻʽÿ�>>");
		x = scan.nextInt();
		y = scan.nextInt();
		
		if (100 <= x && x <= 200 && 100 <= y && y <= 200) 
			System.out.printf("(%d,%d)�� �簢�� �ȿ� �ֽ��ϴ�.", x, y);
		else
			System.out.printf("(%d,%d)�� �簢�� �ȿ� �����ϴ�.", x, y);

	}

}