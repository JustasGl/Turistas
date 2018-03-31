package com.example.android.turistas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptorgrid extends ArrayAdapter<word> {


    public Adaptorgrid(Context context, ArrayList<word> word) {

        super(context, 0, word);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
        }
        word vieta = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.gridtext);
        nameTextView.setText(vieta.getTag());

        ImageView pic = (ImageView) listItemView.findViewById(R.id.gridimg);
        pic.setImageResource(vieta.getFoto());

        return listItemView;
    }
}