/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liarrary;

import liarrary.OPC.MangerOperation;
import java.util.Scanner;

/**
 *
 * @author shoeep
 */
public class Liarrary {
public static  void showInfo()throws Exception{
    
           System.out.println("ENTER 1 FOR MINUE STUDENT:PRESS 1 PLEASE  ***");
          
           System.out.println("ENTER 2 FOR MINUE BOOK:PRESS 1 PLEASE  ***");
         
           System.out.println("ENTER 3 FOR MINUE AUTHER:PRESS 1 PLEASE  ***");
            
           System.out.println("ENTER 4 FOR MINUE MANGER:PRESS 1 PLEASE  ***");
             
           System.out.println("ENTER 5 FOR MINUE STUDENT:PRESS 1 PLEASE  ***");
             
           System.out.println("ENTER 6 FOR MINUE INFO:PRESS 1 PLEASE  ***");
          
           System.out.println("ENTER 0 FOR EXIT MINUE INFO:PRESS 1 PLEASE  ***");
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
      
          MangerOperation manger=new MangerOperation(); 
       
           int chioce=6;
          showInfo();
       do{
            
         
           try {
                 Scanner input=new Scanner(System.in);
          
                chioce =input.nextInt();  
               
           } catch (Exception e) {
               System.out.println("insert number ");
           }
              
               switch(chioce){   
            
            
           case 1: {
        
          
            manger.opertionLoop(1);
                  
                       }     
      break;
      
           case 2:
               
                       manger.opertionLoop(2);
          
           break;
           
            case 3:
                      manger.opertionLoop(3);
          
            break; 
          case 4:{
          
                      manger.opertionLoop(4);
          }  break; 
          case 5:{
                       showInfo();
        
          }  break; 
       default:System.out.println("the insert is not defined ");
       
         break; 
     }//END SWITCH  
     
         }while(chioce==0);//
      
     
    
        
       
       
        
        
    }
    
}
