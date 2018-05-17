package com.example.usuario.listado;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Usuario on 26/04/2018.
 */

public class TarjetaAdapter extends BaseAdapter{

    ArrayList<Tarjeta> DataAdapter;
    Context contexto;
    ArrayList<String> Imagenes;

    @Override
    public int getCount() {
        return DataAdapter.size();
    }

    @Override
    public Object getItem(int i) {
        return DataAdapter.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater vinculo = LayoutInflater.from(contexto);
        View v = vinculo.inflate(R.layout.tarjeta,null);

        TextView tvnombre = (TextView) v.findViewById(R.id.nombre);
        tvnombre.setText(DataAdapter.get(i).getNombre());

        TextView tvedad = (TextView) v.findViewById(R.id.edad);
        tvedad.setText(""+DataAdapter.get(i).getEdad());

        TextView tvdesc= (TextView) v.findViewById(R.id.descripcion);
        tvdesc.setText(DataAdapter.get(i).getDescripcion());

        ImageView Imagewachar = (ImageView) v.findViewById(R.id.imagen);
        Picasso.with(contexto).load(Imagenes.get(i)).into(Imagewachar);


        return  v;
    }
}
