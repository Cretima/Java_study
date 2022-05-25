import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class LoginMajor extends JFrame{
	
	private JTextField inputName;
	private JRadioButton btn1;
	private JRadioButton btn2;
	private JButton btnGo;
	
	
	
	public LoginMajor() {
		setTitle("전공 선택");
		setSize(260,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 이름과 전공 선택하세요 문구
		JLabel selectMajor = new JLabel("이름과 전공을 선택하시오.",JLabel.CENTER);
		selectMajor.setFont(new Font("궁서", Font.BOLD, 19));
		selectMajor.setForeground(Color.blue);
		
		// 이름 라벨
		JLabel labelName = new JLabel("이름",JLabel.CENTER);
		inputName = new JTextField(18);
		
		// 전공 라디오버튼
		JLabel labelMajor = new JLabel("전공: ",JLabel.CENTER);
		btn1 = new JRadioButton("소프트웨어", true);
		btn2 = new JRadioButton("가상현실");
		
		ButtonGroup group = new ButtonGroup();
		group.add(btn1);
		group.add(btn2);
		
		// go 버튼
		btnGo = new JButton("GO");
		LoginListener listener = new LoginListener();
		btnGo.addActionListener(listener);
		
		Container loginPanel = getContentPane();
		loginPanel.setLayout(new FlowLayout());
		loginPanel.add(selectMajor);
		loginPanel.add(labelName);
		loginPanel.add(inputName);
		loginPanel.add(labelMajor);
		loginPanel.add(btn1);
		loginPanel.add(btn2);
		loginPanel.add(btnGo);

	}
	// 리스너
	public class LoginListener implements ActionListener {
		
		String msg = "";
		
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnGo) {
				msg += inputName.getText(); // 이름 읽어오기
				
				msg += "님은";
				
				if (btn1.isSelected()) {
					msg += btn1.getText();
				}
				
				if (btn2.isSelected()) {
					msg += btn2.getText();
				}
				
				msg += "전공입니다.";
				(new LoginMajorResult(msg)).setVisible(true);
				dispose();
			}
		}
		
	}
	
	public static void main(String[] args) {
		(new LoginMajor()).setVisible(true);

	}

}
