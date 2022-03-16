import java.time.LocalDate;

import javax.swing.JOptionPane;

public class AgeCalculation__03 {

	public static void main(String[] args) {
		
		// JOptionPane을 이용한 GUI(그래픽 유저 인터페이스)
		String birthString =
				JOptionPane.showInputDialog("당신이 태어난 연도는?"); // showInputDialog는 입력(String만)대화창을 띄어준다.
		int birthYear = Integer.parseInt(birthString); // parseInt는 문자로 이루어진 숫자("1998")을 int로 변환
		
		LocalDate date = LocalDate.now(); // 현재연도를 불러옴
		int thisYear = date.getYear();
		
		int age = thisYear - birthYear;
		// showMessageDialog: 출혁하는 메세지창을 사용 / 주의점은 인자를 두개 받아야하는데 하나만 써야기에 앞에 null을 추가
		JOptionPane.showMessageDialog(null,
										"당신의 나이는" + age + "살입니다.");
		System.exit(0); //프로그램을 강제종료 - 윈도우창(대화창)을 사용했기에
		
	}

}
