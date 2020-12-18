
package edu.cvtc.java;

/** This driver program tests the instanceOf operator 
 * as well as the interface, abstract classes and abstract methods
 * within this Java project
 * @author ben.julian
 *
 */
public class BankAccountDemoTwo {

  public static void main(String[] args) {
    
    // Create three new bank account objects with initialized values
    BankAccount free = new FreeCheckingAccount(1000.00);
    BankAccount biz = new BusinessCheckingAccount(1000);
    BankAccount savings = new SavingsAccount(1000);
    
    // Create an array holding the three accounts
    BankAccount accounts[] = {free, biz, savings};
    
    // For each account, print the balance and determine 
    // if it accrues interest or not
    
    for (BankAccount i:accounts) {
      System.out.println(i.toString());
      
      if (i instanceof AccruesInterest) 
      {
        System.out.println(
            "This account type accrues interest.\nAdding interest...");
        ((AccruesInterest) i).accrueInterest();
        System.out.println(
            "New " + i.toString() + "\n------------------");
      }
      else 
      {
        System.out.println(
            "This account type does NOT accrue interest.\n------------------");
      }
    }
  }

}
