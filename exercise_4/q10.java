package exercise_4;
import java.util.Scanner;

class Dictionary{
	private static String [] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};
	
	public static String kor2eng(String word) {
		for (int i = 0; i < kor.length; i++) {
			if (kor[i].equals(word)){
				return eng[i];
			}
		}
		return "None";
	}
}

public class q10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Dictionary dict = new Dictionary();
		System.out.println("�ѱ� �ܾ� �˻� ���α׷��Դϴ�.");
		while (true) {
			System.out.print("�ѱ� �ܾ�?");
			String input = scan.next();
			if (input.equals("�׸�")) break;
			if (dict.kor2eng(input).equals("None")) 
				System.out.println(input + "�� ���� ������ �����ϴ�.");
			else
				System.out.println(input + "�� " + dict.kor2eng(input));
		}
	}
}
