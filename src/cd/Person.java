package cd;

import lombok.ToString;

@ToString

public class Person {
	String name;
	Address address;
	int age;
	public Person() {
		this("John");
		System.out.println("in default constructor");
		
	}
public Person(String name) {
		
		this(name,new Address("ABC","XYZ",199999));
		System.out.println("in one argument constructor");
	}
public Person(String name, Address address) {
	
	this(name,address,34);
	System.out.println("in two argument constructor");
}

	public Person(String name, Address address, int age) {
		
		this.name = name;
		this.address = address;
		this.age = age;
		System.out.println("in three argument constructor");
	}
	
	

	

	
	

	
	
	
}
