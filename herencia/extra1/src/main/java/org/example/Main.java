package org.example;

import org.example.modelos.Alquiler;
import org.example.modelos.barcos.Barco;
import org.example.modelos.barcos.BarcoAMotor;
import org.example.modelos.barcos.Velero;
import org.example.modelos.barcos.YateDeLujo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ni ganas de estructurarlo mejor
        List<Barco> barcos = obtenerBarcos();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elija un tipo de barco a alquilar:");
        listarBarcos(barcos);
        System.out.print("Ingrese un número: ");
        int barcoSeleccionadoIndex = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese la cantidad de días a alquilar: ");
        int cantDias = Integer.parseInt(scanner.nextLine());
        LocalDate fechaAlquiler = LocalDate.now();
        LocalDate fechaDevolucion = LocalDate.now().plusDays(cantDias);

        Alquiler alquiler = new Alquiler(null, fechaAlquiler, fechaDevolucion, null, barcos.get(barcoSeleccionadoIndex));
        System.out.println("El valor del alquiler resultaría $" + alquiler.cotizar());
    }

    private static List<Barco> obtenerBarcos() {
        Velero velero1 = new Velero("Velero 1", 12, 2006, 1);
        Velero velero2 = new Velero("Velero 2", 10, 1995, 4);
        Barco barco1 = new BarcoAMotor("Barco 1", 12, 1999, 120);
        Barco barco2 = new BarcoAMotor("Barco 2", 11, 2001, 140);
        YateDeLujo yate1 = new YateDeLujo("Yate 1", 15, 2020, 120, 2);
        YateDeLujo yate2 = new YateDeLujo("Yate 2", 15, 2020, 120, 2);

        return List.of(velero1, velero2, barco1, barco2, yate1, yate2);
    }

    private static void listarBarcos(List<Barco> barcos) {
        ListIterator<Barco> it = barcos.listIterator();
        while(it.hasNext()) {
            System.out.println(it.nextIndex() + " - " + it.next().getMatricula());
        }
    }
}