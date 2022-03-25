import javax.swing.JFrame;

public class FishFrameDemo {

	public static void main(String[] args) {
		FishFrame fish = new FishFrame();
		fish.setTitle("Fish Frame Example");
		fish.setSize(400, 300);
		fish.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fish.setVisible(true);
	}
}
