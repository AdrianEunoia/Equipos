package com.adrian.equipos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.adrian.equipos.Adaptadores.AdaptadorJugadores;
import com.adrian.equipos.Datos.Datos;
import com.adrian.equipos.Utiles.Jugadores;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    // VAR ELEMENTOS
    AdaptadorJugadores adaptadorJugadores;
    RecyclerView recyclerJugadores;
    ArrayList<Jugadores> listaJugadores;
    // VAR INTENTS
    String equipoPasado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // Creamos metodo para recuperar datos
        instancias();
        recuperarDatos();
    }

    private void recuperarDatos() {
        if(getIntent().getExtras() != null){
            String equipoPasado = (getIntent().getExtras().get(MainActivity.TAG_1)).toString();
            if(equipoPasado.equals("Real Madrid")){
                listaJugadores = Datos.newInstance().listaRealMadrid();
            }else{
                listaJugadores = Datos.newInstance().listaJugadoresRandom();
            }
            // Adaptadores
            adaptadorJugadores = new AdaptadorJugadores(SecondActivity.this,listaJugadores);
            recyclerJugadores.setAdapter(adaptadorJugadores);
            adaptadorJugadores.notifyDataSetChanged();
            recyclerJugadores.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        }
    }

    private void instancias() {
        recyclerJugadores = findViewById(R.id.idRecyclerJugadores);
        listaJugadores = new ArrayList();

    }
}
