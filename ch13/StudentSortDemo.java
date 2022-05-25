package ch13;

import java.util.Arrays;

public class StudentSortDemo {
	
	public static void main(String[] args) {
		Student[] students = new Student[4];
		students[0] = new Student("박철수", 2.23);
		students[1] = new Student("이철수", 1.23);
		students[2] = new Student("김철수", 4.23);
		students[3] = new Student("표철수", 3.23);
		
		Arrays.sort(students);
		for(Student s : students)
			s.writeInfo();
	}

}
