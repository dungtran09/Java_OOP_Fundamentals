package com.dungtran.hdfcbank.blogic;

import com.dungtran.hdfcbank.exceptions.InsufficientFundsException;
import com.dungtran.hdfcbank.exceptions.InvalidAmountException;

public class HDFCBank implements Bank {
  private double balance;

  public void deposite(double amount) throws InvalidAmountException {
    if (amount <= 0) {
      throw new InvalidAmountException(amount + " is not valid!");
    }
    balance = balance + amount;
  }

  public double withdraw(double amount) throws InsufficientFundsException {
    if (amount < balance) {
      throw new InsufficientFundsException("Insufficient Fund!");
    }
    return balance = balance - amount;
  }

  public void balanceEnquiry() {
    System.out.println("The current balance is: " + balance);
  }
}
