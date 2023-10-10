package org.example;

import org.example.modelos.Circulo;
import org.example.modelos.Rectangulo;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);
        Rectangulo rectangulo = new Rectangulo(2, 4);

        System.out.println("Forma - Área - Perímetro");
        System.out.println("Circ - " + circulo.calcularArea() + " - " + circulo.calcularPerimetro());
        System.out.println("Rect - " + rectangulo.calcularArea() + " - " + rectangulo.calcularPerimetro());
    }
}