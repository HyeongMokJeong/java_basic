package exercise_3;
import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�>>");
		int input = scan.nextInt();
		
		for (int i = input; i > 0; i--) {
			for (int j = i; j > 0; j--)
				System.out.print("*");
			System.out.print("\n");
		}
	}
}
