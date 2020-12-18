package edu.cvtc.java;

public class LengthDemo {
  
  public static void main(String[] args)
  {
    Rectangle box = new Rectangle();
    System.out.println("Sending the value 10.0 to " +
        "the setLenth method.");
    
   box.set(10.0, 20.0);
   System.out.println("Done.");
 
   
   box.getLength();
   box.getWidth();
   
   System.out.println("The box's length is " +
                box.getLength());
   System.out.println("The box's width is " +
               box.getWidth());
   System.out.println("The box's area is " +
               box.getArea());
   
  }
  
  

}
