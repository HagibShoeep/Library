/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liarrary.OPC;

import java.util.List;
import java.util.Vector;
import liarrary.TypeLBook;
import liarrary.VOOPc.VoAuther;

/**
 *
 * @author shoeep
 */
public class Auther  extends VoAuther implements TypeLBook<VoAuther> {
    public static Auther getAuther() {
        return auther;
    }
    public static void setAuther(Auther auther)throws Exception{
        Auther.auther = auther;
    }
private   static Auther auther;
 public static Auther   getInstAuther(){
 
 if(auther==null)
     auther=new Auther();
 
 return auther;}
 
 
private Auther(){
    count=0;
}
   public static List<VoAuther> in =new Vector<>();
static int count;
    @Override
    public VoAuther getById(int x)throws Exception {
       for(VoAuther iterator:in){
           if(iterator.getIdAuther()==x){
               return iterator;
           }
       }
       return null;
    }

    @Override
    public boolean insert(VoAuther inst)throws Exception {
        in.add(inst);
        return true;
       
    }

    @Override
    public boolean update(VoAuther ins)throws Exception {
      int i=0;
               for(VoAuther iterator:in){
           if(iterator.getIdAuther()==ins.getIdAuther()){
               in.set(i, ins);
               return true;
           }
           i++;
       }
        return false;
            
            
        }
        
    @Override
    public boolean removeItem(VoAuther ins)throws Exception {
        
  int i=0;
               for(VoAuther iterator:in){
           if(iterator.getIdAuther()==ins.getIdAuther()){
               in.remove(i);
               return true;
           }
           i++;
       }
        return false;
    }

    @Override
    public List<VoAuther> getList()throws Exception {
       return in;
    }
 public int length()throws Exception{
        return count;
    }

}
