package com.capgemini.repository;

import java.util.List;

import com.capgemini.beans.Employee;
import com.capgemini.exceptions.EmployeeDoesnotExistException;

public interface EmployeeRepo {
	Employee save(Employee e);
	List<Employee> findByName(String name) throws EmployeeDoesnotExistException;
	boolean findId(int id);
	

}
