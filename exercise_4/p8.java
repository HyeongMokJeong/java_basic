package exercise_4;
import java.util.Scanner;

class Phone{
	String name;
	String tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
}

public class p8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String result = "";
		
		System.out.print("�ο���>>");
		int people = scan.nextInt();
		Phone[] phoneAry = new Phone[people];
		System.out.print("");
		
		for (int i = 0; i < people; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String input_name = scan.next();
			String tel = scan.next();
			phoneAry[i] = new Phone(input_name, tel);
		}
		System.out.println("����Ǿ����ϴ�...");
		
		while (true) {
			boolean flag = false;
			System.out.print("�˻��� �̸�>>");
			String name = scan.next();
			if (name.equals("�׸�"))
				return;
			
			for (int i = 0; i < phoneAry.length; i++) {
				if ((phoneAry[i].name).equals(name)) {
					result = name + "�� ��ȣ�� " + phoneAry[i].tel + " �Դϴ�.\n";
					flag = true;
					break;
				}
			}
			if (flag == true)
				System.out.printf(result);
			else
				System.out.printf("%s �� �����ϴ�.\n", name);
			}
		}
		
	}
