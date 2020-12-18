
package edu.cvtc.java;

/**
 * @author ben.julian
 *
 */

public class RoomFlooring {
    private RoomDimension room;
    private double priceSqFt;
    
    // No-argument Constructor
    public RoomFlooring() 
    {
      
    }
    
    // Overloaded Constructor
    public RoomFlooring(RoomDimension room, double priceSqFt) 
    {
      this.room = room;
      this.priceSqFt = priceSqFt;
    }
    
    // getCostSqFt method
    public double getCostSqFt() 
    {
      return priceSqFt * room.getArea();
    }
    
}
