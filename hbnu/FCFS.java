import java.util.Arrays;

public class FCFS {
	static int[] fcfsTime(int[] burst, int[] arrival) {
		int[] waitTimeAry = new int[burst.length];
		waitTimeAry[0] = 0;
		
		//��� �ð� = n-1������ ���� �ð� - n�� ���� �ð�
		for (int i = 1; i < burst.length; i++) {
			int sum = 0;
			for (int j=0; j < i; j++) 
				sum += burst[j];
			waitTimeAry[i] = sum - arrival[i];
		}
		
		return waitTimeAry;
	}
	
	
	static int[] returnTime(int[] wait, int[] burst) {
		int[] returnTimeAry = new int[burst.length];
		returnTimeAry[0] = burst[0];
		// ��ȯ �ð� = n�� ��� �ð� + n�� ���� �ð�
		for (int i = 1; i < burst.length; i++) {
			returnTimeAry[i] = wait[i] + burst[i];
		}
		
		return returnTimeAry;
	}
	
	
	public static void main(String[] args) {
		int processes[] = {1, 2, 3, 4, 5, 6}; // ���μ��� ����
		int burst_time[] = {5, 9, 6, 15, 6, 3}; // ���� �ð�
		int arrival_time[] = {0, 3, 6, 7, 8, 10}; // ���� �ð�
		
		// ��� �ð�
		int[] waiting_time = fcfsTime(burst_time, arrival_time);
		// 
		int[] return_time = returnTime(waiting_time, burst_time);
		
		double waiting_sum = 0;
		for(int i:waiting_time) 
			waiting_sum += i;
		
		double return_sum = 0;
		for(int i: return_time)
			return_sum += i;
		
		System.out.println("process ID\t\t: " + Arrays.toString(processes));
		System.out.println("Burst_�ð�\t\t: " + Arrays.toString(burst_time));
		System.out.println("Waititng_�ð�\t\t: " + Arrays.toString(waiting_time));
		System.out.println("Turn_Around_�ð�\t\t: " + Arrays.toString(return_time));
		System.out.println("��� waiting �ð�\t\t: " + (waiting_sum / waiting_time.length));
		System.out.println("��� turn around �ð�\t: " + (return_sum / return_time.length));
	}
}
