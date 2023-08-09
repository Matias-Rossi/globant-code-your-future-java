package org.glCYF;

import org.glCYF.modelos.Jugador;
import org.glCYF.modelos.Revolver;
import org.glCYF.servicios.JuegoServicio;
import org.glCYF.servicios.JugadorServicio;
import org.glCYF.servicios.RevolverServicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final RevolverServicio revolverServicio = new RevolverServicio();

    private static final JuegoServicio juegoServicio = new JuegoServicio();

    private static final JugadorServicio jugadorServicio = new JugadorServicio();


    public static void main(String[] args) {
        Revolver revolver = prepararRevolver();

        int cantidadJugadores = solicitarCantidadJugadores();
        List<Jugador> jugadores = crearJugadores(cantidadJugadores);

        juegoServicio.llenarJuego(jugadores, revolver);

        juegoServicio.jugarRonda();
    }

    private static List<Jugador> crearJugadores(int cantidadJugadores) {
        List<Jugador> jugadores = new ArrayList<>();
        for (int i=0; i<cantidadJugadores; i++) {
            System.out.println("# Creando jugador " + (i+1));
            Jugador nuevoJugador = jugadorServicio.crearJugador();
            jugadores.add(nuevoJugador);
        }

        return jugadores;
    }

    private static int solicitarCantidadJugadores() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de jugadores: ");
        int cantidadIntroducida = Integer.parseInt(scanner.nextLine());
        if (cantidadIntroducida < 1 || cantidadIntroducida > 6) {
            return 6;
        } else {
            return cantidadIntroducida;
        }
    }

    private static Revolver prepararRevolver() {
        Revolver revolver = new Revolver();
        revolverServicio.llenarRevolver(revolver);
        return revolver;
    }
}