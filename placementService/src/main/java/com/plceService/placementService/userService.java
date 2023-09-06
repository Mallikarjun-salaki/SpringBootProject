package com.plceService.placementService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
	
	@Autowired
	private userRepo userrepo;

	public List<user> getAllusers()
	{
		List<user> user=new ArrayList();
		userrepo.findAll().forEach(user::add);
		return user;
	}
	public void addUser(user user) {
		
		userrepo.save(user);
		
	}
}
