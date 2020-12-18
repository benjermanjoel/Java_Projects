
package edu.cvtc.java;

/**
 * @author ben.julian
 *
 */

public class FinalExam extends GradedActivity {
  // Private fields
  private int numberOfQuestions;
  private int numberOfMissed;
  private double pointsEach;
  
  // The FinalExam Constructor also sets the score for the object
  public FinalExam (int numberOfQuestions, int numberOfMissed) {
    // Private variables
    double numericScore;
    
    this.numberOfQuestions = numberOfQuestions;
    this.numberOfMissed = numberOfMissed;
    
    pointsEach = 100.0 / numberOfQuestions;
    numericScore = 100.0 - (numberOfMissed * pointsEach);
    
    super.setScore(numericScore);
  }

  // Getters for our private fields
  public int getNumberOfQuestions() {
    return numberOfQuestions;
  }

  public int getNumberOfMissed() {
    return numberOfMissed;
  }

  public double getPointsEach() {
    return pointsEach;
  }
}
