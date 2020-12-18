
package edu.cvtc.java;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * This driver program tests the methods created in the 
 * RoomDimension and RoomFlooring Classes.
 * @author ben.julian
 *
 */
public class FlooringCalculatorProgram {

  public static void main(String[] args) {
    // Create scanner, Initialize variables
    Scanner keyboard = new Scanner(System.in);
    double length = 0.0;
    double width = 0.0;
    double price = 0.0;
   
    // Fetch user input for the length and width of the room,
    // as well as the price per foot of flooring.
    System.out.println("Enter the length of the room: ");
    length = keyboard.nextDouble();
    System.out.println("Enter the width of the room: ");
    width = keyboard.nextDouble();
    System.out.println("Enter the flooring's price per square foot: ");
    price = keyboard.nextDouble();
    
    // Create and initialize the new RoomDimension and RoomFlooring objects
    // with the inputed data.
    RoomDimension room = new RoomDimension(length,width);
    RoomFlooring flooring = new RoomFlooring(room,price);
    
    // Calculate and display the room's area using the 
    // RoomDimension Class's getArea method
    System.out.println("\nThe total area of the room is " + 
        room.getArea() + " square feet.");
    
    // Return the cost per square foot using the RoomFlooring Class's 
    // getCostSqFt method
    System.out.println("\nThe total cost of flooring for this room will be " + 
        NumberFormat.getCurrencyInstance().format(flooring.getCostSqFt()));
   
    keyboard.close();
  }
}
