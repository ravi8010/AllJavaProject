package com.capgemini.view;


import java.util.List;

import com.capgemini.beans.Address;
import com.capgemini.beans.City;
import com.capgemini.beans.Country;
import com.capgemini.beans.Employee;
import com.capgemini.exceptions.DuplicateIdException;
import com.capgemini.exceptions.EmployeeDoesnotExistException;
import com.capgemini.exceptions.InvalidAddressException;
import com.capgemini.exceptions.InvalidIdException;
import com.capgemini.exceptions.InvalidNameException;
import com.capgemini.exceptions.SearchByNullException;
import com.capgemini.repository.EmployeeRepo;
import com.capgemini.repository.EmployeeRepoImpl;
import com.capgemini.service.EmployeeService;
import com.capgemini.service.EmployeeServiceImp;

public class View {
	
	

	public static void main(String[] args) throws InvalidIdException, DuplicateIdException, InvalidNameException, SearchByNullException, EmployeeDoesnotExistException, InvalidAddressException {
		// TODO Auto-generated method stub
		EmployeeRepo repo=new EmployeeRepoImpl();
		EmployeeService service=new EmployeeServiceImp(repo);
		
/*		City c1=new City("Pune");
		Country cntry=new Country("India",c1);*/
        Address ad1=new Address("Talwade",new Country("India",new City("Delhi")));
        Address ad2=new Address("Hinjwadi",new Country("India",new City("Pune")));
    
         Address ad3=new Address("Bhel",new Country("India",new City("Pune")));
        
        service.createEmployee("Ravi",1,ad1);
        service.createEmployee("Rahul",2,ad2);
        service.createEmployee("Rishab",3,ad3);
        
        
        
        
        List <Employee> list=service.searchByName("Ravi");
        for(Employee employee:list)
        {
        
        	
        	
        	System.out.println(employee);
        }
        
        
        
		
	}

}
