package com.account.model;

public class Account {

	private Long accountId;
	private Long accountBalance;
	private String accountType;
	private Long customerId;
	private Customer customer;

	public Account(Long accountId, Long accountBalance, String accountType, Long customerId, Customer customer) {
		super();
		this.accountId = accountId;
		this.accountBalance = accountBalance;
		this.accountType = accountType;
		this.customerId=customerId;
		this.customer = customer;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Long getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Long accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	

}
