package com.sky.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sky.util.SpringTestUtility;

public class CategoriesTest extends SpringTestUtility {
	
	@Test
	public void testCategoryName() throws Exception {
		
		 assertEquals("Sports", category1.getName());       
    }
	
	@Test
	public void testCategoryName2() throws Exception {
		
		 assertEquals("News", category2.getName());       
    }
	
	@Test
	public void testGetProductsInCategory1() throws Exception {
		 //should be 3 products in sports category
		 assertEquals(3, category1.getProducts().size());       
    }
	
	@Test
	public void testGetProductsInCategory2() throws Exception {
		 //should be 2 products in news category
		 assertEquals(2, category2.getProducts().size());       
    }

}
