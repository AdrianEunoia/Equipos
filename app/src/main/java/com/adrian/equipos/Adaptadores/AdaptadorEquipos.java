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
import com.adrian.equipos.Utiles.Equipos;

import java.util.ArrayList;

public class AdaptadorEquipos extends RecyclerView.Adapter<AdaptadorEquipos.HolderAdapterEquipos> {
    // VAR
    Context context;
    ArrayList<Equipos> listaEquipos;
    AdaptadorEquipos.OnMiRecyclerListener listener;
    // CONSTRUCTOR ADAPTADOR, SOLO PARENT CLASS Y LISTA PASADA
    public AdaptadorEquipos(MainActivity equipos, ArrayList<Equipos> listaEquipos) {
        this.context = equipos;
        this.listaEquipos = listaEquipos;
        listener = (AdaptadorEquipos.OnMiRecyclerListener) context;
    }
    // METODOS ADAPTADOR
    @NonNull
    @Override
    // DESARROLLO HOLDER
    public HolderAdapterEquipos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // INFLATER CON CONTEXT Y LAYOUT
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_equipos, parent,false);
        // CREO HOLDER // IMPORTANTE, EL CONSTRUCTOR DE LA CLASE DE MI HOLDER INVOCA DESDE AQUI
        HolderAdapterEquipos miHolder = new HolderAdapterEquipos(view);
        return miHolder;
    }
    // ACCIONES HOLDER
    @Override
    public void onBindViewHolder(@NonNull HolderAdapterEquipos holder, int position) {
        final Equipos equipoEncontrado = listaEquipos.get(position);
        holder.getIdNombreEquipo().setText(equipoEncontrado.getNombreEquipos());
        holder.getIdEstadoEquipo().setText(equipoEncontrado.getEstadio());
        holder.getIdImagenEquipo().setImageResource(equipoEncontrado.getEscudo());
        // ACTIONS
        holder.getIdNombreEquipo().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onMiRecycler(equipoEncontrado);
            }
        });
    }
    @Override
    // TAMAÑO LISTA
    public int getItemCount() {
        return listaEquipos.size();
    }
    // CLASE MANUAL
    // CLASE HOLDER
    class HolderAdapterEquipos extends RecyclerView.ViewHolder {
        // VAR ELEMENTOS LAYOUT
        private ImageView idImagenEquipo;
        private TextView idNombreEquipo;
        private TextView idEstadoEquipo;
        private LinearLayout idLayoutEquipos;
        // CONSTRUCTOR HOLDER
        public HolderAdapterEquipos(@NonNull View itemView) {
            super(itemView);
            idImagenEquipo = itemView.findViewById(R.id.idImagenEquipo);
            idNombreEquipo = itemView.findViewById(R.id.idNombreEquipo);
            idEstadoEquipo = itemView.findViewById(R.id.idEstadioEquipo);
            idLayoutEquipos = itemView.findViewById(R.id.idLayoutEquipos);
        }
        // GETTERS
        public ImageView getIdImagenEquipo() { return idImagenEquipo; }
        public TextView getIdNombreEquipo() { return idNombreEquipo; }
        public TextView getIdEstadoEquipo() { return idEstadoEquipo; }
        public LinearLayout getIdLayoutEquipos() { return idLayoutEquipos; }
    }
    // INTERFACE
    public interface OnMiRecyclerListener {
        public void onMiRecycler(Equipos equipos);
    }
}
