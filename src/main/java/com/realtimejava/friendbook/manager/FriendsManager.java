package com.realtimejava.friendbook.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.realtimejava.friendbook.dao.FriendsDAO;
import com.realtimejava.friendbook.entities.Friends;

@Component
public class FriendsManager {

	@Autowired
	private FriendsDAO friendsDAO;

	public List<Friends> getFriends() {

		List<Friends> friends = (List<Friends>) friendsDAO.findAll();
		return friends;

	}

	public Friends createFriends(Friends friends) {
		Friends friend = friendsDAO.save(friends);
		return friend;
	}

}
