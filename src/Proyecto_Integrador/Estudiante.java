package Proyecto_Integrador;

public class Estudiante {

    String nombre;
    int edad;
    String curso;

    public Estudiante() {

        nombre = "Sin nombre";
        edad = 0;
        curso = "Sin curso";

    }

    public Estudiante(String nombre, int edad, String curso) {

        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;

    }

    @Override
    public String toString() {

        return nombre + ", " + edad + " años - " + curso;

    }
}
