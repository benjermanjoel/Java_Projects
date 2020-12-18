
package edu.cvtc.java;

/**
 * @author ben.julian
 *
 */

public class Essay extends GradedActivity {
  // Private fields
  private double grammar;
  private double spelling;
  private double correctLength;
  private double content;
  
  // Public getters and setters
  public double getScore() {
    return super.getScore();
  }
  
  public void setScore(double grammar, double spelling, 
      double correctLength, double content) {
    this.grammar = grammar;
    this.spelling = spelling;
    this.correctLength = correctLength;
    this.content = content;
    
    double numericScore;
    
    numericScore = (grammar + spelling 
        + correctLength + content);
    
    super.setScore(numericScore);
  }
  
  // Public getters and setters for private fields
  public double getGrammar() {
    return grammar;
  }
  public void setGrammar(double grammar) {
    this.grammar = grammar;
  }
  public double getSpelling() {
    return spelling;
  }
  public void setSpelling(double spelling) {
    this.spelling = spelling;
  }
  public double getCorrectLength() {
    return correctLength;
  }
  public void setCorrectLength(double correctLength) {
    this.correctLength = correctLength;
  }
  public double getContent() {
    return content;
  }
  public void setContent(double content) {
    this.content = content;
  }
}
