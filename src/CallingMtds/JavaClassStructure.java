/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CallingMtds;

/**
 *
 * @author john
 */
public class JavaClassStructure {
 
    
    //objects are those items that have memory allocated to and have state and behaviour
    //eg class person will have objects such as legs , arms
    //A class is a logical conatiner for objects or a template for creating objects which difines its properties and behaviours. 
    
    public JavaClassStructure()
            {
           //this is a constructor and do not return a value..it creates objects and their references 
               // constructors too could be parameterized
                //but you wil have to call the null constructor too
                
            }
    
    public static void Hey(/*String x*/){
    
        //String x is a parameter whic is optional..
    //this is a static mtd which can only be refered to by another static mtd like Main
        //it belongs to the whole claSS instead of a certain instance of class
        //void means it doesn't return() anything
        //it is public to all classes that want to use it outside this class
        //static mtds are not overriden
      //Overriding methds --multiple methods have same type,name, parameters
        //overload, mtds with same name but different parameters
    }
     public int getName() { 
       // this is a mtd with a return type
      int x;
      x=1;
     return x;
     }  
    
    
    public static void main(String[]arg)
    {
   // First thing that is looked at by the compiler
     Hey();//calling static method
     new  JavaClassStructure();// calling a constructor with mtd in it
     
    }
    
    
}
