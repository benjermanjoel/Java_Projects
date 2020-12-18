/**
 * 
 */
package edu.cvtc.java;

import java.util.Scanner;

/**
 * @author ben.julian
 * This driver program demonstrates how to pass multiple
 * arguments to our Rectangle method(s).
 *
 */
public class MultipleArgs {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    double length;
    double width;
    
    
    //Create a scanner object.
    Scanner keyboard = new Scanner(System.in);
        
    // Create a new Rectangle.
    
    Rectangle box = new Rectangle();
    
    // Get the length of the box from the user.
    
    System.out.print("What is the length of the box? ");
    length = keyboard.nextDouble();
    
    // Get the width of the box from the user.
    
    System.out.print("What is the width of the box? ");
    width = keyboard.nextDouble();
    
    // Pass the length and width of the box to the set method.
    
    
    box.set(length, width);
    System.out.println("The length of the box is  " + length);
    System.out.println("The width of the box is " + width);
    System.out.println("The area of the box is  " + box.getArea());
    
    keyboard.close();


  }

}
