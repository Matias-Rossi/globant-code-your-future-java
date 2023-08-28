package org.example;

import org.example.modelos.Lavadora;
import org.example.modelos.Televisor;

public class Main {
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        lavadora.crearElectrodomestico();
        System.out.println("Precio lavadora = $" + lavadora.precioFinal());

        Televisor televisor = new Televisor();
        televisor.crearElectrodomestico();
        System.out.println("Precio lavadora = $" + lavadora.precioFinal());
    }
}