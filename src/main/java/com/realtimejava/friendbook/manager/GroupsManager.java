package com.realtimejava.friendbook.manager;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.realtimejava.friendbook.dao.GroupsDAO;
import com.realtimejava.friendbook.entities.Groups;

@Component
public class GroupsManager {

	@Autowired
	private GroupsDAO groupsDAO;

	public Groups getGroupById(int groupId) {
		Optional<Groups> optionalGroups = groupsDAO.findById(groupId);
		if (optionalGroups != null && optionalGroups.isPresent()) {
			Groups group = optionalGroups.get();
			if (group != null)
				return group;
		}
		return null;

	}

}
