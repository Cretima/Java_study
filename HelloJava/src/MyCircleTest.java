
public class MyCircleTest {

	public static void main(String[] args) {
		MyCircle circle = new MyCircle();
		
		circle.setRadius(12);
		System.out.println("면적=" + circle.getArea());
		System.out.println("둘레=" + circle.getPerimeter());
	}

}
