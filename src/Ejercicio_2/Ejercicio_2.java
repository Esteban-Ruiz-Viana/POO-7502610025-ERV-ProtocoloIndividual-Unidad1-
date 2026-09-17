package Ejercicio_2;

public class Ejercicio_2 {

    public static void main(String[] args) {

        CuentaBancaria c1 = new CuentaBancaria();
        CuentaBancaria c2 = new CuentaBancaria("1234", "Corriente");
        CuentaBancaria c3 = new CuentaBancaria("5678", 500000, "Ahorros");


        c1.mostrarDetalles();
        c2.mostrarDetalles();
        c3.mostrarDetalles();

    }
}

