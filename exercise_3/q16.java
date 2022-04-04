package exercise_3;
import java.util.Scanner;

public class q16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while (true) {
			System.out.print("가위 바위 보!>>");
			String input = scan.nextLine();
			if (input.equals("그만"))
				break;
			int n = (int)(Math.random()*3);
			String text = ("사용자 = " + input + " , 컴퓨터 = " + str[n] + ", ");
			
			if (input.equals(str[n])) {
				System.out.println(text + "비겼습니다.");
			}
			else {
				switch (input) {
				case "가위":
					if (n==1) {// 컴퓨터 바위
						System.out.println(text + "컴퓨터가 이겼습니다.");
						break;
					}
					else{ // 컴퓨터 보
						System.out.println(text + "사용자가 이겼습니다.");
						break;
					}
				case "바위":
					if (n==0) {// 컴퓨터 가위
						System.out.println(text + "사용자가 이겼습니다.");
						break;
					}
					else{ // 컴퓨터 보
						System.out.println(text + "컴퓨터가 이겼습니다.");
						break;
					}
				case "보":
					if (n==0) {// 컴퓨터 가위
						System.out.println(text + "컴퓨터가 이겼습니다.");
						break;
					}
					else{ // 컴퓨터 바위
						System.out.println(text + "사용자가 이겼습니다.");
						break;
					}
				}
			
		}
		}
		System.out.print("게임을 종료합니다...");
	}
}