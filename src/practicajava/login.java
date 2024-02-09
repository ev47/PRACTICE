/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicajava;

/**
 *
 * @author edgva
 */

public class login {
    private String user;
    private String password;
      public login() {
   // sin parametros 
    }
    public login(String user ,String password ){
        this.user=user;
        this.password=password;        
    }
    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
   public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    } 
    public String Ingreso(){
        if (user.equalsIgnoreCase("Admin") 
          || user.equalsIgnoreCase("Content") || user.equalsIgnoreCase("limit")){    
            System.out.println("El usuario Ingresado: "+user);
        }
        return null;
    }
   public String password(){
       if (password.equalsIgnoreCase("admin") 
        || password.equalsIgnoreCase("content") || password.equalsIgnoreCase("limit")){
           System.out.println("El Password: "+password);
       }
        return null;
   } 
}
