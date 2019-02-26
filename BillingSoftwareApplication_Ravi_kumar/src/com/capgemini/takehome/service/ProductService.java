package com.capgemini.takehome.service;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.dao.IProductDAo;
import com.capgemini.takehome.dao.ProductDao;
import com.capgemini.takehome.exception.ProductNotFound;

public class ProductService implements IProductService {
  IProductDAo prod=new ProductDao();
	@Override
	public Product getProductDetails(int productCode) throws ProductNotFound {
		// TODO Auto-generated method stub
return prod.getProductDetails(productCode);
		
	}

	
	
	

}
