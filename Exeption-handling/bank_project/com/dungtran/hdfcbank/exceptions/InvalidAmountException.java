package com.dungtran.hdfcbank.exceptions;

public class InvalidAmountException extends Exception {
  public InvalidAmountException() {
    super();
  }

  public InvalidAmountException(String msg) {
    super(msg);
  }
}
