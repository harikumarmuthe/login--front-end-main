package com.spec.login.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CreateEntity {

	@Id
	private String username;
	private String email;
	private String password;
	private String confirmPass;
	public CreateEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreateEntity(String username, String email, String password, String confirmPass) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.confirmPass = confirmPass;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPass() {
		return confirmPass;
	}
	public void setConfirmPass(String confirmPass) {
		this.confirmPass = confirmPass;
	}
	
}
