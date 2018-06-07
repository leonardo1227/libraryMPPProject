package edu.mum.cs401mpp.libraryproject.entity;

public class Stuff extends PersonRole {

	private long id;

	private String password;

	private AuthorizationLevel authorizationLevel;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AuthorizationLevel getAuthorizationLevel() {
		return authorizationLevel;
	}

	public void setAuthorizationLevel(AuthorizationLevel authorizationLevel) {
		this.authorizationLevel = authorizationLevel;
	}

}
