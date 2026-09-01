/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;

/**
 *
 * @author estuam
 */
public class CuentaBancaria {
    public String titular;
    public double saldo; 
    
    public void Consignar(double monto){
        saldo += monto; 
        System.out.println("nuevo saldo es de : " + saldo);
    }
       
    
    public void Retirar (double monto){
        if (monto <= saldo){
        saldo -= monto ; 
        System.out.println("Retiro relizado");
        System.out.println("Nuevo saldo: " + saldo); }
        
        else{
        System.out.println("Fondos suficientes."); 
        }
    }
       
}

