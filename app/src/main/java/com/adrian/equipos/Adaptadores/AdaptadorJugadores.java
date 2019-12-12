package com.adrian.equipos.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.adrian.equipos.MainActivity;
import com.adrian.equipos.R;
import com.adrian.equipos.Utiles.Jugadores;
import com.adrian.equipos.Utiles.Ligas;

import java.util.ArrayList;

public class AdaptadorJugadores extends RecyclerView.Adapter<AdaptadorJugadores.HolderAdapter> {
    // VAR
    Context context;
    ArrayList<Jugadores> listaJugadores;

    // CONSTRUCTOR ADAPTADOR, SOLO PARENT CLASS Y LISTA PASADA
    public AdaptadorJugadores(Context context, ArrayList<Jugadores> listaJugadores) {
        this.context = context;
        this.listaJugadores = listaJugadores;
    }
    // METODOS ADAPTADOR
    @NonNull
    @Override
    // DESARROLLO HOLDER
    public HolderAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_jugadores,parent,false);
        return new HolderAdapter(view);
    }
    // ACCIONES HOLDER
    @Override
    public void onBindViewHolder(@NonNull AdaptadorJugadores.HolderAdapter holder, int position) {
        final Jugadores jugadorEnconrado = listaJugadores.get(position);
        holder.getIdNombreJugador().setText(jugadorEnconrado.getNombre());
        holder.getIdImagenJugador().setImageResource(jugadorEnconrado.getFotoJugador());
        if (jugadorEnconrado.isEstrellaJugador()){
            holder.getIdEstrellaJugador().setVisibility(View.VISIBLE);
        }else{
            holder.getIdEstrellaJugador().setVisibility(View.INVISIBLE);
        }
    }
    @Override
    // TAMAÑO LISTA
    public int getItemCount() {
        return listaJugadores.size();
    }
    // CLASE MANUAL
    // CLASE HOLDER
    class HolderAdapter extends RecyclerView.ViewHolder {
        // VAR ELEMENTOS LAYOUT
        private ImageView idImagenJugador;
        private TextView idNombreJugador;
        private ImageView idEstrellaJugador;
        private  LinearLayout idLayoutJugador;
        // CONSTRUCTOR HOLDER
        public HolderAdapter(@NonNull View itemView) {
            super(itemView);
            idImagenJugador = itemView.findViewById(R.id.idImagenJugador);
            idNombreJugador = itemView.findViewById(R.id.idNombreJugador);
            idEstrellaJugador = itemView.findViewById(R.id.idEstrellaJugador);
            idLayoutJugador = itemView.findViewById(R.id.idLayoutJugadores);
        }
        // GETTERS
        public ImageView getIdImagenJugador() { return idImagenJugador; }
        public TextView getIdNombreJugador() { return idNombreJugador; }
        public ImageView getIdEstrellaJugador() { return idEstrellaJugador; }
        public LinearLayout getIdLayoutJugador() { return idLayoutJugador; }
    }
}
