package exercise_4;
import java.util.Scanner;

class Grade{
	private int math, science, english;
	
	public Grade(int a, int b, int c) {
		this.math = a;
		this.science = b;
		this.english = c;
	}
	
	int average() {
		int sum = this.math + this.science + this.english;
		int result = sum / 3;
		return result;
	}
}

public class q2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scan.nextInt();
		int science = scan.nextInt();
		int english = scan.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average());
	}
}
