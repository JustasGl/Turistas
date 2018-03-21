package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Charlie extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_IFN8_WF7Q_DILCA8N_PL9G_J_Q_CHARLIE_MA_C5_BEEIKIUOSE_OQ_CHARLIE_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_12_24561_24561_0_25787_0_0_0_0_0_0_0_0_0_0_0_1_64_PSY_AB_0_0_0_0_S_L_VTHH_I_3_I_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=Ifn8Wf7qDILca8nPl9gJ&q=Charlie+Ma%C5%BEeikiuose&oq=Charlie+Ma%C5%BEeikiuose&gs_l=psy-ab.12...24561.24561.0.25787.0.0.0.0.0.0.0.0..0.0....0...1..64.psy-ab..0.0.0....0.s_lVThhI-3I&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String LAISVĖS_G_56_MAŽEIKIAI_89223 = "Laisvės g. 56, Mažeikiai 89223";
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
        mMediaPlayer = MediaPlayer.create(Charlie.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charlie);

        ImageView adress = (ImageView)findViewById(R.id.adreso);
        ImageView tel = (ImageView)findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String str_location = LAISVĖS_G_56_MAŽEIKIAI_89223;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String phone = "(8-610) 01809";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView)findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_IFN8_WF7Q_DILCA8N_PL9G_J_Q_CHARLIE_MA_C5_BEEIKIUOSE_OQ_CHARLIE_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_12_24561_24561_0_25787_0_0_0_0_0_0_0_0_0_0_0_1_64_PSY_AB_0_0_0_0_S_L_VTHH_I_3_I_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });

    }
}
