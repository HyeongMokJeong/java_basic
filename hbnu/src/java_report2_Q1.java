import java.util.Scanner;

public class java_report2_Q1 {
	
	public static double getunit(double cm, double kg) {
		// Unit ����ϴ� �޼ҵ�
		return (double)(kg / (cm - 100));
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int student = 5; // ������ ��

		// student ����ŭ �����
		for(int i=1; i <= student; i++) {
			System.out.println(i + "��° �л�");
			System.out.print("Ű�� �Է��ϼ���.: ");
			double user_Height = scan.nextDouble();
			System.out.print("ü���� �Է��ϼ���.: ");
			double user_Weight = scan.nextDouble();
			
			// ���� ���
			double user_Unit = getunit(user_Height, user_Weight);
			
			// ��� ����Ͽ� ���
			if (0.60 <= user_Unit && user_Unit<= 0.79) 
				System.out.printf("����� Unit�� %.2f ��ü���Դϴ�.\n\n", user_Unit);
			else if (0.80 <= user_Unit && user_Unit<= 0.99) 
				System.out.printf("����� Unit�� %.2f ���ü���Դϴ�.\n\n", user_Unit);
			else if (1.0 <= user_Unit && user_Unit<= 1.19) 
				System.out.printf("����� Unit�� %.2f ��ü���Դϴ�.\n\n", user_Unit);
	}
}
}
