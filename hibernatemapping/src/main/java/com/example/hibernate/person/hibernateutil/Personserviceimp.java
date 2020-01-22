package com.example.hibernate.person.hibernateutil;

import java.io.IOException;
import java.util.List;

public class Personserviceimp implements Personservice {
	private PersonDao dao;
	{
		dao=new PersonDaoimp();
	}


	@Override
	public Person createPerson(Person person) {
		// TODO Auto-generated method stub
		return dao.createPerson(person);
	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return dao.getAllPersons();
	}
	@Override
	public Person getPersonByid(int id) {
		// TODO Auto-generated method stub
		return dao.getPersonByid(id);
	}

	

	@Override
	public Person updatePerson(Integer id) throws IOException {
		// TODO Auto-generated method stub
		return dao.updatePerson(id);
	}

	@Override
	public void deletePerson(Integer id) {
		// TODO Auto-generated method stub
		dao.deletePerson(id);
		
	}

	

}
