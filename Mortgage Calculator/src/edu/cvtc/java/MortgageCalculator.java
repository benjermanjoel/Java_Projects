/**
 * 
 */
package edu.cvtc.java;

/**
 * @author ben.julian
 *
 */

import javax.swing.JOptionPane;

public class MortgageCalculator {

  /**
   * This new class calculate an monthly mortgage given the 
   * principal, interest rate, and period of the loan in years.
   */
  public static void main(String[] args) {
    // Calculate a monthly mortgage.
   //Get principal
    int principal;
    principal = Integer.parseInt
        (JOptionPane.showInputDialog("Enter your loan amount:"));
    //Get Annual Interest rate.
    float interestRate;
    interestRate = Float.parseFloat
        (JOptionPane.showInputDialog("Enter in your approved interest rate:"));
    //Get loan period.
    int loanPeriod;
    loanPeriod = Integer.parseInt
        (JOptionPane.showInputDialog("Enter in your loan period in years:"));
    //Print monthly interest rate.
    double result = 0;
    
    JOptionPane.showMessageDialog(null, "Your Monthly mortgage payment will be %,.2f\n" + result);
    System.exit(0);
  }

}
