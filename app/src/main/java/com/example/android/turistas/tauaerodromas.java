package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class tauaerodromas extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_BIW_958_BIH_954_EI_5_CR_WZ3B_NOYB6_AS40A_SW_AG_Q_AERODROMAS_TAURAG_C4_97JE_OQ_AERODROMAS_TAURAG_C4_97JE_GS_L_PSY_AB_3_7061_10504_0_10671_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_FD_UNN_D4D_SX_A_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&biw=958&bih=954&ei=5Cr-WZ3bNoyb6AS40aSwAg&q=Aerodromas+Taurag%C4%97je&oq=Aerodromas+Taurag%C4%97je&gs_l=psy-ab.3...7061.10504.0.10671.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.fdUNnD4dSxA&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
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
        mMediaPlayer = MediaPlayer.create(tauaerodromas.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tauaerodromas);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = "72127";
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-698) 39524";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_BIW_958_BIH_954_EI_5_CR_WZ3B_NOYB6_AS40A_SW_AG_Q_AERODROMAS_TAURAG_C4_97JE_OQ_AERODROMAS_TAURAG_C4_97JE_GS_L_PSY_AB_3_7061_10504_0_10671_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_FD_UNN_D4D_SX_A_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
