/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liarrary.OPC;

import java.util.Scanner;
import liarrary.TypeManger;
import liarrary.VOOPc.VoAuther;
import liarrary.VOOPc.VoBook;
import liarrary.VOOPc.VoMangerBook;
import liarrary.VOOPc.VoStudent;

/**
 *
 * @author shoeep
 */
public class MangerOperation {
    
   public void insertedStudent()throws Exception{
          System.out.println("Count Student:"+Student.getStudent().length());
         Scanner in1=new Scanner(System.in);
          VoStudent vo=new VoStudent();
          System.out.println("insert id cared:");
          int idcared=in1.nextInt();
          vo.setIdCared(idcared);
         
          System.out.println("insert id student:");
      int id=   in1.nextInt();
          vo.setIdStudent(id);
           
           System.out.println("insert Name Student:");
        String name=    in1.next();
          vo.setNameStudent(name);
          Student.getStudent().insert(vo);
      }
       
   public void insertedBook()throws Exception{
           Scanner in=new Scanner(System.in);
          VoBook vo=new VoBook();
          System.out.println("insert id Book:");
          
          vo.setIdBook(in.nextInt());
          
          System.out.println("insert name Book plusher:");
            
          vo.setNameBook(in.nextLine());
          
          
          System.out.println("insert addres book:");
            
          vo.setBookAdres(in.nextInt());
          
           System.out.println("insert number   book:");
            
          vo.setNumberBook(in.nextInt());
          
           System.out.println("insert Date Book plusher:");
            
          vo.setDateBookBubish(in.nextLine());
          
           
          Book.getinstancBook().insert(vo);
          
                                  }
       
   public void insertedAuther()throws Exception{
          
             Scanner in=new Scanner(System.in);
          VoAuther vo=new VoAuther();
          System.out.println("insert id Auther:");
          
          vo.setIdAuther(in.nextInt());
          
          System.out.println("insert name Auther plusher:");
            
          vo.setNameAuther(in.nextLine());
          
          
          System.out.println("insert info Auther:");
            
          vo.setInfoAuther(in.nextLine());
          
        
          
           
          Auther.getAuther().insert(vo);
                                  }
       
   public void insertedManger()throws Exception{
          
             Scanner in=new Scanner(System.in);
          VoMangerBook vo=new VoMangerBook();
          System.out.println("insert id Manger:");
          
          vo.setIdManger(in.nextInt());
          
          System.out.println("insert System Login  plusher: 1 for ADMIN 2"
                  + "  USER3");
            
          vo.setNameManger(in.nextLine());
       boolean   ischicked=false;
       
      int  number=0;
          while(ischicked){
              
             number=     in.nextInt();
              if(number==1){
                 vo.setTypeManger(TypeManger.ADMIN);
                 ischicked=true;
              }
              else if(number==2)
              {
                 vo.setTypeManger(TypeManger.MANGER);  
                 ischicked=true;
              }
              else if(number==3){
                      vo.setTypeManger(TypeManger.USER);
                      ischicked=true;
                                }
                 
          }
         
         
           System.out.println("insert name Manger:");
            
          vo.setNameManger(in.nextLine());
          
          System.out.println("insert Name Jop:");
            
          vo.setJob(in.nextLine());
          
        
          
           
          MangerBook.getMangerBook().insert(vo);
                  
                                  }
      
   public void updateStudent()throws Exception{
      Scanner in=new Scanner(System.in);
          VoStudent vo=new VoStudent();
         if(Student.getStudent().isEmpty()){
              System.out.println("is empty");
         
          return;
         }
          System.out.println("update id cared:");
          
          vo.setIdCared(in.nextInt());
          
          System.out.println("update id student:");
            
          vo.setIdStudent(in.nextInt());
          
           System.out.println("update Name Student:");
            
          vo.setNameStudent(in.nextLine());
          
          Student.getStudent().update(vo);
  
                                 }
      
   public void updateBook()throws Exception{
          
           Scanner in=new Scanner(System.in);
          VoBook vo=new VoBook();
          System.out.println("update id Book:");
          
          vo.setIdBook(in.nextInt());
          
          System.out.println("update name Book plusher:");
            
          vo.setNameBook(in.nextLine());
          
          
          System.out.println("update addres book:");
            
          vo.setBookAdres(in.nextInt());
          
           System.out.println("update number   book:");
            
          vo.setNumberBook(in.nextInt());
          
           System.out.println("update Date Book plusher:");
            
          vo.setDateBookBubish(in.nextLine());
          
           
          Book.getinstancBook().update(vo);
                                 }
       
