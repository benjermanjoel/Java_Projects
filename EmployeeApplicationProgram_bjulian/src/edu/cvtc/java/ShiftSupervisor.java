package edu.cvtc.java;

import java.text.DecimalFormat;

/**
 * 
 * @author ben.julian
 *
 */

public class ShiftSupervisor extends Employee {
  private double annualSalary;
  private double annualBonus;
  
  // No-argument Constructor
  public ShiftSupervisor() {
    
  }
  // Overloaded Constructors
  public ShiftSupervisor(double annualSalary, double annualBonus) {
    this.annualSalary = annualSalary;
    this.annualBonus = annualBonus;
  }
  
  public ShiftSupervisor(
      String employeeName, 
      String employeeNumber, 
      String employeeHireDate, 
      double annualSalary, 
      double annualBonus) 
  {
    super(employeeName,employeeNumber,employeeHireDate);
    this.annualSalary=annualSalary;
    this.annualBonus=annualBonus;
  }
  
  // Get shift supervisor data methods
  public double getAnnualSalary() {
    return annualSalary;
  }
  public double getAnnualBonus() {
    return annualBonus;
  }
  
  // Set shift supervisor data methods
  public void setAnnualSalary(double annualSalary) {
    
  }
  
  public void setAnnualBonus(double annualBonus) {
    
  }
  
  // To string method
  public String toString(){
    DecimalFormat dollar = new DecimalFormat("0,000.00");
    String str = 
        super.toString();
      str += 
        "\nAnnual Salary: $" + dollar.format(annualSalary) +
        "\nAnnual Bonus: $" + dollar.format(annualBonus);
     return str;
  }
  
}
