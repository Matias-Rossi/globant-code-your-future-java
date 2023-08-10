package org.glCYF.modelos;

public class Carta {
    private int numero;
    private Palo palo; //si tan solo hubiéramos visto enums...

    public Carta() {}

    public Carta(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta: " + numero + " de " + palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }
}
