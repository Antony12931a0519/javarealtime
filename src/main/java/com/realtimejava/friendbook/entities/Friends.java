package com.realtimejava.friendbook.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Friends")
public class Friends {

	@Id
//	@Column(name = "friend_id")
	private int id;
//	@Column(name = "friend_name")
	private String name;
//	@Column(name = "address")
	private String address;
	private int groupId;

	/**
	 * @return the groupId
	 */
	public int getGroupId() {
		return groupId;
	}

	/**
	 * 
	 */
	public Friends() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param groupId the groupId to set
	 */
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param id
	 * @param name
	 * @param address
	 * @param groupId
	 */
	public Friends(int id, String name, String address, int groupId) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.groupId = groupId;
	}
	
	

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
