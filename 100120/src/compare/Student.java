package compare;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

//public class Student implements Comparable<Student>{
public class Student implements Comparable{
	private int rollno=0;
	private String firstname;
	private String lastname;
	private double Gpa;

	/*@Override
	public int compareTo(Student student) {
		int result=0;
		if(this.getGpa()>student.getGpa())
		{
			result=1;
		}
		if(this.getGpa()<student.getGpa())
		{
			result=-1;
		}
		if(this.getGpa()==student.getGpa())
		{
			result=0;
			
		}
		// TODO Auto-generated method stub
		return result;
	}*/

	@Override
	public int compareTo(Object o) {
		Student s=(Student)o;
		int result=0;
		if(this.getGpa()>s.getGpa())
		{
			result=1;
		}
		if(this.getGpa()<s.getGpa())
		{
			result=-1;
		}
		if(this.getGpa()==s.getGpa())
		{
			result=0;
			
		}
		// TODO Auto-generated method stub
		return result;
		
		
		// TODO Auto-generated method stub
		
	}
	

}
