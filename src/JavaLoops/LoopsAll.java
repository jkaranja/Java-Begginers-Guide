/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLoops;

/**
 *
 * @author john
 */
import java. util.Scanner;
public class LoopsAll {
       
    public static void TheLoops()
    
    {
        //Scanner input=new Scanner(System.in);
        //Scanner sum=new Scanner(System.in);grade= sum.nextInt();
    
   //loops make execution of codes multiple times     
        
   //The while loop
    //takes only 1 parameter    
        
       int counter=0;
       while(counter<3)
       {
           
          counter++; 
        System.out.println("Im a while loop "+counter);
       
       }      
       //System.out.println("Im a while loop "+counter); 
        
       //The for loop
       //have 3 conditions/paramenters,starting,end  &increment/decrement  
       // unlike while loop which don't print the starting point, for loop starts and ends as specified
       //this will start fro 1 but if it were while loop it wud have started from 2 
       int x;
       int i=1;
       
       //for(x=i;x<=8;x++ ) or to increment by a number eg 1 which is equal to ++ or +=2 
       for(x=i;x<=4;x++ )
       {
              if(x==3)
              {
             System.out.println("justfound 3");
             
             break; //getting out of the loop
               }
       System.out.println("i'm a for loop"+x);
       
       }
       
       
      //the do while
       //executes a piece of code at least once
      //it prints the first results of a code and then go to th while loop to confirm whether it should do it again; 
       
       int w=4;
       do
       {
       System.out.println("i'm a do while loop"+w);
       w++;
       }while(w<3);
              
       
       
       
       
       
    }
    
    public static void main(String[]args)
    {
    
    TheLoops();
    
    
    
    int q=0;
    
    
    System.out.println(q++);  //value of operand will be 0 but next it will add 1 below 
     System.out.println(++q); //value of opearnd q = 1
            
    
    }
            
}
