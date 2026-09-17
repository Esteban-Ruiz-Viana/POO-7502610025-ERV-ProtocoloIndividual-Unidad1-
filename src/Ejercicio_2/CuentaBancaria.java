package Ejercicio_2;

public class CuentaBancaria {

    String numeroCuenta;
    double saldo;
    String tipoCuenta;

    //Constructor por defecto

    public CuentaBancaria() {
        numeroCuenta = "0000";
        saldo = 0;
        tipoCuenta = "Ahorros";

    }

    //Constructor con dos parametros

    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0;

    }

    //Constructor sobrecargado con tres parametros

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;

    }

    public void mostrarDetalles() {
        System.out.println("Cuenta " + numeroCuenta + " (" + tipoCuenta + ") - Saldo: $" + saldo);

    }
}


