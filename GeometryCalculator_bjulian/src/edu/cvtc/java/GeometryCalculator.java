
package edu.cvtc.java;

import java.util.Scanner;

/**
 * This program will prompt the user to choose a number 1 through 4.
 * Each choice corresponds to a public static method in the Geometry Class
 * that returns the area of the shape passed via user input. The end-user
 * will have the option to quit the program and we have error-checking
 * enabled for non-positive integer values.
 * 
 * @author ben.julian
 *
 */
public class GeometryCalculator {
  
  // Method to prompt the user to begin the program
  public static void prompt() {
    
    // Ask the user to choose between 1 - 4.
    System.out.print("Geometry Calculator\n" +  
        "\t1. Calculate the Area of a Circle\n" + 
        "\t2. Calculate the Area of a Rectangle\n" + 
        "\t3. Calculate the Area of a Triangle\n" + 
        "\t4. Quit\n" + 
        "Enter your choice (1-4):");
  }
  
  // Invalid value method for reuse later
  public static void invalidValue() {
    System.out.println("Invalid value. Please enter a positive number.");
  }

  public static void main(String[] args) {
  
    // Create a Scanner object to read input and 
    // create input variable
    Scanner keyboard = new Scanner(System.in);
    byte choice;
    
    // Call our prompt method and capture the input
    prompt();
    choice = keyboard.nextByte();
    
    // Validate the input and loop the prompt if the
    // user doesn't choose a value between 1 and 4
    while (choice < 1 || choice > 4) 
    {
      System.out.println("Invalid choice, please enter a number between 1 and 4."
          + "\nTo quit, choose option 4.");
      prompt();
      choice = keyboard.nextByte();
    }
  
    // Switch statement for all 4 choices 
    // as well as the default case
    switch (choice) {
      // Case 1: Calculate the Area of a Circle
      case 1:
        double radius = 0.0;
        System.out.println("Enter the radius of the circle: ");
        radius = keyboard.nextDouble();
        while (radius <= 0) 
        {
          invalidValue();
          System.out.println("Enter the radius of the circle: ");
          radius = keyboard.nextDouble();
        }
        System.out.println("You entered " + radius);
        System.out.println("The area of this circle is " + 
            Geometry.getCircleArea(radius));
        break;
        
      // Case 2: Calculate the Area of a Rectangle
      case 2:
        double length = 0.0;
        double width = 0.0;
        System.out.println("Enter the length of the rectangle: ");
        length = keyboard.nextDouble();
        while (length <=0 ) 
        {
          invalidValue();
          System.out.println("Enter the length of the rectangle: ");
          length = keyboard.nextDouble();
        }
        System.out.println("You entered " + length);
        System.out.println("Enter the width of the rectangle: ");
        width = keyboard.nextDouble();
        while (width <= 0) 
        {
          invalidValue();
          System.out.println("Enter the width of the rectangle: ");
          width = keyboard.nextDouble();
        }
        System.out.println("You entered " + width);
        System.out.println("The area of this rectangle is " + 
            Geometry.getRectangleArea(length, width));
        break;
      
      // Case 3: Calculate the Area of a Triangle
      case 3:
        double base = 0.0;
        double height = 0.0;
        System.out.println("Enter the base of the triangle: ");
        base = keyboard.nextDouble();
        while (base <= 0) 
        {
          invalidValue();
          System.out.println("Enter the base of the triangle: ");
          base = keyboard.nextDouble();
        }
        System.out.println("You entered " + base);
        System.out.println("Enter the height of the triangle: ");
        height = keyboard.nextDouble();
        while (height <= 0) 
        {
          invalidValue();
          System.out.println("Enter the height of the triangle: ");
          height = keyboard.nextDouble();
        }
        System.out.println("You entered " + height);
        System.out.println("The area of this triangle is " + 
            Geometry.getTriangleArea(base, height));
        break;
      
      // Case 4, quit the program
      case 4:
        System.out.println("Quitting Geometry Calculator..." + "\nDone.");
        break;
      
      // Default case, break out if no valid choice provided
      default:
        System.out.println("Invalid choice, please enter a number between 1 and 4."
            + "\nTo quit, choose option 4.");
        break;
    }
    
    keyboard.close();
  }
}

   

