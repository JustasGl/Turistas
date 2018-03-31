package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class elgreco extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_8_P38_WEV_ROS_W2A_J_LK_VA_Q_EL_GRECO_TAURAG_C4_97JE_OQ_EL_GRECO_TAURAG_C4_97JE_GS_L_PSY_AB_3_0I71K1L3_14181_14205_0_14253_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_RMO_XS_ZIJ_YN0_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=8P38WevROsW2a-jLkVA&q=El+Greco+Taurag%C4%97je&oq=El+Greco+Taurag%C4%97je&gs_l=psy-ab.3..0i71k1l3.14181.14205.0.14253.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.RmoXsZIjYN0&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String DARIAUS_IR_GIRĖNO_G_18_TAURAGĖ_72252 = "Dariaus ir Girėno g. 18, Tauragė 72252";
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
        mMediaPlayer = MediaPlayer.create(elgreco.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elgreco);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = DARIAUS_IR_GIRĖNO_G_18_TAURAGĖ_72252;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-630) 79424";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_8_P38_WEV_ROS_W2A_J_LK_VA_Q_EL_GRECO_TAURAG_C4_97JE_OQ_EL_GRECO_TAURAG_C4_97JE_GS_L_PSY_AB_3_0I71K1L3_14181_14205_0_14253_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_RMO_XS_ZIJ_YN0_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });

    }
}
