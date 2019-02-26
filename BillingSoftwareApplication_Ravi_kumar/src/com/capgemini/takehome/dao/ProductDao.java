package com.capgemini.takehome.dao;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.exception.ProductNotFound;
import com.capgemini.takehome.util.CollectionUtil;

public class ProductDao implements IProductDAo {
	

	@Override
	public Product getProductDetails(int productCode) throws ProductNotFound {
		// TODO Auto-generated method stub
		 CollectionUtil coll=new CollectionUtil();
		 if(coll.getProductDetails(productCode)!=null)
		 {
            return coll.getProductDetails(productCode);
		 }
		throw new ProductNotFound();
		
		
	}

}
