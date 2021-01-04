package com.realtimejava.friendbook.manager;

import java.util.List;
import java.util.Optional;

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

	public String updateFriend(Friends friends) {

		if (friends != null && friends.getId() != 0) {

			// select * from friends where id=friends.getId();

			// select * from friends where id=101;
			Optional<Friends> optionalFriend = friendsDAO
					.findById( friends.getId());
			Friends friend = optionalFriend.get();
			if (friend != null) {
				// null///""
				if (friends.getName() != null && !friends.getName().isEmpty()) {
					friend.setName(friends.getName());
				}
				if (friends.getAddress() != null
						&& !friends.getAddress().isEmpty()) {
					friend.setAddress(friends.getAddress());
				}
				// friendsDAO.save(friends);
				Friends updatedFriend = friendsDAO.save(friend);
				if (updatedFriend != null)
					return "FriendDetals updated successsfully";

			}

		}

		return "FriendDetals not updated successsfully";

	}

}
