package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Tododao;
import com.example.demo.model.Todo;
@Service
public class Todoserviceimp implements Todoservice {
private Tododao tododao;






@Autowired
	public Todoserviceimp(Tododao tododao) {
	super();
	this.tododao = tododao;
}





















	@Override
	public List<Todo> getAllToDos() {
		// TODO Auto-generated method stub
		return tododao.getalltodos();
	}

}
