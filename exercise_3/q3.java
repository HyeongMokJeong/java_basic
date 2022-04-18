package exercise_3;
import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오>>");
		int input = scan.nextInt();
		
		for (int i = input; i > 0; i--) {
			for (int j = i; j > 0; j--)
				System.out.print("*");
			System.out.print("\n");
		}
	}
}
