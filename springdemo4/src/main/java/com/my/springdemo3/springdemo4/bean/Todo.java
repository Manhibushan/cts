package com.my.springdemo3.springdemo4.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Component

public class Todo {
	@Value("${todo.todoId}")
	private String todoId;
	@Value("${todo.todoName}")
	private String todoName;
	@Value("${todo.isCompleted}")
	private boolean isCompleted;
	@Autowired
	private Task task;
	@Override
	public String toString() {
		return "Todo [todoId=" + todoId + ", todoName=" + todoName + ", isCompleted=" + isCompleted + ", task=" + task
				+ "]";
	}
	

}
