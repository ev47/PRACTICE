/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicajava;

import java.util.Scanner;

/**
 *
 * @author edgva
 */
public class MenuPrincipal {
   static Scanner lea=new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int menu=0;
        System.out.println("Bienvenido al Sistema aereo");
        System.out.println("-1 Boleteria");
        System.out.println("-2 Despachar Vuelo");
        System.out.println("-3 Reportes");
        System.out.println("-4 Cerrar Session");
        System.out.println("-5 Salir");
        System.out.println("Elija una opcion (1-5)");
        menu = lea.nextInt();
    }
    
}
