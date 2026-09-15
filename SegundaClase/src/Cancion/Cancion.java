package Cancion;



/**
 * Representa una cancion con su titulo, artista y duracion.
 */
public class Cancion {

    String titulo;   // Titulo de la cancion
    String artista;  // Artista que interpreta la cancion
    int duracion;    // Duracion de la cancion en segundos

    /**
     * Muestra la informacion de la cancion.
     */
    void MostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duracion: " + duracion + " segundos");
    }

    /**
     * Muestra un mensaje indicando que la cancion se esta reproduciendo.
     */
    void Reproducir() {
        System.out.println("Reproduciendo: " + titulo);
    }

    /**
     * Reproduce la cancion comenzando desde un segundo determinado.
     *
     * @param segundo segundo desde el cual comienza la reproduccion
     */
    void ReproducirDesde(int segundo) {
        System.out.println("Reproduciendo " + titulo + " desde el segundo " + segundo);
    }

    /**
     * Convierte la duracion de la cancion de segundos a minutos.
     *
     * @return duracion de la cancion en minutos
     */
    double ObtenerDuracionMinutos() {
        return duracion / 60.0;
    }
}