package com.capgemini.takehome.service;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.exception.ProductNotFound;

public interface IProductService {
	Product getProductDetails(int productCode) throws ProductNotFound;

}
