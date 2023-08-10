package org.glCYF.servicios;

import org.glCYF.modelos.Carta;
import org.glCYF.modelos.Palo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// No es un servicio realmente
public class CartasFabrica {

    private static final HashSet<Palo> palos = new HashSet<>();


    public static List<Carta> fabricarBarajaEspaniola() {
        List<Carta> cartas = new ArrayList<>();

        cargarPalos();

        palos.forEach(palo -> {
           for(int i=1; i<=12; i++) {
               if(i == 8 || i == 9) {
                   continue;
               }

               cartas.add(new Carta(i, palo));

           }
        });

        return cartas;
    }

    private static void cargarPalos() {
        Palo espada = new Palo("espada");
        Palo basto = new Palo("basto");
        Palo copa = new Palo("copa");
        Palo oro = new Palo("oro");
        palos.add(espada);
        palos.add(basto);
        palos.add(copa);
        palos.add(oro);
    }
}
