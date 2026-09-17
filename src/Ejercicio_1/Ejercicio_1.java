package Ejercicio_1;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("La psicologia del dinero", "Morgan Housel", 299);

        libro1.mostrarDetalles();
        libro2.mostrarDetalles();

    }
}
