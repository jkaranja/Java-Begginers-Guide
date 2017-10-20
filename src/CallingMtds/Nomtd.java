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
public class Nomtd {

    /**
     * @param args the command line arguments
     */
    
    //constructor-creates and initializes instances of objects-creates and allocate memory
    //objects are instances of a class-that which mem has bn allocated to
    //objects in java could be methods, buttons,  greetings lk blow, animal, person-basically anything with xstics
    public Nomtd()
            
    {
        //private mtd called within a constructor
        //do everything here and call the constructor
        //you can use parametirized constructors too but you must call the null constructor too
   System.out.println("I'm eating");
    }    
     
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //call the constructor-
        new Nomtd();
        
        
    }
    
}
