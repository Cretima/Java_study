import java.awt.Container;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class SimpleButtonFrame extends JFrame {
	public SimpleButtonFrame() {
		setSize(300, 150);
		setTitle("Simple Button Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		JLabel label = new JLabel("버튼을 누르세요");
		JButton btn = new JButton("버튼");
		cPane.add(label);
		cPane.add(btn);
	}
}
