package com.realtimejava.friendbook.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.realtimejava.friendbook.entities.Groups;

@Repository
public interface GroupsDAO extends CrudRepository<Groups, Integer> {

}
