package com.realtimejava.friendbook.manager;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.realtimejava.friendbook.dao.FriendsDAO;
import com.realtimejava.friendbook.entities.Friends;
import com.realtimejava.friendbook.entities.Groups;
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

		// friendsDAO = Mockito.mock(FriendsDAO.class);

		List<Friends> friends = new ArrayList<Friends>();

		Friends friend = new Friends();
		friend.setId(101);
		friend.setAddress("SDDA");
		friend.setName("gsf");
		friend.setGroupId(1);

		Friends friend1 = new Friends();
		friend1.setId(102);
		friend1.setAddress("Hyderbad");
		friend1.setName("gsf");
		friend1.setGroupId(1);

		friends.add(friend);
		friends.add(friend1);

		Mockito.when(friendsDAO.findAll()).thenReturn(friends);

		Groups groups = new Groups();
		groups.setGroupId(1);
		groups.setDescription("sfsdf");
		groups.setName("group1");

		Mockito.when(groupsManager.getGroupById(1)).thenReturn(groups);

		// eclmma
		List<FriendsModel> object = friendsManager.getFriends();

		Assert.assertEquals("Hyderbad", object.get(1).getAddress());
		Assert.assertEquals(2, object.size());

	}

	@Test
	public void getFriendsForGroupsAsNull() {

		List<Friends> friends = new ArrayList<Friends>();

		Friends friend = new Friends();
		friend.setId(101);
		friend.setAddress("SDDA");
		friend.setName("gsf");
		friend.setGroupId(1);

		Friends friend1 = new Friends();
		friend1.setId(102);
		friend1.setAddress("Hyderbad");
		friend1.setName("gsf");
		friend1.setGroupId(1);

		friends.add(friend);
		friends.add(friend1);

		Mockito.when(friendsDAO.findAll()).thenReturn(friends);

		Groups groups = new Groups();
		groups.setGroupId(1);
		groups.setDescription("sfsdf");
		groups.setName("group1");

		Mockito.when(groupsManager.getGroupById(1)).thenReturn(null);

		// eclmma
		List<FriendsModel> object = friendsManager.getFriends();

		Assert.assertEquals("Hyderbad", object.get(1).getAddress());
		Assert.assertEquals(2, object.size());

	}

	@Test(expected = NullPointerException.class)
	public void getFriendsForFriendsAsNull() {

		Mockito.when(friendsDAO.findAll()).thenReturn(new ArrayList<Friends>());

		// eclmma
		List<FriendsModel> object = friendsManager.getFriends();

	}

}
