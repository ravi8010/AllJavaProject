package com.capgemini.view;

//import java.math.BigDecimal;
import java.util.Scanner;

import com.capgemini.exception.DuplicatePhoneNo;
import com.capgemini.exception.PhoneNoDoesNotExist;
import com.capgemini.service.WalletService;
import com.capgemini.service.WalletServiceImpl;

public class WalletMainApp {
	 static WalletService walletService  = new WalletServiceImpl();
	 static Scanner sc = new Scanner(System.in);
	 static String name;
		static String mobile;
	static 	long amt;

	public static void main(String[] args) throws DuplicatePhoneNo,PhoneNoDoesNotExist {
		
		
		
		int n;
	
		
		
		
		while(true)
		{
		System.out.println("1. Create account\n2. Show balance\n3. Withdraw amount\n4. Deposit amount\n5. Fund transfer\n6. Exit");
		n = sc.nextInt();
		switch(n)
		{
		case 1: 
			createAccount();
				
				break;
		case 2: 
			showBalance();
				
				break;
		case 3: 
			withdrawAmount();
				
				break;
		case 4:
			depositAmount();
								break;
		case 5: 
			fundTransfer();
				
				
				break;
		default: System.exit(0);
		}
		}
	}

	private static void fundTransfer() {
		// TODO Auto-generated method stub
		String tr;
		System.out.println("Enter Source mobile number and target mobile number and amount to be transferred\n");
		mobile = sc.next();
		tr = sc.next();
		amt = sc.nextLong();
		try
		{
		walletService.fundTransfer(mobile, tr, amt);
		}
		catch(Exception e)
		{
			System.out.println("Phone Number does not exist");
		}
		
	}

	private static void depositAmount() {
		// TODO Auto-generated method stub
		System.out.println("Enter mobile number");
		mobile = sc.next();
		System.out.println("Enter Amount");
		amt = sc.nextLong();
		try
		{
		walletService.depositAmount(mobile, amt);
		}
		catch(Exception e)
		{
			System.out.println("Phone Number does not exist");
		}

		
	}

	private static void withdrawAmount() {
		// TODO Auto-generated method stub
		System.out.println("Enter mobile number");
		mobile = sc.next();
		System.out.println("Enter Amount");
		amt = sc.nextLong();
		try
		{
		walletService.withdrawAmount(mobile, amt);
		}
		catch(Exception e)
		{
			System.out.println("Phone Number does not exist");
		}
		
	}

	private static void showBalance() {
		// TODO Auto-generated method stub
		System.out.println("Enter mobile number");
		mobile = sc.next();
		sc.nextLine();
		try
		{
		System.out.println(walletService.showBalance(mobile).getWallet());
		}
		catch(Exception e)
		{
			System.out.println("Phone Number does not exist");
		}
	}

	private static void createAccount() {
		// TODO Auto-generated method stub

		System.out.println("Enter Mobile number");
		mobile = sc.next();
		if(walletService.validateMobileNo(mobile))
		{
		System.out.println("Enter name");
		name = sc.next();
		if(walletService.validatenName(name))
		{
		System.out.println("Enter Amount");
		amt = sc.nextLong();
		if(amt>0)
		{
			try
			{
			walletService.createAccount(name, mobile, amt);
			}
			catch(Exception e)
			{
				System.out.println("Duplicate Phone Numbers");
			}
			
		}
		else
		{
			System.out.println("You have entered an invalid amount");
		}
		}
		else
		{
			System.out.println("Enter valid Name");
		}
		}
		else
		{
			System.out.println("Enter a valid 10 digit number");
		}
		
		
	}
}
