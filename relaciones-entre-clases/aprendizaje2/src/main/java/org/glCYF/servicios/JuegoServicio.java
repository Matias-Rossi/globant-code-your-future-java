package org.glCYF.servicios;

import org.glCYF.modelos.Juego;
import org.glCYF.modelos.Jugador;
import org.glCYF.modelos.Revolver;

import java.util.Iterator;
import java.util.List;

public class JuegoServicio {

    Juego juego = new Juego();

    JugadorServicio jugadorServicio = new JugadorServicio();

    RevolverServicio revolverServicio = new RevolverServicio();

    public void llenarJuego(List<Jugador> jugadores, Revolver revolver) {
        juego.setJugadores(jugadores);
        juego.setRevolver(revolver);
    }

    public void jugarRonda() {
        boolean disparoRealizado = false;
        String jugadorEliminado = "";

        while (!disparoRealizado) {
            Iterator<Jugador> iterator = juego.getJugadores().iterator();

            while(iterator.hasNext()) {
                Jugador jugadorActual = iterator.next();
                System.out.println("Le toca al jugador " + jugadorActual.getNombre());
                disparoRealizado = jugadorServicio.dispararse(jugadorActual, juego.getRevolver());

                if(disparoRealizado) {
                    System.out.println("BOOM :C");
                    jugadorEliminado = jugadorActual.getNombre();
                    break;
                }
            }
        }

        System.out.println("Jugador eliminado: " + jugadorEliminado);
    }
}
