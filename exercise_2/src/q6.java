package exercise_2;
import java.util.Scanner;

public class q6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numCount = 0; //numCount�� 3, 6, 9�� ���� �����ϴ� ����
		
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int inputNum = scan.nextInt();
		
		if (inputNum / 10 == 3 || inputNum / 10 == 6 || inputNum / 10 == 9) {
			// ���� �ڸ��� 3, 6, 9 �̸�
			numCount ++;
		}
		if (inputNum % 10 == 3 || inputNum % 10 == 6 || inputNum % 10 == 9) {
			// ���� �ڸ��� 3, 6, 9 �̸�
			numCount ++;
		}
		
		if (numCount == 2)
			System.out.println("�ڼ�¦¦");
		else if (numCount ==1)
			System.out.println("�ڼ�¦");
		else
			System.out.println(inputNum);
	}

}