   public void updateAuther()throws Exception{
           Scanner in=new Scanner(System.in);
          VoAuther vo=new VoAuther();
          System.out.println("update id Auther:");
          
          vo.setIdAuther(in.nextInt());
          
          System.out.println("update name Auther plusher:");
            
          vo.setNameAuther(in.nextLine());
          
          
          System.out.println("update info Auther:");
            
          vo.setInfoAuther(in.nextLine());
          
        
          
           
          Auther.getAuther().update(vo);
                               
          
                                 }
        
   public void updateManger() throws Exception{
          //MangerBook.getMangerBook().getById(0);
     Scanner in=new Scanner(System.in);
          VoMangerBook vo=new VoMangerBook();
          System.out.println("update id Manger:");
          
          vo.setIdManger(in.nextInt());
          
          System.out.println("update System Login  plusher: 1 for ADMIN 2"
                  + "  USER3");
            
          vo.setNameManger(in.nextLine());
       boolean   ischicked=false;
       
      int  number=0;
          while(ischicked){
              
             number=     in.nextInt();
              if(number==1){
                 vo.setTypeManger(TypeManger.ADMIN);
                 ischicked=true;
              }
              else if(number==2)
              {
                 vo.setTypeManger(TypeManger.MANGER);  
                 ischicked=true;
              }
              else if(number==3){
                      vo.setTypeManger(TypeManger.USER);
                      ischicked=true;
                                }
                 
          }
         
         
           System.out.println("update name Manger:");
            
          vo.setNameManger(in.nextLine());
          
          System.out.println("update Name Jop:");
            
          vo.setJob(in.nextLine());
          
        
          
           
          MangerBook.getMangerBook().update(vo);     
                                 }
       
   public void delateStudent()throws Exception{
        Scanner countForDeleted =new Scanner(System.in);
  VoStudent vo=      Student.getStudent().getById( countForDeleted.nextInt());
  if(vo==null)
      return;
      Student.getStudent().removeItem(vo);
              
             
        
        
                         }
    
   public void delateBook()throws Exception{
          
            Scanner countForDeleted =new Scanner(System.in);
  VoBook vo=      Book.getinstancBook().getById( countForDeleted.nextInt());
  if(vo==null)
      return;
      Book.getinstancBook().removeItem(vo);    
                                 }
   public void delateAuther()throws Exception{
          
           Scanner countForDeleted =new Scanner(System.in);
  VoAuther vo=      Auther.getAuther().getById( countForDeleted.nextInt());
  if(vo==null)
      return;
      Auther.getAuther().removeItem(vo);     
                                 }
   public void delateManger()throws Exception{
            Scanner countForDeleted =new Scanner(System.in);
  VoMangerBook vo=      MangerBook.getMangerBook().getById( countForDeleted.nextInt());
  if(vo==null)
      return;
      MangerBook.getMangerBook().removeItem(vo);    
          
                                 }
     
   public void searchStudent()throws Exception{
       System.out.println("insert rows for search:");
           Scanner countForDeleted =new Scanner(System.in);
    int ValueSearch=       countForDeleted.nextInt();
      if(Student.arraylist.isEmpty())
      {
      return;
      }--ValueSearch;
         System.out.println("ID STUDENT:"+Student.arraylist.get(ValueSearch));
         System.out.println("ID CARED:"+Student.arraylist.get(ValueSearch));
         System.out.println("NAME STUDENT:"+Student.arraylist.get(ValueSearch));
                                }
     
   public void searchBook()throws Exception{
                Scanner countForDeleted =new Scanner(System.in);
       VoBook vo=new VoBook();
       vo=Book.getinstancBook().getById(countForDeleted.nextInt());
        if(Book.in.isEmpty()){
            return;
        }
          
                  System.out.println("ID BOOK:"+Book.in.get(0).getIdBook());    
                  System.out.println("NAME BOOK"+Book.in.get(0).getNameBook()); 
                  System.out.println("AUTHER BOOK"+Book.in.get(0).getAutherBook()); 

                  System.out.println("BOOK ADRESS"+Book.in.get(0).getBookAdres()); 
                  System.out.println("DATE BOOK BUBLISH"+Book.in.get(0).getDateBookBubish()); 
                  System.out.println("NUMBER BOOK"+Book.in.get(0).getNumberBook()); 
      }

