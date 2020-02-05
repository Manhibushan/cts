package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Todo;
@Repository
@Transactional

public interface Tododao extends JpaRepository<Todo, Integer> 
{

	public List<Todo> findBytodoName(String todoName);
	public void deleteBytodoName(String todoName );
}
