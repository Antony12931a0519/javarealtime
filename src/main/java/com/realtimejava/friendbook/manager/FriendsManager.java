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

			Optional<Friends> optionalFriend = friendsDAO.findById(friends
					.getId());

			if (optionalFriend != null && optionalFriend.isPresent()) {
				Friends friend = optionalFriend.get();
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

			} else {
				return "FriendDetals not updated successsfully";
			}

		}
		return null;

	}

	public String updateFriendByPathParam(int friendId, Friends friends) {

		if (friends != null && friendId != 0) {

			Optional<Friends> optionalFriend = friendsDAO.findById(friendId);

			if (optionalFriend != null && optionalFriend.isPresent()) {
				Friends friend = optionalFriend.get();
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

			} else {
				return "FriendDetals not updated successsfully";
			}

		}
		return null;

	}
	
	public String updateFriendDetailsByPathParam(int friendId, String address) {

		if (address != null && friendId != 0) {

			Optional<Friends> optionalFriend = friendsDAO.findById(friendId);

			if (optionalFriend != null && optionalFriend.isPresent()) {
				Friends friend = optionalFriend.get();
				// null///""
				/*
				 * if (address != null && !address.isEmpty()) {
				 * friend.setName(friends.getName()); }
				 */
				if (address != null && !address.isEmpty()) {
					friend.setAddress(address);
				}
				// friendsDAO.save(friends);
				Friends updatedFriend = friendsDAO.save(friend);
				if (updatedFriend != null)
					return "FriendDetals updated successsfully";

			} else {
				return "FriendDetals not updated successsfully";
			}

		}
		return null;

	}


	public String deleteFriend(int friendId) {

		if (friendId != 0) {

			Optional<Friends> optionalFriend = friendsDAO.findById(friendId);

			if (optionalFriend != null && optionalFriend.isPresent()) {
				Friends friend = optionalFriend.get();

				if (friend != null) {

					friendsDAO.delete(friend);
					return "FriendDetals deleted successfully";
				}

			} else {
				return "FriendDetals are  not available";
			}

		} else {
			return "FriendDetals are  not available";
		}
		return null;

	}
}
