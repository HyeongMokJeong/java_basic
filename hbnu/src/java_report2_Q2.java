import java.util.Scanner;

public class java_report2_Q2 {
	
	public static double getunit(double cm, double kg) {
		// Unit 계산하는 메소드
		return (double)(kg / (cm - 100));
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int student = 5; // 수강생 수
		int lowWeight = 0, stdWeight = 0, overWeight = 0;

		// student 수만큼 입출력
		for(int i=1; i <= student; i++) {
			System.out.println(i + "번째 학생");
			System.out.print("키를 입력하세요.: ");
			double user_Height = scan.nextDouble();
			System.out.print("체중을 입력하세요.: ");
			double user_Weight = scan.nextDouble();
			
			// 유닛 계산
			double user_Unit = getunit(user_Height, user_Weight);
			
			// 결과 계산하여 출력
			if (0.60 <= user_Unit && user_Unit<= 0.79) {
				System.out.printf("당신의 Unit은 %.2f 저체중입니다.\n\n", user_Unit);
				lowWeight ++;
			}
			else if (0.80 <= user_Unit && user_Unit<= 0.99) {
				System.out.printf("당신의 Unit은 %.2f 평균체중입니다.\n\n", user_Unit);
				stdWeight ++;
			}
			else if (1.0 <= user_Unit && user_Unit<= 1.19) {
				System.out.printf("당신의 Unit은 %.2f 과체중입니다.\n\n", user_Unit);
				overWeight ++;
			}
			
		}
		
		System.out.printf("저체중(%d명)\t | ", lowWeight);
		for (int i=0; i < lowWeight; i++) 
			System.out.print("*");
		
		System.out.printf("\n표준체중(%d명)\t | ", stdWeight);
		for (int i=0; i < stdWeight; i++) 
			System.out.print("*");
		
		System.out.printf("\n과체중(%d명)\t | ", overWeight);
		for (int i=0; i < overWeight; i++) 
			System.out.print("*");
}
}