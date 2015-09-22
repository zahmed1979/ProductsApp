package com.sky.services.impl;

import java.util.Map;
import com.sky.model.Customer;
import com.sky.services.CustomerLocationService;

public class CustomerLocationServiceImpl implements CustomerLocationService  {
	
	private Map<String, Customer> customersMap;
	
	public CustomerLocationServiceImpl(Map<String, Customer> customersMap) {
		this.customersMap = customersMap;
	}
	public String getCustomerLocation(String customerId) throws Exception {
		
		Customer customer = customersMap.get(customerId);
		if (null != customer)
			return customer.getCustomerLocation().getName();
		else
		return null;
	}

}
