package com.realtimejava.friendbook.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurdController {
	// read
	@GetMapping("/welcome")
	public String getWelcomeMessage() {
		return "Hey Welcome to the Friendbook!!!";

	}

	// create
	@PostMapping("/welcome")
	public String getWelcomeMessage1() {
		return "Hey Welcome to the Friendbook!!!";

	}

	// update
	@PutMapping("/welcome")
	public String getWelcomeMessage2() {
		return "Hey Welcome to the Friendbook!!!";

	}

	// delete
	@DeleteMapping("/welcome")
	public String getWelcomeMessage3() {
		return "Hey Welcome to the Friendbook!!!";

	}

}
