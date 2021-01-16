package com.realtimejava.friendbook.manager;

import com.realtimejava.friendbook.models.FriendsConsolidatedModel;
import com.realtimejava.friendbook.models.UsersModel;
import com.realtimejava.friendbook.response.UserResponse;

public interface UsersManager {	
	public UserResponse isUserExists(UsersModel usersModel);
	public FriendsConsolidatedModel getHomepageDetails();

}
