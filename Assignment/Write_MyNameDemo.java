import javax.swing.JFrame;

public class Write_MyNameDemo {
	
	public static void main(String[] args) {
		Write_MyName name = new Write_MyName();
		
		name.setTitle("이름 2글자 쓰기");
		name.setSize(300, 250);
		name.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		name.setVisible(true);
	
	}

}
