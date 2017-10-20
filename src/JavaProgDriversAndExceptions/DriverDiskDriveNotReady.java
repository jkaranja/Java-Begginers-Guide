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

public class DriverDiskDriveNotReady {
    public static void main(String [] args){
        try{
            
            Scanner b=new Scanner(System.in);
            System.out.println("Enter your first item");
            String y=b.next();
            throw new DiskDriveNotReady();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
