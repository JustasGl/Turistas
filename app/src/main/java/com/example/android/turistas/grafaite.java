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

public class grafaite extends FragmentActivity implements OnPageChangeListener {

    public static final String GRAFAITE = "grafaite";
    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_0W_L9_WZ7_OFCE2AD2NG6_AH_Q_VIE_C5_A1BUTIS_BARAS_22_GRAFAIT_C4_97_22_C5_A0IAULIAI_OQ_VIE_C5_A1BUTIS_BARAS_22_GRAFAIT_C4_97_22_C5_A0IAULIAI_GS_L_PSY_AB_12_4224_5708_0_6611_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_0407_AHV3G0_A_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=0wL9WZ7OFce2ad2ng6AH&q=Vie%C5%A1butis+-+Baras+%22Grafait%C4%97%22+%C5%A0iauliai&oq=Vie%C5%A1butis+-+Baras+%22Grafait%C4%97%22+%C5%A0iauliai&gs_l=psy-ab.12...4224.5708.0.6611.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.0407AHv3g0A&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String AUŠROS_G_1_ŠIAULIAI_81493 = "Aušros g. 1, Šiauliai 81493";
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
        mMediaPlayer = MediaPlayer.create(grafaite.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grafaite);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = AUŠROS_G_1_ŠIAULIAI_81493;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-41) 589120";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_0W_L9_WZ7_OFCE2AD2NG6_AH_Q_VIE_C5_A1BUTIS_BARAS_22_GRAFAIT_C4_97_22_C5_A0IAULIAI_OQ_VIE_C5_A1BUTIS_BARAS_22_GRAFAIT_C4_97_22_C5_A0IAULIAI_GS_L_PSY_AB_12_4224_5708_0_6611_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_0407_AHV3G0_A_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });

        viewPage = (ViewPager) findViewById(R.id.viewPager);
        imageId = new Images(GRAFAITE);
        itemData = imageId.getImageItem();
        totalImage = itemData.size();

        adapter = new FragmentPagerAdapter(getSupportFragmentManager(), itemData);
        viewPage.setAdapter(adapter);
        viewPage.setOnPageChangeListener(grafaite.this);


        sliderDotspanel = (LinearLayout) findViewById(R.id.SliderDots);


        dots = new ImageView[totalImage];

        for (int i = 0; i < totalImage; i++) {

            dots[i] = new ImageView(grafaite.this);
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
