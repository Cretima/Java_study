package ch13;

public class MyRect implements Measurable {
	private int width, height;
	
	public MyRect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public double getArea() {
		return width*height;
	}
	
	public double getPerimeter() {
		return 2*(width+height);
	}

}
