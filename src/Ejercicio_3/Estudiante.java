package Ejercicio_3;

public class Estudiante {

    String nombre;
    int edad;
    String curso;

    // Constructor por defecto

    public Estudiante() {

        nombre = "Sin nombre";
        edad = 0;
        curso = "Sin curso asignado";

    }

    // Constructor con nombre y edad

    public Estudiante(String nombre, int edad) {

        this.nombre = nombre;
        this.edad = edad;
        this.curso = "Sin curso asignado";

    }

    // Constructor con todos los parametros,reutilizando el anterior con this()

    public Estudiante(String nombre, int edad, String curso) {

        this(nombre, edad);
        this.curso = curso;

    }

    public void mostrarDetalles() {

        System.out.println( nombre + ", " + edad + " años - " + curso );

    }
}