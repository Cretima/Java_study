import java.util.Scanner;

import javax.swing.JOptionPane;

public class temperatureCalc_03 {
	public static void main(String[] args) {
		
		// 화씨 온도를 섭씨온도 변환 프로그램(대화창 사용.)
		/*String string_temperature =
				JOptionPane.showInputDialog("화씨 온도를 입력하시오:"); // showInputDialog는 입력(String만)대화창을 띄어준다.
		int temperature = Integer.parseInt(string_temperature);
		
		int temperature_result = (int)((temperature - 32) / 1.8); // 화씨 온도를 섭씨온도로 / (int)는 좋은 방법은 아님
		
		JOptionPane.showMessageDialog(null,
					"화씨" + temperature + "도는 섭씨" + temperature_result + "도입니다.");
		System.exit(0); */
		
		Scanner input = new Scanner(System.in); // 입력객체
		
		System.out.print("변화할 온도를 입력하시오 (섭씨는 온도 뒤에 c나C로, 화씨는 f나F로표시):");
		String temp = input.nextLine();
		
	    String int_temp = temp.substring(0, temp.length()-1); // 온도만
	    int temperature = Integer.parseInt(int_temp);
		String str_temp = temp.substring(temp.length()-1); // 화씨인지 섭씨인지 구분
		
		// 섭씨에서 화씨로
		if (str_temp.equals("c") || str_temp.equals("C")) {
			int c_result = (int)((temperature * 1.8) + 32);
			System.out.println("섭씨" + temperature 
					+ "도는 화씨" + c_result + "도 입니다.");
		}
		// 화씨에서 섭씨로
		else if (str_temp.equals("f") || str_temp.equals("F")) {
			int f_result = (int)((temperature - 32) / 1.8);
			System.out.println("화씨" + temperature 
					+ "도는 섭씨" + f_result + "도 입니다.");
		}
		else
			System.out.println("잘못 입력했습니다!!");
		
	}
}
