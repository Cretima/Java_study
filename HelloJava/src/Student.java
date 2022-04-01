
public class Student {

	public String name;
	public String course;
	public int score;
	
	public void writeOutput() {
		System.out.println("이름: " + name); //  -> this.name  // this. : 수신객체를 표현하는 키워드.		
		System.out.println("과목: " + course); // this.course
		System.out.println("성적: " + score); // this.score
		System.out.println("학점: " + getGrade()); //this.getGrade
	}
	
	public String getGrade() {
		String grade;
		
		if (score >= 95)
			grade = "A+";
		else if (score >= 90)
			grade = "A";
		else if (score >= 85)
			grade = "B+";
		else if (score >= 80)
			grade = "B";
		else if (score >= 75)
			grade = "C+";
		else if (score >= 70)
			grade = "C";
		else if (score >= 60)
			grade = "D";
		else
			grade = "F";
		
		return grade;
	}	
}
