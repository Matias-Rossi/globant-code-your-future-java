package org.example.modelos.barcos;

public class BarcoAMotor extends Barco{
    private int potenciaCV;

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV;
    }

    public BarcoAMotor() {
    }

    public BarcoAMotor(String matricula, double metrosEslora, int anioFabricacion, int potenciaCV) {
        super(matricula, metrosEslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
}
