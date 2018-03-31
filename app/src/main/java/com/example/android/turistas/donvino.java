package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class donvino extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_KFZ8_WF6P_PMNBAP6_KU_AD_Q_DON_VINO_C5_A0IAULIUOSE_OQ_DON_VINO_C5_A0IAULIUOSE_GS_L_PSY_AB_3_15430_16988_0_17310_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_3K_DFHV_ME3_AS_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=kfz8Wf6pPMnbap6-kuAD&q=Don+Vino+%C5%A0iauliuose&oq=Don+Vino+%C5%A0iauliuose&gs_l=psy-ab.3...15430.16988.0.17310.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.3kDfhvMe3As&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String GARDINO_G_2_ŠIAULIAI_78230 = "Gardino g. 2, Šiauliai 78230";
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
        mMediaPlayer = MediaPlayer.create(donvino.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donvino);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = GARDINO_G_2_ŠIAULIAI_78230;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-620) 33657";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_KFZ8_WF6P_PMNBAP6_KU_AD_Q_DON_VINO_C5_A0IAULIUOSE_OQ_DON_VINO_C5_A0IAULIUOSE_GS_L_PSY_AB_3_15430_16988_0_17310_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_3K_DFHV_ME3_AS_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
