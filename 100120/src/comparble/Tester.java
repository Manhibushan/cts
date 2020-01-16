package comparble;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Tester {
	public static void main(String[] args)
	{
		Comparator c=new NameComp();
		c=new GPAComparator();
		Set<Student> studentset=new TreeSet<Student>(c);
		studentset.add(new Student("Mike", "Hauffmann", 101, 4.0));
		studentset.add(new Student("John", "Lynn", 102, 2.8));
		studentset.add(new Student("Jim", "Max", 103, 3.6));
		studentset.add(new Student("Kelly", "Grant", 104, 2.3));
		Object[] studentArray=studentset.toArray();
		Student s;
		for (Object obj : studentArray) {
			s = (Student) obj;
			System.out.printf("Name = %s %s ID = %d GPA = %.1f\n", s.getFirstname(), s.getLastname(), s.getStudentId(),
					s.getGpa());
		
		
	}
	}
	
	
	
}
