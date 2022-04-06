import java.awt.Container;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class DoubleButtonFrame extends JFrame {
	public DoubleButtonFrame() {
		setSize(450, 150);
		setTitle("Yes/No Button Example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cPane = getContentPane(); //프레임의 내용창을 얻음
		cPane.setBackground(Color.green); //배경색
		cPane.setLayout(new FlowLayout()); // 내용창의 배치관리자 지정
		
		JButton btn1 = new JButton("Yes");
		JButton btn2 = new JButton("No");
		
		JLabel label = new JLabel("정보를 보내시겠습니까?");
		label.setFont(new Font("Monosoaced", Font.BOLD, 32));
		label.setForeground(Color.blue);
		
		cPane.add(btn1);
		cPane.add(btn2);
		cPane.add(label);
		
	}
}

