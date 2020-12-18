
package edu.cvtc.java;

/**
 * @author ben.julian
 *
 */

public class BusinessCheckingAccount extends BankAccount implements AccruesInterest {

  // Private Fields
  private static final double MIN_BALANCE = 1000.00;
  private static final double INTEREST_RATE = 0.05;
  
  // Constructors
  public BusinessCheckingAccount() {
    
  }

  public BusinessCheckingAccount(double balance) {
    super(balance);
  }
  
  // Deposit method
  public void deposit(double amount) {
    this.setBalance(getBalance() + amount);
  }
  
  // Withdraw method
  public void withdraw(double amount) {
    if (getBalance() >= MIN_BALANCE)
      if ((getBalance() - amount) >= MIN_BALANCE)
        this.setBalance(getBalance() - amount);
  }

  // toString method
  public String toString() {
    return "Business Checking " + super.toString();
  }

  public void accrueInterest() {
    this.setBalance(getBalance() + (getBalance() * INTEREST_RATE));
  }

  
  
}
