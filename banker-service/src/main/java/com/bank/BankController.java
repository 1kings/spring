package com.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.Banker;
import com.bank.model.Customer;

/**
 * The Class CustomerController.
 * @author Beepin
 */
@RestController
public class BankController {

	/** The customer service. */
	@Autowired
	private BankService bankerService;

	/**
	 * Accounts.
	 *
	 * @param customerId the customer id
	 * @return the customer
	 */
	@RequestMapping("/bankers")
	public Banker accounts(@RequestParam(value = "bankerid", defaultValue = "1") String bankerId) {
		return bankerService.getBanker(Long.valueOf(bankerId));
	}

}
