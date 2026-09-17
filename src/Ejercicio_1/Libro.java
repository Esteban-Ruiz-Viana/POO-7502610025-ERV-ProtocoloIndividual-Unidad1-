package Ejercicio_1;

public class Libro {

    String titulo;
    String autor;
    int numeroPaginas;

    public Libro() {
        titulo = "Sin título";
        autor = "Desconocido";
        numeroPaginas = 0;
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void mostrarDetalles() {
        System.out.println(titulo + " - " + autor + " (" + numeroPaginas + " páginas)");
    }
}
