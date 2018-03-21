package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class tenis extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_5GJ9_WAMU_JOB4A_PH_J_ZAD_Q_TENISAS_MA_C5_BEEIKIUOSE_OQ_TENISAS_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_3_16780_20896_0_21136_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_R_ITD_IRCC_RXI_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=5gj9WamuJob4aPH-jZAD&q=Tenisas+Ma%C5%BEeikiuose&oq=Tenisas+Ma%C5%BEeikiuose&gs_l=psy-ab.3...16780.20896.0.21136.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.rItdIrccRXI&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String V_KUDIRKOS_G_13_MAŽEIKIAI_89215 = "V. Kudirkos g. 13, Mažeikiai 89215";
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
        mMediaPlayer = MediaPlayer.create(tenis.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenis);

        ImageView adress = (ImageView)findViewById(R.id.adreso);
        ImageView tel = (ImageView)findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String str_location = V_KUDIRKOS_G_13_MAŽEIKIAI_89215;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String phone = "(8-650) 12129";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView)findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_5GJ9_WAMU_JOB4A_PH_J_ZAD_Q_TENISAS_MA_C5_BEEIKIUOSE_OQ_TENISAS_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_3_16780_20896_0_21136_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_R_ITD_IRCC_RXI_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
