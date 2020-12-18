/**
 * Bank Account Simulation program
 * @author ben.julian
 *
 */
public class BankAccount {
  
  //Initialize private attributes:
  private double balance;
  private double interestRate;
  private double interest;
  
  //Initialize the constructor
  public BankAccount(double startBalance, double intRate)
  {
    balance = startBalance;
    interestRate = intRate;
    interest = 0.0;
  }
  
  // Initialize the deposit method
  public void deposit(double amount)
  {
    balance += amount;
  }
  
  // Initialize the withdraw method.
  public void withdraw(double amount)
  {
    balance -= amount;
  }
  
  //Initialize the addInterest method.
  public void addInterest()
  {
   interest = balance * interestRate;
   balance += interest;
  }
 
  //Initialize the getBalance method.
  public getBalance()
  {
    return balance;
  }

  //Initialize the getInterest method.
  public getInterest()
  {
    return interest;
  }

}
