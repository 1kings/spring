package com.customer.model;

public class CustomerDomain {

	private Long customerId ;
	
	private String userName ;
	
	private Long accountBalance ;
	
	private Long rm_id ;
	
	private Long fa_id ;
	
	private String cust_type ;
	
	private String account_type;
	
	public CustomerDomain(long customerId,String userName ,Long accountBalance, Long rm_id,Long fa_id,String cust_type,String account_type) {
		
		this.customerId = customerId;
		this.userName=userName;
		this.accountBalance = accountBalance;
		this.rm_id = rm_id;
		this.fa_id = fa_id;
		this.cust_type=cust_type;
		this.account_type=account_type;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Long accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Long getRm_id() {
		return rm_id;
	}

	public void setRm_id(Long rm_id) {
		this.rm_id = rm_id;
	}

	public Long getFa_id() {
		return fa_id;
	}

	public void setFa_id(Long fa_id) {
		this.fa_id = fa_id;
	}

	public String getCust_type() {
		return cust_type;
	}

	public void setCust_type(String cust_type) {
		this.cust_type = cust_type;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	

	
}