package comparble;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Student {
	String firstname,lastname;
	int studentId=0;
	double Gpa=0.0;
	public Student(String firstname, String lastname, int studentId, double Gpa) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.studentId = studentId;
		this.Gpa = Gpa;
	}
	public String firstName() {
		return firstname;
	}

	public String lastName() {
		return lastname;
	}

	public int studentID() {
		return studentId;
	}

	public double GPA() {
		return Gpa;
	}

}
