package com.adrian.equipos.Adaptadores;

import android.content.Context;
import android.text.Layout;
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
import com.adrian.equipos.Utiles.Ligas;

import java.util.ArrayList;

public class AdaptadorLigas extends RecyclerView.Adapter<AdaptadorLigas.HolderAdapterLigas> {
    // VAR
    Context context;
    ArrayList<Ligas> listaLigas;
    OnMiRecyclerListener listener;

    // CONSTRUCTOR ADAPTADOR, SOLO PARENT CLASS Y LISTA PASADA
    public AdaptadorLigas(MainActivity ligas, ArrayList<Ligas> listaLigas) {
        this.context = ligas;
        this.listaLigas = listaLigas;
        listener = (OnMiRecyclerListener) context;
    }
    // METODOS ADAPTADOR
    @NonNull
    @Override
    // DESARROLLO HOLDER
    public HolderAdapterLigas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // INFLATER CON CONTEXT Y LAYOUT
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_ligas, parent,false);
        // CREO HOLDER // IMPORTANTE, EL CONSTRUCTOR DE LA CLASE DE MI HOLDER INVOCA DESDE AQUI
        HolderAdapterLigas miHolder = new HolderAdapterLigas(view);
        return miHolder;
    }
    // ACCIONES HOLDER
    @Override
    public void onBindViewHolder(@NonNull HolderAdapterLigas holder, int position) {
        final Ligas ligaEncontrada = listaLigas.get(position);
        holder.getIdNombreLiga().setText(ligaEncontrada.getNombreLiga());
        holder.getIdImagenLiga().setImageResource(ligaEncontrada.getLogoLiga());
        // ACTIONS
        holder.getIdNombreLiga().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onMiRecycler(ligaEncontrada);
            }
        });
        holder.getIdImagenLiga().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onMiRecycler(ligaEncontrada);
            }
        });
    }

    @Override
    // TAMAÑO LISTA
    public int getItemCount() {
        return listaLigas.size();
    }
    // CLASE MANUAL
    // CLASE HOLDER
    class HolderAdapterLigas extends RecyclerView.ViewHolder {
        // VAR ELEMENTOS LAYOUT
        private ImageView idImagenLiga;
        private TextView idNombreLiga;
        private LinearLayout idLayoutLigas;
        // CONSTRUCTOR HOLDER
        public HolderAdapterLigas(@NonNull View itemView) {
            super(itemView);
            idImagenLiga = itemView.findViewById(R.id.idImagenLiga);
            idNombreLiga = itemView.findViewById(R.id.idNombreLiga);
            idLayoutLigas = itemView.findViewById(R.id.idLayoutLigas);
        }
        // GETTERS
        public LinearLayout getIdLayoutLigas() { return idLayoutLigas; }
        public ImageView getIdImagenLiga() { return idImagenLiga; }
        public TextView getIdNombreLiga() { return idNombreLiga; }
    }
    // INTERFACE
    public interface OnMiRecyclerListener {
        public void onMiRecycler(Ligas ligas);
    }
}
