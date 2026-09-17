package Proyecto_Integrador;

public class CuentaBancaria {

    String numeroCuenta;
    double saldo;
    String tipoCuenta;

    public CuentaBancaria() {

        numeroCuenta = "0000";
        saldo = 0;
        tipoCuenta = "Ahorros";

    }

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {

        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;

    }

    @Override
    public String toString() {

        return "Cuenta " + numeroCuenta + " (" + tipoCuenta + ") - Saldo: $" + saldo;

    }
}
