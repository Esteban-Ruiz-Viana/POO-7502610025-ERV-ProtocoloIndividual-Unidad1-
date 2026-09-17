package Proyecto_Integrador;

import java.util.Scanner;

public class Proyecto_Integrador {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("------------------Libro----------------------------");

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        System.out.print("Páginas: ");
        int paginas = Integer.parseInt(sc.nextLine());

        Libro libro = new Libro(titulo, autor, paginas);


        System.out.println("\n------------------Cuenta Bancaria----------------------------");

        System.out.print("N° cuenta: ");
        String numCuenta = sc.nextLine();

        System.out.print("Saldo: ");
        double saldo = Double.parseDouble(sc.nextLine());

        System.out.print("Tipo cuenta: ");
        String tipoCuenta = sc.nextLine();

        CuentaBancaria cuenta = new CuentaBancaria(numCuenta, saldo, tipoCuenta);


        System.out.println("\n------------------Estudiante----------------------------");

        System.out.print("Nombre estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = Integer.parseInt(sc.nextLine());

        System.out.print("Curso: ");
        String curso = sc.nextLine();

        Estudiante estudiante = new Estudiante(nombre, edad, curso);


        System.out.println();
        System.out.println(libro);
        System.out.println(cuenta);
        System.out.println(estudiante);

        sc.close();
    }
}