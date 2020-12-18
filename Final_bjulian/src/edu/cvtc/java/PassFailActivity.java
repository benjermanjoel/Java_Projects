
package edu.cvtc.java;

/**
 * @author ben.julian
 *
 */

public class PassFailActivity extends GradedActivity {
  // Private fields
  private double minimumPassingScore;
  
  // Constructors
  public PassFailActivity() {
    
  }
  
  public PassFailActivity(double minimumPassingScore) {
    this.minimumPassingScore = minimumPassingScore;
  }
  
  // The getGrade method overrides the getGrade method 
  // in the GradedActivity superclass
  public char getGrade() {
    char grade;
    
    if (super.getScore() >= minimumPassingScore) {
      grade = 'P';}
    else {
      grade = 'F';}
    
    return grade;
  }
}
