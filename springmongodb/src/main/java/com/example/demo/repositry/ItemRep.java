package com.example.demo.repositry;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Item;


@Repository
public interface ItemRep extends MongoRepository<Item, String> {
	public List<Item> findByitemName(String itemName);

}
