package com.capgemini.takehome.ui;

import java.util.Scanner;

import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;

public class Client {
	static Scanner sc=new Scanner(System.in);
	static IProductService ips=new ProductService();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		while(true)
		{
			System.out.println("1:Generate Bill by Entring product code and Quantity \n2:Exit");
			System.out.println("Enter your Choice");
		        int n=sc.nextInt();
		        switch(n)
		        {
		        case 1:generateBill();
		               break;
		        case 2:System.exit(0);
	               break;
	               default: System.out.println("Wrong Choice");
		        }
		        
		}

	}

	private static void generateBill() {
		// TODO Auto-generated method stub
		System.out.println("Enter Products Details");
		System.out.print("Enter the Product Code: ");
		int pcode=sc.nextInt();
		
		int t=pcode/1000;
		
		if(t>=1 &&t<=9)
		{
			
			
			
			
			
			System.out.print("Enter quantity: ");
			int qnty=sc.nextInt();
			if(qnty>0)
			{
				
				try {
				System.out.println("Product Name is:"+ips.getProductDetails(pcode).getProductName());
				System.out.println("Product Category is:"+ips.getProductDetails(pcode).getProductCategory());
				System.out.println("Product Description is:"+ips.getProductDetails(pcode).getProductCategory());
				System.out.println("Product Price is:"+ips.getProductDetails(pcode).getPrice());
				System.out.println("Quantity:"+qnty);
				System.out.println("Line Total(Rs.):"+ips.getProductDetails(pcode).getPrice()*qnty);
			}
				catch(Exception e)
				{
					System.out.println("Product Code "+pcode+ "  is not available");
				}
			}
			
		}
		else
		{
			System.out.println("Product code is not Valid");
		}
	}
	
	

}
