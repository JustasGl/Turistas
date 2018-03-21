package com.example.android.turistas;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.android.turistas.word;

import java.util.ArrayList;

public class Adaptoreditor2 extends ArrayAdapter<word> {


    public Adaptoreditor2(Context context, ArrayList<word> word) {

        super(context, 0, word);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item2, parent, false);
        }
        word vertimas = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.pavadinimas);
        nameTextView.setText(vertimas.getTag());

        ImageView pic = (ImageView)listItemView.findViewById(R.id.foto);
        pic.setImageResource(vertimas.getFoto());

        return listItemView;
    }
}