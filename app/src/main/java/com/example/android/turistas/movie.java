package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class movie extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_MGJ9_WY6_EPYYRA_ZTCOVG_D_Q_KINO_TEATRAS_MA_C5_BEEIKIUOSE_OQ_KINO_TEATRAS_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_3_14054_19860_0_19921_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_PRF_CCQ_E7_LLG_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=mgj9WY6EPYyraZTcovgD&q=Kino+teatras+Ma%C5%BEeikiuose&oq=Kino+teatras+Ma%C5%BEeikiuose&gs_l=psy-ab.3...14054.19860.0.19921.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.PrfCcqE7LLg&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String PIRMAS_KADRAS_VYDŪNO_GATVĖ_89225_MAŽEIKIAI = "Pirmas Kadras, Vydūno Gatvė, 89225 Mažeikiai";
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
        mMediaPlayer = MediaPlayer.create(movie.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = PIRMAS_KADRAS_VYDŪNO_GATVĖ_89225_MAŽEIKIAI;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "+370 68440411";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_MGJ9_WY6_EPYYRA_ZTCOVG_D_Q_KINO_TEATRAS_MA_C5_BEEIKIUOSE_OQ_KINO_TEATRAS_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_3_14054_19860_0_19921_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_PRF_CCQ_E7_LLG_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
