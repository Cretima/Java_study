import javax.swing.JFrame;

public class color_SquareDemo {

	public static void main(String[] args) {
		
		color_Square Square = new color_Square(); //앞에는 객체를 쓰기위한 설계도
		Square.setTitle("컬러사각형 데모");
		Square.setSize(500, 500);
		Square.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Square.setVisible(true);

	}

}
