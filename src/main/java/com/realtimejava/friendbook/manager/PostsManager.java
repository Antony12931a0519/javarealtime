package com.realtimejava.friendbook.manager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.realtimejava.friendbook.models.Posts;
@Service
public class PostsManager {

	public List<Posts> getPosts() {

		List<Posts> postsList = new ArrayList<Posts>();

		Posts p1 = new Posts();
		p1.setPostId(101);
		p1.setPostName("new1");

		Posts p2 = new Posts();
		p2.setPostId(102);
		p2.setPostName("new2");

		postsList.add(p1);
		postsList.add(p2);
		return postsList;

	}

}
