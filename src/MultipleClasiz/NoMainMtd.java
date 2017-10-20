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
import java.util.Scanner;
public class NoMainMtd {
    //must be static as it will be called from main..static mtds call static mtd
    public static void Hey()
    {
    Scanner input=new Scanner(System.in);    
   String name=input.nextLine();
   
    System.out.println("I'M being called from another class"+name);
    }
}
