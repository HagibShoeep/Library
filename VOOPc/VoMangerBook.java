/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liarrary.VOOPc;

import liarrary.TypeManger;

/**
 *
 * @author shoeep
 */
public class VoMangerBook {

    public int getIdManger() {
        return idManger;
    }

    public void setIdManger(int idManger) {
        this.idManger = idManger;
    }

    public String getNameManger() {
        return NameManger;
    }

    public void setNameManger(String NameManger) {
        this.NameManger = NameManger;
    }

    public TypeManger getTypeManger() {
        return typeManger;
    }

    public void setTypeManger(TypeManger typeManger) {
        this.typeManger = typeManger;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    
    private int idManger;
    private String NameManger;
    private TypeManger typeManger;
    private   String  job  ;
    
}
