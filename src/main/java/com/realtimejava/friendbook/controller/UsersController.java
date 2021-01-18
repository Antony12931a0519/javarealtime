package com.realtimejava.friendbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.realtimejava.friendbook.manager.UsersManager;
import com.realtimejava.friendbook.models.FriendsConsolidatedModel;
import com.realtimejava.friendbook.models.UsersModel;
import com.realtimejava.friendbook.response.UserResponse;

@RestController
@RequestMapping("users")
public class UsersController {
	@Autowired
	private UsersManager usersManager;

	@PostMapping("getUserDetails")
	public UserResponse isUserExists(@RequestBody UsersModel usersModel) {
		return usersManager.isUserExists(usersModel);

	}
	
	@GetMapping("homepage")
	public FriendsConsolidatedModel getHomepageDetails() {
		return usersManager.getHomepageDetails();

	}

}
