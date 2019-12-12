package com.adrian.equipos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObservable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.adrian.equipos.Adaptadores.AdaptadorEquipos;
import com.adrian.equipos.Adaptadores.AdaptadorLigas;
import com.adrian.equipos.Datos.Datos;
import com.adrian.equipos.Utiles.Equipos;
import com.adrian.equipos.Utiles.Ligas;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdaptadorLigas.OnMiRecyclerListener, AdapterView.OnItemClickListener, AdaptadorEquipos.OnMiRecyclerListener {
    // VAR ELEMENTOS
        // Ligas
        RecyclerView idRecyclerLigas;
        AdaptadorLigas adaptadorLigas;
        // Equipos
        RecyclerView idRecyclerEquipos;
        AdaptadorEquipos adaptadorEquipos;
        // Arrays
        ArrayList <Ligas> listaLigas;
        ArrayList <Equipos> listaEquipos;
        Context context;
        // Constantes intents
        final static String TAG_1= "Envio1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
        rellenarRecyclerLigas();
        rellenarRecyclerEquipos();
    }

    private void instancias() {
        // Elementos
        idRecyclerLigas = findViewById(R.id.idRecyclerLigas);
        idRecyclerEquipos = findViewById(R.id.idRecyclerEquipos);
        // Arraylist
        listaLigas = Datos.newInstance().listaLigas();
        listaEquipos = Datos.newInstance().listaEquiposLiga();
        // Adaptadores
        adaptadorLigas = new AdaptadorLigas(MainActivity.this,listaLigas);
        adaptadorEquipos = new AdaptadorEquipos(MainActivity.this,listaEquipos);
    }

    private void acciones() {

    }

    private void rellenarRecyclerLigas() {
        System.out.println("Dentro de rellenar ligas");
        idRecyclerLigas.setAdapter(adaptadorLigas);
        adaptadorLigas.notifyDataSetChanged();
        idRecyclerLigas.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
    }
    private void rellenarRecyclerEquipos() {
        idRecyclerEquipos.setAdapter(adaptadorEquipos);
        adaptadorEquipos.notifyDataSetChanged();
        idRecyclerEquipos.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
    }

    @Override
    public void onMiRecycler(Ligas ligas) {
        System.out.println(ligas.getLigasEquipos());
        adaptadorEquipos = new AdaptadorEquipos(MainActivity.this,ligas.getLigasEquipos());
        idRecyclerEquipos.setAdapter(adaptadorEquipos);
        adaptadorEquipos.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onMiRecycler(Equipos equipos) {
        System.out.println(equipos.getNombreEquipos());
        Intent intentEquipos = new Intent(getApplicationContext(),SecondActivity.class);
        intentEquipos.putExtra(TAG_1,equipos);
        startActivity(intentEquipos);
    }
}
