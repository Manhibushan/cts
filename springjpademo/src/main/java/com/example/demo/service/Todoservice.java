package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Todo;

public interface Todoservice {
	
	public List<Todo> getAlltodos();
	public Optional<Todo> gettodoById(Integer todoId);
	public Todo create(Todo todo);
	public void deletetodobyId(Integer todoId);
	public void deleteAll();
}
