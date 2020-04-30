package com.mymenu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mymenu.model.Menu;
import com.mymenu.service.MenuService;

@RestController
public class MenuController 
{
	@Autowired
	MenuService menuService;
	@PostMapping("/menu")
	private Menu createMenu(@RequestBody Menu menu) 
	{
		return menuService.createMenu(menu);
	
	}
	@GetMapping("/menu/{id}")
	private Menu getMenuItem (@PathVariable("id") int id) 
	{
		return menuService.getMenuItem(id);
	}
	@PutMapping("/menu/{id}")
	private Menu update(@RequestBody Menu menu,@PathVariable("id") int id) 
	{
		 Menu menu1 = null;
		 
		if(menuService.getMenuItem(id)!=null) {
		 menu1 = menuService.createMenu(menu);
		}
		return menu1;
		
	}
	@DeleteMapping("/menu/{id}")
	private void delete(@PathVariable("id") int id) 
	{
		menuService.delete(id);
	}

}
