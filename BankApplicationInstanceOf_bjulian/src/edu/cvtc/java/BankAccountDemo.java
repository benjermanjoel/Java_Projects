
package edu.cvtc.java;

/** The BankAccountDemo program tests dynamic binding 
 * of the common 'withdraw' method shared by all subclasses
 * 
 * @author ben.julian
 *
 */
public class BankAccountDemo {

  public static void main(String[] args) {
    
    // Create three new bank account types with initialized values
    BankAccount free = new FreeCheckingAccount(125.00);
    BankAccount biz = new BusinessCheckingAccount(1025);
    BankAccount savings = new SavingsAccount(25);
    
    // Print starting values
    System.out.println("Starting Balances:");
    System.out.println(free.toString());
    System.out.println(biz.toString());
    System.out.println(savings.toString());
    
    System.out.println("----------------------");
    
    // Withdraw funds
    free.withdraw(5);
    biz.withdraw(5);
    savings.withdraw(5);
    
    System.out.println("Withdrawing $5 from each account...\nNew Balances:");
    
    // Print new values
    System.out.println(free.toString());
    System.out.println(biz.toString());
    System.out.println(savings.toString());
    
    System.out.println("----------------------" + "\n"
        + "Withdrawing $21 from each account...\nNew Balances:");
    
    // Withdraw funds
    free.withdraw(20);
    biz.withdraw(20);
    savings.withdraw(20);
    
    // Print new values
    System.out.println(free.toString());
    System.out.println(biz.toString());
    System.out.println(savings.toString());

  }

}
