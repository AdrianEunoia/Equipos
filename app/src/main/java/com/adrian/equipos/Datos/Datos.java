package com.adrian.equipos.Datos;

import com.adrian.equipos.R;
import com.adrian.equipos.Utiles.Equipos;
import com.adrian.equipos.Utiles.Jugadores;
import com.adrian.equipos.Utiles.Ligas;

import java.util.ArrayList;

public class Datos {
    // Metodo obtener datos
    public static Datos newInstance(){
        Datos datos = new Datos();
        return datos;
    }
    public ArrayList listaEquiposLiga(){

        ArrayList<Equipos> lista = new ArrayList<>();

        lista.add(new Equipos("FC.Barcelona","CampNou", R.drawable.barsa,null));
        lista.add(new Equipos("Real Madrid","Bernabeu", R.drawable.madrid,null));
        lista.add(new Equipos("Atletico de Madrid","CampNou", R.drawable.atletico,null));
        lista.add(new Equipos("Valencia","Mestalla", R.drawable.valencia,null));
        lista.add(new Equipos("Sevilla","Sanchez Pijuan", R.drawable.sevilla,null));
        lista.add(new Equipos("Getafe","Alfonso Perez", R.drawable.getafe,null));
        lista.add(new Equipos("Leganes","Butarque", R.drawable.leganes,null));
        return lista;
    }

    public ArrayList listaEquiposPremier(){
        ArrayList<Equipos> lista = new ArrayList<>();
        lista.add(new Equipos("M. City","Etihad Stadium", R.drawable.city,null));
        lista.add(new Equipos("Liverpool","Anfiled", R.drawable.liverpool,null));
        lista.add(new Equipos("Manchester United","Old Traford", R.drawable.manchester,null));
        lista.add(new Equipos("Everton","Goodison", R.drawable.everton,null));
        lista.add(new Equipos("Leicester","King Power Stadium", R.drawable.leices,null));
        lista.add(new Equipos("Chelsea","Stanford Bridge", R.drawable.chelsea,null));
        return lista;
    }

    public ArrayList listaEquiposItalia(){
        ArrayList<Equipos> lista = new ArrayList<>();
        lista.add(new Equipos("Juventus","Etihad Stadium", R.drawable.juventus,null));
        lista.add(new Equipos("Milan","Old Traford", R.drawable.milan,null));
        lista.add(new Equipos("Inter","Goodison", R.drawable.inter,null));
        return lista;
    }

    public ArrayList listaLigas(){
        ArrayList<Ligas> lista = new ArrayList<>();
        lista.add(new Ligas("LIGA SANTANDER",R.drawable.laliga,listaEquiposLiga()));
        lista.add(new Ligas("PREMIER LEAGUE",R.drawable.premiere,listaEquiposPremier()));
        lista.add(new Ligas("CALCIO SERIE A",R.drawable.calcio,listaEquiposItalia()));
        return lista;
    }
    public ArrayList listaRealMadrid(){
        // Lista facilitada por Jaime //
        ArrayList<Jugadores> lista = new ArrayList<>();
        lista.add(new Jugadores("Alphonse  Areola",false,R.drawable.jugador));
        lista.add(new Jugadores("Thibaut Courtois",true,R.drawable.jugador));
        lista.add(new Jugadores("Daniel Carvajal",true,R.drawable.jugador));
        lista.add(new Jugadores("Eder Militao",false,R.drawable.jugador));
        lista.add(new Jugadores("Sergio Ramos",true,R.drawable.jugador));
        lista.add(new Jugadores("Rafael Varane",true,R.drawable.jugador));
        lista.add(new Jugadores("Marelo Vieira",true,R.drawable.jugador));
        lista.add(new Jugadores("Álvaro Odriozola",false,R.drawable.jugador));
        lista.add(new Jugadores("Ferd Mendy",false,R.drawable.jugador));
        lista.add(new Jugadores("Tony Kroos",true,R.drawable.jugador));
        lista.add(new Jugadores("Luka Modric",true,R.drawable.jugador));
        lista.add(new Jugadores("Carlos Casemiro",true,R.drawable.jugador));
        lista.add(new Jugadores("Fede Valverde",false,R.drawable.jugador));
        lista.add(new Jugadores("James Rodriguez",true,R.drawable.jugador));
        lista.add(new Jugadores("Francisco Alarcón",false,R.drawable.jugador));
        lista.add(new Jugadores("Eden Hazard",true,R.drawable.jugador));
        lista.add(new Jugadores("Karim Bencema",true,R.drawable.jugador));
        lista.add(new Jugadores("Gareth Bale",false,R.drawable.jugador));
        lista.add(new Jugadores("Lucas Vázquez",true,R.drawable.jugador));
        lista.add(new Jugadores("Luka Jóvic",false,R.drawable.jugador));
        lista.add(new Jugadores("Marco Asensio",false,R.drawable.jugador));
        lista.add(new Jugadores("Brahim Diaz",false,R.drawable.jugador));
        lista.add(new Jugadores("Vinicius Junior ",true,R.drawable.jugador));
        lista.add(new Jugadores("Rodrygo Goes",false,R.drawable.jugador));
        return lista;
    }
    public ArrayList listaJugadoresRandom(){
        // Lista facilitada por Jaime //
        ArrayList<Jugadores> lista = new ArrayList<>();
        lista.add(new Jugadores("Random  Areola",false,R.drawable.jugador));
        lista.add(new Jugadores("Random Courtois",true,R.drawable.jugador));
        lista.add(new Jugadores("Random Carvajal",true,R.drawable.jugador));
        lista.add(new Jugadores("Random Militao",false,R.drawable.jugador));
        lista.add(new Jugadores("Random Ramos",true,R.drawable.jugador));
        lista.add(new Jugadores("Random Varane",true,R.drawable.jugador));
        lista.add(new Jugadores("Random Vieira",true,R.drawable.jugador));
        lista.add(new Jugadores("Random Odriozola",false,R.drawable.jugador));
        lista.add(new Jugadores("Random Mendy",false,R.drawable.jugador));
        lista.add(new Jugadores("Random Kroos",true,R.drawable.jugador));
        lista.add(new Jugadores("Random Modric",true,R.drawable.jugador));
        lista.add(new Jugadores("Random Casemiro",true,R.drawable.jugador));
        lista.add(new Jugadores("Random Valverde",false,R.drawable.jugador));
        lista.add(new Jugadores("Random Rodriguez",true,R.drawable.jugador));
        lista.add(new Jugadores("Random Alarcón",false,R.drawable.jugador));
        lista.add(new Jugadores("Random Hazard",true,R.drawable.jugador));
        lista.add(new Jugadores("Random Bencema",true,R.drawable.jugador));
        lista.add(new Jugadores("Random Bale",false,R.drawable.jugador));
        lista.add(new Jugadores("Random Vázquez",true,R.drawable.jugador));
        lista.add(new Jugadores("Random Jóvic",false,R.drawable.jugador));
        lista.add(new Jugadores("Random Asensio",false,R.drawable.jugador));
        lista.add(new Jugadores("Random Diaz",false,R.drawable.jugador));
        lista.add(new Jugadores("Random Junior ",true,R.drawable.jugador));
        lista.add(new Jugadores("Random Goes",false,R.drawable.jugador));
        return lista;
    }
}
