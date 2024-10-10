 public class Percussion{

   /*
   *Instance variables
   *4 instance variables to keep track of size, color, price, and strings of percussion (superclass)
   */ 
  private String size; 
  private String color;
  private double price;
  private boolean hasStrings;

  
 //constructors
 /*
  *No-argument constructor 
  *sets the percussion (constructor)'s instance variables to a value 
  */
   public Percussion(){
    size="small";
    color= "no color";
    price = 0.0;
    hasStrings= false;
  }
 /*
  *Parameterized constructor 
  *sets the value of instance variables to the data given when replaced with arguments
  */
  public Percussion(String size, String color, double price, boolean hasStrings){
    this.size= size;
    this.color= color;
    this.price= price;
    this.hasStrings= hasStrings;
  }

  
 /*
  *Accessor and Mutator Methods
  *to get and return the data
  *if you want to change or modify a value, you can use mutator methods
*/
  public String getSize(){
    return size;

  }

    public String getColor(){
    return color;

  }
    public double getPrice(){
    return price;

  }
    public boolean getHasStrings(){
    return hasStrings;

  }
  public void setSize(String size){
    this.size = size;
  }
  
public void setColor(String color){
    this.color = color;
  }
  
  public void setPrice(double price){
    this.price = price;
  }
  
  public void setHasStrings(boolean hasStrings){
    this.hasStrings = hasStrings;
  }
  
// toString Method Override
   // used for printing/ returning a certain format for info onto console.log when needed
  public String toString(){
    return "Percussion size: " + size +"\nPercussion color: " + color +"\nPercussion price: " + price + "\nPercussion has Strings?: "+ hasStrings;
  }
}