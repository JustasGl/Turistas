package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class pzirgas extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_EYZ_WC_GPM_PW6_ATFI4P_Y_Q_C5_BDIRGYNAS_PLUNG_C4_97JE_OQ_C5_BDIRGYNAS_PLUNG_C4_97JE_GS_L_PSY_AB_3_9706_10902_0_11054_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_G_QW4BT_HYAO_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&ei=eyz-WcGPM-Pw6ATfi4pY&q=%C5%BDirgynas+Plung%C4%97je&oq=%C5%BDirgynas+Plung%C4%97je&gs_l=psy-ab.3...9706.10902.0.11054.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.G_Qw4btHyao&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String KALNIŠKIŲ_K_STALGĖNŲ_SEN_PLUNGĖS_RAJ = "Kalniškių k., Stalgėnų sen., Plungės raj.";
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
        mMediaPlayer = MediaPlayer.create(pzirgas.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pzirgas);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = KALNIŠKIŲ_K_STALGĖNŲ_SEN_PLUNGĖS_RAJ;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "+370 600 79886";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_EYZ_WC_GPM_PW6_ATFI4P_Y_Q_C5_BDIRGYNAS_PLUNG_C4_97JE_OQ_C5_BDIRGYNAS_PLUNG_C4_97JE_GS_L_PSY_AB_3_9706_10902_0_11054_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_G_QW4BT_HYAO_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
