/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam;

/**
 *
 * @author edgva
 */
public class Entry {
    String username;
    long posicion;
    Entry siguiente;
    
    public Entry(long posicion,String username) {
        this.username = username;
        this.posicion = posicion;
        siguiente = null;      
    }

    
    
}
