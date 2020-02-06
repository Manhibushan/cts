package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Item;

public interface Itemservice {
	public List<Item> getAllitem();
	public Item   createItem(Item item);
	public Optional<Item> findbyId(String itemId);
	public void deleteitembyId(String itemId);
	public void deleteAll();
	public List<Item> findByitemName(String itemName);

}
