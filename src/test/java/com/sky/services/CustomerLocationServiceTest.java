package com.sky.services;

import static org.junit.Assert.*;

import org.junit.Test;
import com.sky.util.SpringTestUtility;


public class CustomerLocationServiceTest extends SpringTestUtility {

	@Test
	public void testGetCustomerLocation1() throws Exception {
		String customerLocation = customerLocationService.getCustomerLocation("1");
		 assertEquals("LONDON", customerLocation);
       
    }
	
	@Test
	public void testGetCustomerLocation2() throws Exception {
		String customerLocation = customerLocationService.getCustomerLocation("2");
		 assertEquals("LIVERPOOL", customerLocation);
       
    }
	
	@Test
	public void testInvalidCustomerId() throws Exception {
		String customerLocation = customerLocationService.getCustomerLocation("3");
		 assertEquals(null, customerLocation);
       
    }

}
