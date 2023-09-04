package com.dungtran.hdfcbank.blogic;

import com.dungtran.hdfcbank.exceptions.InsufficientFundsException;
import com.dungtran.hdfcbank.exceptions.InvalidAmountException;

public interface Bank {
  
  public void deposite (double amount) throws InvalidAmountException;
  public double withdraw (double amount) throws InsufficientFundsException;
  public void balanceEnquiry();

}
