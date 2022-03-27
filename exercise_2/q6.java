package exercise_2;
import java.util.Scanner;

public class q6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numCount = 0; //numCount는 3, 6, 9의 개수 저장하는 변수
		
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int inputNum = scan.nextInt();
		
		if (inputNum / 10 == 3 || inputNum / 10 == 6 || inputNum / 10 == 9) {
			// 십의 자리가 3, 6, 9 이면
			numCount ++;
		}
		if (inputNum % 10 == 3 || inputNum % 10 == 6 || inputNum % 10 == 9) {
			// 일의 자리가 3, 6, 9 이면
			numCount ++;
		}
		
		if (numCount == 2)
			System.out.println("박수짝짝");
		else if (numCount ==1)
			System.out.println("박수짝");
		else
			System.out.println(inputNum);
	}

}
