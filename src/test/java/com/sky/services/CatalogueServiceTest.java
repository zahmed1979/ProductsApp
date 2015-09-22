package com.sky.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sky.util.SpringTestUtility;

public class CatalogueServiceTest extends SpringTestUtility {
	
	@Test
	public void testGetNumberOfCategories() throws Exception {
		//Should return 2 categories
		 assertEquals(2, this.catalogueService.getProductsByLocation("LONDON").size());
       
    }

}
