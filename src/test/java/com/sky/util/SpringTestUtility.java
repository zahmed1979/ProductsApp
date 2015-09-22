package com.sky.util;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sky.model.Categories;
import com.sky.model.Location;
import com.sky.model.Product;
import com.sky.services.CatalogueService;
import com.sky.services.CustomerLocationService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
    "file:src/main/webapp/WEB-INF/applicationContext.xml"})
public class SpringTestUtility {
	
	@Autowired
	protected CustomerLocationService customerLocationService;
	@Autowired
	protected CatalogueService catalogueService;
	@Autowired
	protected Product product1;
	@Autowired
	protected Product product2;
	@Autowired
	protected Product product3;
	@Autowired
	protected Product product4;
	@Autowired
	protected Product product5;
	@Autowired
	protected Location location1;
	@Autowired
	protected Location location2;
	@Autowired
	protected Categories category1;
	@Autowired
	protected Categories category2;

}
