package Coll;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class Shuffle {
	public static void main(String[] args)
	{
		String name[]= {new String("sang"),
				new String("cricket"),
				new String("football"),
				new String("Teacher")
		};
		
		
	/*List<String> l=Arrays.asList(name);
	System.out.println(l);
	Collections.shuffle(l);
	System.out.println(l);*/
	List<Integer> l=new ArrayList<Integer>();
	l.add(30);
	l.add(40);
	l.add(-30);
	int index=Collections.binarySearch(l,80);
	if(index>=0)
	{
		System.out.println("found"+index);
	}
	else
	{
		System.out.println("Not found"+index);
	}
	
	}
		

}
