package com.capgemini.takehome.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.exception.ProductNotFound;

public class CollectionUtil {
	private static Map<Integer,Product> products=new HashMap<>();
	static {
		products.put(1001, new Product(1001,"iPhone","Electronics",35000));
		products.put(1001, new Product(1002,"Doll","Toys",5000));
		products.put(1001, new Product(1003,"Car","Toys",35000));
		products.put(1001, new Product(1004,"Samsung","Electronics",35000));
		
	}
	
           public Product getProductDtails(int key) throws ProductNotFound
           {
          /* {
        	   for(Entry<Integer,Product>entry:products.entrySet())
        	   {
        		   if(entry.getKey()==key)
        			   return(entry.getValue());
        	   }*/
        	   if(products.containsKey(key))
        	   {
       	        	return  products.get(key);      	   
                }
        	  
			throw new ProductNotFound();
           }
}
