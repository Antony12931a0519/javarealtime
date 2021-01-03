package com.realtimejava.friendbook.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.realtimejava.friendbook.entities.Friends;

@Repository
public interface FriendsDAO extends CrudRepository<Friends, Long> {

}
