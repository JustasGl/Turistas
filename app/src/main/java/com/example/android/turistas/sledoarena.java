package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class sledoarena extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_9_SN_WYPKDMEP6_ATT0QY4_CQ_Q_LEDO_ARENA_C5_A0IAULIUOSE_OQ_LEDO_ARENA_C5_A0IAULIUOSE_GS_L_PSY_AB_3_8261_10098_0_10244_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_B_ERUVJ_O2V_GU_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&ei=9Sn-WYPKDMep6ATt0qy4CQ&q=Ledo+arena+%C5%A0iauliuose&oq=Ledo+arena+%C5%A0iauliuose&gs_l=psy-ab.3...8261.10098.0.10244.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.bEruvjO2vGU&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String AKROPOLIS_ŠIAULIAI = "Akropolis Šiauliai";
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
        mMediaPlayer = MediaPlayer.create(sledoarena.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sledoarena);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = AKROPOLIS_ŠIAULIAI;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "8 659 43 911";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_9_SN_WYPKDMEP6_ATT0QY4_CQ_Q_LEDO_ARENA_C5_A0IAULIUOSE_OQ_LEDO_ARENA_C5_A0IAULIUOSE_GS_L_PSY_AB_3_8261_10098_0_10244_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_B_ERUVJ_O2V_GU_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });

    }
}
