/**
 * This driver program creates three new 
 * instances of Rectangle objects.
 */
package edu.cvtc.java;

/**
 * Import the Scanner package
 */

import java.util.Scanner;

/**
 * @author ben.julian
 *
 */
public class RoomAreas {

  /**
   * 
   */
  public static void main(String[] args) {
    
    // Set variables
    double length, width, totalArea;
    
    // Create new Scanner object:
    Scanner keyboard = new Scanner(System.in);
    
    // Initialize the three new Rectangle objects:
    Rectangle kitchen = new Rectangle();
    Rectangle den = new Rectangle();
    Rectangle bedroom = new Rectangle();
    
    /** 
     * Get and store the dimensions via user input:
     */
    
    // Get and store the dimensions of the kitchen.
     System.out.print("What is the kitchen's length? ");
     length = keyboard.nextDouble();
     kitchen.setLength(length);
     System.out.print(length);
     System.out.print("What is the kitchen's width? ");
     width = keyboard.nextDouble();
     kitchen.setWidth(width);
     System.out.print(width);
     System.out.println("The total area of this room is " + kitchen.getArea());
     
     // Get and store the dimensions of the den.
     System.out.print("What is the den's length? ");
     length = keyboard.nextDouble();
     den.setLength(length);
     System.out.print("What is the den's width? ");
     width = keyboard.nextDouble();
     den.setWidth(width);
     System.out.println("The total area of this room is " + den.getArea());
     
     // Get and store the dimensions of the bedroom.
     System.out.print("What is the bedroom's length? ");
     length = keyboard.nextDouble();
     bedroom.setLength(length);
     System.out.print("What is the bedroom's width? ");
     width = keyboard.nextDouble();
     bedroom.setWidth(width);
     System.out.println("The total area of this room is " + bedroom.getArea());
     
     /**
      * Calculate total area of each room.
      */
     totalArea = kitchen.getArea() + den.getArea() + bedroom.getArea();
     
     // Display the total area:
     
     System.out.println("The total area of all three rooms is " + totalArea);
    
     keyboard.close();
     

  }

}
