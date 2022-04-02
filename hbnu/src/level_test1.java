// 사용자로부터 키와 체중을 입력받아 표준 체중을 계산한 후에 사용자의 체중이 저체중인지, 표준인지, 과체중인지를 판단(출력)하는 프로그램을 작성하라. 
// 이때, 표준 체중 = (키-100) x unit, unit는 0.9이고 저체중 < 표준 체중 < 과체중 으로 판단(출력문 예: 당신의 체중은 5 kg 과제충입니다.)

import java.util.Scanner;

public class level_test1 {

	public static double getStandard(double cm) {
		// 표준체중 계산하는 메소드
		double unit = 0.9;
		return (cm - 100) * unit;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 사용자 입력
		System.out.print("키를 입력하세요.: ");
		double user_Height = scan.nextDouble();
		System.out.print("체중을 입력하세요.: ");
		double user_Weight = scan.nextDouble();
		
		// 표준체중 계산
		double std_Weight = getStandard(user_Height);
		
		// 결과 계산하여 출력
		if (user_Weight < std_Weight) 
			System.out.println("당신의 체중은 " + user_Weight + "kg 저체중입니다.");
		else if (std_Weight < user_Weight) 
			System.out.println("당신의 체중은 " + user_Weight + "kg 과체중입니다.");
		else 
			System.out.println("당신의 체중은 " + user_Weight + "kg 표준 체중입니다.");
		
	}

}