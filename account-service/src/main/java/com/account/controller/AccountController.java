/*
 * 1kings
 */
package com.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.account.model.Account;

/**
 * The Class AccountController.
 * @author Beepin
 */
@RestController
public class AccountController {

	/** The account service. */
	@Autowired
	private AccountService accountService;

	/**
	 * Accounts.
	 *
	 * @param accountId the account id
	 * @return the account
	 */
	@RequestMapping("/accounts")
	public Account accounts(@RequestParam(value = "accountid", defaultValue = "1") String accountId) {
		return accountService.getAccount(Long.valueOf(accountId));
	}

}
