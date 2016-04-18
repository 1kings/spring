package com.cutomer.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.customer.model.Account;
import com.customer.model.Banker;
import com.customer.model.Customer;
import com.customer.model.CustomerDomain;

@Service
public class CustomerService {

	@Value("${db.file.path}")
	private String filePath;

	@Value("${cust.service.path}")
	private String servicePath;

	private static RestTemplate restTemplate = new RestTemplate();
	
	public Banker getPersonalBankerDetail(Long db_RM_Id) {
		return restTemplate.getForObject(servicePath + db_RM_Id, Banker.class);
	}

	/*public Account getAccount(Long accountId) {

		JSONParser parser = new JSONParser();
		Object obj = null;
		try {
			obj = parser.parse(new InputStreamReader(getClass().getResourceAsStream(filePath)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		JSONObject jsonObject = (JSONObject) obj;

		Long dbAccountId = (Long) jsonObject.get("accountId");

		if (accountId.equals(dbAccountId)) {

			Long dbAccountBalance = (Long) jsonObject.get("accountBalance");
			String dbAccountType = (String) jsonObject.get("accountType");
			Long dbCustomerId = (Long) jsonObject.get("customerId");

			return new Account(accountId, dbAccountBalance, dbAccountType, dbCustomerId, getCustomer(dbCustomerId));
		}

		return new Account(accountId, null, null, null, null);
	}*/
	
	public Banker getBankerDetail(Long customerId) {

		JSONParser parser = new JSONParser();
		Object obj = null;
		try {
			obj = parser.parse(new InputStreamReader(getClass().getResourceAsStream(filePath)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		JSONObject jsonObject = (JSONObject) obj;

		Long dbCustomerId = (Long) jsonObject.get("customerId");
		
		Long db_RM_Id = (Long) jsonObject.get("rm_id");
		
		Long db_FA_Id = (Long) jsonObject.get("fa_id");

		if (customerId.equals(dbCustomerId)) {

			return getPersonalBankerDetail(db_RM_Id);
			
		}

		return new Banker(0l, "", "", "", 0l, "", "");
	}
	
	
}
