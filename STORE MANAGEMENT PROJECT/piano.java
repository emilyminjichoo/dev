public class piano extends Percussion{
 
  /*
  *Instance variables are declared
  *One variable for type of pedal for piano 
  *another variable for the number of keys on the piano (integer)
  */
  private String typeOfPedal;
  private int numOfKeys;

  //constructors
  
  /*
  *No-argument constructor 
  *sets the piano (constructor) to a value and has super for percussion
  */
  public piano(){
   super("large", "black", 5000.0, true);
   typeOfPedal= "sostenuto pedal";
   numOfKeys= 104;
  }

  /*
  *Parameterized constructor 
  *sets the value of instance variables to the data given when replaced with arguments
  */
  public piano(String size, String color, double price, boolean hasStrings, String typeOfPedal, int NumOfKeys){
   super(size, color, price, hasStrings);
    this.typeOfPedal= typeOfPedal;
    this.numOfKeys= numOfKeys;
  }
  /*
  *Accessor and Mutator Methods
  *to get and return the data
  *if you want to change or modify a value, you can use mutator methods
*/
  public String getTypeOfPedal(){
    return typeOfPedal;

  }

    public int getNumOfKeys(){
    return numOfKeys;

  }
   public void setTypeOfPedal(String typeOfPedal){
    this.typeOfPedal = typeOfPedal;
  }
  
  public void setNumOfKeys(int numOfKeys){
    this.numOfKeys = numOfKeys;
  }
  

}
