/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1;

/**
 *
 * @author estuam
 */

public class Banco {

  
    public static void main(String[] args) {
        
    CuentaBancaria c1 = new CuentaBancaria ();
        c1.titular = "Juanito Alimaña"; 
        c1.saldo = (int) 50;
        
        System.out.println("Titular:  " + c1.titular );
        System.out.println("su saldo es : " + c1.saldo);
        
        c1.Consignar(50);
        
        c1.Retirar(10);
       
        c1.Retirar(10);
        
        
        
    CuentaBancaria c2 = new CuentaBancaria ();
        c2.titular = "maria"; 
        c2.saldo = (int) 60; 
        
        System.out.println("Titular:  " + c2.titular );
        System.out.println("su saldo es : " + c2.saldo);
        
        c2.Consignar(100);
        
        c2.Retirar(50);
       
        c2.Retirar(50);
        
        
        
        
       
        
       
   
    }
    
}
