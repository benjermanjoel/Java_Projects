package edu.cvtc.java;

/**
 * The Employee class is the superclass for this Java Project

 * @author ben.julian
 *
 */

public class Employee {
  // Private fields
  private String employeeName;
  private String employeeNumber;
  private String employeeHireDate;
  
  // No-argument Constructor
  public Employee() {
    
  }
  // Overloaded constructor
  public Employee(String employeeName, String employeeNumber,
      String employeeHireDate) {
    
    this.employeeName=employeeName;
    this.employeeNumber=employeeNumber;
    this.employeeHireDate=employeeHireDate;
    setEmployeeNumber(employeeNumber);   
  }
  
  // Get employee data Methods
  public String getEmployeeName() {
    return employeeName;
  }
  public String getEmployeeNumber() {
    return employeeNumber;
  }
  public String getEmployeeHireDate() {
    return employeeHireDate;
  }
  
  // Set employee data Methods
  public void setEmployeeName(String employeeName) {
    this.employeeName=employeeName;
     
  }
  public void setEmployeeNumber(String employeeNumber) {
    if (isValidEmployeeNumber(employeeNumber)) {
       this.employeeNumber=employeeNumber;}
       else {
         System.out.println("Invalid employee number. Please enter the employee "
             + "number in the following format: 123-A. Valid letters include A-M.");}
  }
  public void setEmployeeHireDate(String employeeHireDate) {
    
  }
  
  //Validation of the Employee Number
  private boolean isValidEmployeeNumber(String employeeNumber){
    boolean isValid = true;
    int index = 0;
    
    if (employeeNumber.length() != 5) {
      isValid = false;
    }
    
    while (isValid && index < 3) {
      if (!Character.isDigit(employeeNumber.charAt(index))) {
        isValid = false;
        break;
      }
      index++;
    }
    
    while (isValid && index == 3) {
      if (employeeNumber.charAt(index) != '-') {
        isValid = false;
        break;
      }
      index++;
    }
    
    while (isValid && index < 5 ) {
      if (Character.getNumericValue(employeeNumber.charAt(index)) < 10 || 
          Character.getNumericValue(employeeNumber.charAt(index)) > 22) {
        isValid = false;
        break;
      }
      index++;
    }
    return isValid;
    
  }
 
  
  // To String method
  public String toString(){
    String str = 
        "Name: " + employeeName +
        "\nEmployee ID Number: " + employeeNumber +
        "\nHire Date: " + employeeHireDate;
    return str;
  }

}
