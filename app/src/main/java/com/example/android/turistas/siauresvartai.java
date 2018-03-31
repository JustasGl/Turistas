package com.example.android.turistas;


import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class siauresvartai extends FragmentActivity implements OnPageChangeListener {

    public static final String JURO = "juro";
    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_HKW_IWO2X_KQY_SG_AA9X_IGG_DW_Q_JURO_GUEST_HOUSE_C5_A0IAULIAI_OQ_JURO_GUEST_HOUSE_C5_A0IAULIAI_GS_L_PSY_AB_3_60444_72231_0_72407_19_18_1_0_0_0_329_3131_0J6J8J1_15_0_0_1_1_64_PSY_AB_3_13_2569_0I13K1J0I13I30K1J0I13I5I30K1J35I39K1J0I203K1J33I22I29I30K1J33I21K1J33I160K1_0_Q_X_QT_OHLZY_E_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&ei=HKwIWo2xKqySgAa9xIGgDw&q=Juro+Guest+House+%C5%A0iauliai&oq=Juro+Guest+House+%C5%A0iauliai&gs_l=psy-ab.3...60444.72231.0.72407.19.18.1.0.0.0.329.3131.0j6j8j1.15.0....0...1.1.64.psy-ab..3.13.2569...0i13k1j0i13i30k1j0i13i5i30k1j35i39k1j0i203k1j33i22i29i30k1j33i21k1j33i160k1.0.q_xQtOHLZyE&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String S_NĖRIES_G_7_ŠIAULIAI_76341 = "S. Nėries g. 7, Šiauliai 76341";
    LinearLayout sliderDotspanel;
    private ImageView[] dots;
    private MediaPlayer mMediaPlayer;
    private int position = 0, totalImage;
    private ViewPager viewPage;
    private ArrayList<Integer> itemData;
    private FragmentPagerAdapter adapter;
    private Images imageId;
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    private void releaseMediaPlayer() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }

    private void skamb() {
        mMediaPlayer = MediaPlayer.create(siauresvartai.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siauresvartai);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = S_NĖRIES_G_7_ŠIAULIAI_76341;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-618) 74886";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_HKW_IWO2X_KQY_SG_AA9X_IGG_DW_Q_JURO_GUEST_HOUSE_C5_A0IAULIAI_OQ_JURO_GUEST_HOUSE_C5_A0IAULIAI_GS_L_PSY_AB_3_60444_72231_0_72407_19_18_1_0_0_0_329_3131_0J6J8J1_15_0_0_1_1_64_PSY_AB_3_13_2569_0I13K1J0I13I30K1J0I13I5I30K1J35I39K1J0I203K1J33I22I29I30K1J33I21K1J33I160K1_0_Q_X_QT_OHLZY_E_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });

        viewPage = (ViewPager) findViewById(R.id.viewPager);
        imageId = new Images(JURO);
        itemData = imageId.getImageItem();
        totalImage = itemData.size();

        adapter = new FragmentPagerAdapter(getSupportFragmentManager(), itemData);
        viewPage.setAdapter(adapter);
        viewPage.setOnPageChangeListener(siauresvartai.this);


        sliderDotspanel = (LinearLayout) findViewById(R.id.SliderDots);


        dots = new ImageView[totalImage];

        for (int i = 0; i < totalImage; i++) {

            dots[i] = new ImageView(siauresvartai.this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);


            sliderDotspanel.addView(dots[i], params);

        }
        dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));
    }

    @Override
    public void onPageScrollStateChanged(int arg0) {
        dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));
        if (position == 0) {
            dots[position + 1].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));
        } else if (position == totalImage - 1) {
            dots[position - 1].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));
        } else if (position != totalImage) {
            dots[position - 1].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));
            dots[position + 1].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));
        }
    }

    @Override
    public void onPageScrolled(int arg0, float arg1, int arg2) {
    }

    @Override
    public void onPageSelected(int position) {
        this.position = position;
    }
}
