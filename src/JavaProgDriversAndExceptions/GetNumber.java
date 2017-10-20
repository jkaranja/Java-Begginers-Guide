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
import java.util.*;
/*import java.util.InputMismatchException;
import javax.swing.JOptionPane;*/


public class GetNumber {
    public static void main(String [] args){
        boolean done=false;
        while(!done){
            try{
        Scanner kb=new Scanner(System.in);
        int firstNumber,secondNumber;
        System.out.println("Enter the first number");
        //JOptionPane.showInputDialog(null,"Enter the first number");
        firstNumber=kb.nextInt();
        System.out.println("Enter the second number");
        //JOptionPane.showInputDialog(null,"Enter the second number");
        secondNumber=kb.nextInt();
        if(firstNumber<0 || secondNumber<0){
            throw new InputMismatchException();
        }
        System.out.println("Your numbers are: " + firstNumber+ " And " + secondNumber);
        done=true;
        }catch(InputMismatchException e){
           System.out.println("Invalid inputs.Negative numbers not permitted!!!! please Try again");
        }
    }
}
}


