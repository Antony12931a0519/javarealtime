package com.realtimejava.friendbook.response;

public class UserResponse {
	private String response;
	private boolean isUserExists;

	/**
	 * @return the response
	 */
	public String getResponse() {
		return response;
	}

	/**
	 * @param response
	 *            the response to set
	 */
	public void setResponse(String response) {
		this.response = response;
	}

	/**
	 * @return the isUserExists
	 */
	public boolean isUserExists() {
		return isUserExists;
	}

	/**
	 * @param isUserExists
	 *            the isUserExists to set
	 */
	public void setUserExists(boolean isUserExists) {
		this.isUserExists = isUserExists;
	}

}
