package org.example;

import org.example.modelos.Edificio;
import org.example.modelos.EdificioDeOficinas;
import org.example.modelos.Polideportivo;

import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Edificio> edificios = List.of(
                new EdificioDeOficinas(10, 10, 10, 5, 1, 3),
                new EdificioDeOficinas(10, 6, 20, 10, 2, 2),
                new Polideportivo(10, 10, 10, "Polideportivo A", true),
                new Polideportivo(10, 10, 10, "Polideportivo B", false)
        );
        int polideportivosCerrados = 0;
        int polideportivosAbiertos = 0;

        ListIterator<Edificio> it = edificios.listIterator();
        while(it.hasNext()) {
            int indice = it.nextIndex();
            Edificio edificio = it.next();
            System.out.println("Edificio " + indice + ": " + edificio.calcularSuperficie() + " m^2 / " + edificio.calcularVolumen() + " m^3");

            // Hacer cualquier tratamiento diferenciado consultando al tipo de un objeto es un "no-no" terrible
            if(edificio instanceof Polideportivo) {
                Polideportivo p = (Polideportivo) edificio;
                if (p.esTechado()) {
                    polideportivosCerrados++;
                } else {
                    polideportivosAbiertos++;
                }
            } else {
                EdificioDeOficinas e = (EdificioDeOficinas) edificio;
                e.cantPersonas();
            }
        }
        System.out.println("Hay " + polideportivosCerrados + " polideportivos techados y " + polideportivosAbiertos + " abiertos");
    }
}