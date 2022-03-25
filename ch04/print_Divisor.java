import java.util.Scanner;

public class print_Divisor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int n = input.nextInt();
		int count = 0;
		
		for (int i = 2; i <= n/2; i++) {
			if (n % i ==0) {
				System.out.println(i);
				count++;	
			}
		}
		System.out.println(n + "의 약수는" + count + "개입니다.");
	}

}
