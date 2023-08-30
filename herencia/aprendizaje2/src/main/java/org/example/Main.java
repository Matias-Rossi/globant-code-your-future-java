package org.example;

import org.example.modelos.Electrodomestico;
import org.example.modelos.Lavadora;
import org.example.modelos.Televisor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Ejercicio 2
        Lavadora lavadora = new Lavadora();
        lavadora.crearElectrodomestico();
        System.out.println("Precio lavadora = $" + lavadora.precioFinal());

        Televisor televisor = new Televisor();
        televisor.crearElectrodomestico();
        System.out.println("Precio lavadora = $" + lavadora.precioFinal());

        /*
        // Ejercicio 3
        List<Electrodomestico> electrodomesticos = new ArrayList<>();

        electrodomesticos.add(new Lavadora(1900.0, "azul", 'f', 0.0, 0.0));
        electrodomesticos.add(new Televisor(1900.0, "azul", 'f', 0.0, 0.0, false));
        System.out.println("Suma = $" + electrodomesticos.stream().mapToDouble(Electrodomestico::precioFinal).sum());
        */
    }
}