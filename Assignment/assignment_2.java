import java.time.LocalDate;

import javax.swing.JOptionPane;

public class assignment_2 {
	public static void main(String[] args) {
		
		String birthString =
				JOptionPane.showInputDialog("생년 월일을 여섯자리로 입력하세요:");
		
		// 연도
		int birthYear = Integer.parseInt(birthString.substring(0,2));
		
		// 달
		int birthMonth = Integer.parseInt(birthString.substring(2,4));	
		
		// 일
		int birthDay = Integer.parseInt(birthString.substring(4,6));	
		
		
		LocalDate date = LocalDate.now(); // 현재연도를 불러옴.
		int thisYear = date.getYear();
		
		// 앞에 부분 연도 구하기.
		if (birthYear > thisYear % 100)
			birthYear += 1900;
		else
			birthYear += 2000;
		
		JOptionPane.showMessageDialog(null,
				birthYear + "년 " + birthMonth + "월 " + birthDay + "일입니다.");
		System.exit(0); //프로그램을 강제종료 - 윈도우창(대화창)을 사용했음
	}

}