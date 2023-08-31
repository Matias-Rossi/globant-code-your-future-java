package org.example.modelos.barcos;

public class Velero extends Barco {
    private int cantMastiles;

    public Velero(String matricula, double metrosEslora, int anioFabricacion, int cantMastiles) {
        super(matricula, metrosEslora, anioFabricacion);
        this.cantMastiles = cantMastiles;
    }

    public Velero() {
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + cantMastiles;
    }

    public int getCantMastiles() {
        return cantMastiles;
    }

    public void setCantMastiles(int cantMastiles) {
        this.cantMastiles = cantMastiles;
    }
}
