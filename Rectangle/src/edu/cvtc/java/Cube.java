package edu.cvtc.java;

public class Cube extends Rectangle {
  private double height;
  
  public Cube(double length, double width, double height) {
    super(length,width);
    this.height=height;
  }
  
  // Methods
  
  public double getHeight() {
    return height;
  }
  
  public void setHeight(double height) {
    
  }
  
  public double getVolume() {
    return getArea() * height;
  }
  
  public double getSurfaceArea() {
    return getArea() * 6;
  }
  
  

}
