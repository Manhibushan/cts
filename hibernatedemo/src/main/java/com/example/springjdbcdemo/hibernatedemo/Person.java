package com.example.springjdbcdemo.hibernatedemo;







import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Person {
	private String id;
	private String name;
	private LocalDate date;

}
