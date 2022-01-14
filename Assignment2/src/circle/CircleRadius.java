package circle;

class Circle{
	private double radius;
	private String color;

	public Circle() {
		radius = 1;
		color = "Red";
	}

	public Circle(double r) {
		radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}
}


public class CircleRadius {

	public static void main(String[] args) {
		Circle circle = new Circle();
		Circle circle2=new Circle(5.8);
		System.out.println("Radius of Circle: " + circle.getRadius());
		System.out.println("Area of Circle: " + circle.getArea());
		System.out.println("Radius of Circle 2: " + circle2.getRadius());
		System.out.println("Area of Circle 2: " + circle2.getArea());

	}

}
