package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class kpaintball extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_QYZ_WC28_LMM_C6_QTVK7I_QDQ_Q_DA_C5_BEASVYDIS_KRETINGOJE_OQ_DA_C5_BEASVYDIS_KRETINGOJE_GS_L_PSY_AB_3_63858_70579_0_72703_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_UP20_OXV_CHAU_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&ei=qyz-Wc28LMmC6QTvk7iQDQ&q=Da%C5%BEasvydis+Kretingoje&oq=Da%C5%BEasvydis+Kretingoje&gs_l=psy-ab.3...63858.70579.0.72703.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.up20OXvCHAU&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String MĖGUVOS_G_3_KRETINGA = "Mėguvos g. 3, Kretinga";
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
        mMediaPlayer = MediaPlayer.create(kpaintball.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kpaintball);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = MĖGUVOS_G_3_KRETINGA;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-644) 00072";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_QYZ_WC28_LMM_C6_QTVK7I_QDQ_Q_DA_C5_BEASVYDIS_KRETINGOJE_OQ_DA_C5_BEASVYDIS_KRETINGOJE_GS_L_PSY_AB_3_63858_70579_0_72703_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_UP20_OXV_CHAU_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
