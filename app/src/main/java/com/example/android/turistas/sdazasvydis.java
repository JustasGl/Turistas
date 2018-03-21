package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class sdazasvydis extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_4IN_WYQG_HMA_L6_ATP5_I6_QCW_Q_DA_C5_BEASVYDIS_C5_A0IAULIUOSE_OQ_DA_C5_BEASVYDIS_C5_A0IAULIUOSE_GS_L_PSY_AB_3_11357_14377_0_14820_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_ADG_TPR_RT_TWI_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&ei=4in-WYqgHMaL6ATp5I6QCw&q=Da%C5%BEasvydis+%C5%A0iauliuose&oq=Da%C5%BEasvydis+%C5%A0iauliuose&gs_l=psy-ab.3...11357.14377.0.14820.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.adgTprRtTWI&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String VILNIAUS_G_72_A_ŠIAULIAI_76357 = "Vilniaus g. 72A, Šiauliai 76357";
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
        mMediaPlayer = MediaPlayer.create(sdazasvydis.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdazasvydis);

        ImageView adress = (ImageView)findViewById(R.id.adreso);
        ImageView tel = (ImageView)findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String str_location = VILNIAUS_G_72_A_ŠIAULIAI_76357;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String phone = "(8-606) 39838";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView)findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_4IN_WYQG_HMA_L6_ATP5_I6_QCW_Q_DA_C5_BEASVYDIS_C5_A0IAULIUOSE_OQ_DA_C5_BEASVYDIS_C5_A0IAULIUOSE_GS_L_PSY_AB_3_11357_14377_0_14820_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_ADG_TPR_RT_TWI_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });

    }
}
