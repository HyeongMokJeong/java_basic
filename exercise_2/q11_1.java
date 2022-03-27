package exercise_2;
import java.util.Scanner;

public class q11_1 {
	public static String printMonth(int num) {
		if (num == 3 || num == 4 || num == 5)
			return "봄";
		else if (num == 6 || num == 7 || num == 8)
			return "여름";
		else if (num == 9 || num == 10 || num == 11)
			return "가을";
		else
			return "겨울";
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("달을 입력하세요(1~12)>>");
		int month = scan.nextInt();
		if (month > 12 || month < 1)
			System.out.print("잘못입력");
		else
			System.out.print(printMonth(month));
		
	}

}
