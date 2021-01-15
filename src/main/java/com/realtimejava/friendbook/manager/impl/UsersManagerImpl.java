package com.realtimejava.friendbook.manager.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.realtimejava.friendbook.dao.UsersDAO;
import com.realtimejava.friendbook.entities.Users;
import com.realtimejava.friendbook.manager.UsersManager;
import com.realtimejava.friendbook.models.UsersModel;
import com.realtimejava.friendbook.response.UserResponse;

@Service
public class UsersManagerImpl implements UsersManager {
	@Autowired
	private UsersDAO usersdAO;

	@Override
	public UserResponse isUserExists(UsersModel usersModel) {
		Users user = null;
		boolean isUserExists = false;
		UserResponse userResponse = null;

		if (usersModel != null && usersModel.getUserId() != null
				&& !usersModel.getUserId().isEmpty()
				&& usersModel.getPassword() != null
				&& !usersModel.getPassword().isEmpty()) {
			/*user = usersdAO.getUserByUserNameAndPassword(
					usersModel.getUserId(), usersModel.getPassword());*/
			Optional<Users> userOptional  = usersdAO.findById(usersModel.getUserId());
			user = userOptional.get();
					
			
		}
		isUserExists = user != null ? true : false;
		System.out.println("7777777777777777777777777777------"+isUserExists+"$$$$$$$$$$$$$$$$$$$$$$$$$$");
		if (isUserExists) {
			userResponse = new UserResponse();
			userResponse.setResponse("Success");
			userResponse.setUserExists(isUserExists);
		} else
			return userResponse;
		return userResponse;
	}

}