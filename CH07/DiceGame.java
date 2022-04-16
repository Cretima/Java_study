import javax.swing.JOptionPane;

public class DiceGame {

	public static void main(String[] args) {
		int comGuess = (int)(Math.random() * 6) +1;
		int userGuess = Integer.parseInt( //정수 객체(Integer), parseInt = 문자형 정수를 인트형으로 변환
				JOptionPane.showInputDialog("주사위의 값(1-6)을 입력하시오."));
		int count = 1;
		while (userGuess != comGuess) {
			userGuess = Integer.parseInt(
					JOptionPane.showInputDialog("틀렸습니다. 다시 입력하시오."));
			count++;
		}
		JOptionPane.showInputDialog(null, "축하합니다. " + count + "번만에 맞추셨습니다!");

	}

}
