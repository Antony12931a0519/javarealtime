package com.realtimejava.friendbook.manager;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.realtimejava.friendbook.dao.FriendsDAO;
import com.realtimejava.friendbook.entities.Friends;
import com.realtimejava.friendbook.models.FriendsModel;

@RunWith(MockitoJUnitRunner.class)
public class FriendsManagerTest {
	@InjectMocks
	private FriendsManager friendsManager;

	@Mock
	private FriendsDAO friendsDAO;

	@Mock
	private GroupsManager groupsManager;

	@Test
	public void getFriendsForSucess() {

//		friendsDAO = Mockito.mock(FriendsDAO.class);

		List<Friends> friends = new ArrayList<Friends>();

		Friends friend = new Friends();
		friend.setId(101);
		friend.setAddress("SDDA");
		friend.setName("gsf");
		friend.setGroupId(1);

		Friends friend1 = new Friends();
		friend1.setId(102);
		friend1.setAddress("SDDA");
		friend1.setName("gsf");
		friend1.setGroupId(1);

		friends.add(friend);
		friends.add(friend1);

		Mockito.when(friendsDAO.findAll()).thenReturn(friends);

		// eclmma
		List<FriendsModel> object = friendsManager.getFriends();

	}

}
