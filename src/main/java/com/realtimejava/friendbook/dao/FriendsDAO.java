package com.realtimejava.friendbook.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.realtimejava.friendbook.entities.Friends;

@Repository
public interface FriendsDAO extends CrudRepository<Friends, Integer> {
	
	public List<Friends> findFriendsByGroupId(int groupId);
	/*public List<Friends> findFriendsByAddress();
	public List<Friends> findFriendsByName();*/

}
