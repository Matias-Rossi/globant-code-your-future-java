package org.example.modelos.barcos;

// Podría extender de Barco, pero personalmente me parece más extensible esta solución, ya que
// no sería extraño querer usar un criterio distinto para darle precio a los yates en el futuro
public class YateDeLujo extends Barco{
    private int potenciaCV;
    private int cantCamarotes;

    public YateDeLujo(String matricula, double metrosEslora, int anioFabricacion, int potenciaCV, int cantCamarotes) {
        super(matricula, metrosEslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.cantCamarotes = cantCamarotes;
    }

    public YateDeLujo() {
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + cantCamarotes + potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(int cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }
}
