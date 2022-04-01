
public class MyCircle {

	public static final double PI = 3.14159; // static final double 이름 상수 선언
	private int radius;


	public void setRadius(int radius) { //source -> 제너레이터 켓 앤 셋
		this.radius = radius;
	}
	
	public double getArea() {
		return PI * radius * radius;
	}
	
	public double getPerimeter() {
		return 2 * PI * radius;
	}
}
