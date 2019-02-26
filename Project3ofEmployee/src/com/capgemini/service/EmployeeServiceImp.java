package com.capgemini.service;

import java.util.List;

import com.capgemini.beans.Address;
import com.capgemini.beans.Employee;
import com.capgemini.exceptions.DuplicateIdException;
import com.capgemini.exceptions.EmployeeDoesnotExistException;
import com.capgemini.exceptions.InvalidAddressException;
import com.capgemini.exceptions.InvalidIdException;
import com.capgemini.exceptions.InvalidNameException;
import com.capgemini.exceptions.SearchByNullException;
import com.capgemini.repository.EmployeeRepo;
import com.capgemini.repository.EmployeeRepoImpl;
public class EmployeeServiceImp implements EmployeeService{
	EmployeeRepo emprepo= new EmployeeRepoImpl();
	public EmployeeServiceImp(EmployeeRepo repo) {
		// TODO Auto-generated constructor stub
		this.emprepo=repo;
	}

	@Override
	public Employee createEmployee(String name,int id, Address address) throws InvalidIdException, DuplicateIdException, InvalidNameException, InvalidAddressException {
		// TODO Auto-generated method stub
		if(id<0)
			throw new InvalidIdException();
		if(emprepo.findId(id))
			throw new DuplicateIdException();
		if(name==null)
			throw new InvalidNameException();
		if((address==null)||(address.getAddressLine()==null)||(address.getCountry().getCname()==null)||(address.getCountry().getCity().getCityName()==null))
		{
			throw new InvalidAddressException();
		}
		
		
		
		
		
		Employee employee= new Employee(name,id,address);
		
		employee.setName(name);
		employee.setAddres(address);
		employee.setId(id);
		
		
		
		return 	emprepo.save(employee);
	}

	@Override
	public List<Employee> searchByName(String name) throws SearchByNullException, EmployeeDoesnotExistException {
		// TODO Auto-generated method stub
		if(name==null)
			throw new SearchByNullException();
		return emprepo.findByName(name);
		
	}

	

	
	

}
