package org.glCYF.modelos;

public class Palo {
    private String palo;

    public Palo(String palo) {
        this.palo = palo;
    }

    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return palo;
    }
}
