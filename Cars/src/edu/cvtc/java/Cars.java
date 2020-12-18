/**
 * 
 */
package edu.cvtc.java;

/**
 * @author ben.julian
 *
 */
import javax.swing.JOptionPane;

public class Cars {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // Cars
    String make, model;
    make = JOptionPane.showInputDialog("Enter your make");
    model = JOptionPane.showInputDialog("Enter your model");
    System.out.print("My car is a" + make + model);

  }

}
