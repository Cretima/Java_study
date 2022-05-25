package ch13;

public class shapeTest {

	public static void main(String[] args) {
//		MyRect rect = new MyRect(20, 15);
//		System.out.println(rect.getArea());
//		MyCircle circle = new MyCircle(22);
//		System.out.println(circle.getPerimeter());
		
		Measurable m = new MyRect(20, 15);
		System.out.println("area=" + m.getArea() + ", perimeter="
				+ m.getPerimeter());
		
		m = new MyCircle(22);
		System.out.printf("area=%.2f, perimeter=%.2f\n",
				m.getArea(), m.getPerimeter());
//		m = new Triangle(4, 5, 6);
//		System.out.printf("area=%.2f, perimeter=%.2f\n",
//				m.getArea(), m.getPerimeter());
	}

}
