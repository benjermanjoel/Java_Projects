/**
 * 
 */
package edu.cvtc.java;

/**
 * @author ben.julian
 *
 */
public class Rectangle {

  /**
   * Rectangle class
   */

    // Members
    private double length;
    private double width;
    
    /**
     * Constructors
     */
    
    public Rectangle()
    {
      length = 0;
      width = 0;
    }
    
    public Rectangle(double len, double w) {
      length = len;
      width = w;
    }
 
    /**
     * Stand alone set methods
     */
    
    public void setLength(double len) 
    {
      length = len;
    }
    
    public void setWidth(double w) 
    {
      length = w;
    }
    
    /**
     * 
     * Multiple arguments set method
     */
   
    public void set(double len, double w) {
      length = len;
      width = w;
    }
    
    /**
     * Get length method
     */
    
    public double getLength()
    {
      return length;
    }
    
    /**
     * 
     * Get width method
     */
    
    public double getWidth()
    {
      return width;
    } 
    
    /**
     * Get Area method
     */
    public double getArea() 
    {
      return length * width;
    }
    
    public static double getArea(double length, double width) {
      return length * width;
    }
    

}
