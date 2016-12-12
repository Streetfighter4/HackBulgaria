package hack.bulgaria.java.sorts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Ivan", "Petrov", 6));
		students.add(new Student("Peter", "Ivanov", 6));
		students.add(new Student("Stan" , "Lii", 2));
		students.add(new Student("Stan", "Lii" , 5));
		
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.getFirstName().compareTo(o1.getFirstName());
			}
		});
		
		for (Student student : students) {
			System.out.print(student.getFirstName() + " " + student.getThirdName() + " " + student.getGrade() + "\n");
		}
	}
}
