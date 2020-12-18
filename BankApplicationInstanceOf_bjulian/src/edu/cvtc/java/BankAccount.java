
package edu.cvtc.java;

/**
 * @author ben.julian
 *
 */

public abstract class BankAccount {
  
  // Private fields
  private double balance;
  
  // Constructors
  public BankAccount() {
    
  }
  
  public BankAccount(double balance) {
    this.balance=balance;
  }
  
  // Getters and setters
  public double getBalance() {
    return balance;
  }
  
  public void setBalance(double balance) {
    this.balance = balance;
    
  }

  // Account operations methods
  public abstract void deposit(double amount);
  
  public abstract void withdraw(double amount);

  public String toString() {
    return "account balance: $" + getBalance();
  }
  
}
