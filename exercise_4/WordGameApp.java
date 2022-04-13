import java.util.Scanner;

class Player{
	String name;
	Scanner scan = new Scanner(System.in);
	
	public Player(String name) {
		this.name = name;
	}
	
	String getWordFromUser() {
		String word;
		
		System.out.print(this.name + ">>");
		word = scan.next();
		
		return word;
	}
	
	public boolean checkSuccess(String word1, String word2) {
		if (word1.charAt(word1.length() - 1) == word2.charAt(0))
			return true;
		else
			System.out.println(this.name +"�� �����ϴ�.");
			return false;
	}
}

public class WordGameApp {
	
	public WordGameApp() {
		System.out.println("�����ձ� ������ �����մϴ�...");
	}
	
	public static void main(String[] args) {
		WordGameApp start = new WordGameApp();
		start.run();
	}
		
	static void run() {
		Scanner scan = new Scanner(System.in);
		
		String startWord = "�ƹ���";
		String secondWord = "";
		
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		int people = scan.nextInt();
		Player ary[] = new Player[people];
		
		for (int i = 0; i < people; i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>>");
			String name = scan.next();
			ary[i] = new Player(name);
		}
		
		System.out.println("�����ϴ� �ܾ�� �ƹ��� �Դϴ�.");
		for (int i=0;; i++) {
			secondWord = ary[i].getWordFromUser();
			if (ary[i].checkSuccess(startWord, secondWord)) 
				startWord = secondWord;
			else
				break;
			
			if (i == people - 1)
				i = -1;
		}
		System.out.print("���� ����");
	}
}
	
