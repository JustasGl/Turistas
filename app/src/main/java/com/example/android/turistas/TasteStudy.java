package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class TasteStudy extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_D_Z8_WC_5_ICJXAS_LQRE_AC_Q_SKONIO_STUDIJA_E2_80_9_E2_MENIU_E2_80_9_C_C5_A0IAULIUOSE_OQ_SKONIO_STUDIJA_E2_80_9_E2_MENIU_E2_80_9_C_C5_A0IAULIUOSE_GS_L_PSY_AB_12_0_0_1_9_0_0_0_0_0_0_0_0_0_0_0_1_64_PSY_AB_0_0_0_0_ADIXX_WME_ZE_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=D_z8Wc_5IcjxasLQreAC&q=Skonio+studija+%E2%80%9E2+meniu%E2%80%9C++%C5%A0iauliuose&oq=Skonio+studija+%E2%80%9E2+meniu%E2%80%9C++%C5%A0iauliuose&gs_l=psy-ab.12...0.0.1.9.0.0.0.0.0.0.0.0..0.0....0...1..64.psy-ab..0.0.0....0._ADIXxWmeZE&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String AUŠROS_AL_52_ŠIAULIAI_76235 = "Aušros al. 52, Šiauliai 76235";
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
        mMediaPlayer = MediaPlayer.create(TasteStudy.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taste_study);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = AUŠROS_AL_52_ŠIAULIAI_76235;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-679) 78076";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_D_Z8_WC_5_ICJXAS_LQRE_AC_Q_SKONIO_STUDIJA_E2_80_9_E2_MENIU_E2_80_9_C_C5_A0IAULIUOSE_OQ_SKONIO_STUDIJA_E2_80_9_E2_MENIU_E2_80_9_C_C5_A0IAULIUOSE_GS_L_PSY_AB_12_0_0_1_9_0_0_0_0_0_0_0_0_0_0_0_1_64_PSY_AB_0_0_0_0_ADIXX_WME_ZE_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
