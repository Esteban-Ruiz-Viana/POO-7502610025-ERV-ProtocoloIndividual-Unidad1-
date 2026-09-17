package Proyecto_Integrador;

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

    @Override
    public String toString() {

        return titulo + " - " + autor + " (" + numeroPaginas + " páginas)";

    }
}