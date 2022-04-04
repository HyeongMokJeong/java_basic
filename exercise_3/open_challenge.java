package exercise_3;
import java.util.Random;
import java.util.Scanner;

public class open_challenge {
	public static void main(String[] args) {
		Random r = new Random(); // Random 객체 생성
		Scanner scan = new Scanner(System.in);

		while (true){
			int min = 0;
			int max = 99;
			int num = r.nextInt(100); // 0~99까지의 랜덤 정수 생성
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			for (int i = 1;;i++) {
				System.out.printf("%d-%d\n", min, max);
				System.out.printf("%d>>", i);
				int input_num = scan.nextInt();
				if (input_num < num) {
					System.out.println("더 높게");
					min = input_num;
				}
				else if (input_num > num) {
					System.out.println("더 낮게");
					max = input_num;
				}
				else {
					System.out.println("맞았습니다.");
					break;
				}
			}
			System.out.print("다시하시겠습니까(y/n)>>");
			String y_n = scan.next();
			if (y_n.equals("y"))
				continue;
			else if (y_n.equals("n"))
				break;
		}
	}

}
