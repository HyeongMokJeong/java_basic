package exercise_2;
import java.util.Scanner;

public class q11_2 {
	public static String printMonth(int num) {
		String mon = null;
		switch (num) {
		case 3: case 4: case 5:
			mon = "��";
			break;
		case 6: case 7: case 8:
			mon = "����";
			break;
		case 9: case 10: case 11:
			mon = "����";
			break;
		case 12: case 1: case 2:
			mon = "�ܿ�";
			break;
		}
		return mon;
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���(1~12)>>");
		int month = scan.nextInt();
		if (month < 1 || month > 12)
			System.out.print("�߸��Է�");
		else
			System.out.print(printMonth(month));
	}

}
