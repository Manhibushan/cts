package com.my.springdemo3.springdemo4.bean;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Component("tas")


public class Task {
	private String taskId;
	private String taskName;
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + "]";
	}
	
	

}
