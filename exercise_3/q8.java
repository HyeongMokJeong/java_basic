package exercise_3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class q8 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		int num_ary[];
		
		System.out.print("정수 몇개?");
		int arySize = scan.nextInt();
		num_ary = new int[arySize];
		
		for (int i=0; i < arySize; i++) {
			num_ary[i] = r.nextInt(100);
			for (int j = 0; j < i; j++) {
				if (num_ary[i] == num_ary[j])
					i--;
			}
		}
		for (int i=0; i < arySize; i++) {
			System.out.printf("%d ",num_ary[i]);
			if ((i+1) % 10 == 0)
				System.out.println();
		}
	}

}
