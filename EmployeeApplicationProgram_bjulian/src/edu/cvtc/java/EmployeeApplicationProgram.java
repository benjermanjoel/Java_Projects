
package edu.cvtc.java;

/**
 * This driver program tests inheritance between the various
 * employee classes within the project
 * 
 * @author ben.julian
 *
 */
public class EmployeeApplicationProgram {

  public static void main(String[] args) {
   
    Employee thorOdinsson = new TeamLeader(
        "Thor Odinsson", "002-L","Jan 1, 1991", 2, 25.00, 500.00, 40.00, 30.50);
    
    thorOdinsson.setEmployeeName("Loki was here");
    
    
    System.out.println(thorOdinsson.toString());
    
    
    
    
    // Create four new employee objects, one from each class,
    // passing default values to our overloaded constructors.
    
    Employee jamesBond = new Employee(
        "James Bond", "007-B", "March 15th, 1925");
    
    ProductionWorker samwiseGamgee = new ProductionWorker(
        "Samwise Gamgee", "101-G", "April 6th, 2980 T.A", 1, 15.00);

    ShiftSupervisor minervaMcGonagal = new ShiftSupervisor(
        "Prof. Minerva McGonagal", "023-M", "May 22, 1895", 55000.00, 10000.00);

    TeamLeader benKenobi = new TeamLeader(
        "Ben Kenobi", "187-J", "Jan 3rd, 57 BBY", 2, 25.00, 500.00, 40.00, 30.50);
    
    
     //Print out the information for each employee object separated by a divider
    
    String divide = "-------------------------------------";

    System.out.println(jamesBond.toString() + "\n" + divide);

    System.out.println(samwiseGamgee.toString()+ "\n" + divide);

    System.out.println(minervaMcGonagal.toString()+ "\n" + divide);

    System.out.println(benKenobi.toString()+ "\n" + divide);

  }

}
