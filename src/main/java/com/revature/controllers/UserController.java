package com.revature.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.User;

@RestController
@RequestMapping("/users")
public class UserController {

	private User me = new User("Muhtasim", "The best COD player in this batch");
	
	@GetMapping
	public User getAllUser() {
		return this.me;
	}
}
