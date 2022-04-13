package exercise_4;

class Rectangle{
	private int x, y, width, height;
	
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	int square() {
		return this.width * this.height;
	}
	
	void show() {
		System.out.printf("(%d, %d)에서 크기의 %dx%d인 사각형\n", this.x, this.y, this.width, this.height);
	}
	
	boolean contains(Rectangle r) {
		if (this.x <= r.x && r.x < this.x + this.width) {
			if (r.x + r.width < this.x + this.width && r.y + r.height < this.y + this.height)
				return true;
		}
		return false;
	}
}

public class q4 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s의 면적은 " + s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
	}
}