   public void searchAuther()throws Exception{
                    Scanner countForDeleted =new Scanner(System.in);
   int  saerchVal=countForDeleted.nextInt();
        if(Auther.in.isEmpty()){
            return;
        }
        --saerchVal;
         System.out.println("ID Auther:"+Auther.in.get(saerchVal).getIdAuther());
         System.out.println("NAME AUTHER:"+Auther.in.get(saerchVal).getNameAuther());
         System.out.println("INFO AUTHER :"+Auther.in.get(saerchVal).getInfoAuther());
         
                                }
     
     
       
        public void searchManger()throws Exception{
         
                           Scanner countForDeleted =new Scanner(System.in);
       VoMangerBook vo=new VoMangerBook();
       vo=MangerBook.getMangerBook().getById(countForDeleted.nextInt());
        if(vo==null){
            return;
        }
         System.out.println("ID MANGER:"+vo.getIdManger());
         System.out.println("ID NAME MANGER:"+vo.getNameManger());
         System.out.println("NAME STUDENT MANGER:"+vo.getTypeManger().getType());
         System.out.println("NAME JOP MANGER:"+vo.getJob());
            
                                }
   public  void info(String name )throws Exception{
    System.out.println("ENTER 1 FOR MINUE  INSERT "+name+":PRESS 1 PLEASE  ***");
          
           System.out.println("ENTER 2 FOR  UPDATE  MINUE "+name+":PRESS 2 PLEASE  ***");
         
           System.out.println("ENTER 3 FOR SHOW "+name+":PRESS 3 PLEASE  ***");
            
           System.out.println("ENTER 4 FOR DELETE "+name+":PRESS 4 PLEASE  ***");
             
           System.out.println("ENTER 5 FOR SERCH  "+name+":PRESS 5 PLEASE  ***");
           
            System.out.println("ENTER 0 FOR  EXIT  "+name+":PRESS 6 PLEASE  ***");
           }
   
   
   
   
   public void  opertionLoop(int chioc)throws Exception{
      Scanner inner=new Scanner(System.in);
       int innerChioce=5;
      
           
           switch(chioc){
               
               case 1:{
                   info("STUDENT");
                   do{
                       
                       innerChioce=inner.nextInt();
                       switch(innerChioce){
                           case 1:
                               this.insertedStudent();
                           break;
                             case 2:
                               this.updateStudent();
                           break;
                           
                             case 3:
                             this.searchStudent();
                           break;
                             case 4:
                                 this.delateStudent();
                           break;
                             case 5:    info("STUDENT");
                               
                           break;
                            default:System.out.println("insert is out of range");
                           break;
                       }
                       
                   }while(innerChioce !=0);
               }break;
                   
               case 2:{
                   this.info("BOOK");
                      do{
                      try{
                           innerChioce=inner.nextInt();
                      }catch(Exception ex){
                          System.out.println("not falid number");
                      }
                      
                       switch(innerChioce){
                           case 1:
                               this.insertedBook();
                           break;
                             case 2:
                               this.updateBook();
                           break;
                           
                             case 3:
                             this.searchBook();
                           break;
                             case 4:
                                 this.delateBook();
                           break;
                             case 5:
                               this.info("BOOK");
                           break;
                           default:System.out.println("insert is out of range");
                           break;
                       }
                       
                   }while(innerChioce !=0);
               }break;
               case 3:
                   
               {
                   this.info("AUTHER");
                    do{
                  
                       innerChioce=inner.nextInt();
                       switch(innerChioce){
                           case 1:
                               this.insertedAuther();
                           break;
                             case 2:
                               this.updateAuther();
                           break;
                           
                             case 3:
                             this.searchAuther();
                           break;
                             case 4:
                                 this.delateAuther();
                           break;
                             case 5:
                                this.info("AUTHER");
                           break;
                            default:System.out.println("insert is out of range");
                           break;
                       }
                       
                   }while(innerChioce !=0);
                   
               }break;
               
               case 4 :
               
               {
                       this.info("MANGER");
                        do{
                     
                       innerChioce=inner.nextInt();
                       switch(innerChioce){
                           case 1:
                               this.insertedManger();
                           break;
                             case 2:
                               this.updateManger();
                           break;
                           
                             case 3:
                             this.searchManger();
                           break;
                             case 4:
                                 this.delateManger();
                           break;
                             case 5:
                                this.info("MANGER");
                           break;
                            default:System.out.println("insert is out of range");
                           break;
                       }
                       
                   }while(innerChioce !=0);
                }
                      break;
                  case 5 :
               
               {
                       this.info("chose 1-5 exit 0");
                }
                      break;
               default:this.info("not foned");
           }
         
       
       
    
           }
}
