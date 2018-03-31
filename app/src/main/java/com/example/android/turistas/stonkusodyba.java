package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class stonkusodyba extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_F_P78_WD_CQJYKUA8EHV_ZG_J_Q_STONK_C5_B3_SODYBA_PLUNG_C4_97JE_OQ_STONK_C5_B3_SODYBA_PLUNG_C4_97JE_GS_L_PSY_AB_3_12075_25645_0_25915_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_OVJ_WO_CSE9_Y_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=fP78WdCQJYKua8ehvZgJ&q=Stonk%C5%B3+sodyba+Plung%C4%97je&oq=Stonk%C5%B3+sodyba+Plung%C4%97je&gs_l=psy-ab.3...12075.25645.0.25915.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.OvjWO_CSe9Y&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String SODŽIAUS_G_36_MACENIŲ_K_90100 = "Sodžiaus g. 36, Macenių k. 90100";
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
        mMediaPlayer = MediaPlayer.create(stonkusodyba.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stonkusodyba);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = SODŽIAUS_G_36_MACENIŲ_K_90100;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-621) 36905";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_F_P78_WD_CQJYKUA8EHV_ZG_J_Q_STONK_C5_B3_SODYBA_PLUNG_C4_97JE_OQ_STONK_C5_B3_SODYBA_PLUNG_C4_97JE_GS_L_PSY_AB_3_12075_25645_0_25915_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_OVJ_WO_CSE9_Y_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
