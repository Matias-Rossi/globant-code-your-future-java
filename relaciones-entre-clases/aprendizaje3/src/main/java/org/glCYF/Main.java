package org.glCYF;

import org.glCYF.modelos.Carta;
import org.glCYF.servicios.BarajaServicio;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static BarajaServicio barajaServicio = new BarajaServicio();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            int opcionElegida = mostrarMenu();
            switch(opcionElegida) {
                case 1: barajaServicio.barajar(); break;
                case 2: System.out.println(barajaServicio.siguienteCarta()); break;
                case 3: System.out.println("Cartas disponibles: "+ barajaServicio.cartasDisponibles()); break;
                case 4: darCartas(); break;
                case 5: barajaServicio.cartasMonton(); break;
                case 6: barajaServicio.mostrarBaraja(); break;
                default: continuar = false;
            }

            if(continuar) {
                System.out.println("Presione <ENTER> para continuar");
                scanner.nextLine();
            }
        }
    }

    private static void darCartas() {
        System.out.print("Cartas a dar: ");
        int cantidadDeCartas = Integer.parseInt(scanner.nextLine());
        List<Carta> cartas = barajaServicio.darCartas(cantidadDeCartas);
        System.out.println("# Cartas dadas");
        cartas.forEach(System.out::println);
    }

    private static int mostrarMenu() {
        System.out.println("\n## Elija una opción, cualquier otra cosa finaliza el programa ##");
        System.out.println(" 1. Barajar cartas");
        System.out.println(" 2. Sacar una carta");
        System.out.println(" 3. Mostrar cartas disponibles");
        System.out.println(" 4. Dar n cartas");
        System.out.println(" 5. Mostrar cartas dadas");
        System.out.println(" 6. Mostrar las cartas restantes");
        return Integer.parseInt(scanner.nextLine());
    }
}