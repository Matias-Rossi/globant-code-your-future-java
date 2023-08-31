package org.example.modelos;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public abstract class Electrodomestico {

    private static final Map<CategoriaConsumoEnergetico, Double> preciosPorConsumoEnergetico = Map.of(
            CategoriaConsumoEnergetico.A, 1000.0,
            CategoriaConsumoEnergetico.B, 800.0,
            CategoriaConsumoEnergetico.C, 600.0,
            CategoriaConsumoEnergetico.D, 500.0,
            CategoriaConsumoEnergetico.E, 300.0,
            CategoriaConsumoEnergetico.F, 100.0
    ); //by Lu Briones

    private static final CategoriaConsumoEnergetico CONSUMO_ENERGETICO_POR_DEFECTO = CategoriaConsumoEnergetico.F;
    private static final Set<String> COLORES_VALIDOS = Set.of("blanco", "negro", "rojo", "azul", "gris");
    private static final String COLOR_POR_DEFECTO = "blanco";
    private static final double PRECIO_POR_DEFECTO = 1000.0;

    private double precio;
    private String color;
    private CategoriaConsumoEnergetico consumoEnergetico;
    private double peso;


    // Constructores
    protected Electrodomestico() {
    }

    protected Electrodomestico(double precio, String color, CategoriaConsumoEnergetico consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = comprobarColor(color) ? color : COLOR_POR_DEFECTO;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    // Métodos varios
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
        consumoEnergetico = CategoriaConsumoEnergetico.desdeCharMayus(scanner.nextLine().toUpperCase().charAt(0)) ;

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
        return preciosPorConsumoEnergetico.get(consumoEnergetico);
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

    public CategoriaConsumoEnergetico getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(CategoriaConsumoEnergetico consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
