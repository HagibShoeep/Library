/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liarrary;

import liarrary.VOOPc.VoBook;
import liarrary.VOOPc.voReciveBook;
import liarrary.VOOPc.VoAuther;
import liarrary.VOOPc.VoStudent;
import liarrary.VOOPc.VoMangerBook;
import java.util.List;

/**
 *
 * @author shoeep
 */
public class storeInfODP {
  private static storeInfODP inparent;
  private storeInfODP(){
      
      
  }
  public static storeInfODP getInstanceParent(){
      if(inparent==null)
          inparent=new storeInfODP();
      return inparent;
      
  }
    public List<VoStudent> getListStudent() {
        return listStudent;
    }

    public void setListStudent(List<VoStudent> listStudent) {
        
        this.listStudent = listStudent;
    }

    public List<VoBook> getBook() {
        return book;
    }

    public void setBook(List<VoBook> book) {
        this.book = book;
    }

    public List<VoAuther> getAuther() {
        return auther;
    }

    public void setAuther(List<VoAuther> auther) {
        this.auther = auther;
    }

    public List<voReciveBook> getRecive() {
        return recive;
    }

    public void setRecive(List<voReciveBook> recive) {
        this.recive = recive;
    }

    public List<VoMangerBook> getManger() {
        return manger;
    }

    public void setManger(List<VoMangerBook> manger) {
        this.manger = manger;
    }
       List<VoStudent> listStudent;
       List<VoBook> book;
       List<VoAuther> auther;
       List<voReciveBook> recive;
       List<VoMangerBook> manger;
       
    
    
    
    
}
