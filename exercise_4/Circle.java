
public class Circle {
	int radius;
	String name;
	
	public Circle() {
	}
	
	public Circle(int r, String n) {
		radius = r;
		name = n;
	}
	
	public double getArea() {
		System.out.println(name);
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "자바피자";
		System.out.println(pizza.getArea());
		
		Circle donut = new Circle(2, "자바도넛");
		System.out.println(donut.getArea());
		
	}
}
