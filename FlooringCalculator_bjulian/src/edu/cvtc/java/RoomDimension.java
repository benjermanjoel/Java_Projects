
package edu.cvtc.java;

/**
 * 
 * @author ben.julian
 *
 */

public class RoomDimension {
    private double length;
    private double width;
    
    // No-argument Constructor
    public RoomDimension() 
    {
      length = 0.0;
      width = 0.0;
    }
    
    // Overloaded Constructor
    public RoomDimension(double length, double width) 
    {
      this.length = length;
      this.width = width;  
    }
    
    // Methods for accessing length, width and area
    public double getLength() 
    {
      return length;
    }
    
    public double getWidth() 
    {
      return width;
    } 
    
    public double getArea() 
    {
      return length * width;
    }
}
