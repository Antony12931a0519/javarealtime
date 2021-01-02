package com.realtimejava.friendbook.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {
	
	@RequestMapping("/posts")
	public String getPosts() {
		return "1,2,3,4,5..";

	}

}
