package exercise_3;
import java.util.Random;
import java.util.Scanner;

public class open_challenge {
	public static void main(String[] args) {
		Random r = new Random(); // Random ��ü ����
		Scanner scan = new Scanner(System.in);

		while (true){
			int min = 0;
			int max = 99;
			int num = r.nextInt(100); // 0~99������ ���� ���� ����
			System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
			for (int i = 1;;i++) {
				System.out.printf("%d-%d\n", min, max);
				System.out.printf("%d>>", i);
				int input_num = scan.nextInt();
				if (input_num < num) {
					System.out.println("�� ����");
					min = input_num;
				}
				else if (input_num > num) {
					System.out.println("�� ����");
					max = input_num;
				}
				else {
					System.out.println("�¾ҽ��ϴ�.");
					break;
				}
			}
			System.out.print("�ٽ��Ͻðڽ��ϱ�(y/n)>>");
			String y_n = scan.next();
			if (y_n.equals("y"))
				continue;
			else if (y_n.equals("n"))
				break;
		}
	}

}
