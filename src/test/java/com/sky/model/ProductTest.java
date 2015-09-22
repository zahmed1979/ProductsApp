package com.sky.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sky.util.SpringTestUtility;

public class ProductTest extends SpringTestUtility {
	
	@Test
	public void testProductNames() throws Exception {
		
		 assertEquals("Arsenal TV", product1.getName());
		 assertEquals("Chelsea TV", product2.getName());
		 assertEquals("Liverpool TV", product3.getName());
		 assertEquals("Sky Sports News", product4.getName());
		 assertEquals("Sky News", product5.getName());
    }
	
	@Test
	public void testProductLocations() throws Exception {
		
		 assertEquals("LONDON", product1.getLocation().getName());
		 assertEquals("LONDON", product2.getLocation().getName()); 
		 assertEquals("LIVERPOOL", product3.getLocation().getName());
    }
	
	@Test
	public void testNullLocations() throws Exception {
		 //products 4 and 5 should not have any location set
		 assertEquals(null, product4.getLocation());
		 assertEquals(null, product5.getLocation()); 
    }

}
