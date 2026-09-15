/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/main.java to edit this template
 */
package Pelicula;


/**
 * Representa una pelicula con su titulo, director y duracion.
 */
public class Pelicula {

    String titulo;       // Titulo de la pelicula
    String director;     // Director de la pelicula
    int duracion;        // Duracion en minutos

    /**
     * Muestra la informacion de la pelicula.
     */
    void MostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Duracion: " + duracion + " minutos");
    }

    /**
     * Muestra un mensaje indicando que la pelicula se esta reproduciendo.
     */
    void Reproducir() {
        System.out.println("Reproduciendo: " + titulo);
    }
}