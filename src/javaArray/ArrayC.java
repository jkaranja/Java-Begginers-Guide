/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaArray;

/**
 *
 * @author john
 */
public class ArrayC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numbers[]= new int[3];//number of reserved indeces/index-upper boundary
        
       
        numbers[0]=40;// cell one or index 0ne stores 40 etc
        numbers[1]=70;
        numbers[2]=90;   // should not exceed number of defined indeces
        
        System.out.println(numbers[2]);
        
       //Another way of storing arrays-Alternative 2
        
       // int number4[]=new int[]{40,50,60,70}; this works too
        
        int number4[]={40,50,60,70};
          System.out.println(number4[3]);
          
          
          //Alternative 3
          
          System.out.println("subject no\t grades");
          
          int grades[]={70,43, 57,66};
          
          //printing all the arrays using for loop
         
          for (int counter=0; counter<grades.length; counter++) //grades.length=number of index.. you can put <4 but you 
              //have to change it when number of indexs changes. grades.length define end point automatically
              
          {
             counter++;
              
              System.out.println(counter + "\t" + grades[counter] );
          }
          
        
        
    }
    
}
