/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pelicula;

/**
 *
 * @author PC
 */


public class Cine {

    public static void main(String[] args) {

        Pelicula p1 = new Pelicula();
        p1.titulo = "Toy Story";
        p1.director = "John Lasseter";
        p1.duracion = 81;

        Pelicula p2 = new Pelicula();
        p2.titulo = "Shrek";
        p2.director = "Andrew Adamson";
        p2.duracion = 90;

        System.out.println("=== PELICULA 1 ===");
        p1.MostrarInformacion();
        p1.Reproducir();

        System.out.println();

        System.out.println("=== PELICULA 2 ===");
        p2.MostrarInformacion();
        p2.Reproducir();

        System.out.println();

        System.out.println("=== COMPROBACION DE INDEPENDENCIA ===");

        p1.titulo = "Nueva Pelicula";

        System.out.println("Pelicula 1:");
        p1.MostrarInformacion();

        System.out.println();

        System.out.println("Pelicula 2:");
        p2.MostrarInformacion();
    }
}
    

