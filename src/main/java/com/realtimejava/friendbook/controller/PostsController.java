package com.realtimejava.friendbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.realtimejava.friendbook.manager.PostsManager;
import com.realtimejava.friendbook.models.Posts;

@RestController
public class PostsController {

	@Autowired
	private PostsManager postsManager;

	@RequestMapping("/posts")
	public List<Posts> getPosts() {
		// PostsManager postsManager = new PostsManager();
		return postsManager.getPosts();

	}
	
	@RequestMapping("/news")
	public List<Posts> getNews() {
		// PostsManager postsManager = new PostsManager();
		return postsManager.getPosts();

	}

}
