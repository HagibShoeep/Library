/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liarrary.OPC;

import java.util.List;
import java.util.Vector;
import liarrary.TypeLBook;
import liarrary.VOOPc.VoMangerBook;

/**
 *
 * @author shoeep
 */
public class MangerBook extends VoMangerBook implements TypeLBook<VoMangerBook>{
private static MangerBook mangerBook;
private       MangerBook(){
    count=0;
}
static int count;
 
     public static List<VoMangerBook> in =new Vector<VoMangerBook>();
    public static MangerBook getMangerBook(){
        if(mangerBook ==null)
           mangerBook=new MangerBook();
        
        return mangerBook;
    }
    @Override
    public List<VoMangerBook> getList() {
     
        return in;
        
    }

    @Override
    public VoMangerBook getById(int x) {
        VoMangerBook vomanger=new MangerBook();
       
       for(VoMangerBook iterator:in ){
           
           if(iterator.getIdManger()==x){
               
               vomanger.setIdManger(iterator.getIdManger());
               vomanger.setNameManger(iterator.getNameManger());
               vomanger.setJob(iterator.getJob());
             vomanger.setTypeManger(iterator.getTypeManger());
               return vomanger;
           }
       }
       return null;
    }
    

    @Override
    public boolean insert(VoMangerBook insert) {
       count++;
                in.add(insert);
return true;
    }

    @Override
    public boolean update(VoMangerBook insert) {
        int index=0;
        for(VoMangerBook iterator:in){
            
            if( iterator.getIdManger()==insert.getIdManger()){
                
                in.set(index, insert);
              
                return true;
            
            }
            index++;
        }
        return false;
    }

    @Override
    public boolean removeItem(VoMangerBook insert) {
        
          int index=0;
        for(VoMangerBook iterator:in){
            
            if( iterator.getIdManger()==insert.getIdManger()){
                
                in.remove(index);
              
                return true;
            
            }
            index++;
        }
        
       return false;
    }

    
   
    
     public int length() {
        return count;
    }
  
    
}
