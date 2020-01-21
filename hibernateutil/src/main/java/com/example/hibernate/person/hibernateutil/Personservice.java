package com.example.hibernate.person.hibernateutil;

import java.io.IOException;
import java.util.List;

public interface Personservice {
	public Person createPerson(Person person);
	public List<Person> getAllPersons();
	public Person getPersonByid(int id);
	public Person updatePerson(Integer id) throws IOException;
	public void deletePerson(Integer id);


}
