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

public interface EmployeeService {
	List<Employee> searchByName(String name) throws SearchByNullException, EmployeeDoesnotExistException;
	Employee createEmployee(String name,int id, Address address) throws InvalidIdException, DuplicateIdException, InvalidNameException, InvalidAddressException;
	

}
