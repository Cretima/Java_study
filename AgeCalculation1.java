import java.time.LocalDate;
import java.util.Scanner;
//이름 관례 : 클래스 이름은 대문자로 시작, 변수, 메소드는 소문자

public class AgeCalculation1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // 스캐너(class)에 input(변수)이라는 객체 생성
		
		System.out.println("당신이 태어난 연도는? ");
		int birthYear = input.nextInt(); // nextInt(메소드)를 호출하기 위해 input(객체)를 호출
		//System.out.println("올해 연도는? ");
		//int thisYear = input.nextInt(); //아래의 로컬데이트와 같으면서 다름
		
		LocalDate date = LocalDate.now(); //:LocalDate(클래스) date(변수) 객체 생성
		int thisYear = date.getYear(); // getYear : 메소드로 올해 몇 년인지 얻음
		
		
		
		// 계산식
		int age = thisYear - birthYear;
		System.out.print("당신은 " + age + "살입니다.");
	}

}
