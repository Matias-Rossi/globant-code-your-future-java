package org.example.modelos;

import java.util.Scanner;

public class Televisor extends Electrodomestico {
    private double resolucionPulgadas;
    private boolean tieneSintonizadorTDT;

    public Televisor() {
    }

    @Override
    public void crearElectrodomestico() {
        super.crearElectrodomestico();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la resolucion en pulgadas del televisor: ");
        resolucionPulgadas = Double.parseDouble(scanner.nextLine());
        System.out.print("Tiene sintonizador TDT? (S/N): ");
        //con lo largo que es no me voy a parar a validar absolutamente nada
        tieneSintonizadorTDT = scanner.nextLine().equalsIgnoreCase("s");
    }

    @Override
    public double precioFinal() {
        double precioElectrodomestico = super.precioFinal();
        double extrasTelevisor = 0;
        if (resolucionPulgadas > 40.0) {
            extrasTelevisor += precioElectrodomestico * 1.3;
        }
        if (tieneSintonizadorTDT) {
            extrasTelevisor += precioElectrodomestico + 500.0;
        }
        return precioElectrodomestico + extrasTelevisor;
    }

    public Televisor(double precio, String color, char consumoEnergetico, double peso, double resolucionPulgadas, boolean tieneSintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucionPulgadas = resolucionPulgadas;
        this.tieneSintonizadorTDT = tieneSintonizadorTDT;
    }

    public double getResolucionPulgadas() {
        return resolucionPulgadas;
    }

    public void setResolucionPulgadas(double resolucionPulgadas) {
        this.resolucionPulgadas = resolucionPulgadas;
    }

    public boolean isTieneSintonizadorTDT() {
        return tieneSintonizadorTDT;
    }

    public void setTieneSintonizadorTDT(boolean tieneSintonizadorTDT) {
        this.tieneSintonizadorTDT = tieneSintonizadorTDT;
    }
}
