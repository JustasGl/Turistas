package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class tautenis extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_BIW_958_BIH_954_EI_8_CR_WF_GRIMJ_X6_ATHR_L3_IDA_Q_TENISAS_TAURAG_C4_97JE_OQ_TENISAS_TAURAG_C4_97JE_GS_L_PSY_AB_3_10446_12376_0_12579_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_4_CVU_MAUXE0_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&biw=958&bih=954&ei=8Cr-WfGRIMjX6ATHrL3IDA&q=Tenisas+Taurag%C4%97je&oq=Tenisas+Taurag%C4%97je&gs_l=psy-ab.3...10446.12376.0.12579.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.4CVU_MAUxe0&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String ŠVYTURIO_G_4_A_TAURAGĖ_72361 = "Švyturio g. 4A, Tauragė 72361";
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
        mMediaPlayer = MediaPlayer.create(tautenis.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tautenis);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = ŠVYTURIO_G_4_A_TAURAGĖ_72361;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-699) 61033";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_BIW_958_BIH_954_EI_8_CR_WF_GRIMJ_X6_ATHR_L3_IDA_Q_TENISAS_TAURAG_C4_97JE_OQ_TENISAS_TAURAG_C4_97JE_GS_L_PSY_AB_3_10446_12376_0_12579_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_4_CVU_MAUXE0_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
