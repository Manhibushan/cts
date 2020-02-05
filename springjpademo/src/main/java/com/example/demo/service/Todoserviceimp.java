package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.Tododao;
import com.example.demo.model.Todo;
@Service
@EnableTransactionManagement
public class Todoserviceimp implements Todoservice {
private Tododao tododao;
@Autowired
public Todoserviceimp(Tododao tododao) {
	super();
	this.tododao = tododao;
}
	@Override
	@Transactional
	public List<Todo> getAlltodos() {
		// TODO Auto-generated method stub
		return tododao.findAll();
	}

	

	@Override
	@Transactional
	public Optional<Todo> gettodoById(Integer todoId) {
		Optional<Todo> todo=tododao.findById(todoId);
		return todo;
	}
	@Override
	public Todo create(Todo todo) {
		// TODO Auto-generated method stub
		return tododao.save(todo);
	}
	@Override
	public void deletetodobyId(Integer todoId) {
		tododao.deleteById(todoId);
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		tododao.deleteAll();
		
	}

}
