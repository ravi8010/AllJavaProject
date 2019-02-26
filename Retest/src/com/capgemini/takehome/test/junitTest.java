package com.capgemini.takehome.test;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.takehome.exception.ProductNotFound;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;

public class junitTest {
	IProductService ips=new ProductService();

	@Before
	public void setUp() throws Exception {
	}

	@Test(expected=com.capgemini.takehome.exception.ProductNotFound.class)
	public void test() throws ProductNotFound {
		ips.getProductDetails(1010);
		
	}
	@Test
	public void test2() throws ProductNotFound
	{
		ips.getProductDetails(1001);
	}

}
