import java.util.Scanner;

public class java_report3 {
	
	public static int sumScore(int[] arr) { // ���� ���ϴ� �޼ҵ�
		int sumScore_score = 0;
		
		for (int i=0; i < arr.length; i++) 
			sumScore_score += arr[i];
		return sumScore_score; 
	}
	
	public static int averScore(int sumScore, int[]arr) { // ����� ���ϴ� �޼ҵ�
		return (sumScore / arr.length); 
	}
	
	public static void countClass(int low_aver, int aver, int[] arr) { // ���� �� ������ ����ϰ� ����ϴ� �޼ҵ�
		String classArray[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
		int countArray[] = new int[classArray.length];
		
		for (int i=0; i < arr.length; i++) {
			if (95 <= arr[i] && arr[i] <= 100)
				countArray[0] ++;
			else if (90 <= arr[i] && arr[i] < 95)
				countArray[1] ++;
			else if (85 <= arr[i] && arr[i] < 90)
				countArray[2] ++;
			else if (80 <= arr[i] && arr[i] < 85)
				countArray[3] ++;
			else if (75 <= arr[i] && arr[i] < 80)
				countArray[4] ++;
			else if (70 <= arr[i] && arr[i] < 75)
				countArray[5] ++;
			else if (65 <= arr[i] && arr[i] < 70)
				countArray[6] ++;
			else if (60 <= arr[i] && arr[i] < 65)
				countArray[7] ++;
			else
				countArray[8] ++;
		}
		
		System.out.printf("\n��� �̸� �л� ���� %d���̰� ���� ������ �Ʒ��� �����ϴ�.\n", low_aver);
		for (int i=0; i < classArray.length; i++) {
			System.out.printf("%s(%d��)\t|", classArray[i], countArray[i]);
			for(int j=0; j < countArray[i]; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("-------------------------");
		System.out.printf("���� %d��(��� %d��)", arr.length, aver);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int student[] = new int[5];
		int lowAver = 0; // ��� �̸� �л� ��
		
		// student �迭�� ũ�⸸ŭ �߰���� ���� �Է�
		System.out.println("�߰���� ������ �Է����ּ���.");
		for (int i=0; i < student.length; i++) {
			System.out.print(i+1 + "�� �л�: ");
			student[i] = scan.nextInt(); 
		}
		
		// ��� ��� �� ��� ���� �л� �� ī��Ʈ
		int averScore = averScore(sumScore(student), student);
		for (int i=0; i< student.length; i++) {
			if (student[i] < averScore)
				lowAver ++;	
		}
		
		countClass(lowAver, averScore, student);
		
	}

}