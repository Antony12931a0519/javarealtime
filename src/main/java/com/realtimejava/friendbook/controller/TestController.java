package com.realtimejava.friendbook.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/welcome")
	public String getWelcomeMessage() {
		return "Hey Welcome to the Friendbook!!!";

	}

	@RequestMapping("/welcome/friends")
	public String getFriends() {
		return "Antony,Srinivas,Lourdhu,Sandeep...";

	}
	
	@RequestMapping("/welcome/groups")
	public String getGroups() {
		return "abc,def,ghi..";

	}

}
