package com.dungtran.hdfcbank.main;

import java.util.Scanner;

import com.dungtran.hdfcbank.blogic.Bank;
import com.dungtran.hdfcbank.blogic.HDFCBank;
import com.dungtran.hdfcbank.exceptions.InsufficientFundsException;
import com.dungtran.hdfcbank.exceptions.InvalidAmountException;

public class Cleark {
  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in);
      Bank acc1 = new HDFCBank();
      String option = "";

      do {
        System.out.println("1. DEPOSITE.");
        System.out.println("2. WITHDWAW.");
        System.out.println("3. BALANCE EQUIRY.");
        System.out.println("4. ENTER OPTIONS.");
        
        System.out.print("WHICH ACTON DO YOU WANT : ");
        option = sc.next();

        switch (option) {
          case "1": {
            System.out.print("ENTER DEPOSITE AMOUNT: ");
            double amount = sc.nextDouble();
            acc1.deposite(amount);
            acc1.balanceEnquiry();
            break;
          }
          case "2": {
            System.out.print("ENTER WITHDWAW AMOUNT: ");
            double amount = sc.nextDouble();
            double withdraw = acc1.withdraw(amount);
            System.out.println("WITHDWAW AMOUNT IS: " + withdraw);
            acc1.balanceEnquiry();
            break;
          }
          case "3": {
            acc1.balanceEnquiry();
            break;
          }
          default: {
            System.out.println("INVALID OPTIONS.");
            break;
          }
        }
        System.out.print("DO YOU WANT TO CONTINUE (YES/NO): ");
        option = sc.next();
      } while (option.equalsIgnoreCase("YES"));
    } catch (InvalidAmountException iae) {
      System.out.println(iae.getMessage());
    } catch (InsufficientFundsException ife){
      System.out.println(ife.getMessage());
    } catch (NumberFormatException nfe) {
      System.out.println(nfe.getMessage());
    }
  }
}
