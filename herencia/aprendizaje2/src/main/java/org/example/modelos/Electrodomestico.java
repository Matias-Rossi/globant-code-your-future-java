package org.example.modelos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public abstract class Electrodomestico {

    private static final Set<Character> CONSUMOS_ENERGETICOS_VALIDOS = Set.of('a', 'b', 'c', 'd', 'e', 'f');
    private static final char CONSUMO_ENERGETICO_POR_DEFECTO = 'f';
    private static final Set<String> COLORES_VALIDOS = Set.of("blanco", "negro", "rojo", "azul", "gris");
    private static final String COLOR_POR_DEFECTO = "blanco";
    private static final double PRECIO_POR_DEFECTO = 1000.0;

    private double precio;
    private String color;
    private char consumoEnergetico;
    private double peso;


    // Constructores
    protected Electrodomestico() {
    }

    protected Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = comprobarColor(color) ? color : COLOR_POR_DEFECTO;
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico) ? consumoEnergetico : CONSUMO_ENERGETICO_POR_DEFECTO;
        this.peso = peso;
    }

    // Métodos varios

    private boolean comprobarConsumoEnergetico(char letraIngresada) {
        return CONSUMOS_ENERGETICOS_VALIDOS.contains(letraIngresada);
    }

    private boolean comprobarColor(String color) {
        return COLORES_VALIDOS.stream().anyMatch(colorDelSet -> colorDelSet.equalsIgnoreCase(color));
    }

    public void crearElectrodomestico() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso del electrodoméstico: ");
        peso = Double.parseDouble(scanner.nextLine());

        System.out.println("Colores disponibles: " + COLORES_VALIDOS);
        System.out.print("Ingrese el color: ");
        color = scanner.nextLine();

        System.out.print("Ingrese consumo energético (a-f): ");
        consumoEnergetico = scanner.nextLine().toLowerCase().charAt(0);

        precio = PRECIO_POR_DEFECTO;
    }

    public double precioFinal() {
        return precio + precioPorConsumoEnergetico() + precioPorPeso();
    }

    private double precioPorPeso() {
        if (peso > 80.0) {
            return 1000.0;
        } else if (peso >= 50) {
            return 800.0;
        } else if (peso >= 20) {
            return 500.0;
        } else {
            return 100.0;
        }
    }

    private double precioPorConsumoEnergetico() {
        switch(consumoEnergetico) {
            case 'a': return 1000.0;
            case 'b': return 800.0;
            case 'c': return 600.0;
            case 'd': return 500.0;
            case 'e': return 300.0;
            case 'f': return 100.0;
            default: return Double.MAX_VALUE; //por skill issue (de ninguna manera correcto, habría que tirar excepción)
        }
    }

    // Getters & Setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
