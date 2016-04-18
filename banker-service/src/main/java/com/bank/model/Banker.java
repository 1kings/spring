package com.bank.model;

public class Banker {
	
	private Long bankerId;
	
	public Long getBankerId() {
		return bankerId;
	}

	public void setBankerId(Long bankerId) {
		this.bankerId = bankerId;
	}

	private String bankerName;
	
	private String title ;
	
	private String role;
	
	private Long contact;
	
	private String email ;
	
	private String bio;

	public Banker(Long bankerId, String bankerName ,String title ,String role ,Long contact ,String email, String bio) {
		super();
		this.bankerId = bankerId;
		this.bankerName = bankerName;
		this.title = title;
		this.role =  role;
		this.contact= contact;
		this.email = email;
		this.bio = bio;
	}
	
	public String getBankerName() {
		return bankerName;
	}

	public void setBankerName(String bankerName) {
		this.bankerName = bankerName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

}