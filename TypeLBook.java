/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liarrary;

import java.util.List;

/**
 *
 * @author shoeep
 */
public interface TypeLBook<T> {
 
    List<T>    getList()throws Exception;
      T               getById(int x)throws Exception;
     int length()throws Exception;
     boolean  insert(T insert)throws Exception;   
     boolean  update(T insert)throws Exception;   
     boolean      removeItem(T insert)throws Exception;        
      
}
