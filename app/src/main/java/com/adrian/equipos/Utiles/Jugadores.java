package com.adrian.equipos.Utiles;

public class Jugadores {
    String nombre;
    boolean estrellaJugador;
    int fotoJugador;

    public Jugadores( String nombre, boolean estrellaJugador,int fotoJugador) {
        this.nombre = nombre;
        this.estrellaJugador = estrellaJugador;
        this.fotoJugador = fotoJugador;
    }
    
    public int getFotoJugador() {
        return fotoJugador;
    }
    public void setFotoJugador(int fotoJugador) {
        this.fotoJugador = fotoJugador;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstrellaJugador() {
        return estrellaJugador;
    }
    public void setEstrellaJugador(boolean estrellaJugador) { this.estrellaJugador = estrellaJugador; }
}
