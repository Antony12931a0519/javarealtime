package com.realtimejava.friendbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.realtimejava.friendbook.manager.UsersManager;
import com.realtimejava.friendbook.models.UsersModel;
import com.realtimejava.friendbook.response.UserResponse;

@RestController
@RequestMapping("users")
public class UsersController {
	@Autowired
	private UsersManager usersManager;

	@PostMapping("getUserDetails")
	public UserResponse isUserExists(UsersModel usersModel) {
		return usersManager.isUserExists(usersModel);

	}

}