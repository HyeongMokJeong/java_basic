// ����ڷκ��� Ű�� ü���� �Է¹޾� ǥ�� ü���� ����� �Ŀ� ������� ü���� ��ü������, ǥ������, ��ü�������� �Ǵ�(���)�ϴ� ���α׷��� �ۼ��϶�. 
// �̶�, ǥ�� ü�� = (Ű-100) x unit, unit�� 0.9�̰� ��ü�� < ǥ�� ü�� < ��ü�� ���� �Ǵ�(��¹� ��: ����� ü���� 5 kg �������Դϴ�.)

import java.util.Scanner;

public class level_test1 {

	public static double getStandard(double cm) {
		// ǥ��ü�� ����ϴ� �޼ҵ�
		double unit = 0.9;
		return (cm - 100) * unit;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// ����� �Է�
		System.out.print("Ű�� �Է��ϼ���.: ");
		double user_Height = scan.nextDouble();
		System.out.print("ü���� �Է��ϼ���.: ");
		double user_Weight = scan.nextDouble();
		
		// ǥ��ü�� ���
		double std_Weight = getStandard(user_Height);
		
		// ��� ����Ͽ� ���
		if (user_Weight < std_Weight) 
			System.out.println("����� ü���� " + user_Weight + "kg ��ü���Դϴ�.");
		else if (std_Weight < user_Weight) 
			System.out.println("����� ü���� " + user_Weight + "kg ��ü���Դϴ�.");
		else 
			System.out.println("����� ü���� " + user_Weight + "kg ǥ�� ü���Դϴ�.");
		
	}

}