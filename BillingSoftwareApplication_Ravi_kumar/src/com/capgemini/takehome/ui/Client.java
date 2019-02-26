package com.capgemini.takehome.ui;

import java.util.Scanner;

import com.capgemini.takehome.exception.ProductNotFound;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;

public class Client {
	IProductService ips=new ProductService();
	
	
	static Scanner sc = new Scanner(System.in);
     public static void main(String[] args) throws ProductNotFound {
    	 while (true) {
 			System.out.println("1:Generate Bill by entering Product Code and quantity" + "\n"+"2:Exit");
 			System.out.println("Enter your Choice");
 			int n = sc.nextInt();
 			switch (n)

 			{
 			case 1:
 				generateBill();
 				break;
 			case 2:
 				System.exit(0);
 				break;
 			
 			default:
 				System.out.println("you enterd Wrong Choice");

 			}
 		}  	 
		
	}
     //Generate Bill
	private static void generateBill() throws ProductNotFound {
		// TODO Auto-generated method stub
		System.out.println("enter product details");
		
		ProductService prods=new ProductService();
		System.out.println("Enter quantity");
		int qnt=sc.nextInt();
		
		if(qnt<=0)
			System.out.println("Quantity should be greater than 0");
		else
		{
		System.out.println("enter productCode");
		int pCode=sc.nextInt();
		int t=pCode/1000;
	
		//Check ProductCode is less than 4 digits
		if(t>=1 && t<=9)
		{
			
	   
	    	try
	    	{
	    	System.out.println("ProductName "+prods.getProductDetails(pCode).getProductName());
	    	System.out.println("ProducCategory "+prods.getProductDetails(pCode).getProductCategory());

	    	System.out.println("ProductPrcie "+prods.getProductDetails(pCode).getProductPrice());

	    	System.out.println("ProductQuantity "+qnt);
	    	System.out.println("Line Total "+prods.getProductDetails(pCode).getProductPrice()*qnt);
	    	}
	    	catch(ProductNotFound e)
	    	{
	    		System.out.println("Product code  Not Found");
	    	}
	    	
	    
	    
		}
		else
			System.out.println("Product Code should be of 4 digits");
		}
		
	}
}
