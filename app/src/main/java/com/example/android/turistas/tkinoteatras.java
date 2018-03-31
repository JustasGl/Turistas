package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class tkinoteatras extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_UCJ_WDI7_HSJ_J6_ASTSOR_YBW_Q_KINO_TEATRAS_TEL_C5_A1IUOSE_OQ_KINO_TEATRAS_TEL_C5_A1IUOSE_GS_L_PSY_AB_3_2649_2755_0_3547_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_H_V9_JL_IU51G_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&ei=UCj-Wdi7HsjJ6AStsorYBw&q=Kino+teatras+Tel%C5%A1iuose&oq=Kino+teatras+Tel%C5%A1iuose&gs_l=psy-ab.3...2649.2755.0.3547.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.hV9_jlIU51g&gfe_rd=cr&dcr=0";
    public static final String NUMERIS_NEPATEIKTAS = "Numeris nepateiktas";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String SEDOS_G_29_TELŠIAI = "Sedos g. 29 Telšiai";
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
        mMediaPlayer = MediaPlayer.create(tkinoteatras.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tkinoteatras);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = SEDOS_G_29_TELŠIAI;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                Toast.makeText(tkinoteatras.this, NUMERIS_NEPATEIKTAS, Toast.LENGTH_SHORT).show();
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_UCJ_WDI7_HSJ_J6_ASTSOR_YBW_Q_KINO_TEATRAS_TEL_C5_A1IUOSE_OQ_KINO_TEATRAS_TEL_C5_A1IUOSE_GS_L_PSY_AB_3_2649_2755_0_3547_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_H_V9_JL_IU51G_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });

    }
}
