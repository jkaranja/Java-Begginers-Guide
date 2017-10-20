/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CallingMtds;
/**
 *
 * @author john
 */
public class CallingmtdinMain {
    
    
    public CallingmtdinMain()
            
            
    {
        //do some things here.
    System.out.println("I'm eating");
    
   
    }
    
    //only static methods can be called in main-that which refers to the whole class not spec object..that which can
    //can be called by the main mtd
   public static void Hey()
   {
     new CallingmtdinMain();
   System.out.println("I'm eating");
   }
    

       public static void main(String[] args) {
      
           
       //you don't call methods using new, only constructors are called using new.
  Hey();  
   
       //or CallingmtdinMain.Hey()
       }
       
}
