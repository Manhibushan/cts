package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Tester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectMapper mapper=new ObjectMapper();
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			Student s=new Student();
					s.setId(100);
				s.setFirstName("john");
				s.setLastName("doe");
				String json=mapper.writeValueAsString(s);
				System.out.println(json);
				
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
