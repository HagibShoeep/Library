/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liarrary.OPC;

import java.util.List;
import liarrary.TypeLBook;
import liarrary.VOOPc.VoBook;

/**
 *
 * @author shoeep
 */
public class Book extends VoBook implements TypeLBook<VoBook>   {
static int count;
    private  static Book  instanceBook;
    private Book(){
        count=0;
 
    }
    public static Book  getinstancBook(){
      if( instanceBook==null   )  
          
          instanceBook=new  Book();
          
      
        return  instanceBook; 
    }
    
    
  static List<VoBook> in;
   
    @Override
    public VoBook getById(int x) {
         VoBook  info=new VoBook();
        for( VoBook iteraitor:in ){
            
      info.setIdBook(iteraitor.getIdBook());
      
      info.setNameBook(iteraitor.getNameBook());
      
      info.setBookAdres(iteraitor.getBookAdres());
      
      info.setDateBookBubish(iteraitor.getDateBookBubish());
      
      info.setNumberBook(iteraitor.getNumberBook());
                  
        }
        return info;
    }

    @Override
    public boolean insert(VoBook insert) {
      in.add(insert);
      return true;
    }

    @Override
    public boolean update(VoBook insert) {
        int count=0;
       for(VoBook iterator:in){
           
           if(iterator.getIdBook()==insert.getIdBook()){
               in.set(count,insert);
               return true;
           }count++;
       }
       return false;
       
    }

    @Override
    public boolean removeItem(VoBook insert) {
         int count=0;
       for(VoBook iterator:in){
           
           if(iterator.getIdBook()==insert.getIdBook()){
               in.remove(count);
               return true;
           }count++;
       }
       return false;
    }

    @Override
    public List<VoBook> getList() {
return in;
    
    
           }

    @Override
    public int length() throws Exception {
       return count;
    }

   
    
    
}
