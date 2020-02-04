package com.example.demo.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Todo;
@Repository
@Transactional

public interface Tododao extends JpaRepository<Todo, Integer> 
{

	
}
