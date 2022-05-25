package ch13;

public class MyCircle implements Measurable {
	public static final double PI = 3.14159;
	private int radius;
	
	public MyCircle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return PI*radius*radius;
	}
	public double getPerimeter() {
		return 2*PI*radius;
	}
	public int getDiameter() {
		return 2*radius;
	}

}
