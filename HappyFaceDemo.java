import javax.swing.JFrame;

public class HappyFaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HappyFace face = new HappyFace(); //앞에는 객체를 쓰기위한 설계도
		face.setTitle("Happy Face");
		face.setSize(400, 300);
		face.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		face.setVisible(true);
	}
}
