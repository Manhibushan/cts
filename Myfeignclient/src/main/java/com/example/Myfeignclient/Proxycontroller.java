package com.example.Myfeignclient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.feignuserservice.Groups;

@RestController
public class Proxycontroller {

	
	@Autowired
	private UserServiceClient userserviceclient;
	@RequestMapping("/groups")
	public List<Groups> getAllGroups()
	{
		return userserviceclient.getAllGroups();
		
	}
}
