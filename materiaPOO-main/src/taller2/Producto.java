/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;

/**
 *
 * @author estuam
 */
public class Producto {
   
   public String nombre;
   public double precio; 
   public int Stock; 
   
public void RegistrarVentas (int cantidad ){
        if (cantidad <= Stock){
        Stock -= cantidad  ; 
        System.out.println("Estado actualizado" + Stock ); }
        
        else{
        System.out.println("sin stock suficientes."); 
        }
    }

public void Reponer (int cantidad){
    Stock += cantidad ;}

public void mostrarInformacion (){
    System.out.println("Nombre" + nombre);
    System.out.println("Precio" + precio);
    System.out.println("Stock " + Stock );
}
}

