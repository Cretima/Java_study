import java.awt.Graphics;

import javax.swing.JFrame;

public class Write_MyName extends JFrame {
	public void paint(Graphics g) {
		
		g.drawLine(100, 100, 60, 150); // '세'의 ㅅ 
		g.drawLine(80, 125, 100, 150); // '세'의 ㅅ
		g.drawLine(100, 125, 115, 125); // ㅔ 의 -
		g.drawLine(115, 100, 115, 150); // ㅔ 의 ㅣ1
		g.drawLine(125, 100, 125, 150); // ㅔ 의 ㅣ2
		
		g.drawLine(165, 100, 165, 85); // ㅎ 의 ㅗ
		g.drawLine(150, 100, 180, 100); // ㅎ 의 ㅗ
		g.drawOval(150, 110, 30, 30); // ㅎ 의 ㅇ
		
		g.drawLine(190, 120, 200, 120); // ㅕ '-'1
		g.drawLine(190, 130, 200, 130); // ㅕ '-'2
		g.drawLine(200, 110, 200, 140); // ㅕ ㅣ
		
		g.drawLine(160, 150, 160, 165); // ㄴ ㅣ
		g.drawLine(160, 165, 200, 165); // ㄴ ㅡ
		
		
	}

}
