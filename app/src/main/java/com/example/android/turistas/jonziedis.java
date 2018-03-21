package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class jonziedis extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_BFV8_WAI_WEOY_VA_NXIJ_IG_E_Q_JON_C5_BEIEDIS_TEL_C5_A1IUOSE_OQ_JON_C5_BEIEDIS_TEL_C5_A1IUOSE_GS_L_PSY_AB_3_740_1370_0_1915_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_UALBB351_OP8_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=Bfv8WaiWEoyVaNXIjIgE&q=Jon%C5%BEiedis+Tel%C5%A1iuose&oq=Jon%C5%BEiedis+Tel%C5%A1iuose&gs_l=psy-ab.3...740.1370.0.1915.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.ualbb351Op8&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String PRAMONĖS_G_19_TELŠIAI_87101 = "Pramonės g. 19, Telšiai 87101";
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
        mMediaPlayer = MediaPlayer.create(jonziedis.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jonziedis);

        ImageView adress = (ImageView)findViewById(R.id.adreso);
        ImageView tel = (ImageView)findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = PRAMONĖS_G_19_TELŠIAI_87101;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                skamb();
                String phone = "(8-615) 56562";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView)findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_BFV8_WAI_WEOY_VA_NXIJ_IG_E_Q_JON_C5_BEIEDIS_TEL_C5_A1IUOSE_OQ_JON_C5_BEIEDIS_TEL_C5_A1IUOSE_GS_L_PSY_AB_3_740_1370_0_1915_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_UALBB351_OP8_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
