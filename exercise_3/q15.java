package exercise_3;
import java.util.Scanner;

public class q15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0; 
		int m = 0;
		
		while(true){
			try {
				System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
				n = scan.nextInt();
				m = scan.nextInt();
				break;
			}
			catch (java.util.InputMismatchException e){
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				scan.nextLine();
			}
		}
		System.out.print(n + "x" + m + "=" + n*m);
		scan.close();
	}

}
