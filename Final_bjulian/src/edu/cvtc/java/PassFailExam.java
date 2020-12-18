
package edu.cvtc.java;

/**
 * @author ben.julian
 *
 */

public class PassFailExam extends PassFailActivity {
  //Private fields
   private int numberOfQuestions;
   private int numberOfMissed;
   private double pointsEach;
   
   // The PassFailExam Constructor also sets the score for the object
   public PassFailExam (double minimumPassingScore, 
       int numberOfQuestions, int numberOfMissed) {
     super(minimumPassingScore);
     this.numberOfQuestions = numberOfQuestions;
     this.numberOfMissed = numberOfMissed;
     
     double numericScore;
     
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
