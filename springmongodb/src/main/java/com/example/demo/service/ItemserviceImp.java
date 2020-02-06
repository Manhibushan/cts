package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Item;

import com.example.demo.repositry.ItemRep;

@Service
@EnableTransactionManagement
public class ItemserviceImp implements Itemservice{
	//@Autowired
	private ItemRep itemRepositry;
	
@Autowired
	public ItemserviceImp(ItemRep itemRepositry) {
		super();
		this.itemRepositry = itemRepositry;
	}

	@Override
	@Transactional
	public List<Item> getAllitem() {
		// TODO Auto-generated method stub
		return itemRepositry.findAll();
	}

	@Override
	@Transactional
	public Item createItem(Item item) {
		// TODO Auto-generated method stub
		return itemRepositry.insert(item);
	}

	@Override
	@Transactional
	public Optional<Item> findbyId(String itemId) {
		Optional<Item> item=itemRepositry.findById(itemId);
		return item;
		
	}

	@Override
	public void deleteitembyId(String itemId) {
		itemRepositry.deleteById(itemId);
		
	}

	@Override
	public void deleteAll() {
		 itemRepositry.deleteAll();
		
	}

	@Override
	public List<Item> findByitemName(String itemName) {
		return itemRepositry.findByitemName(itemName);
	}

	

}
