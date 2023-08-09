package org.glCYF.servicios;

import org.glCYF.modelos.Revolver;

public class RevolverServicio {
    public RevolverServicio() {}

    public void llenarRevolver(Revolver revolver) {
        revolver.setPosicionActualTambor((int) (Math.random() * 5));
        revolver.setPosicionAguaTambor((int) (Math.random() * 5));
    }

    //mojar
    public boolean disparar(Revolver revolver) {
        boolean saleDisparo = revolver.getPosicionActualTambor() == revolver.getPosicionAguaTambor();
        ciclar(revolver);
        return saleDisparo;
    }

    //siguienteChorro
    public void ciclar(Revolver revolver) {
        int posActual = revolver.getPosicionActualTambor();
        int sigPosicion = (posActual + 1) % 5;
        revolver.setPosicionActualTambor(sigPosicion);
    }

    public String infoRevolver(Revolver revolver) {
        return revolver.toString();
    }
}
