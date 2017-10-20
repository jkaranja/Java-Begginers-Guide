/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultipleClasiz;

/**
 *
 * @author john
 */
public class MainMtdClass {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        //this is how you call a another class//like a constructor in main  
        NoMainMtd mtdobject= new NoMainMtd();
        // this is how you call a mtd in another class
        mtdobject.Hey();
    }
    
}
