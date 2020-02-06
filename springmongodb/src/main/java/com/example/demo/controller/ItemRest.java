package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.error.Errormessage;
import com.example.demo.error.ItemNotfoundException;
import com.example.demo.model.Item;

import com.example.demo.repositry.ItemRep;

@RestController
@RequestMapping("/api")
public class ItemRest {
	private ItemRep itemRepositry;
@Autowired
	public ItemRest(ItemRep itemRepositry) {
		super();
		this.itemRepositry = itemRepositry;
	}
@ExceptionHandler
public ResponseEntity<Errormessage> handle1(ItemNotfoundException bne)
{
	Errormessage errmsg=new Errormessage();
	errmsg.setMessage(bne.getmessage());
	errmsg.setStatus(HttpStatus.NOT_FOUND.value());
	errmsg.setErrortime(System.currentTimeMillis());
	return new ResponseEntity<Errormessage>(errmsg,HttpStatus.NOT_FOUND);
}

@ExceptionHandler
public ResponseEntity<Errormessage> handle2(Exception e)
{
	Errormessage errmsg=new Errormessage();
	errmsg.setMessage(e.getMessage());
	errmsg.setStatus(HttpStatus.BAD_REQUEST.value());
	errmsg.setErrortime(System.currentTimeMillis());
	return new ResponseEntity<Errormessage>(errmsg,HttpStatus.BAD_REQUEST);
}

		@PostMapping("/items")
		public Item createItem(@RequestBody Item item)
		{
			return itemRepositry.insert(item);
		}
		@PutMapping("/items")
		public Item UpdateItem(@RequestBody Item item)
		{
			return itemRepositry.save(item);
		}
		
		@GetMapping("/items")
		public List<Item> getAllItem()
		{
			return itemRepositry.findAll();
	
		}
		@GetMapping("/items/{itemId}")
		public Optional<Item> getitemById(@PathVariable String itemId )
		{
			Optional<Item> item=itemRepositry.findById(itemId);
				return item;
		}
		@DeleteMapping("/items/{itemId}")
		public void deleteitembyId(@PathVariable String itemId)
		{
			itemRepositry.deleteById(itemId);
		}
		@DeleteMapping("/items")
		public void deleteAll()
		{
			itemRepositry.deleteAll();
		}
	@GetMapping("/items/findbyitemName/{itemName}")
	public List<Item> findByitemName(@PathVariable String itemName)
	{
		return itemRepositry.findByitemName(itemName);	}
}
