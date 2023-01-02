/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liarrary.VOOPc;

import liarrary.OPC.Auther;

/**
 *
 * @author shoeep
 */
public class VoBook {
  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return NameBook;
    }

    public void setNameBook(String NameBook) {
        this.NameBook = NameBook;
    }

    public String getDateBookBubish() {
        return DateBookBubish;
    }

    public void setDateBookBubish(String DateBookBubish) {
        this.DateBookBubish = DateBookBubish;
    }

    public int getBookAdres() {
        return BookAdres;
    }

    public void setBookAdres(int BookAdres) {
        this.BookAdres = BookAdres;
    }

    public Auther getAutherBook() {
        return autherBook;
    }

    public void setAutherBook(Auther autherBook) {
        this.autherBook = autherBook;
    }

    public int getNumberBook() {
        return NumberBook;
    }

    public void setNumberBook(int NumberBook) {
        this.NumberBook = NumberBook;
    }
   private int idBook;
    private String NameBook;
   private String DateBookBubish; 
    private int BookAdres;
    private Auther autherBook;
    private int NumberBook;
    

  
}
