package org.example.modelos;

import org.example.modelos.barcos.Barco;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Alquiler {
    private Cliente cliente;

    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private String posicionAmarre;
    private Barco barco;

    public Alquiler(Cliente cliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, String posicionAmarre, Barco barco) {
        this.cliente = cliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public double cotizar() {
        long diasEntreFechas = DAYS.between(fechaAlquiler, fechaDevolucion);
        return diasEntreFechas * barco.calcularModulo();
    }
}
