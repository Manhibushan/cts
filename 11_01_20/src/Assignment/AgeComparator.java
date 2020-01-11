package Assignment;

import java.util.Comparator;

public class AgeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		if(e1.getAge()==e2.getAge())
		{
		return (e1.getDateofjoining().compareTo(e2.getDateofjoining()));
		}
		else if(e1.getAge()>e2.getAge())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	

}
