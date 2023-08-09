package org.example;

public class Main {
    public static void main(String[] args) {
        aprendizaje.relacionesAprendizaje1.servicios.PersonaService personaService = new aprendizaje.relacionesAprendizaje1.servicios.PersonaService();
        personaService.crearPersona();
        personaService.imprimirInformacion();
    }
}