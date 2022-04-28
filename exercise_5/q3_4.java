package exercise_5;
import java.util.Scanner;

abstract class Convert{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println(getSrcString() + "�� " + getDestString() + "�� �ٲߴϴ�.");
		System.out.print(getSrcString() + "�� �Է��ϼ���>> ");
		double val = scan.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: " + res + getDestString() + "�Դϴ�.");
		scan.close();
	}
}

class Won2Dollar extends Convert{
	protected double convert(double src) {
		return src / ratio;
	}
	
	protected String getSrcString() {
		return "��";
	}
	
	protected String getDestString() {
		return "�޷�";
	}
	
	public Won2Dollar(int a) {
		ratio = a;
	}
}

class resultQ3{
	public resultQ3(){
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}
}

class Km2Mile extends Convert{
	protected double convert(double src) {
		return src / ratio;
	}
	
	protected String getSrcString() {
		return "Km";
	}
	
	protected String getDestString() {
		return "mile";
	}
	
	public Km2Mile(double a) {
		ratio = a;
	}
}

public class q3_4 {
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
}
