package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repositry.ItemRep;

@SpringBootApplication
public class SpringmongodbApplication implements CommandLineRunner {
	private ItemRep itemRepositry;
	
	
	
	
	
	@Autowired
	public SpringmongodbApplication(ItemRep itemRepositry) {
		super();
		this.itemRepositry = itemRepositry;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringmongodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
