package exercise_2;

import java.util.Scanner;

public class q12_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // ��ĳ�� ��ü ����
		
		System.out.print("����>>");
		int num1 = scan.nextInt();
		String op = scan.next();
		int num2 = scan.nextInt();
		
		String input_line = Integer.toString(num1) + op + Integer.toString(num2);
		
		switch (op){
			case "+":
				System.out.printf(input_line + "�� ��� ����� %d", num1 + num2);
				break;
			case "-":
				System.out.printf(input_line + "�� ��� ����� %d", num1 - num2);
				break;
			case "*":
				System.out.printf(input_line + "�� ��� ����� %d", num1 * num2);
				break;
			case "/":
				if (num2 == 0)
					System.out.println("0���� ���� �� �����ϴ�.");
				else
					System.out.printf(input_line + "�� ��� ����� %d", num1 / num2);
				break;
			default:
				System.out.println("�߸��� �������Դϴ�.");
	
		}
		
	}

}
