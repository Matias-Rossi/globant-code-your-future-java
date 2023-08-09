package aprendizaje.relacionesAprendizaje1.servicios;

import aprendizaje.relacionesAprendizaje1.modelos.Persona;

import java.util.Scanner;

public class PersonaService {
    Persona persona = new Persona();

    PerroService perroService = new PerroService();
    public Persona crearPersona() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la persona: ");
        persona.setNombre(scanner.nextLine());
        System.out.print("Ingrese el apellido de la persona: ");
        persona.setApellido(scanner.nextLine());
        System.out.print("Ingrese la edad de la persona: ");
        persona.setEdad(Integer.parseInt(scanner.nextLine()));
        System.out.print("Ingrese el documento de la persona: ");
        persona.setDocumento(scanner.nextLine());

        persona.setPerro(perroService.crearPerro());

        return persona;
    }

    public void imprimirInformacion() {
        System.out.println(persona.toString());
    }
}
