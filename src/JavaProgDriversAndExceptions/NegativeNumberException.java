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

public class NegativeNumberException extends Exception{
    public NegativeNumberException(){
        super("Negative Number Not Allowed!");
    }
    public NegativeNumberException(String message){
        super(message);
    }
}
