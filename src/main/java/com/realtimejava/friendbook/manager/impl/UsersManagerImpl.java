package com.realtimejava.friendbook.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.realtimejava.friendbook.dao.UsersDAO;
import com.realtimejava.friendbook.entities.Users;
import com.realtimejava.friendbook.manager.FriendsManager;
import com.realtimejava.friendbook.manager.PostsManager;
import com.realtimejava.friendbook.manager.UsersManager;
import com.realtimejava.friendbook.models.FriendsConsolidatedModel;
import com.realtimejava.friendbook.models.FriendsModel;
import com.realtimejava.friendbook.models.News;
import com.realtimejava.friendbook.models.Posts;
import com.realtimejava.friendbook.models.UsersModel;
import com.realtimejava.friendbook.response.UserResponse;

@Service
public class UsersManagerImpl implements UsersManager {
	@Autowired
	private UsersDAO usersdAO;
	@Autowired
	private FriendsManager friendsManager;
	@Autowired
	private PostsManager postsManager;
	
	

	@Override
	public UserResponse isUserExists(UsersModel usersModel) {
		Users user = null;
		boolean isUserExists = false;
		UserResponse userResponse = null;

		if (usersModel != null && usersModel.getUserId() != null
				&& !usersModel.getUserId().isEmpty()
				&& usersModel.getPassword() != null
				&& !usersModel.getPassword().isEmpty()) {
			user = usersdAO.getUserByUserNameAndPassword(
					usersModel.getUserId(), usersModel.getPassword());
		}
		isUserExists = user != null ? true : false;

		userResponse = new UserResponse();
		userResponse.setResponse("Success");
		userResponse.setUserExists(isUserExists);

		return userResponse;
	}

	@Override
	public FriendsConsolidatedModel getHomepageDetails() {

		List<FriendsModel> friends = null;
		List<Posts> posts = null;
		List<News> news = null;
		FriendsConsolidatedModel friendsConsolidateModel = new FriendsConsolidatedModel();

		friends = friendsManager.getFriends();
		if (friends != null && friends.size() > 0) {

			friendsConsolidateModel.setFriends(friends);

		}
		posts = postsManager.getPosts();
		if (posts != null && posts.size() > 0) {

			friendsConsolidateModel.setPosts(posts);

		}
		

		return friendsConsolidateModel;
	}

}
