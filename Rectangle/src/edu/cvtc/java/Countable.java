package edu.cvtc.java;

/**
* This class demonstrates a static field.
 */

public class Countable{
    
  private static int instanceCount = 0;
    
    public Countable(){
      
       instanceCount++;
    }

    public int getInstanceCount()
    {
       return instanceCount;
   }
}
