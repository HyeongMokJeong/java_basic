package exercise_4;
import java.util.Scanner;

class reservation{
	void reserSite(int siteLine) {
		switch (siteLine) {
		case 0:
			System.out.print("S>> ");
			for (int i = 0; i < q12.Ary[siteLine].length; i++)
				System.out.print(q12.Ary[siteLine][i] + " ");
			System.out.print("\n");
			break;
		case 1:
			System.out.print("A>> ");
			for (int i = 0; i < q12.Ary[siteLine].length; i++)
				System.out.print(q12.Ary[siteLine][i] + " ");
			System.out.print("\n");
			break;
		case 2:
			System.out.print("B>> ");
			for (int i = 0; i < q12.Ary[siteLine].length; i++)
				System.out.print(q12.Ary[siteLine][i] + " ");
			System.out.print("\n");
			break;
		}
		System.out.print("�̸�>>");
		String inputName = q12.scan.next();
		int inputNum = 0;
		while (true) {
			System.out.print("��ȣ>>");
			inputNum = q12.scan.nextInt();
			if (0 > inputNum || inputNum > q12.Ary[siteLine].length)
				System.out.println("�߸��� �Է��Դϴ�.");
			else
				break;
		}
		q12.Ary[siteLine][inputNum] = inputName;
		return;
	}
}

class search{
	void searchSite() {
		System.out.print("S>> ");
		for (int i = 0; i < q12.Ary[0].length; i++)
			System.out.print(q12.Ary[0][i] + " ");
		System.out.print("\n");
		System.out.print("A>> ");
		for (int i = 0; i < q12.Ary[1].length; i++)
			System.out.print(q12.Ary[1][i] + " ");
		System.out.print("\n");
		System.out.print("B>> ");
		for (int i = 0; i < q12.Ary[2].length; i++)
			System.out.print(q12.Ary[2][i] + " ");
		System.out.print("\n");
		System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
	}
}

class cancel{
	void cancelSite(int siteLine) {
		switch (siteLine) {
		case 1:
			System.out.print("S>> ");
			for (int i = 0; i < q12.Ary[siteLine - 1].length; i++)
				System.out.print(q12.Ary[siteLine - 1][i] + " ");
			System.out.print("\n");
			break;
		case 2:
			System.out.print("A>> ");
			for (int i = 0; i < q12.Ary[siteLine - 1].length; i++)
				System.out.print(q12.Ary[siteLine - 1][i] + " ");
			System.out.print("\n");
			break;
		case 3:
			System.out.print("B>> ");
			for (int i = 0; i < q12.Ary[siteLine - 1].length; i++)
				System.out.print(q12.Ary[siteLine - 1][i] + " ");
			System.out.print("\n");
			break;
		}
		while (true) {
			System.out.print("�̸�>>");
			String inputName = q12.scan.next();
			for (int i = 0; i < q12.Ary[siteLine - 1].length; i++) {
				if (q12.Ary[siteLine - 1][i].equals(inputName)) {
					q12.Ary[siteLine - 1][i] = "---";
					return;
				}
			}
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	}
}

public class q12 {
	static String Ary[][] = new String[3][10];
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		reservation reser = new reservation();
		search scar = new search();
		cancel canc = new cancel();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				Ary[i][j] = "---";
			}
		
		}
		
		System.out.println("��ǰ �ܼ�ƮȦ ���� �ý����Դϴ�.");
		while (true) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			int inputNum = scan.nextInt();
			int inputsite = 0;
			if (inputNum == 1) {
				while (true) {
					System.out.print("�¼����� S(1), A(2), B(3)>>");
					inputsite = scan.nextInt();
					if ( 1 > inputsite || inputsite > 3) {
						System.out.println("�߸��� �Է��Դϴ�.");
					}
					else
						break;
				}
				reser.reserSite(inputsite - 1);
			}
			else if (inputNum == 2) 
				scar.searchSite();
			else if (inputNum == 3) {
				while (true) {
					System.out.print("�¼� S:1, A:2, B:3>>");
					inputsite = scan.nextInt();
					if ( 1 > inputsite || inputsite > 3) {
						System.out.println("�߸��� �Է��Դϴ�.");
					}
					else
						break;
				}
				canc.cancelSite(inputsite);
			}
			else if (inputNum == 4)
				break;
			else
				System.out.println("�߸��� �Է��Դϴ�.");
		}
	}
}
