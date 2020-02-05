package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.Tododao;
import com.example.demo.model.Todo;

@SpringBootApplication
public class SpringjpademoApplication implements CommandLineRunner {
/*private Tododao tododao;




@Autowired
	public SpringjpademoApplication(Tododao tododao) {
	super();
	this.tododao = tododao;
}*/

	public static void main(String[] args) {
		SpringApplication.run(SpringjpademoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// TODO Auto-generated method stub
		/*tododao.save(new Todo("todo-1"));
		tododao.save(new Todo("todo-2"));
		tododao.save(new Todo("todo-3"));
		tododao.save(new Todo("todo-4"));
		*/
	}

}
