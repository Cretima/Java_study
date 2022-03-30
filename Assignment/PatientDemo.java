import java.util.Scanner;

public class PatientDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("이름을 입력하시오: ");
		String name = input.nextLine().trim();
		System.out.print("키를 입력하시오(cm): ");
		int height = input.nextInt();
		System.out.print("체중을 입력하시오(kg): ");
		int weight = input.nextInt();
		
		Patient p = new Patient(name, height, weight);
		System.out.println(p.getName() + "의 BMI = " + p.getBMI());

	}

}
