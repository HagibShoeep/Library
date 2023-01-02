/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liarrary;

/**
 *
 * @author shoeep
 */
public  enum TypeManger {
    
ADMIN(1,"admin") ,MANGER(2,"manger") ,USER(3,"USER");
 private    int Id;
 private   String Type;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
  private TypeManger(int Id ,String Type){
      this.Id=Id;
      this.Type=Type;
      
  }
    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    
   public  static TypeManger getTypeAdminById(int id){
        for(TypeManger typeAdmin:TypeManger.values()  ){
            if(typeAdmin.getId()==id){
                return typeAdmin;
            }
        }
        return null;
    }
}
