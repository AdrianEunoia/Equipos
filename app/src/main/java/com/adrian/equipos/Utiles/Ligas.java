package com.adrian.equipos.Utiles;

import java.util.ArrayList;

public class Ligas {
    String nombreLiga;
    int logoLiga;
    ArrayList ligasEquipos;

    public Ligas(String nombreLiga, int logoLiga, ArrayList ligasEquipos) {
        this.nombreLiga = nombreLiga;
        this.logoLiga = logoLiga;
        this.ligasEquipos = ligasEquipos;
    }

    public String getNombreLiga() {
        return nombreLiga;
    }
    public void setNombreLiga(String nombreLiga) {
        this.nombreLiga = nombreLiga;
    }

    public int getLogoLiga() {
        return logoLiga;
    }
    public void setLogoLiga(int logoLiga) {
        this.logoLiga = logoLiga;
    }

    public ArrayList getLigasEquipos() {
        return ligasEquipos;
    }
    public void setLigasEquipos(ArrayList ligasEquipos) {
        this.ligasEquipos = ligasEquipos;
    }
}
