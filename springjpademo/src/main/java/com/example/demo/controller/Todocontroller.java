package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Todo;
import com.example.demo.service.Todoservice;

@RestController
@RequestMapping("/api")
public class Todocontroller {
	private Todoservice todoservice;
	@Autowired
	public Todocontroller(Todoservice todoservice) {
		super();
		this.todoservice = todoservice;
	}
	
	@GetMapping("/todos")
	public List<Todo> getAlltodos()
	{
		return todoservice.getAlltodos();
	}
	@GetMapping("/todos/{todoId}")
	public Optional<Todo> getBookById(@PathVariable Integer todoId)
	{
		return todoservice.gettodoById(todoId);
	}

}
