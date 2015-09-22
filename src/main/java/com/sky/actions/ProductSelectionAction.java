package com.sky.actions;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.sky.model.Product;
import com.sky.services.CatalogueService;
import com.sky.services.CustomerLocationService;

public class ProductSelectionAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
    
    private String customerId;
    private Map<String, List<Product>> productsByCategory;
    private String chosenProducts;
    private CustomerLocationService customerLocationService;
    private CatalogueService catalogueService;
    
    public ProductSelectionAction(CustomerLocationService customerLocationService,
    							  CatalogueService catalogueService) {
    	
    	this.customerLocationService = customerLocationService;
    	this.catalogueService = catalogueService;
    	
	}
    
    public String getProducts() throws Exception {
    	String customerLocationId = customerLocationService.getCustomerLocation(customerId);
    	if (null != customerLocationId) {
    		this.setProductsByCategory(catalogueService.getProductsByLocation(customerLocationId));  	
    		return SUCCESS;
    	}
    	return ERROR;
    }
     
 
    @Override
    public String execute() throws Exception {
         
        return SUCCESS;
         
    }


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public Map<String, List<Product>> getProductsByCategory() {
		return productsByCategory;
	}


	public void setProductsByCategory(Map<String, List<Product>> productsByCategory) {
		this.productsByCategory = productsByCategory;
	}


	public String getChosenProducts() {
		return chosenProducts;
	}


	public void setChosenProducts(String chosenProducts) {
		this.chosenProducts = chosenProducts;
	}


	public String display() {
		return NONE;
	}
     
   

}
