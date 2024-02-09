/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabPractice;

/**
 *
 * @author edgva
 */
public abstract class JuegoAhorcadoBase implements JuegoAhorcado {
    protected String palabraSecreta;
    protected String PalabraActual;
    protected int intentos;
    
    abstract void ActualizarPalabraActual();
    abstract void VerificarLetra();
    abstract void HasGanado();
}
