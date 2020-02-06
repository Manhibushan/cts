package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.Userdao;
import com.example.demo.model.User;
import com.example.demo.shared.Shared;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
@Service
@EnableTransactionManagement
public class Userserviceimp implements Userservice {

	
	private Userdao userdao;
	
	private ModelMapper modelmapper;
	{
		modelmapper=new ModelMapper();
		modelmapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}
	@Autowired
	public Userserviceimp(Userdao userdao) {
		super();
		this.userdao = userdao;
		
	}
	@Override
	@Transactional
	public Shared createUser(User user) {
		User tempuser=userdao.save(user);
		return modelmapper.map(tempuser,Shared.class);
	}



	@Override
	@Transactional
	public Shared findUserById(Integer id) {
		// TODO Auto-generated method stub
		return modelmapper.map(userdao.findById(id),Shared.class);
	}
	

}
