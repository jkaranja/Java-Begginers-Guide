/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProgDriversAndExceptions;

/**
 *
 * @author john
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class DriverNegativeNumberException {
    public static void main(String [] args){
        boolean done=false;
        while(!done){
        try{
        Scanner s=new Scanner(System.in);
        int x,y;
        System.out.println("Enter Your First Number");
        x=s.nextInt();
        System.out.println("Enter Your Second Number");
        y=s.nextInt();
        if(x<0 || y<0){
            throw new NegativeNumberException();
        }
        System.out.println("Your Numbers Are "+ x + " And " + y);
        done=true;
        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        }
    }
}
