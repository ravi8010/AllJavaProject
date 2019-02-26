package com.capgemini.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.SQLException;
import java.sql.Statement;
//import java.util.LinkedList;
//import java.util.ListIterator;

import com.capgemini.beans.Customer;
import com.capgemini.exception.PhoneNoDoesNotExist;
import com.capgemini.util.Connection1;
//import com.capgemini.exception.PhoneNoDoesNotExist;

public class WalletRepoImpl implements WalletRepo {
	Connection con=Connection1.toConnect();
	@Override
	public boolean save(Customer customer) {
		
		String name = customer.getName();
		String mobile = customer.getMobileNumber();
		long amount = customer.getWallet();
		try{  
			
			
			PreparedStatement stmt=con.prepareStatement("insert into Customer values(?,?,?)");
			stmt.setString(1, name);
			stmt.setString(2, mobile);
			stmt.setLong(3, amount);
			stmt.executeQuery();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return true;  
		
	}
	public Customer findOne(String mobilenumber) throws PhoneNoDoesNotExist
	{
		Customer c = new Customer(); 
		
			
		
			PreparedStatement stmt;
			try {
				stmt = con.prepareStatement("select * from Customer where mobilenumber=?");
			
			stmt.setString(1, mobilenumber);
			ResultSet rs=stmt.executeQuery();  
			if(rs.next())
			{
			c.setName(rs.getString(1));
			c.setMobileNumber(rs.getString(2));
			c.setWallet(rs.getInt(3));
			return c;
			}
			else 
			{
				throw new PhoneNoDoesNotExist();
			}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		
		return null;  
      
	}
}
