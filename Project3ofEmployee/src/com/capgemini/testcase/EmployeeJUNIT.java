package com.capgemini.testcase;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

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

public class EmployeeJUNIT {

	EmployeeRepo employeeRepository = new EmployeeRepoImpl();

	EmployeeService employeeService = new EmployeeServiceImp(employeeRepository);

	@Before
	public void setUp() throws Exception {
		employeeService = new EmployeeServiceImp(employeeRepository);
	}

	@Test(expected = com.capgemini.exceptions.InvalidIdException.class)
	public void test() throws InvalidIdException, DuplicateIdException, InvalidNameException, InvalidAddressException {
		City c = new City("mathura");
		Country cn = new Country("India", c);
		Address ad = new Address("krishna nagar", cn);
		employeeRepository.save(employeeService.createEmployee("Krishan", -1, ad));
	}

	@Test
	public void test6() throws InvalidIdException, DuplicateIdException, InvalidNameException, InvalidAddressException {
		City c = new City("mathura");
		Country cn = new Country("India", c);
		Address ad = new Address("krishna nagar", cn);
		employeeRepository.save(employeeService.createEmployee("Krishan", 1, ad));
	}

	@Test(expected = com.capgemini.exceptions.DuplicateIdException.class)
	public void test1() throws InvalidIdException, DuplicateIdException, InvalidNameException, InvalidAddressException {

		City c = new City("mathura");
		Country cn = new Country("India", c);
		Address ad = new Address("krishna nagar", cn);
		Employee e = employeeRepository.save(employeeService.createEmployee("Krishan", 1, ad));

		City c1 = new City("singapore");
		Country cn1 = new Country("England", c1);
		Address ad1 = new Address("ravi nagar", cn1);
		Employee e1 = employeeRepository.save(employeeService.createEmployee("ravi", 1, ad1));
	}

	@Test(expected = com.capgemini.exceptions.InvalidNameException.class)
	public void test2() throws InvalidIdException, DuplicateIdException, InvalidNameException, InvalidAddressException {
		City c = new City("mathura");
		Country cn = new Country("India", c);
		Address ad = new Address("krishna nagar", cn);
		employeeService.createEmployee(null, 1, ad);
	}

	@Test(expected = com.capgemini.exceptions.EmployeeDoesnotExistException.class)
	public void test3() throws InvalidIdException, DuplicateIdException, InvalidNameException,
			EmployeeDoesnotExistException, InvalidAddressException {
		City c = new City("mathura");
		Country cn = new Country("India", c);
		Address ad = new Address("krishna nagar", cn);
		employeeService.createEmployee("ravi", 1, ad);
		List<Employee> al = employeeRepository.findByName("krishan");

	}

	@Test(expected = SearchByNullException.class)
	public void test4() throws SearchByNullException, InvalidIdException, DuplicateIdException, InvalidNameException,
			EmployeeDoesnotExistException, InvalidAddressException {
		City c = new City("mathura");
		Country cn = new Country("India", c);
		Address ad = new Address("krishna nagar", cn);
		employeeService.createEmployee("ravi", 2, ad);
		List<Employee> al = employeeService.searchByName(null);

	}

	@Test
	public void test5() throws SearchByNullException, InvalidIdException, DuplicateIdException, InvalidNameException,
			EmployeeDoesnotExistException, InvalidAddressException {
		City c = new City("mathura");
		Country cn = new Country("India", c);
		Address ad = new Address("krishna nagar", cn);
		employeeService.createEmployee("ravi", 2, ad);
		List<Employee> al = employeeService.searchByName("ravi");
		System.out.println(al);

	}

	@Test(expected = com.capgemini.exceptions.InvalidAddressException.class)
	public void test7() throws InvalidIdException, DuplicateIdException, InvalidNameException, InvalidAddressException {
		City c = new City("Mathura");
		Country cn = new Country("India", c);
		Address ad = new Address("krishna nagar", cn);
		employeeRepository.save(employeeService.createEmployee("Krishan", 1, null));
	}

}