package exercise_4;
import java.util.Scanner;

class Phone{
	String name;
	String tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
}

public class p8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String result = "";
		
		System.out.print("인원수>>");
		int people = scan.nextInt();
		Phone[] phoneAry = new Phone[people];
		System.out.print("");
		
		for (int i = 0; i < people; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String input_name = scan.next();
			String tel = scan.next();
			phoneAry[i] = new Phone(input_name, tel);
		}
		System.out.println("저장되었습니다...");
		
		while (true) {
			boolean flag = false;
			System.out.print("검색할 이름>>");
			String name = scan.next();
			if (name.equals("그만"))
				return;
			
			for (int i = 0; i < phoneAry.length; i++) {
				if ((phoneAry[i].name).equals(name)) {
					result = name + "의 번호는 " + phoneAry[i].tel + " 입니다.\n";
					flag = true;
					break;
				}
			}
			if (flag == true)
				System.out.printf(result);
			else
				System.out.printf("%s 이 없습니다.\n", name);
			}
		}
		
	}
