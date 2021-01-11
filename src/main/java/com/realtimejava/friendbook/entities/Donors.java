package com.realtimejava.friendbook.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Anthony Sampath
 *
 */
@Entity
@Table(name = "donors")
public class Donors {
	@Id
	@Column(name = "donor_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long donorId;
	@Column(name = "status")
	private String status;
	@Column(name = "contact")
	private String contact;
	@Column(name = "place")
	private String place;
	@Column(name = "name")
	private String name;
	@Column(name = "state")
	private long state;
	@Column(name = "password")
	private String password;
	@Column(name = "blood_group")
	private String bloodGroup;
	@Column(name = "age")
	private String age;
	@Column(name = "gender")
	private String gender;
	@Column(name = "email")
	private String email;
	@Column(name = "hide_mobile_number")
	private String hideMobileNumber;
	@Column(name = "date_of_birth")
	private Date dateOfBirth;

	/**
	 * @return the donorId
	 */
	public long getDonorId() {
		return donorId;
	}

	/**
	 * @param donorId
	 *            the donorId to set
	 */
	public void setDonorId(long donorId) {
		this.donorId = donorId;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * @param contact
	 *            the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * @param place
	 *            the place to set
	 */
	public void setPlace(String place) {
		this.place = place;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the state
	 */
	public long getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(long state) {
		this.state = state;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the bloodGroup
	 */
	public String getBloodGroup() {
		return bloodGroup;
	}

	/**
	 * @param bloodGroup
	 *            the bloodGroup to set
	 */
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the hideMobileNumber
	 */
	public String getHideMobileNumber() {
		return hideMobileNumber;
	}

	/**
	 * @param hideMobileNumber
	 *            the hideMobileNumber to set
	 */
	public void setHideMobileNumber(String hideMobileNumber) {
		this.hideMobileNumber = hideMobileNumber;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth
	 *            the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
