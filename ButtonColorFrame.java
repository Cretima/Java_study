package ch13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class ButtonColorFrame extends JFrame {
	private JRadioButton yellow;
	private JRadioButton green;
	
	public ButtonColorFrame() {
		setSize(300, 150);
		setTitle("Button Color Example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		
		yellow = new JRadioButton("노란색");
		green = new JRadioButton("연두색");
		ButtonGroup colorGroup = new ButtonGroup();
		colorGroup.add(yellow); 
		colorGroup.add(green);
		// 무명 클래스
		JButton button = new JButton("변경");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(yellow.isSelected())
					(getContentPane()).setBackground(Color.yellow);
				else if (green.isSelected())
					(getContentPane()).setBackground(Color.green);
			}
		}); 
		
		cPane.add(yellow);
		cPane.add(green);
		cPane.add(button);
	}
	
	
	public static void main(String[] args) {
		(new ButtonColorFrame()).setVisible(true);

	}

}
