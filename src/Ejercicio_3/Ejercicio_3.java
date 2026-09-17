package Ejercicio_3;

public class Ejercicio_3 {

    public static void main(String[] args) {

        Estudiante e1 = new Estudiante();
        Estudiante e2 = new Estudiante("Laura", 20);
        Estudiante e3 = new Estudiante("Joel", 22, "Ingenieria de software");

        e1.mostrarDetalles();
        e2.mostrarDetalles();
        e3.mostrarDetalles();

    }
}