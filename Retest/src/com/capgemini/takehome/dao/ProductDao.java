package com.capgemini.takehome.dao;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.exception.ProductNotFound;
import com.capgemini.takehome.util.CollectionUtil;

public class ProductDao implements IProduct {

CollectionUtil coll=new CollectionUtil();
	@Override
	public Product getProductDetails(int productCode) throws ProductNotFound {
		// TODO Auto-generated method stub
		
		return coll.getProductDtails(productCode);
	}

}
