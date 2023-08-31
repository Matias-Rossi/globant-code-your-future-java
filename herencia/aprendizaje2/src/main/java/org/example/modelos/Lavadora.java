package org.example.modelos;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {
    private double carga;

    public Lavadora() {
    }

    public Lavadora(double precio, String color, CategoriaConsumoEnergetico consumoEnergetico, double peso, double carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    @Override
    public void crearElectrodomestico() {
        Scanner scanner = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.print("Ingrese la carga de la lavadora: ");
        carga = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public double precioFinal() {
        double precioElectrodomestico = super.precioFinal();
        return carga > 30.0 ? precioElectrodomestico + 500.0 : precioElectrodomestico;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
}
