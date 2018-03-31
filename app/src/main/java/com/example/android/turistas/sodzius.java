package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class sodzius extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_PVZ8_WF_DHGIM1ADE_BR_YAL_Q_SOD_C5_BEIUS_C5_A0IAULIUOSE_OQ_SOD_C5_BEIUS_C5_A0IAULIUOSE_GS_L_PSY_AB_3_19256_22024_0_22585_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_WHV_WC_I7G_QVC_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=Pvz8WfDHGIm1adeBrYAL&q=Sod%C5%BEius++%C5%A0iauliuose&oq=Sod%C5%BEius++%C5%A0iauliuose&gs_l=psy-ab.3...19256.22024.0.22585.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.WHvWcI7gQVc&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String STOTIES_G_3_ŠIAULIAI_77156 = "Stoties g. 3, Šiauliai 77156";
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
        mMediaPlayer = MediaPlayer.create(sodzius.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sodzius);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = STOTIES_G_3_ŠIAULIAI_77156;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-41) 431867";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_PVZ8_WF_DHGIM1ADE_BR_YAL_Q_SOD_C5_BEIUS_C5_A0IAULIUOSE_OQ_SOD_C5_BEIUS_C5_A0IAULIUOSE_GS_L_PSY_AB_3_19256_22024_0_22585_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_WHV_WC_I7G_QVC_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
