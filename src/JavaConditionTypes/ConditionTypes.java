/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaConditionTypes;

/**
 *
 * @author john
 */
//import java.awt.*;
//import javax.swing.*;
//import java.awt.event.*;
import java.util.*;
public class ConditionTypes  {
       
  
     
    public ConditionTypes()
    {
    
     int x=9;
        String fun;
        int counter;
        
        fun="Brilliant!!";
        double y=0.6;
       double sum=0;
       int w;
       int p;
       int j;
       j=3;
        p=3;       
        w=p+j;
        
        sum=x+y;
        
       
        
        
        
        //switch just like else if but with one condition w=2;
        
        switch(w){
            //case "boy":
       case 1:
                System.out.println("yea");
                break;
                case 2:
                System.out.println("");
                break;
                    case 3:
                System.out.println("");
                break;
                    default:
                System.out.println("");
                break;
        } 
        
        
        
        // if else if--and bruckets are optional-note else doesnt have a condition
        
        
        
        
        int z=3;
        
        if(z==8)
       
      System.out.println(""+z);
        
       else if(z==5 && z<6 ||z<=4)
        System.out.println(""+z);
       else 
                 
        System.out.println("my bad");
         
        
  
       //NB nested if else stament is an if else statement inside another if else statement
       
        int q;
        q=6;
        if(q==5)
        {
                  if(q<3)
                  {}
                 else
                  {}    
            
        }   
        else
        {
        
        }
       
        //------------if alone
       int t=2;
       String message;
       if((t<7) || (t<6) )
       {
       
        message="hi there";   
           
       }
        
       
       else if(t>=6)
       {
       message="Yes it's me";
       System.out.println(message);
       }
       
       
     //--or using if else inside system.out
       int f=0;
       System.out.println(f<8? "yeah it's":"unfortunately not");
        
        
     
       
//      System.out.println("im number "+x +y +fun);
//        System.out.print("im number "+y);
//        System.out.print("\n ");
//        System.out.print("sum is "+sum );   
       
    
  }    
       
   
public static void main(String[]args){
       
      new ConditionTypes(); 
      String x;
     Scanner kb= new Scanner(System.in);
     
     x=kb.next();
     
     System.out.println(x);
        
    }
}