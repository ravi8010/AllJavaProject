package com.capgemini.takehome.dao;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.exception.ProductNotFound;

public interface IProductDAo {
	Product getProductDetails(int productCode) throws ProductNotFound;
	

}
