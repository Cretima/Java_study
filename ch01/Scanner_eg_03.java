import java.util.Scanner;

public class Scanner_eg_03 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // 스캐너를 이용해 객체 만듬.
		
		System.out.println("두개의 정수를 입력하시오.");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println("두 수의 곱은 = " + (num1 * num2));
		
		System.out.println("두개의 실수를 입력하시오.");
		double float1 = input.nextDouble();
		double float2 = input.nextDouble();
		System.out.println("두 수의 합은 = " + (float1 + float2));
		
		System.out.println("두개의 단어를 입력하시오.");
		String str1 = input.next(); // 앞의 String 클래스이다 (이유: 앞에 대문자)
		String str2 = input.next();
		System.out.println(str2 + "of" + str1);
	}

}
