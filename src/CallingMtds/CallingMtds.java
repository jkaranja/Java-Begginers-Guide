/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callingmtds;

/**
 *
 * @author john
 */
public class CallingMtds {

    /**
     * @param args the command line arguments
     */
    //   print and println-next line or \n and \t a space
    //constructor-creates and initializes instances of objects-creates and allocate memory
    //objects are instances of a class-that which mem has bn allocated to
    //objects in java could be methods, buttons,  greetings lk blow, animal, person-basically anything with xstics
    public CallingMtds()
            
    {
        //private mtd called within a constructor-this the recoc way .
   hey();
   Greetings();
    }    
     
    
    private void hey()
    {
    System.out.println("I'm eating");
    }
     private void Greetings()
    {
    System.out.println("You kidding me?");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        //call the constructor-
        new CallingMtds();
        
        
    }
    
}
