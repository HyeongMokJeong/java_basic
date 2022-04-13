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
			System.out.println(this.name +"이 졌습니다.");
			return false;
	}
}

public class WordGameApp {
	
	public WordGameApp() {
		System.out.println("끝말잇기 게임을 시작합니다...");
	}
	
	public static void main(String[] args) {
		WordGameApp start = new WordGameApp();
		start.run();
	}
		
	static void run() {
		Scanner scan = new Scanner(System.in);
		
		String startWord = "아버지";
		String secondWord = "";
		
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int people = scan.nextInt();
		Player ary[] = new Player[people];
		
		for (int i = 0; i < people; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			String name = scan.next();
			ary[i] = new Player(name);
		}
		
		System.out.println("시작하는 단어는 아버지 입니다.");
		for (int i=0;; i++) {
			secondWord = ary[i].getWordFromUser();
			if (ary[i].checkSuccess(startWord, secondWord)) 
				startWord = secondWord;
			else
				break;
			
			if (i == people - 1)
				i = -1;
		}
		System.out.print("게임 종료");
	}
}
	
