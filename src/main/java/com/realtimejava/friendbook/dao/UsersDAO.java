package com.realtimejava.friendbook.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.realtimejava.friendbook.entities.Users;
@Repository
public interface UsersDAO extends CrudRepository<Users, String> {
	@Query("select user from Users user where user.userId=:userId and user.password=:password")
	public Users getUserByUserNameAndPassword(@Param("userId") String userId,
			@Param("password") String password);

}
