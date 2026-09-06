/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;

/**
 *
 * @author PC
 */


public class Tienda {

    public static void main(String[] args) {

        Producto producto1 = new Producto();
        producto1.nombre = "Camiseta";
        producto1.precio = 50000;
        producto1.Stock = 10;

        Producto producto2 = new Producto();
        producto2.nombre = "Gorra";
        producto2.precio = 30000;
        producto2.Stock = 5;

        System.out.println("=== PRODUCTOS INICIALES ===");

        producto1.mostrarInformacion();

        System.out.println();

        producto2.mostrarInformacion();

        System.out.println();
        System.out.println("=== VENTA DE CAMISETAS ===");

        producto1.RegistrarVentas(3);

        System.out.println();
        System.out.println("=== INFORMACION DESPUES DE LA VENTA ===");

        System.out.println("Producto 1:");
        producto1.mostrarInformacion();

        System.out.println();

        System.out.println("Producto 2:");
        producto2.mostrarInformacion();

        System.out.println();
        System.out.println("=== REPOSICION DE CAMISETAS ===");

        producto1.Reponer(5);

        System.out.println();
        System.out.println("Producto 1 después de reponer:");
        producto1.mostrarInformacion();

        System.out.println();
        System.out.println("Producto 2 no cambia:");
        producto2.mostrarInformacion();
    }
}