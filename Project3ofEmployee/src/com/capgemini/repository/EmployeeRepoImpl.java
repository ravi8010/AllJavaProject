package com.capgemini.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.capgemini.beans.Employee;
import com.capgemini.exceptions.EmployeeDoesnotExistException;

public class EmployeeRepoImpl implements EmployeeRepo{
	
	HashMap<Integer,Employee> hm=new HashMap<>();

	@Override
	public Employee save(Employee e) {
		// TODO Auto-generated method stub\
		
		hm.put(e.getId(), e);
	

		return e;
	}

	@Override
	public List<Employee> findByName(String name) throws EmployeeDoesnotExistException {
		// TODO Auto-generated method stub
		boolean b=true;
	
		
		
		
       List <Employee> list = new ArrayList<>(); 
		
		for (Map.Entry<Integer,Employee>  iter : hm.entrySet()) {
			  if (iter.getValue().getName().equals(name) ) {
			    // do something
				  b=false;
				  list.add(iter.getValue());
			  }
			}
		
		
		
		if(b)
			throw new EmployeeDoesnotExistException();
		
		return list;
	}
	
	
	public boolean findId(int id)
	{
		for(Entry<Integer, Employee> entry:hm.entrySet())
		{
			if(entry.getKey()==id);
			{
				return true;
			}
		}
		return(false);
	}
	
	
	
	
	

}
