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
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class Laisves30 extends FragmentActivity implements OnPageChangeListener {

    public static final String LAISVES_30 = "laisves30";
    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_Q_LAISV_C4_97S_30_MA_C5_BEEIKIUOSE_SPELL_1_SA_X_VED_0AH_UKEWJD3SJ_FW6_PXAH_WS_FJO_KHWT_BBZ0_QVW_UIIYG_A_BIW_1920_BIH_971_GFE_RD_CR_DCR_0_EI_L_F8_WC7_LES_KAT_AGKOA7O_AW = "https://www.google.com/search?client=firefox-b&q=Laisv%C4%97s+30+Ma%C5%BEeikiuose&spell=1&sa=X&ved=0ahUKEwjd3sjFw6PXAhWsFJoKHWtBBz0QvwUIIygA&biw=1920&bih=971&gfe_rd=cr&dcr=0&ei=l_f8Wc7LEsKAtAGKoa7oAw";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String LAISVĖS_G_30_MAŽEIKIAI_89223 = "Laisvės g. 30, Mažeikiai 89223";
    public static final String ARNAKVYNE = "ARNAKVYNE";
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
        mMediaPlayer = MediaPlayer.create(Laisves30.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laisves30);
        boolean ar = getIntent().getBooleanExtra(ARNAKVYNE, false);
        if (!ar) {
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.relative);
            rl.setVisibility(View.GONE);
        }
        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = LAISVĖS_G_30_MAŽEIKIAI_89223;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-443) 27054";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });


        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_Q_LAISV_C4_97S_30_MA_C5_BEEIKIUOSE_SPELL_1_SA_X_VED_0AH_UKEWJD3SJ_FW6_PXAH_WS_FJO_KHWT_BBZ0_QVW_UIIYG_A_BIW_1920_BIH_971_GFE_RD_CR_DCR_0_EI_L_F8_WC7_LES_KAT_AGKOA7O_AW;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });

        viewPage = (ViewPager) findViewById(R.id.viewPager);
        imageId = new Images(LAISVES_30);
        itemData = imageId.getImageItem();
        totalImage = itemData.size();

        adapter = new FragmentPagerAdapter(getSupportFragmentManager(), itemData);
        viewPage.setAdapter(adapter);
        viewPage.setOnPageChangeListener(Laisves30.this);


        sliderDotspanel = (LinearLayout) findViewById(R.id.SliderDots);


        dots = new ImageView[totalImage];

        for (int i = 0; i < totalImage; i++) {

            dots[i] = new ImageView(Laisves30.this);
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