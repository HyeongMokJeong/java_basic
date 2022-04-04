package exercise_3;
import java.util.Scanner;

public class q15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0; 
		int m = 0;
		
		while(true){
			try {
				System.out.print("곱하고자 하는 두 수 입력>>");
				n = scan.nextInt();
				m = scan.nextInt();
				break;
			}
			catch (java.util.InputMismatchException e){
				System.out.println("실수는 입력하면 안됩니다.");
				scan.nextLine();
			}
		}
		System.out.print(n + "x" + m + "=" + n*m);
		scan.close();
	}

}
