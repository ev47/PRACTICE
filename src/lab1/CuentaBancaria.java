/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author edgva
 */
public class CuentaBancaria {
    private int codigo;
    private String NombreCliente;
    private double Saldo;

    public CuentaBancaria(int codigo, String NombreCliente) {
        this.codigo = codigo;
        this.NombreCliente = NombreCliente;
        Saldo=500;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getNombreCliente() {
        return NombreCliente;
    }
    public double getSaldo() {
        return Saldo;
    }
   public void depositar(double monto){
     if (monto > 0) {
            // Sumar el monto al saldo actual
            Saldo+= monto;
            System.out.println("Depósito exitoso. Nuevo saldo: " + Saldo);
        } else {
            System.out.println("Error: El monto debe ser positivo para realizar un depósito.");
        }     
   } 
}
