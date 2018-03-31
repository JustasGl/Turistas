package com.example.android.turistas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptoreditor4 extends ArrayAdapter<word3> {

    public static final String NERA_PAVADINIMO = "nera pavadinimo";
    Animation blink;
    ImageView midimg;

    public Adaptoreditor4(Context context, ArrayList<word3> word3) {

        super(context, 0, word3);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item4, parent, false);
        }

        word3 vieta = getItem(position);
        blink = AnimationUtils.loadAnimation(getContext(), R.anim.blink);

        midimg = (ImageView) listItemView.findViewById(R.id.midpic);
        midimg.setAnimation(blink);

        TextView nameTextView00 = (TextView) listItemView.findViewById(R.id.pavadinimas);
        nameTextView00.setAnimation(blink);
        if (vieta.getpavadinimas() == NERA_PAVADINIMO) {
            nameTextView00.setVisibility(View.GONE);

        } else {
            nameTextView00.setVisibility(View.VISIBLE);
            nameTextView00.setText(vieta.getpavadinimas());
        }
        TextView nameTextView0 = (TextView) listItemView.findViewById(R.id.aprasymas);
        nameTextView0.setAnimation(blink);
        if (vieta.getaprasymas() == NERA_PAVADINIMO) {
            nameTextView0.setVisibility(View.GONE);
        } else {
            nameTextView0.setVisibility(View.VISIBLE);
            nameTextView0.setText(vieta.getaprasymas());
        }
        ImageView pic1 = (ImageView) listItemView.findViewById(R.id.isvykstameimg);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.text1);
        nameTextView.setAnimation(blink);
        pic1.setImageResource(vieta.getFoto2());
        nameTextView.setText(vieta.text1());

        pic1.setImageResource(vieta.getFoto1());
        pic1.setAnimation(blink);

        nameTextView.setText(vieta.text1());
        TextView nameTextView1 = (TextView) listItemView.findViewById(R.id.text2);
        nameTextView1.setAnimation(blink);
        nameTextView1.setText(vieta.text2());
        ImageView pic3 = (ImageView) listItemView.findViewById(R.id.ft2);
        TextView nameTextView2 = (TextView) listItemView.findViewById(R.id.text3);
        nameTextView2.setAnimation(blink);
        pic3.setImageResource(vieta.getFoto2());

        nameTextView2.setVisibility(View.VISIBLE);
        nameTextView2.setText(vieta.text3());

        TextView kelias = (TextView) listItemView.findViewById(R.id.text4);
        kelias.setText(vieta.text4());
        kelias.setAnimation(blink);

        return listItemView;
    }
}