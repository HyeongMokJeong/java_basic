package exercise_4;
import java.util.Scanner;

class Add{
	int a;
	int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return (this.a + this.b);
	}
}

class Sub{
	int a;
	int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return (this.a - this.b);
	}
}

class Mul{
	int a;
	int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return (this.a * this.b);
	}
}

class Div{
	int a;
	int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return (this.a / this.b);
	}
}

public class q11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = scan.nextInt();
		int b = scan.nextInt();
		String c = scan.next();
		
		switch (c) {
		case "+":
			add.setValue(a, b);
			System.out.println(add.calculate());
			break;
		case "-":
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			break;
		case "*":
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
		case "/":
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;
		}
	}
}
