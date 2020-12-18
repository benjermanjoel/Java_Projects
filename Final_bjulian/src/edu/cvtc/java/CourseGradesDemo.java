
package edu.cvtc.java;

/** This driver program tests the classes within 
 * the java project "Final_bjulian"
 * 
 * @author ben.julian
 *
 */
public class CourseGradesDemo {

  public static void main(String[] args) {
    // Initialize the NUMBER_OF_GRADES public field:
    CourseGrades.NUMBER_OF_GRADES=4;
    
    // Create a new CourseGrades object
    CourseGrades courseGrades = new CourseGrades();
    
    // Create four new objects to be passed to the CourseGrades class using
    // the provided information as well as some default values:
    
    GradedActivity gradedActivity = new GradedActivity();
    gradedActivity.setScore(85);

    PassFailExam passFailExam = new PassFailExam(70, 20, 5);
      
    Essay essay = new Essay();
    essay.setScore(12, 15, 20, 45);

    FinalExam finalExam = new FinalExam(50, 10);
    
    // Pass the scores for the four graded activities to the set
    // methods provided in the CourseGrades class:
    courseGrades.setLab(gradedActivity);
    courseGrades.setPassFailExam(passFailExam);
    courseGrades.setEssay(essay);
    courseGrades.setFinalExam(finalExam);
    
    // Print the scores and letter grades for the assignments using the
    // CourseGrades class's toString method:
    System.out.println(courseGrades.toString());
    
    // Also print out the average score, the highest score, and
    // the lowest score of all the graded activities: 
    System.out.println("Average Score: " + courseGrades.getAverage());
    System.out.println("\nHighest Score: " + courseGrades.getHighest().getScore());
    System.out.println("\nLowest Score: " + courseGrades.getLowest().getScore());
  }
}
