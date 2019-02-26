package com.capgemini.test;


import java.sql.SQLException;

//import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.exception.DuplicatePhoneNo;
import com.capgemini.exception.PhoneNoDoesNotExist;
import com.capgemini.repository.WalletRepo;
import com.capgemini.repository.WalletRepoImpl;
import com.capgemini.service.WalletService;
import com.capgemini.service.WalletServiceImpl;

public class TestUnit {
	WalletRepo wr=new WalletRepoImpl();
	WalletService ws=new WalletServiceImpl();

	@Before
	public void setUp() throws Exception {
	}
	
		
	@Test(expected=com.capgemini.exception.DuplicatePhoneNo.class)
	public void test() throws DuplicatePhoneNo, PhoneNoDoesNotExist
	{
		ws.createAccount("Ravi", "20",10000);
		ws.createAccount("Krishna", "20",10000);
		
	}
	@Test(expected=com.capgemini.exception.PhoneNoDoesNotExist.class)
	public void test1() throws PhoneNoDoesNotExist, SQLException
	{
		ws.withdrawAmount("121",20000);
		
		
	}
	@Test
	public void test3() throws DuplicatePhoneNo, PhoneNoDoesNotExist 
	{
		ws.createAccount("Mudit", "1",20000);
		
		
	}
}