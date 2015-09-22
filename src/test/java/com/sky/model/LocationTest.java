package com.sky.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sky.util.SpringTestUtility;

public class LocationTest extends SpringTestUtility {
	
	@Test
	public void testLocationNames() throws Exception {
		
		 assertEquals("LONDON", location1.getName());
		 assertEquals("LIVERPOOL", location2.getName());
    }

}
