
public class MyCircle {

	public static final double PI = 3.14159; // static final double �̸� ��� ����
	private int radius;


	public void setRadius(int radius) { //source -> ���ʷ����� �� �� ��
		this.radius = radius;
	}
	
	public double getArea() {
		return PI * radius * radius;
	}
	
	public double getPerimeter() {
		return 2 * PI * radius;
	}
}
