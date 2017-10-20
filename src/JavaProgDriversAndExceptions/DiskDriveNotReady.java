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
public class DiskDriveNotReady extends Exception{
    public DiskDriveNotReady(){
        super("your associated item set is [a,b]");
    }
    public DiskDriveNotReady(String message){
        super(message);
    }
   
}