/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author john
 */
public class Daughter extends TheMother {
 
   
    
       public static void main(String[] args) {
        // TODO code application logic here
       TheMother mt=new TheMother();// this inherits static mtds and constructorseg swing components
                    //or just new TheMother() if you dont have none static mtds.
       
       mt.LoveAll();  //this calls or inherits methods that are not static
     
       WeAre();
       
    }
    
    
}
