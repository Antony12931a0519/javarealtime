package com.realtimejava.friendbook.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	@Id
	private String userId;
	private String password;
	private String roletype;
	
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the roletype
	 */
	public String getRoletype() {
		return roletype;
	}
	/**
	 * @param roletype the roletype to set
	 */
	public void setRoletype(String roletype) {
		this.roletype = roletype;
	}

}
