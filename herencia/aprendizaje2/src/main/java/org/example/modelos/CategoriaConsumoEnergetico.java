package org.example.modelos;

public enum CategoriaConsumoEnergetico {
    A, B, C, D, E, F;
    static public CategoriaConsumoEnergetico desdeCharMayus(char charMayus) {
        switch(charMayus) {
            case 'A': return CategoriaConsumoEnergetico.A;
            case 'B': return CategoriaConsumoEnergetico.B;
            case 'C': return CategoriaConsumoEnergetico.C;
            case 'D': return CategoriaConsumoEnergetico.D;
            case 'E': return CategoriaConsumoEnergetico.E;
            case 'F': return CategoriaConsumoEnergetico.F;
        }
        throw new RuntimeException();
    }

}
