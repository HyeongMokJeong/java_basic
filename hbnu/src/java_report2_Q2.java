import java.util.Scanner;

public class java_report2_Q2 {
	
	public static double getunit(double cm, double kg) {
		// Unit ����ϴ� �޼ҵ�
		return (double)(kg / (cm - 100));
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int student = 5; // ������ ��
		int lowWeight = 0, stdWeight = 0, overWeight = 0;

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
			if (0.60 <= user_Unit && user_Unit<= 0.79) {
				System.out.printf("����� Unit�� %.2f ��ü���Դϴ�.\n\n", user_Unit);
				lowWeight ++;
			}
			else if (0.80 <= user_Unit && user_Unit<= 0.99) {
				System.out.printf("����� Unit�� %.2f ���ü���Դϴ�.\n\n", user_Unit);
				stdWeight ++;
			}
			else if (1.0 <= user_Unit && user_Unit<= 1.19) {
				System.out.printf("����� Unit�� %.2f ��ü���Դϴ�.\n\n", user_Unit);
				overWeight ++;
			}
			
		}
		
		System.out.printf("��ü��(%d��)\t | ", lowWeight);
		for (int i=0; i < lowWeight; i++) 
			System.out.print("*");
		
		System.out.printf("\nǥ��ü��(%d��)\t | ", stdWeight);
		for (int i=0; i < stdWeight; i++) 
			System.out.print("*");
		
		System.out.printf("\n��ü��(%d��)\t | ", overWeight);
		for (int i=0; i < overWeight; i++) 
			System.out.print("*");
}
}