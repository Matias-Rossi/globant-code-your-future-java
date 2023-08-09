package org.glCYF.modelos;

public class Revolver {
    private int posicionActualTambor = 0;
    private int posicionAguaTambor = 6;

    public Revolver() {}

    @Override
    public String toString() {
        return "# Revolver " +
                "\n - Posicion actual del tambor: " + (posicionActualTambor+1) +
                "\n - Posicion actual del agua: " + (posicionAguaTambor+1);
    }

    public int getPosicionActualTambor() {
        return posicionActualTambor;
    }

    public void setPosicionActualTambor(int posicionActualTambor) {
        this.posicionActualTambor = posicionActualTambor;
    }

    public int getPosicionAguaTambor() {
        return posicionAguaTambor;
    }

    public void setPosicionAguaTambor(int posicionAguaTambor) {
        this.posicionAguaTambor = posicionAguaTambor;
    }
}
