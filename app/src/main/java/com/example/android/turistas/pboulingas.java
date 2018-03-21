package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class pboulingas extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_AYZ_WC_LJ_M4I_C6_ATUI_KNG_CW_Q_BOULINGAS_PLUNG_C4_97JE_OQ_BOULINGAS_PLUNG_C4_97JE_GS_L_PSY_AB_3_11791_14597_0_14793_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_H_HA_UW_Y4NW_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&ei=ayz-WcLjM4iC6ATUiKngCw&q=Boulingas+Plung%C4%97je&oq=Boulingas+Plung%C4%97je&gs_l=psy-ab.3...11791.14597.0.14793.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.hHaUW__y4nw&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String PRAMOGŲ_G_2_TRUIKIAI_VLG_S_RAJ_PLUNGĖ_PLUNGĖ_90110 = "Pramogų g. 2 Truikiai Vlg. s raj. Plungė, Plungė 90110";
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
        mMediaPlayer = MediaPlayer.create(pboulingas.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pboulingas);

        ImageView adress = (ImageView)findViewById(R.id.adreso);
        ImageView tel = (ImageView)findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = PRAMOGŲ_G_2_TRUIKIAI_VLG_S_RAJ_PLUNGĖ_PLUNGĖ_90110;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-611) 50200";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView)findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_AYZ_WC_LJ_M4I_C6_ATUI_KNG_CW_Q_BOULINGAS_PLUNG_C4_97JE_OQ_BOULINGAS_PLUNG_C4_97JE_GS_L_PSY_AB_3_11791_14597_0_14793_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_H_HA_UW_Y4NW_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
