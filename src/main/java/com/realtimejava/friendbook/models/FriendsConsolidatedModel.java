package com.realtimejava.friendbook.models;

import java.util.List;

public class FriendsConsolidatedModel {

	private List<FriendsModel> friends;
	private List<News> news;
	private List<Posts> posts;

	/**
	 * @return the friends
	 */
	public List<FriendsModel> getFriends() {
		return friends;
	}

	/**
	 * @param friends
	 *            the friends to set
	 */
	public void setFriends(List<FriendsModel> friends) {
		this.friends = friends;
	}

	/**
	 * @return the news
	 */
	public List<News> getNews() {
		return news;
	}

	/**
	 * @param news
	 *            the news to set
	 */
	public void setNews(List<News> news) {
		this.news = news;
	}

	/**
	 * @return the posts
	 */
	public List<Posts> getPosts() {
		return posts;
	}

	/**
	 * @param posts
	 *            the posts to set
	 */
	public void setPosts(List<Posts> posts) {
		this.posts = posts;
	}

}
