
public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.course = "자바프로그래밍";
		s.score = 89;
		
		System.out.println(s.name + "의 학점은 " + s.getGrade() + "입니다.");

	}

}
