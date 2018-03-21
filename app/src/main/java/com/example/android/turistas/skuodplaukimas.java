package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class skuodplaukimas extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_YI3_WYU9_DO_OP6_ASJ5BQG_BA_Q_BASEINAI_SKUODE_OQ_BASEINAI_SKUODE_GS_L_PSY_AB_3_7164_9137_0_9781_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_9M5T_RM_KV1_VY_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&ei=Yi3-WYu9DoOp6ASj5bqgBA&q=Baseinai+Skuode&oq=Baseinai+Skuode&gs_l=psy-ab.3...7164.9137.0.9781.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.9m5tRmKv1VY&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String P_CVIRKOS_G_6A_SKUODAS = "P. Cvirkos g. 6a, Skuodas";
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
        mMediaPlayer = MediaPlayer.create(skuodplaukimas.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skuodplaukimas);

        ImageView adress = (ImageView)findViewById(R.id.adreso);
        ImageView tel = (ImageView)findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = P_CVIRKOS_G_6A_SKUODAS;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8 440) 78 018";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView)findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_YI3_WYU9_DO_OP6_ASJ5BQG_BA_Q_BASEINAI_SKUODE_OQ_BASEINAI_SKUODE_GS_L_PSY_AB_3_7164_9137_0_9781_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_9M5T_RM_KV1_VY_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}