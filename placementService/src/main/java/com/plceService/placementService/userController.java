package com.plceService.placementService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController 
{
	@Autowired
 private userService userservice;
 
 @RequestMapping("/")
 public List<user> getAllusers()
 	{
	 return userservice.getAllusers(); 
 	}
 	
 	@RequestMapping(value="/add-user", method=RequestMethod.POST)
 	public void addUser(@RequestBody user userRecord){
 		userservice.addUser(userRecord);
 	}
 	
 		
 	
}
