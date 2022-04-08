
public class CourseDemo {
	public static void main(String[] args) {
		Book book = new Book("궁극의 자바", "임꺽정");
		Professor prof = new Professor("홍길동", "컴퓨터공학");
		Course course = new Course("자바프로그래밍", prof, book);
		System.out.println(course.toString());
	}

}
