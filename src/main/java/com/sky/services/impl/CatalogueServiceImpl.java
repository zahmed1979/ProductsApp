package com.sky.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sky.model.Catalogue;
import com.sky.model.Categories;
import com.sky.model.Product;
import com.sky.services.CatalogueService;

public class CatalogueServiceImpl implements CatalogueService {
	
	private Catalogue catalogue;
	
	public CatalogueServiceImpl(Catalogue catalogue) {
		this.catalogue = catalogue;
	}
	
	public Map<String, List<Product>> getProductsByLocation(String locationId) {
		
		Map<String, List<Product>> productsByCategory = new HashMap<String, List<Product>>();
		List<Categories> categories = catalogue.getCategories();
		for (Categories cat : categories) {
			List<Product> productsByLocation = new ArrayList<Product>();
			for (Product prd : cat.getProducts()) {
				if (null == prd.getLocation() || 
					prd.getLocation().getName().equalsIgnoreCase(locationId)) {
					productsByLocation.add(prd);
				}
			}
			productsByCategory.put(cat.getName(), productsByLocation);
		}
		
		return productsByCategory;		
		
	}

}
