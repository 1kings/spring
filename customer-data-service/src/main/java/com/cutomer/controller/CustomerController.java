/*
 * 1kings
 */
package com.cutomer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.model.Account;
import com.customer.model.Banker;

/**
 * The Class AccountController.
 * @author Beepin
 */
@RestController
public class CustomerController {

	/** The account service. */
	@Autowired
	private CustomerService customerService;

	/**
	 * Accounts.
	 *
	 * @param accountId the account id
	 * @return the account
	 */
	@RequestMapping("/customer")
	public Banker getBankerDetail(@RequestParam(value = "customerid", defaultValue = "1") String customerId) {
		return customerService.getBankerDetail(Long.valueOf(customerId));
	}

}
