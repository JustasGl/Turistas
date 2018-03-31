package com.example.android.turistas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptoreditor5 extends ArrayAdapter<word4> {

    public static final String NERA = "nera";

    public Adaptoreditor5(Context context, ArrayList<word4> word4) {

        super(context, 0, word4);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item5, parent, false);
        }

        word4 pozicija = getItem(position);
        ImageView view = (ImageView) listItemView.findViewById(R.id.foto);
        TextView pavadinimas = (TextView) listItemView.findViewById(R.id.pavadinim);
        TextView aprasymas = (TextView) listItemView.findViewById(R.id.aprasym);
        View views = (View) listItemView.findViewById(R.id.viewas);

        if (pozicija.getPavadinimas() == NERA) {
            pavadinimas.setVisibility(View.GONE);
            views.setVisibility(View.GONE);
        } else {
            pavadinimas.setVisibility(View.VISIBLE);
            views.setVisibility(View.VISIBLE);
            pavadinimas.setText(pozicija.getPavadinimas());
        }
        view.setImageResource(pozicija.getFoto());
        aprasymas.setText(pozicija.getaprasymas());

        return listItemView;
    }
}