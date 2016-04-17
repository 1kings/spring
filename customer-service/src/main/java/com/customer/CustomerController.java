package com.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.model.Customer;

/**
 * The Class CustomerController.
 * @author Beepin
 */
@RestController
public class CustomerController {

	/** The customer service. */
	@Autowired
	private CustomerService customerService;

	/**
	 * Accounts.
	 *
	 * @param customerId the customer id
	 * @return the customer
	 */
	@RequestMapping("/customers")
	public Customer accounts(@RequestParam(value = "customerid", defaultValue = "1") String customerId) {
		return customerService.getCustomer(Long.valueOf(customerId));
	}

}
