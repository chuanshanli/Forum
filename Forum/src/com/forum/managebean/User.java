package com.forum.managebean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "user")
@SessionScoped()
public class User {
	@Override
	public String toString() {

		return this.username + " " + this.gender + " " + this.password + " " + this.town + " ";
	}

	private String username;
	private String password;
	private String gender;
	private String town;

	public User(String username, String password, String gender, String town) {
		super();
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.town = town;
	}

	public User() {
		super();
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
