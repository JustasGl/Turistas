package com.example.android.turistas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptoreditor3 extends ArrayAdapter<word2> {


    public Adaptoreditor3(Context context, ArrayList<word2> word2) {

        super(context, 0, word2);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item3, parent, false);
        }
        word2 kaire = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.kaire);
        nameTextView.setText(kaire.getKaire());

        word2 vieta = getItem(position);

        TextView text = (TextView) listItemView.findViewById(R.id.desine);
        text.setText(vieta.getDesine());

        ImageView pic = (ImageView) listItemView.findViewById(R.id.fonas);
        pic.setImageResource(vieta.getFoto());

        return listItemView;
    }
}