package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author MSI-Nam
 *
 */
@Document(collection = "User")
public class userModel {
	@Id
	private String _id;
	private String userName;
	private String password;
	private String role;
	private String name;

	public userModel(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	public userModel(String userName, String password, String role) {
		super();
		this.userName = userName;
		this.password = password;
		this.role = role;
	}

	public userModel(String userId, String userName, String password, String role) {
		super();
		this._id = userId;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}
	
	
	
	public userModel(String _id, String userName, String password, String role, String name) {
		super();
		this._id = _id;
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.name = name;
	}

	public userModel() {
		super();
	}
	
	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

