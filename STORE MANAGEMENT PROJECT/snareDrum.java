public class snareDrum extends Percussion{

  /*
  *Instance variables are declared
  *One variable for shell material for snare drum 
  *another variable for the shell thickness for snare drum
  */
private String shellMaterial;
private double shellThickness;

   /*
  *No-argument constructor 
  *sets the piano (constructor) to a value and has super for percussion
  */
  
public snareDrum(){
   super("medium", "brown", 650.0, false);
  shellMaterial= "wood";
  shellThickness= 1.5;   
}

   /*
  *Parameterized constructor 
  *sets the value of instance variables to the data given when replaced with arguments
  */
  
  public snareDrum(String size, String color, double price, boolean hasStrings, String shellMaterial, double shellThickness){
    super(size, color, price, hasStrings);
    this.shellMaterial= shellMaterial;
    this.shellThickness= shellThickness;
  }
   /*
  *Accessor and Mutator Methods
  *to get and return the data
  *if you want to change or modify a value, you can use mutator methods
*/
  public String getShellMaterial(){
    return shellMaterial;

  }

    public double getShellThickness(){
    return shellThickness;

  }
   public void setShellMaterial(String shellMaterial){
    this.shellMaterial = shellMaterial;
  }
  
  public void setShellThickness(double shellThickness){
    this.shellThickness = shellThickness;
  }
  
}