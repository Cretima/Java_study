import java.util.Scanner;

public class GawiBawiBo {
	private int compsMove, yourMove;
	
	public void playGame() {
		Scanner input = new Scanner(System.in);
		do {
			compsMove = (int) (Math.random() * 3); // 랜덤 0~2
			yourMove = -1;
			while (yourMove < 0 || yourMove > 2) { //입력오류는 다시 반복
				System.out.print("0: 가위, 1:바위, 2:보 >> ");
				yourMove = input.nextInt(); // 사용자 입력
			}
		}while (!findWinner()); // 승/패 비교.
	}
	
	private String getMoveStr(int move) { // 글자를 출력하기 위해 메소드 생성.
		if (move == 0)
			return "가위";
		else if (move == 1)
			return "바위";
		else
			return "보";
	}
	
	private boolean findWinner() {
		if (compsMove == yourMove) {
			System.out.println("you=" + getMoveStr(yourMove) +
					", com=" + getMoveStr(compsMove) +
					": 비겼습니다. 다시 입력하세요.");
			return false;
		}
		else if ((compsMove + 1) % 3 == yourMove) {
			System.out.println("you=" + getMoveStr(yourMove) +
					", com=" + getMoveStr(compsMove) +
					": 귀하가 이겼습니다.");
			return true;
		}
		else {
			System.out.println("you=" + getMoveStr(yourMove) +
					", com=" + getMoveStr(compsMove) +
					": 귀하가 졌습니다!");
			return true;
		}
	}
	

	public static void main(String[] args) {
		GawiBawiBo game = new GawiBawiBo();
		game.playGame();
	}

}
