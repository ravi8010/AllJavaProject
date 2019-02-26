package com.capgemini.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import java.math.BigDecimal;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Map.Entry;

import com.capgemini.beans.Customer;
import com.capgemini.exception.PhoneNoDoesNotExist;
//import com.capgemini.beans.Wallet;
//import com.capgemini.exception.DuplicatePhoneNo;
//import com.capgemini.exception.PhoneNoDoesNotExist;
import com.capgemini.repository.WalletRepo;
import com.capgemini.repository.WalletRepoImpl;
import com.capgemini.util.Connection1;


public class WalletServiceImpl implements WalletService {
	Connection con=Connection1.toConnect();
	WalletRepo walletRepo = new WalletRepoImpl();
	

	@Override
	public Customer createAccount(String name, String mobileNumber, long amount)
	{
		
		Customer customer=new Customer(name, mobileNumber, amount);
				
//		if(walletRepo.findOne(mobileNumber)!=null)
//		{
//			System.out.println("Already present");
//		}
		
		walletRepo.save(customer);
		return customer;
	}

	@Override
	public Customer showBalance(String mobileNumber) throws PhoneNoDoesNotExist
	{
		if(walletRepo.findOne(mobileNumber)!=null)
			return walletRepo.findOne(mobileNumber);
		else
			return null;
	}

	@Override
	public Customer fundTransfer(String sourceMobileNumber, String targetMobileNumber, long amount) throws SQLException, PhoneNoDoesNotExist {
		if(walletRepo.findOne(sourceMobileNumber)==null)
		{
			return null;
		}
		if(walletRepo.findOne(targetMobileNumber)==null)
		{
			return null;
		}
		
		this.depositAmount(targetMobileNumber, amount);
		this.withdrawAmount(sourceMobileNumber, amount);
		return walletRepo.findOne(sourceMobileNumber);
	}

	@Override
	public Customer depositAmount(String mobileNumber, long amount) throws SQLException, PhoneNoDoesNotExist {
		

		if(walletRepo.findOne(mobileNumber)==null)
		{
			return null;
		}
		Customer customer=walletRepo.findOne(mobileNumber);
		PreparedStatement stmt=con.prepareStatement("update Customer set wallet=? where mobilenumber=?");
		stmt.setLong(1, customer.getWallet()+amount);
		stmt.setString(2, mobileNumber);
		stmt.executeQuery();
		
		
		//customer.setWallet(customer.getWallet()+amount);
		return customer;
	}

	@Override
	public Customer withdrawAmount(String mobileNumber, long amount) throws SQLException, PhoneNoDoesNotExist {
		
		if(walletRepo.findOne(mobileNumber)==null)
		{
			return null;
		}
		Customer customer=walletRepo.findOne(mobileNumber);
		PreparedStatement stmt=con.prepareStatement("update Customer set wallet=? where mobilenumber=?");
		stmt.setLong(1, customer.getWallet()-amount);
		stmt.setString(2, mobileNumber);
		stmt.executeQuery();
		return customer;
	}

	@Override
	public boolean validateMobileNo(String mobileNumber) {
		// TODO Auto-generated method stub
		if(mobileNumber.length()==10)
			return true;
		else
		return false;
	}

	@Override
	public boolean validatenName(String name) {
		// TODO Auto-generated method stub
		Pattern pat=Pattern.compile("[a-z A-Z]+");
		Matcher mat=pat.matcher(name);
		return mat.matches();
	}

}
