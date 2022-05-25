import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LoginMajorResult extends JFrame{
	public LoginMajorResult(String msg) {
		setSize(500, 200);
		setTitle("전공 선택 결과");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel msgLabel = new JLabel(msg,
				SwingConstants.CENTER);
		msgLabel.setFont(new Font("궁서", Font.BOLD, 26));
		msgLabel.setForeground(Color.red);
		
		Container ctr = getContentPane();
		ctr.setLayout(new FlowLayout());
		ctr.add(msgLabel);
		
	}
}
