import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {
/*
    *Scanner Methods:
    *nextInt() ---> save the inputed value as an int
    *nextDouble()---> to save the inputed value as an double 
    
  */
    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

  Percussion piano = new Percussion("large", "black", 6900.0, true);


    System.out.println(piano.toString());

    // Closes the Scanner object
    input.close();
    
  }
}