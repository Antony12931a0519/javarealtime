package com.realtimejava.friendbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@PutMapping("/update/friend")
	public String updateFriend(@RequestBody Friends friends) {
		return friendsManager.updateFriend(friends);

	}

	@PutMapping("/update/friend/{friendId}")
	public String updateFriendUsingPathParam(
			@PathVariable("friendId") int friendId, @RequestBody Friends friends) {
		return friendsManager.updateFriendByPathParam(friendId, friends);

	}

	@PutMapping("/update/friend/{friendId}/{address}")
	public String updateFriendDetailsUsingPathParam(
			@PathVariable("friendId") int friendId,
			@PathVariable("address") String address) {
		return friendsManager.updateFriendDetailsByPathParam(friendId, address);

	}

	@PostMapping("/delete/friend")
	public String deleteFriend(@RequestBody Friends friends) {
		return friendsManager.deleteFriend(friends.getId());

	}

	@RequestMapping(value = "/delete/friendbyid", method = RequestMethod.DELETE)
	public String deleteFriendById(@RequestBody Friends friends) {
		return friendsManager.deleteFriend(friends.getId());

	}

}
