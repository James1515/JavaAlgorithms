//*******************************************************
//Account.java    Author: Lewis/Loftus
//
//Purpose: Represents a bank account with basic services
//such as deposit, and withdraw.
//********************************************************

import java.text.NumberFormat;

public class Account
{
  public final double RATE = 0.035; //Interest Rate of 3.5%
  
  private long acctNumber;
  private double balance;
  private String name;
  
  //------------------------------------------------------------------------
  //Sets up account by defining its owner, account number, and initial balance.
  //------------------------------------------------------------------------
  
  public Account(String owner, long account, double initial)
  {
     name = owner;
     acctNumber = account;
     balance = initial;
     
  }
  
  
  //---------------------------------------------------------
  //**Overloaded method, provides an alternative option to create an account
  //**with an initial balance of zero.
  //---------------------------------------------------------
  public Account(String owner, long account)
  {
    name = owner;
    acctNumber = account;
    balance = 0;
  }
  
  //--------------------------------------------------------------
  //Deposits the specified amount into the account. 
  //Returns a new balance.
  //--------------------------------------------------------------
  
  public double deposit(double amount)
  {
    balance = balance + amount;
    return balance;
  }
  
  
  //-------------------------------------------------------------
  //Wtihdraws the specified amount from the account and applies 
  //the fee. Returns the new balance.
  //-------------------------------------------------------------
  
  public double withdraw(double amount, double fee)
  {
     balance = balance - amount - fee;
     
     return balance;
  }
  
  //------------------------------------------------------------
  // Adds interest to the account and returns the new balance.
  //-------------------------------------------------------------
  
  public double addInterest()
  {
    balance += (balance * RATE);
    return balance;
  }
  
  //-------------------------------------------------------------
  //Returns the current balance of the account.
  //-------------------------------------------------------------
  
  public double getBalance()
  {
     return balance;
     
  }
  
  public String toString()
  {
     NumberFormat fmt = NumberFormat.getCurrencyInstance();
     return acctNumber + "\t" + name + "\t" + fmt.format(balance);
  }
  
  
  
  
}