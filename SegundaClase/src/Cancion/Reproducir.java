package Cancion;

public class Reproducir {

    public static void main(String[] args) {

        Cancion cancion1 = new Cancion();
        cancion1.titulo = "Vivir Mi Vida";
        cancion1.artista = "Marc Anthony";
        cancion1.duracion = 250;

        Cancion cancion2 = new Cancion();
        cancion2.titulo = "La Camisa Negra";
        cancion2.artista = "Juanes";
        cancion2.duracion = 216;

        System.out.println("=== CANCION 1 ===");
        cancion1.MostrarInformacion();
        cancion1.Reproducir();
        cancion1.ReproducirDesde(30);

        System.out.println("Duracion en minutos: "
                + cancion1.ObtenerDuracionMinutos());

        System.out.println();

        System.out.println("=== CANCION 2 ===");
        cancion2.MostrarInformacion();
        cancion2.Reproducir();
        cancion2.ReproducirDesde(60);

        System.out.println("Duracion en minutos: "
                + cancion2.ObtenerDuracionMinutos());
    }
}