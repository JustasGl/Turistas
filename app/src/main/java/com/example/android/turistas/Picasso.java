package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Picasso extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_PJ8_WC_DB_G4_KVAR_KYQT_AI_Q_PICASSO_MA_C5_BEEIKIUOSE_OQ_PICASSO_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_12_27014_28695_0_29425_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_6O1_LVQF_G_B8_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=-Pj8WcDbG4KvarKyqtAI&q=Picasso+Ma%C5%BEeikiuose&oq=Picasso+Ma%C5%BEeikiuose&gs_l=psy-ab.12...27014.28695.0.29425.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.6o1LVQfG_B8&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String LAISVĖS_G_26_MAŽEIKIAI_89223 = "Laisvės g. 26, Mažeikiai 89223";
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
        mMediaPlayer = MediaPlayer.create(Picasso.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = LAISVĖS_G_26_MAŽEIKIAI_89223;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-443) 27335";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_PJ8_WC_DB_G4_KVAR_KYQT_AI_Q_PICASSO_MA_C5_BEEIKIUOSE_OQ_PICASSO_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_12_27014_28695_0_29425_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_6O1_LVQF_G_B8_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });

    }
}
