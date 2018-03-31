package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class kparachute extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_9YZ_WE_TM_OO_OC6_AT78_LEO_BQ_Q_AERODROMAS_KRETINGOJE_OQ_AERODROMAS_KRETINGOJE_GS_L_PSY_AB_3_16595_18173_0_18307_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_5_ZFMEU9_NYO_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&ei=9yz-WeTmOoOC6AT78LeoBQ&q=Aerodromas+Kretingoje&oq=Aerodromas+Kretingoje&gs_l=psy-ab.3...16595.18173.0.18307.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.-5ZFMEU9Nyo&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String KARTENOS_AERODROMAS = "Kartenos aerodromas";
    private MediaPlayer mMediaPlayer;
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
        mMediaPlayer = MediaPlayer.create(kparachute.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kparachute);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = KARTENOS_AERODROMAS;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "+370 445 47 441";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_9YZ_WE_TM_OO_OC6_AT78_LEO_BQ_Q_AERODROMAS_KRETINGOJE_OQ_AERODROMAS_KRETINGOJE_GS_L_PSY_AB_3_16595_18173_0_18307_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_5_ZFMEU9_NYO_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
