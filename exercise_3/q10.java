package exercise_3;
import java.util.Random;

public class q10 {
	public static void main(String[] args) {
		Random r = new Random();
		int [][] arr = new int[4][4];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				arr[i][j] = 0;
		}
		
		for (int i = 0; i < 10; i++) {
			int a = r.nextInt(arr.length);
			int b = r.nextInt(arr[a].length);
			if (arr[a][b] == 0)
				arr[a][b] = r.nextInt(10);
			else
				i--;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + "\t");
			System.out.println();
		}
	}
}
