package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Todo;
@Repository
public class Tododaoimp implements Tododao{
private List<Todo> todolist;
{
	todolist=new ArrayList<Todo>();
	todolist.add(new Todo("t1","test todo-1"));
	todolist.add(new Todo("t2","test todo-2"));
	todolist.add(new Todo("t3","test todo-3"));
	todolist.add(new Todo("t4","test todo-4"));
	todolist.add(new Todo("t5","test todo-5"));
}
	@Override
	public List<Todo> getalltodos() {
		// TODO Auto-generated method stub
		return todolist;
	}
	

}
