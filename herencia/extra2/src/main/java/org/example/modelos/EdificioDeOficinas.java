package org.example.modelos;

public class EdificioDeOficinas extends Edificio{

    private int cantOficinasPorPiso;
    private int cantPersonasPorOficina;
    private int cantPisos;

    public EdificioDeOficinas(double ancho, double alto, double largo, int cantOficinas, int cantPersonasPorOficina, int cantPisos) {
        super(ancho, alto, largo);
        this.cantOficinasPorPiso = cantOficinas;
        this.cantPersonasPorOficina = cantPersonasPorOficina;
        this.cantPisos = cantPisos;
    }

    @Override
    public double calcularSuperficie() {
        return ancho * largo * cantPisos;
    }

    @Override
    public double calcularVolumen() {
        return ancho * largo * alto;
    }

    public void cantPersonas() {
        System.out.println("Entran " + cantPersonasPorOficina + " por piso y "
                + cantPersonasPorOficina * cantOficinasPorPiso * cantPisos + " en total");
    }
}
