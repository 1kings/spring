package com.customer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.customer.model.Customer;

@Service
public class CustomerService {

	@Value("${db.file.path}")
	private String filePath;

	public Customer getCustomer(Long customerId) {

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

		if (customerId.equals(dbCustomerId)) {

			String dbCustomerName = (String) jsonObject.get("customerName");
			String dbCustomerAddress = (String) jsonObject.get("customerAddress");

			return new Customer(customerId, dbCustomerName, dbCustomerAddress);
		}

		return new Customer(customerId, null, null);
	}
}
