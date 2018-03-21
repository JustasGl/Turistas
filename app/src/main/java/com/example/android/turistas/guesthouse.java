package com.example.android.turistas;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;


public class guesthouse extends FragmentActivity implements OnPageChangeListener  {

    public static final String SINCHRONAS = "sinchronas";
    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_AVR8_WE_KQJME_AAF_LUI4G_B_Q_GUESTHOUSE_SINCHRONAS_TEL_C5_A1IUOSE_OQ_GUESTHOUSE_SINCHRONAS_TEL_C5_A1IUOSE_GS_L_PSY_AB_3_18552_22846_0_23343_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_E_LKXMO_EEB_VO_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=avr8WeKQJMeAafLui4gB&q=Guesthouse+Sinchronas+Tel%C5%A1iuose&oq=Guesthouse+Sinchronas+Tel%C5%A1iuose&gs_l=psy-ab.3...18552.22846.0.23343.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.eLkxmoEebVo&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String TURGAUS_A_24_TELŠIAI_87122 = "Turgaus a. 24, Telšiai 87122";
    public static final String ARNAKVYNE = "ARNAKVYNE";
    LinearLayout sliderDotspanel;
    private ImageView[] dots;
    private MediaPlayer mMediaPlayer;
    private int position = 0, totalImage;
    private ViewPager viewPage;
    private ArrayList<Integer> itemData;
    private FragmentPagerAdapter adapter;
    private Images imageId;
    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };
    private void releaseMediaPlayer() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }
    private void skamb ()
    {
        mMediaPlayer = MediaPlayer.create(guesthouse.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guesthouse);
        boolean ar=getIntent().getBooleanExtra(ARNAKVYNE, false);
        if (!ar)
        {
            RelativeLayout rl =(RelativeLayout)findViewById(R.id.relative);
            rl.setVisibility(View.GONE);
        }
        ImageView adress = (ImageView)findViewById(R.id.adreso);
        ImageView tel = (ImageView)findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String str_location = TURGAUS_A_24_TELŠIAI_87122;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String phone = "(8-655) 50313";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView)findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_AVR8_WE_KQJME_AAF_LUI4G_B_Q_GUESTHOUSE_SINCHRONAS_TEL_C5_A1IUOSE_OQ_GUESTHOUSE_SINCHRONAS_TEL_C5_A1IUOSE_GS_L_PSY_AB_3_18552_22846_0_23343_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_E_LKXMO_EEB_VO_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });

        viewPage = (ViewPager) findViewById(R.id.viewPager);
        imageId = new Images(SINCHRONAS);
        itemData = imageId.getImageItem();
        totalImage = itemData.size();

        adapter = new FragmentPagerAdapter(getSupportFragmentManager(), itemData);
        viewPage.setAdapter(adapter);
        viewPage.setOnPageChangeListener(guesthouse.this);


        sliderDotspanel = (LinearLayout) findViewById(R.id.SliderDots);


        dots = new ImageView[totalImage];

        for(int i = 0; i < totalImage; i++){

            dots[i] = new ImageView(guesthouse.this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);


            sliderDotspanel.addView(dots[i], params);

        }
        dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));
    }

    @Override
    public void onPageScrollStateChanged(int arg0) {
        dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));
        if (position==0)
        {
            dots[position + 1].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));
        }
        else if (position==totalImage-1)
        {
            dots[position - 1].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));
        }
        else if(position!=totalImage){
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
