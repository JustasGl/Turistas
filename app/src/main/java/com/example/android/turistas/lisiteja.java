package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class lisiteja extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_CVV8_WEU_ON8BDA5U_TH5G_F_Q_LISIT_C4_97JA_TEL_C5_A1IUOSE_OQ_LISIT_C4_97JA_TEL_C5_A1IUOSE_GS_L_PSY_AB_3_4585_5968_0_6278_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_X5JWUL_VHV_GY_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=Cvv8WeuON8bda5uTh5gF&q=Lisit%C4%97ja+Tel%C5%A1iuose&oq=Lisit%C4%97ja+Tel%C5%A1iuose&gs_l=psy-ab.3...4585.5968.0.6278.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.X5jwulVHvGY&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String PLUNGĖS_G_14_TELŠIAI_87317 = "Plungės g. 14, Telšiai 87317";
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
        mMediaPlayer = MediaPlayer.create(lisiteja.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lisiteja);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = PLUNGĖS_G_14_TELŠIAI_87317;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-443) 60159";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_CVV8_WEU_ON8BDA5U_TH5G_F_Q_LISIT_C4_97JA_TEL_C5_A1IUOSE_OQ_LISIT_C4_97JA_TEL_C5_A1IUOSE_GS_L_PSY_AB_3_4585_5968_0_6278_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_X5JWUL_VHV_GY_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });

    }
}
