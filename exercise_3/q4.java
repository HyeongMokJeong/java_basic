package exercise_3;
import java.util.Scanner;

public class q4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String input = scan.next();
		char c = input.charAt(0);
		
		for (char i = c; i >= 97; i--) {
			for (char j = 97; j <= i; j++)
				System.out.print(j);
			System.out.print("\n");
		}
	}
}
