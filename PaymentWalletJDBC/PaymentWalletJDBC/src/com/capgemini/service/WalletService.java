package com.capgemini.service;

import java.sql.SQLException;

//import java.math.BigDecimal;

import com.capgemini.beans.Customer;
//import com.capgemini.exception.DuplicatePhoneNo;
//import com.capgemini.exception.PhoneNoDoesNotExist;
import com.capgemini.exception.PhoneNoDoesNotExist;

public interface WalletService {
	public Customer createAccount(String name,String mobileNumber,long amount);
	public Customer showBalance(String mobileNumber) throws PhoneNoDoesNotExist;
	public Customer fundTransfer(String sourceMobileNumber,String targetMobileNumber,long amount) throws SQLException, PhoneNoDoesNotExist;
	public Customer depositAmount(String mobileNumber,long amount) throws SQLException, PhoneNoDoesNotExist;
	public Customer withdrawAmount(String mobileNumber,long amount) throws SQLException, PhoneNoDoesNotExist;
	public boolean validateMobileNo(String mobileNumber);
	public boolean validatenName(String name);
}
