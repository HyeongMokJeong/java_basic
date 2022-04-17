package exercise_4;
import java.util.Scanner;

class Dictionary{
	private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
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
		System.out.println("한글 단어 검색 프로그램입니다.");
		while (true) {
			System.out.print("한글 단어?");
			String input = scan.next();
			if (input.equals("그만")) break;
			if (dict.kor2eng(input).equals("None")) 
				System.out.println(input + "는 저의 사전에 없습니다.");
			else
				System.out.println(input + "은 " + dict.kor2eng(input));
		}
	}
}
