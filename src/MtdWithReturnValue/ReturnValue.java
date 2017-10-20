/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MtdWithReturnValue;

/**
 *
 * @author john
 */

public class ReturnValue {
  private String name;    
    
  
  public void setName(String w)
  {
  name=w;
  w="john kar";
  }
  public String getName()
  {
  return name;
  }
  
  public void NameMine()
          
  {
  //System.out.println("%s", getName());
  } 
  
  
  public static  String MyName()      
  {
  String q="john karanja";
      
    return q;  
  }
  
  
  public static void MyNameIs()
        
  {
   String myna=MyName();
   
   System.out.println(myna);
  
  }
  
  
      public static void main(String[] args) 
      {
          MyNameIs();
           System.out.println("My  \"so called\" life"); 
           
        
           
      }
    
}
