import java.util.Scanner;

public class java_report3 {
	
	public static int sumScore(int[] arr) { // 합을 구하는 메소드
		int sumScore_score = 0;
		
		for (int i=0; i < arr.length; i++) 
			sumScore_score += arr[i];
		return sumScore_score; 
	}
	
	public static int averScore(int sumScore, int[]arr) { // 평균을 구하는 메소드
		return (sumScore / arr.length); 
	}
	
	public static void countClass(int low_aver, int aver, int[] arr) { // 평점 및 누적을 계산하고 출력하는 메소드
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
		
		System.out.printf("\n평균 미만 학생 수는 %d명이고 성적 분포는 아래와 같습니다.\n", low_aver);
		for (int i=0; i < classArray.length; i++) {
			System.out.printf("%s(%d명)\t|", classArray[i], countArray[i]);
			for(int j=0; j < countArray[i]; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("-------------------------");
		System.out.printf("총합 %d명(평균 %d점)", arr.length, aver);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int student[] = new int[5];
		int lowAver = 0; // 평균 미만 학생 수
		
		// student 배열의 크기만큼 중간고사 성적 입력
		System.out.println("중간고사 성적을 입력해주세요.");
		for (int i=0; i < student.length; i++) {
			System.out.print(i+1 + "번 학생: ");
			student[i] = scan.nextInt(); 
		}
		
		// 평균 계산 및 평균 이하 학생 수 카운트
		int averScore = averScore(sumScore(student), student);
		for (int i=0; i< student.length; i++) {
			if (student[i] < averScore)
				lowAver ++;	
		}
		
		countClass(lowAver, averScore, student);
		
	}

}