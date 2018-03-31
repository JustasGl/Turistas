package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class saukstelis extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_WP38_WZ_ZLYWLA4Q5HVG_D_Q_C5_A0AUK_C5_A1TELIO_STUDIJA_TAURAG_C4_97JE_OQ_C5_A0AUK_C5_A1TELIO_STUDIJA_TAURAG_C4_97JE_GS_L_PSY_AB_12_7841_7841_0_9713_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_ZA_EQEJYYB_PQ_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=WP38WZ-ZLYWla4q5hvgD&q=%C5%A0auk%C5%A1telio+studija+Taurag%C4%97je&oq=%C5%A0auk%C5%A1telio+studija+Taurag%C4%97je&gs_l=psy-ab.12...7841.7841.0.9713.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.zaEQEjyybPQ&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String DARIAUS_IR_GIRĖNO_G_26_TAURAGĖ_72250 = "Dariaus ir Girėno g. 26, Tauragė 72250";
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
        mMediaPlayer = MediaPlayer.create(saukstelis.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saukstelis);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = DARIAUS_IR_GIRĖNO_G_26_TAURAGĖ_72250;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-609) 99887";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_WP38_WZ_ZLYWLA4Q5HVG_D_Q_C5_A0AUK_C5_A1TELIO_STUDIJA_TAURAG_C4_97JE_OQ_C5_A0AUK_C5_A1TELIO_STUDIJA_TAURAG_C4_97JE_GS_L_PSY_AB_12_7841_7841_0_9713_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_ZA_EQEJYYB_PQ_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });

    }
}
