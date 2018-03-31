package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class parachute extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_DWF9_WF_CP_FS_STAOE_EO_AO_Q_AERODROMAS_MA_C5_BEEIKIUOSE_OQ_AERODROMAS_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_3_33568_35373_0_35547_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_ENJ_J6_GGW8K_Q_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=dwf9WfCpFsSTaoeEo_AO&q=Aerodromas+Ma%C5%BEeikiuose&oq=Aerodromas+Ma%C5%BEeikiuose&gs_l=psy-ab.3...33568.35373.0.35547.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.enjJ6Ggw8kQ&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String VIEŠETĖS_G_13_ŠERKŠNĖNAI_89366 = "Viešetės g. 13, Šerkšnėnai 89366";
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
        mMediaPlayer = MediaPlayer.create(parachute.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parachute);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        ImageView tel1 = (ImageView) findViewById(R.id.telefono1);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = VIEŠETĖS_G_13_ŠERKŠNĖNAI_89366;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "+370 614 74 329";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        tel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "+370 686 70 374 ";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_DWF9_WF_CP_FS_STAOE_EO_AO_Q_AERODROMAS_MA_C5_BEEIKIUOSE_OQ_AERODROMAS_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_3_33568_35373_0_35547_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_ENJ_J6_GGW8K_Q_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
