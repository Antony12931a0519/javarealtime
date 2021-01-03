package com.realtimejava.friendbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.realtimejava.friendbook.entities.Friends;
import com.realtimejava.friendbook.manager.FriendsManager;

@RestController
@RequestMapping("friendbook")
public class FriendsController {
	@Autowired
	private FriendsManager friendsManager;

	@GetMapping("/friends")
	public List<Friends> getFriends() {
		List<Friends> friends = friendsManager.getFriends();
		return friends;
	}

	@PostMapping("/create/friends")
	public Friends createFriends(@RequestBody Friends friends) {
		Friends friend = friendsManager.createFriends(friends);
		return friend;
	}

}
