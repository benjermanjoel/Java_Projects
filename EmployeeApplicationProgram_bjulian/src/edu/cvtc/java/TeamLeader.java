package edu.cvtc.java;

import java.text.DecimalFormat;

/**
 * 
 * @author ben.julian
 *
 */

public class TeamLeader extends ProductionWorker {
  private double monthlyBonus;
  private double requiredTrainingHours;
  private double actualTrainingHours;
  
  // No-argument Constructor
  public TeamLeader() {
    
  }
  
  // Overloaded Constructors
  public TeamLeader(
      double monthlyBonus, 
      double requiredTrainingHours,
      double actualTrainingHours) 
  {
    this.monthlyBonus=monthlyBonus;
    this.requiredTrainingHours=requiredTrainingHours;
    this.actualTrainingHours=actualTrainingHours;
  }
  
  public TeamLeader(
      String employeeName,
      String employeeNumber,
      String employeeHireDate,
      int shift,
      double hourlyPayRate,
      double monthlyBonus, 
      double requiredTrainingHours, 
      double actualTrainingHours) 
  {
    super(employeeName, employeeNumber, employeeHireDate, 
        shift, hourlyPayRate);
    this.monthlyBonus=monthlyBonus;
    this.requiredTrainingHours=requiredTrainingHours;
    this.actualTrainingHours=actualTrainingHours;
    
  }
  
  // Get team leader data methods
  public double getMonthlyBonus() {
    return monthlyBonus;
  }
  public double getRequiredTrainingHours() {
    return requiredTrainingHours;
  }
  public double getActualTrainingHours() {
    return actualTrainingHours;
  }
  
  // Set team leader data methods
  public void setMonthlyBonus(double monthlyBonus) {
    
  }
  public void setRequiredTrainingHours(double requiredTrainingHours) {
    
  }
  public void setActualTrainingHours(double actualTrainingHours) {
    
  }
  
  public String toString(){
    DecimalFormat dollar = new DecimalFormat("000.00");
    String str = 
        super.toString();
        str += 
        "\nMonthly Bonus: $" + dollar.format(monthlyBonus) +
        "\nRequired Training Hours: " + requiredTrainingHours +
        "\nActual Training Hours: " + actualTrainingHours;
    return str;
  }

}
