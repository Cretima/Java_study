package ch13;

public class Student implements Comparable {
	
	private String name;
	private double gpa;
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}
	
	public void writeInfo() {
		System.out.println(name + " : " + gpa);
	}
	
	// 객체 순서 오름차순 정렬
	@Override
	public int compareTo(Object obj) {
		if (obj != null && obj instanceof Student) {
			Student s = (Student)obj;
			return this.name.compareTo(s.name);
		}
		else
			return -1;
	}

}
