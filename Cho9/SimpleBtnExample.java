import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SimpleBtnExample extends JFrame {
	
	//리스너에 쓸때는 접근하기 위해 변수선언
	private JButton btnRed; 
	private JButton btnYellow;
	
	public class ButtonListener implements ActionListener { //리스너 클래스
		public void actionPerformed(ActionEvent e) {
//			(getContentPane()).setBackground(Color.red);
			if (e.getSource() == btnRed)
				(getContentPane()).setBackground(Color.red);
			else if (e.getSource() == btnYellow)
				(getContentPane()).setBackground(Color.yellow);
		}
	}
	
	public SimpleBtnExample() {
		setSize(300, 150);
		setTitle("Simple Button Example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cPane = getContentPane();
		cPane.setBackground(Color.GREEN);
		cPane.setLayout(new FlowLayout());
		JLabel label = new JLabel("버튼을 누르세요");
//		JButton btn = new JButton("버튼");
		
		btnRed = new JButton("빨간색"); //private에 선언
		btnYellow = new JButton("노랑색");
		
		ButtonListener listener = new ButtonListener(); //리스너 객체 생성
		btnRed.addActionListener(listener);// 리스너 컴포넌트 등록
		btnYellow.addActionListener(listener);
		
		cPane.add(label);
		cPane.add(btnRed); 
		cPane.add(btnYellow);
	}
	
	
	public static void main(String[] args) {
		(new SimpleBtnExample()).setVisible(true);

	}

}
