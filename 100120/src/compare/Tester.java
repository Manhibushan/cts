package compare;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tester {
	public static void main(String[] args)
	{
		Set<Student> set=new TreeSet<Student>();
		set.add(new Student(585,"john","abraham",9.0));
		set.add(new Student(586,"marry","..",7.0));
		set.add(new Student(587,"mahendrasingh","dhoni",5.0));
		set.add(new Student(588,"sehwag","tendulkar",9.5));
		//for(Student s:set)
		//{
			//System.out.println(s+"\n");
		//}
		Iterator iterator=set.iterator();
		 while (iterator.hasNext()) 
	            System.out.print(iterator.next() + "\n ");
		
		
	}

	
}
