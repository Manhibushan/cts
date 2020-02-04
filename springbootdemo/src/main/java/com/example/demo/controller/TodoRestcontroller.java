package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Todo;
import com.example.demo.service.Todoservice;

@RestController
@RequestMapping("/todos")

public class TodoRestcontroller {
	private Todoservice todoservice;

	public TodoRestcontroller(Todoservice todoservice) {
		super();
		this.todoservice = todoservice;
	}
	@GetMapping("/")
	public List<Todo> getAllToDos() {
		// TODO Auto-generated method stub
		return todoservice.getAllToDos();
	}

}
