import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class color_Square extends JFrame {
	private static final int XINIT = 50;
	private static final int YINIT = 50;
	private static final int WIDTHINT = 30;
	private static final int HEIGHTINT = 30;

	public void paint(Graphics g) {
		super.paint(g);
		
		Color[] rgb = {Color.RED, Color.GREEN, Color.BLUE};
		int xNew = XINIT, yNew = YINIT, wNew = WIDTHINT, hNew = HEIGHTINT;
		for (int i=0; i < 20; i++) {
			
			g.setColor(rgb[i%rgb.length]);
			
			g.drawRect(xNew, yNew, wNew, hNew);
			xNew += 10;
			yNew += 10;
			wNew += 10;
			hNew += 10;
		}
		
	}

}
