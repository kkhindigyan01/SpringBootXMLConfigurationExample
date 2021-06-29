package com.kkhindigyan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kkhindigyan.app.model.WelcomeMessage;

@RestController
public class HelloController {
	
	@Autowired
	private WelcomeMessage message;

	@GetMapping(path = "/welcome")
	public String welcome() {
		return message.getMessage();
	}
}
