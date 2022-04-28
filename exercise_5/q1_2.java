package exercise_5;

class TV{
	private int size;
	public TV(int size) { this.size = size; }
	protected int getSize() { return size;}
}

class ColorTV extends TV{
	int color;
	public ColorTV(int a, int b) { 
		super(a);
		color = b;
	}
	
	void printProperty() {
		System.out.printf("%d��ġ %d�÷�", getSize(), color);
	}
}

class IPTV extends ColorTV{
	String ip;
	public IPTV(String ip, int a, int b) {
		super(a, b);
		this.ip = ip;
	}
	
	void printProperty() {
		System.out.printf("���� IPTV�� %s �ּ��� %d��ġ %d�÷�", ip, getSize(), color);
	}
}

public class q1_2 {
	public static void main(String[] args) {
		IPTV myTV = new IPTV("192.1.1.2", 32, 1024);
		myTV.printProperty();
	}
}
