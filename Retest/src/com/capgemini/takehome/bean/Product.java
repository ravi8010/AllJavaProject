package com.capgemini.takehome.bean;

public class Product {
	int productId;
	String productName;
	String productCategory;
	int price;
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public int getPrice() {
		return price;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(int productId, String productName, String productCategory, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.price = price;
	}
	
	

}
