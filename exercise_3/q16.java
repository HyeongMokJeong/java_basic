package exercise_3;
import java.util.Scanner;

public class q16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str[] = {"����", "����", "��"};
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while (true) {
			System.out.print("���� ���� ��!>>");
			String input = scan.nextLine();
			if (input.equals("�׸�"))
				break;
			int n = (int)(Math.random()*3);
			String text = ("����� = " + input + " , ��ǻ�� = " + str[n] + ", ");
			
			if (input.equals(str[n])) {
				System.out.println(text + "�����ϴ�.");
			}
			else {
				switch (input) {
				case "����":
					if (n==1) {// ��ǻ�� ����
						System.out.println(text + "��ǻ�Ͱ� �̰���ϴ�.");
						break;
					}
					else{ // ��ǻ�� ��
						System.out.println(text + "����ڰ� �̰���ϴ�.");
						break;
					}
				case "����":
					if (n==0) {// ��ǻ�� ����
						System.out.println(text + "����ڰ� �̰���ϴ�.");
						break;
					}
					else{ // ��ǻ�� ��
						System.out.println(text + "��ǻ�Ͱ� �̰���ϴ�.");
						break;
					}
				case "��":
					if (n==0) {// ��ǻ�� ����
						System.out.println(text + "��ǻ�Ͱ� �̰���ϴ�.");
						break;
					}
					else{ // ��ǻ�� ����
						System.out.println(text + "����ڰ� �̰���ϴ�.");
						break;
					}
				}
			
		}
		}
		System.out.print("������ �����մϴ�...");
	}
}