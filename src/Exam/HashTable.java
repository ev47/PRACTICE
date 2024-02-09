/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam;

/**
 *
 * @author edgva
 */
public class HashTable {
    private Entry inicio=null;
    private int size=0;
    
    public boolean add(long posicion,String username){
      if (inicio==null){
          inicio=new Entry(posicion,username);          
      }else {
          Entry temp=inicio;
          while(temp.siguiente!=null){
              temp=temp.siguiente;
          }
          temp.siguiente=new Entry(posicion,username);
          return true;
      }  
      return false;        
    }
    public boolean remove(String username){
       if(inicio!=null){
            if(inicio.username.equals(username)){
                inicio=inicio.siguiente;
            }else{
                Entry temporal=inicio;
                while(temporal.siguiente!=null){
                    if(temporal.siguiente.username.equals(username)){
                        temporal.siguiente=temporal.siguiente.siguiente;
                        return true;
                    }
                    temporal=temporal.siguiente;
                }
            }
        }
        return false;
    }
    public long search(String username){
           if(inicio!=null){
            if(inicio.username.equals(username)){
                return inicio.posicion;
            }else{
                Entry temporal=inicio;
                while(temporal.siguiente!=null){
                    if(temporal.username.equals(username)){
                        return temporal.posicion;
                    }
                    temporal=temporal.siguiente;
                }
            }
        }
        return -1;
    }
    
}
