
public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "ȫ�浿";
		s.course = "�ڹ����α׷���";
		s.score = 89;
		
		System.out.println(s.name + "�� ������ " + s.getGrade() + "�Դϴ�.");

	}

}
