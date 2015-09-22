package com.sky.services;

import java.util.List;
import java.util.Map;

import com.sky.model.Product;

public interface CatalogueService {
	
	public Map<String, List<Product>> getProductsByLocation(String locationId);

}
