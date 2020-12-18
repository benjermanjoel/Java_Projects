
package edu.cvtc.java;

/**
 * @author ben.julian
 *
 */

public class CourseGrades implements Analyzable {  
  // The public field NUMBER_OF_GRADES holds the number of graded activities.
  //  It is static in order to be overridden from within the driver program
  public static int NUMBER_OF_GRADES;
  
  // Private fields
  private GradedActivity grades[] = new GradedActivity[NUMBER_OF_GRADES];
  
  // No-argument Constructor
  public CourseGrades() {
    
  }
  
  // Setters for each GradedActivity object
  public void setLab(GradedActivity gradedActivity) {
    grades[0] = gradedActivity;
  }
  
  public void setPassFailExam(PassFailExam passFailExam) {
    grades[1] = passFailExam;
  }
  
  public void setEssay(Essay essay) {
    grades[2] = essay;
  }
  
  public void setFinalExam(FinalExam finalExam) {
    grades[3] = finalExam;
  }

  // The toString Method prints the scores and grades for each activity
  public String toString() {
    return "Lab Score: " + grades[0].getScore() + "\n" +
           "  Grade: " + grades[0].getGrade() + "\n" +
           "\nPass/Fail Exam Score: " + grades[1].getScore() + "\n" +
           "  Grade: " + grades[1].getGrade() + "\n" +
           "\nEssay Score:" + grades[2].getScore() + "\n" +
           "  Grade: " + grades[2].getGrade() + "\n" +
           "\nFinal Exam Score: " + grades[3].getScore() + "\n" +
           "  Grade: " + grades[3].getGrade() + "\n";
  }

  // Public getters retrieve the average, highest score, and the lowest 
  // score of all GradedActivity's
  public double getAverage() {
    double total = 0;   
    double average;    
    // For loop to add up all the values in the array.
    for (int index = 0; index < NUMBER_OF_GRADES; index++)
      total += grades[index].getScore();
      // Calculate the average.
      average = total / NUMBER_OF_GRADES;
      return average;
  }

  public GradedActivity getHighest() {
    // Declare variables
    double highestScore = grades[0].getScore();
    GradedActivity highestScoredActivity = new GradedActivity();
    // Enhanced For Loop  
    for (int index = 1; index < NUMBER_OF_GRADES ; index++){
      if (grades[index].getScore() > highestScore) {
       highestScore = grades[index].getScore();
       highestScoredActivity = grades[index];
      }
    }
    return highestScoredActivity;
  }

  public GradedActivity getLowest() {
    // Declare variables
    double lowestScore = grades[0].getScore();
    GradedActivity lowestScoredActivity = new GradedActivity();
    // Enhanced for loop
    for (int index = 1; index < NUMBER_OF_GRADES ; index++){
      if (grades[index].getScore() < lowestScore) {
       lowestScore = grades[index].getScore();
       lowestScoredActivity = grades[index];
      }
    }
    return lowestScoredActivity;
  }
}
