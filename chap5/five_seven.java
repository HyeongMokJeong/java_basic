package chap5;

abstract class Calculator {
	public abstract int add(int a, int b); // �� ������ ���� ���Ͽ� ����
	public abstract int subtract(int a, int b); // �� ������ ���� ���Ͽ� ����
	public abstract double average(int[] a); // �迭�� ����� ������ ��� ����
}

class GoodCalc extends Calculator{
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public double average(int[] a) {
		double result = 0;
		
		for (int i:a) 
			result += i;
		return result / a.length; 
	}
}

public class five_seven{
	public static void main(String[] args) {
		GoodCalc cal = new GoodCalc();
		System.out.println(cal.add(2, 3));
	}
}