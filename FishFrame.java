import java.awt.Graphics; 

import javax.swing.JFrame;

public class FishFrame extends JFrame {
	public void paint(Graphics g) {
		// Graphics이 제공하는 메소드(아래글)들 
		g.drawRect(30, 50, 330, 210);//좌상단 꼭지점, 너비, 높이
		g.drawArc(30, 0, 300, 200, 210, 150);//좌,상단 꼭지점,가로,세로,시작점(호그리는 위치),몇도로 돌릴건가
		g.drawArc(30, 100, 300, 200, 0, 150);
		g.drawOval(70, 135, 30, 30);
		g.fillOval(75,  140,  20 , 20);
		g.drawLine(330, 100, 330, 200);
	}
}