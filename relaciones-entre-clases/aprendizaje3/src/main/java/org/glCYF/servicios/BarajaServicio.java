package org.glCYF.servicios;

import org.glCYF.modelos.Carta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BarajaServicio {
    List<Carta> baraja = new ArrayList<>();
    List<Carta> cartasDadas = new ArrayList<>();

    public BarajaServicio() {
        baraja = CartasFabrica.fabricarBarajaEspaniola();
    }

    public void barajar() {
        Collections.shuffle(baraja); // método que mezcla los elementos de la colección
    }

    public Carta siguienteCarta() {
        if (baraja.size() > 0) {
            Carta cartaRemovida = baraja.remove(0);
            cartasDadas.add(cartaRemovida);
            return cartaRemovida;
        } else {
            System.out.println("No hay más baraja");
            return null;
        }
    }

    public int cartasDisponibles() {
        return baraja.size();
    }

    public List<Carta> darCartas(int cantidadSolicitada) {
        List<Carta> cartas = new ArrayList<>();
        int cantidadADar = Math.min(cantidadSolicitada, cartasDisponibles());

        for (int i=0; i<cantidadADar; i++) {
            cartas.add(siguienteCarta());
        }

        return cartas;
    }

    public void cartasMonton() {
        if (cartasDadas.size() > 0) {
            System.out.println("# Cartas dadas");
            cartasDadas.forEach(System.out::println);
        } else {
            System.out.println("No se han dado cartas");
        }
    }

    public void mostrarBaraja() {
        System.out.println("# Cartas en la baraja");
        baraja.forEach(System.out::println);
    }
}
