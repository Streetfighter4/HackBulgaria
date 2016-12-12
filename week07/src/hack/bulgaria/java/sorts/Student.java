package hack.bulgaria.java.sorts;

public class Student implements Comparable<Student>{
	private final String firstName;
	private final String thirdName;
	private final int grade;
	
	public String getFirstName() {
		return firstName;
	}
	public String getThirdName() {
		return thirdName;
	}
	public int getGrade() {
		return grade;
	}
	public Student(String firstName, String thirdName, int grade) {
		super();
		this.firstName = firstName;
		this.thirdName = thirdName;
		this.grade = grade;
	}
	
	@Override
	public int compareTo(Student arg0) {
		return arg0.getFirstName().compareTo(getFirstName());
	}
	
	
}
