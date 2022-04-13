package exercise_4;
import java.util.Scanner;

class Day {
	private String work;
	public void set(String work) {this.work = work;}
	public String get() {return work;}
	public void show() {
		if(work == null) System.out.println("�����ϴ�.");
		else System.out.println(work + "�Դϴ�.");
	}
}

class MonthSchedule{
	Scanner scan = new Scanner(System.in);
	static Day[] day;
	
	public MonthSchedule(int i) {
		day = new Day[i];
		for (int j = 0; j < i; j++)
			day[j] = new Day();
	}
	
	void input() {
		System.out.printf("��¥(1~30)?");
		int input_day = scan.nextInt();
		System.out.print("����(��ĭ�����Է�)?");
		String input_work = scan.next();
		day[input_day].set(input_day + "���� �� ���� " + input_work);
		System.out.print("\n");
		return;
	}
	
	void view() {
		System.out.printf("��¥(1~30)?");
		int input_day = scan.nextInt();
		day[input_day].show();
		System.out.print("\n");
		return;
	}
	
	void finish() {
		System.out.println("���α׷��� �����մϴ�.");
		return;
	}
	
	void run() {
		int user_input;
		while (true){
			while (true) {
				System.out.print("����(�Է�:1, ����:2, ������:3) >>");
				user_input = scan.nextInt();
				if (user_input == 1 || user_input == 2 || user_input == 3) break;
				else
					System.out.println("�߸��� �Է��Դϴ�.");
			}
			
			switch (user_input) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				return;
			}
		}
	}
}


public class q7 {
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}
}
