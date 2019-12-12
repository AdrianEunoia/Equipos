package com.adrian.equipos.Utiles;

import java.io.Serializable;
import java.util.ArrayList;

public class Equipos implements Serializable {
    String nombreEquipos,estadio;
    int escudo;
    ArrayList ligasJugadores;

    public Equipos(String nombreEquipos,String estadio, int escudo,ArrayList ligasJugadores) {
        this.nombreEquipos = nombreEquipos;
        this.estadio = estadio;
        this.escudo = escudo;
        this.ligasJugadores = ligasJugadores;
    }

    public String getNombreEquipos() {
        return nombreEquipos;
    }
    public void setNombreEquipos(String nombreEquipos) {
        this.nombreEquipos = nombreEquipos;
    }

    public String getEstadio() {
        return estadio;
    }
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getEscudo() {
        return escudo;
    }
    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public ArrayList getLigasJugadores() { return ligasJugadores; }
    public void setLigasJugadores(ArrayList ligasJugadores) { this.ligasJugadores = ligasJugadores; }
}
