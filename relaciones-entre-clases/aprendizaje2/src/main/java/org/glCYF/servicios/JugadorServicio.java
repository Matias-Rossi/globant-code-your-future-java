package org.glCYF.servicios;

import org.glCYF.modelos.Jugador;
import org.glCYF.modelos.Revolver;

import java.util.ArrayList;
import java.util.List;

public class JugadorServicio {

    RevolverServicio revolverServicio = new RevolverServicio();

    private static int ultimoId = 0;

    public Jugador crearJugador() {
        Jugador jugador = new Jugador();
        int id = obtenerIdDisponible();
        jugador.setId(id);
        jugador.setNombre("Jugador " + id);
        jugador.setMojado(false);
        return jugador;
    }

    public boolean dispararse(Jugador jugador, Revolver revolver) {
        if(revolverServicio.disparar(revolver)) {
            mojar(jugador);
            return true;
        }
        return false;
    }

    private void mojar(Jugador jugador) {
        jugador.setMojado(true);
    }

    private int obtenerIdDisponible() {
        return ++ultimoId;
    }

}
