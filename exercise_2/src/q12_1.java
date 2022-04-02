package exercise_2;
import java.util.Scanner;

public class q12_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 스캐너 객체 생성
		
		System.out.print("연산>>");
		int num1 = scan.nextInt();
		String op = scan.next();
		int num2 = scan.nextInt();
		
		String input_line = Integer.toString(num1) + op + Integer.toString(num2);
		
		if (op.equals("+")) // equals는 내용 자체를 비교, ==는 주소값을 비교
			System.out.printf(input_line + "의 계산 결과는 %d", num1 + num2);
		else if (op.equals("-")) 
			System.out.printf(input_line + "의 계산 결과는 %d", num1 - num2);
		else if (op.equals("*")) 
			System.out.printf(input_line + "의 계산 결과는 %d", num1 * num2);
		else if (op.equals("/")) 
			if (num2 == 0)
				System.out.println("0으로 나눌 수 없습니다.");
			else
				System.out.printf(input_line + "의 계산 결과는 %d", num1 / num2);
		else
			System.out.println("잘못된 연산자입니다.");
	}

}
