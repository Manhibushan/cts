package com.example.hibernate.hibernatetodo;

import java.time.LocalDateTime;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor



public class Todo {
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)	

private int tdoId;

private String uId;
@Column(name="name")
private String todoName;
@Column(name="datetime")
private LocalDateTime datetime;
}
