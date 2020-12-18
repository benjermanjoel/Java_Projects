package edu.cvtc.java;

/**
 * 
 * @author ben.julian
 *
 */

public class Geometry {
  
  // Calculate the Area of a Circle
  public static double getCircleArea(double radius) { 
        return (Math.PI*radius*radius);
    }

  // Calculate the Area of a Rectangle
  public static double getRectangleArea(double length, double width) {
        return length * width;
    }
  
  // Calculate the Area of a Triangle
  public static double getTriangleArea(double base, double height) {
        return (base * height * 0.5);
    }
  
}
