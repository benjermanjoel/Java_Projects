package edu.cvtc.java;

public class TestCube {

  public static void main(String[] args) {
    Cube myCube = new Cube(10, 10, 10);
    
    System.out.print("\nLength= " + myCube.getLength());
    System.out.print("\nWidth= " + myCube.getWidth());
    System.out.print("\nHeight= " + myCube.getHeight());
    System.out.print("\nVolume= " + myCube.getVolume());
    System.out.print("\nArea= " + myCube.getArea());
    System.out.print("\nSurface Area= " + myCube.getSurfaceArea());

  }

}
