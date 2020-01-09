package Coll;

import java.util.Collections;
import java.util.LinkedList;


public class MyList {
	private LinkedList<String> list=new LinkedList<String>();
	
	public void getSortedList()
	{
		list.add("cricket");
		list.add("football");
		list.add("sing");
		list.add("sang");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
	public static void main(String[] args)
	{
		MyList mlist=new MyList();
		mlist.getSortedList();
	}
	
}
