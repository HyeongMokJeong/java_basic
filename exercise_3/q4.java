package exercise_3;
import java.util.Scanner;

public class q4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		String input = scan.next();
		char c = input.charAt(0);
		
		for (char i = c; i >= 97; i--) {
			for (char j = 97; j <= i; j++)
				System.out.print(j);
			System.out.print("\n");
		}
	}
}
