
package edu.cvtc.java;

/**
 * @author ben.julian
 *
 */

public class FreeCheckingAccount extends BankAccount {

  // Private Fields
  private static final double MIN_BALANCE = 100.0;
 
  // Constructors
  public FreeCheckingAccount() {
    
  }

  public FreeCheckingAccount(double balance) {
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
    return "Checking " + super.toString();
  }


}
