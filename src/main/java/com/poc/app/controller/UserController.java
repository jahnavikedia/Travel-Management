package com.poc.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.poc.app.model.User;
import com.poc.app.repository.UserRepo;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserRepo UserRepo;

	@GetMapping(path="/listuser")
	public List<User> listuser(){
		List<User> list = UserRepo.findAll();
		return list;
	}
	
	@PostMapping(path="/save/{username}/{contact}")
	public void Usersave(@PathVariable("username") String username, @PathVariable("contact") String contact)
	{
		User newUser = new User();
		newUser.setUser_name(username);
		newUser.setContact(contact);
		newUser.setBooking(null);
		UserRepo.save(newUser);
		
	}
	
}
