package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.error.TodonotfoundException;
import com.example.demo.error.Errormessage;
import com.example.demo.model.Todo;
import com.example.demo.service.Todoservice;

import io.micrometer.core.ipc.http.HttpSender.Response;

@RestController
@RequestMapping("/api")
public class Todocontroller {
	private Todoservice todoservice;
	@Autowired
	public Todocontroller(Todoservice todoservice) {
		super();
		this.todoservice = todoservice;
	}
	@ExceptionHandler
	public ResponseEntity<Errormessage> handle1(TodonotfoundException bne)
	{
		Errormessage errmsg=new Errormessage();
		errmsg.setMessage(bne.getmessage());
		errmsg.setStatus(HttpStatus.NOT_FOUND.value());
		errmsg.setErrortime(System.currentTimeMillis());
		return new ResponseEntity<Errormessage>(errmsg,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<Errormessage> handle2(Exception e)
	{
		Errormessage errmsg=new Errormessage();
		errmsg.setMessage(e.getMessage());
		errmsg.setStatus(HttpStatus.BAD_REQUEST.value());
		errmsg.setErrortime(System.currentTimeMillis());
		return new ResponseEntity<Errormessage>(errmsg,HttpStatus.BAD_REQUEST);
	}
	
	
	@GetMapping("/todos")
	public List<Todo> getAlltodos()
	{
		return todoservice.getAlltodos();
	}
	@GetMapping("/todos/{todoId}")
	public Optional<Todo> gettodoById(@PathVariable Integer todoId)throws Exception
	{
		Optional<Todo> todo=todoservice.gettodoById(todoId);
		if(!todo.isPresent())
		{
			throw new TodonotfoundException("Todo  not found"+todoId);
		}
		return todo;
	}
	@PostMapping("/todos")
	public Todo create(@RequestBody Todo todo)
	{
		todo.setTodoId(0);

		return todoservice.create(todo);
		
	}
	@PutMapping("/todos")
	public Todo update(@RequestBody Todo todo)
	{
		return todoservice.create(todo);
	}
	@DeleteMapping("/todos/{todoId}")
	public  void  deletetodobyId(@PathVariable Integer todoId)
	{
		todoservice.deletetodobyId(todoId);
	}
	@DeleteMapping("/todos")
	public void deleteAll(){

		todoservice.deleteAll();
	}
	@GetMapping("/todos/findBytodoName/{todoName}")
	public List<Todo> findBytodoName(@PathVariable String todoName)
	{
		return todoservice.findbytodoname(todoName);
		
	}
	@DeleteMapping("/todos/deleteBytodoName/{todoName}")
	public void deleteBytodoName(@PathVariable String todoName)
	{
			todoservice.deleteBytodoName(todoName);
	}
}

