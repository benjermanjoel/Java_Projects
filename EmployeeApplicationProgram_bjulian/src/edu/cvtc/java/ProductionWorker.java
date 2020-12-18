package edu.cvtc.java;

import java.text.DecimalFormat;

/**
 * 
 * @author ben.julian
 *
 */

public class ProductionWorker extends Employee {
  private int shift;
  private double hourlyPayRate;
  public static final int DAY_SHIFT=1;
  public static final int NIGHT_SHIFT=2;
  
  // No-argument Constructor
  public ProductionWorker() {
    
  }
  
  // Overloaded Constructors
  public ProductionWorker(int shift, double hourlyPayRate) 
  {
    this.shift = shift;
    this.hourlyPayRate = hourlyPayRate;
  }
  
  public ProductionWorker(
      String employeeName, 
      String employeeNumber, 
      String employeeHireDate,
      int shift,
      double hourlyPayRate) 
  {
      super(employeeName,employeeNumber,employeeHireDate);
      this.shift=shift;
      this.hourlyPayRate=hourlyPayRate;
  }
  
  // Get production worker data methods
  
  public int getShift() {
    return shift;
  }
  public double getHourlyPayRate() {
    return hourlyPayRate;
  }
  
  // Set production worker data methods
  
  public void setShift(int shift) {
    
  }
  public void setHourlyPayRate(double hourlyPayRate) {
    
  }
  
  public String toString(){
    DecimalFormat dollar = new DecimalFormat("00.00");
    String shiftStr;
    if (shift == DAY_SHIFT) {
          shiftStr = "Day";}
    else if (shift == NIGHT_SHIFT) {
      shiftStr = "Night";}
    else {
      shiftStr = "Invalid shift integer";
        }
    String str = 
        super.toString();
      str += 
        "\nShift: " + shiftStr +
        "\nHourly Pay rate: $" + dollar.format(hourlyPayRate);
    return str;
  }

}
