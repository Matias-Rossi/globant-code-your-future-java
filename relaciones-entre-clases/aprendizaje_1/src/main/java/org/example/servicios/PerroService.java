package aprendizaje.relacionesAprendizaje1.servicios;

import aprendizaje.relacionesAprendizaje1.modelos.Perro;

import java.util.Scanner;

public class PerroService {

    private Perro perro = new Perro();

    public Perro crearPerro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del perro: ");
        perro.setNombre(scanner.nextLine());
        System.out.print("Ingrese la raza del perro: ");
        perro.setRaza(scanner.nextLine());
        System.out.print("Ingrese la edad del perro: ");
        perro.setEdad(Integer.parseInt(scanner.nextLine()));
        System.out.print("Ingrese el tamaño del perro: ");
        perro.setTamanio(Double.parseDouble(scanner.nextLine()));

        return perro;
    }
}
