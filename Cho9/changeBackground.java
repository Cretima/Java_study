import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class changeBackground extends JFrame {
	private boolean isOn = false;
	
	public changeBackground() {
		setSize(380, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("change Background");
		
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		JButton button = new JButton("버튼을 누르시오");
		button.addActionListener(new BtnListener());
		cPane.add(button);
	}
		
		
	public void paint(Graphics g) {
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		if (isOn)
			cPane.setBackground(Color.black);
		else
			cPane.setBackground(Color.white);
		
	}
		
	private class BtnListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			isOn = !isOn;
			JButton btn = (JButton) e.getSource();
			btn.setText(isOn ? "버튼이 켜졌습니다" : "버튼을 누르시오");
			repaint();
		}
	}
	

	public static void main(String[] args) {
		(new changeBackground()).setVisible(true);

	}

}
