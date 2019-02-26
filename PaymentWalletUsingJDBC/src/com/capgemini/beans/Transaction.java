package com.capgemini.beans;

import java.math.BigDecimal;

public class Transaction {
	private int id;
	private String mobileNumber;
	private String depositMobileNumber;
	private String withdrawMobileNumber;
	private BigDecimal amount;

	public Transaction(int id, String mobileNumber, String depositMobileNumber, String withdrawMobileNumber,
			BigDecimal amount) {
		super();
		this.id = id;
		this.mobileNumber = mobileNumber;
		this.depositMobileNumber = depositMobileNumber;
		this.withdrawMobileNumber = withdrawMobileNumber;
		this.amount = amount;
	}
	public Transaction() {
		super();
	}
	public int getId() {
		return id;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public String getDepositMobileNumber() {
		return depositMobileNumber;
	}
	public String getWithdrawMobileNumber() {
		return withdrawMobileNumber;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public void setDepositMobileNumber(String depositMobileNumber) {
		this.depositMobileNumber = depositMobileNumber;
	}
	public void setWithdrawMobileNumber(String withdrawMobileNumber) {
		this.withdrawMobileNumber = withdrawMobileNumber;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", mobileNumber=" + mobileNumber + ", depositMobileNumber="
				+ depositMobileNumber + ", withdrawMobileNumber=" + withdrawMobileNumber + ", amount=" + amount + "]";
	}
	
	

}
