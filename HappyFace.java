import java.awt.Graphics;

import javax.swing.JFrame;

public class HappyFace extends JFrame {
	public void paint(Graphics g) {
		g.drawOval(100, 50, 200, 200);
		g.fillOval(155, 100, 10, 20);
		g.fillOval(230, 100, 10, 20);
		g.drawArc(150, 160, 100, 50, 180, 180);
		
	}
}