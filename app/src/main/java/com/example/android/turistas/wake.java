package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class wake extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_EI_6_QB9_WDV_ZEIMWAF6XG_NG_C_Q_WAKE_PARKAI_MA_C5_BEEIKIUOSE_OQ_WAKE_PARKAI_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_3_12679_15766_0_16139_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_R_PQUTC_XMM3_U_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&ei=6Qb9WdvZEImwaf6xgNgC&q=Wake+parkai+Ma%C5%BEeikiuose&oq=Wake+parkai+Ma%C5%BEeikiuose&gs_l=psy-ab.3...12679.15766.0.16139.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.rPqutcXMm3U&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String N_22_20_26_4_E = "56°17'42.8\"N 22°20'26.4\"E";
    public static final String KUKIAI_ŽIDIKŲ_SEN_MAŽEIKIŲ_R = "Kukiai, Židikų sen., Mažeikių r.";
    private MediaPlayer mMediaPlayer;

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
        mMediaPlayer = MediaPlayer.create(wake.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wake);

        ImageView adress = (ImageView)findViewById(R.id.adreso);
        ImageView tel = (ImageView)findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String str_location = KUKIAI_ŽIDIKŲ_SEN_MAŽEIKIŲ_R;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String phone = "+370 629 79300";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView adress2 = (ImageView)findViewById(R.id.adreso2);
        ImageView tel2 = (ImageView)findViewById(R.id.telefono2);
        adress2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String str_location = N_22_20_26_4_E;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String phone = "+37069533355";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView)findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_EI_6_QB9_WDV_ZEIMWAF6XG_NG_C_Q_WAKE_PARKAI_MA_C5_BEEIKIUOSE_OQ_WAKE_PARKAI_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_3_12679_15766_0_16139_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_R_PQUTC_XMM3_U_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });

    }
}
