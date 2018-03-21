package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class starrpizza extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_ZP38_WEV_ACCY7AU_HJJ_G_F_Q_STAR_PIZZA_TAURAG_C4_97JE_OQ_STAR_PIZZA_TAURAG_C4_97JE_GS_L_PSY_AB_3_109624_111921_0_113912_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_Y19JR6_SI_BD0_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=ZP38WevACcy7auHjj-gF&q=Star+pizza+Taurag%C4%97je&oq=Star+pizza+Taurag%C4%97je&gs_l=psy-ab.3...109624.111921.0.113912.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.y19jr6SiBD0&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String BAŽNYČIŲ_G_20_TAURAGĖ_72253 = "Bažnyčių g. 20, Tauragė 72253";
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
        mMediaPlayer = MediaPlayer.create(starrpizza.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starrpizza);

        ImageView adress = (ImageView)findViewById(R.id.adreso);
        ImageView tel = (ImageView)findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String str_location = BAŽNYČIŲ_G_20_TAURAGĖ_72253;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String phone = "(8-690) 33322";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView)findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_ZP38_WEV_ACCY7AU_HJJ_G_F_Q_STAR_PIZZA_TAURAG_C4_97JE_OQ_STAR_PIZZA_TAURAG_C4_97JE_GS_L_PSY_AB_3_109624_111921_0_113912_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_Y19JR6_SI_BD0_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });

    }
}
