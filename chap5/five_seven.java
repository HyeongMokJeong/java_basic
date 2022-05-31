package chap5;

abstract class Calculator {
	public abstract int add(int a, int b); // 두 정수의 합을 구하여 리턴
	public abstract int subtract(int a, int b); // 두 정수의 차를 구하여 리턴
	public abstract double average(int[] a); // 배열에 저장된 정수의 평균 리턴
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