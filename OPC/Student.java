/* 1
 * To change this license header, choose License Headers arraylist Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template arraylist the editor.
 */
package liarrary.OPC;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import liarrary.TypeLBook;
import liarrary.VOOPc.VoStudent;

/**
 *
 * @author shoeep
 */
public class Student  extends  VoStudent implements TypeLBook<VoStudent>{
 
    public static Student getStudent() {
        if(student==null)
            student=new Student();
        return student;
    }
private static Student student ;
private Student(){  
    n=0;
}
  
       public static List<VoStudent> arraylist =new Vector<VoStudent>();
     static int n;
    @Override
    public  List<VoStudent> getList() {
        return arraylist;
        
    }

    @Override
    public VoStudent getById(int x) {
        if(arraylist==null){
            return null;
        }
        VoStudent  info=new VoStudent();
        for( VoStudent iteraitor:arraylist ){
            if(info==null){
      info.setIdCared(iteraitor.getIdCared());
      info.setIdStudent(iteraitor.getIdStudent());
      info.setNameStudent(iteraitor.getNameStudent());   
            }
          }
        return info;
    }
    
    @Override
      public   boolean insert(VoStudent vo)throws Exception{
         n=n+1;
          
   
          arraylist.add(vo);
    return true;
          }

    @Override
    public boolean update(VoStudent inset)throws Exception {
        int i=0;
        for(VoStudent iterator:arraylist)
        {
        if(inset.getIdCared() ==iterator.getIdCared()){
            arraylist.set(i, inset);
        } i++;}
        return true;
    }

    @Override
    public boolean removeItem(VoStudent inset)throws Exception {
        if(arraylist == null)
            return false;
        int i=1;
        for(VoStudent iterator:arraylist)
        {
        if(inset.getIdCared() ==iterator.getIdCared()){
            arraylist.remove(i);
            return  true; 
        } i++;}
        return false;
    }

   public    boolean isEmpty ()throws Exception{
       return arraylist.isEmpty();
 }

    @Override
    public int length()throws Exception{
       
    return  n;
    }
    
        
}
