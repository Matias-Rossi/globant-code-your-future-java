package org.example.modelos;

public class Polideportivo extends Edificio {

    private String nombre;

    private boolean esTechado;

    public Polideportivo(double ancho, double alto, double largo, String nombre, boolean esTechado) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.esTechado = esTechado;
    }

    @Override
    public double calcularSuperficie() {
        return largo * ancho;
    }

    @Override
    public double calcularVolumen() {
        return alto * ancho * largo;
    }

    public boolean esTechado() {
        return esTechado;
    }
}
