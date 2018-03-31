package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class paintball extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_EI_WB9_WB_E_ESQPA5_XWITG_K_Q_DA_C5_BEASVYDIS_MA_C5_BEEIKIUOSE_OQ_DA_C5_BEASVYDIS_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_3_17401_20012_0_20306_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_Z_WB4_Q_Q3BG_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&ei=-wb9Wb_eEsqpa5XWitgK&q=Da%C5%BEasvydis+Ma%C5%BEeikiuose&oq=Da%C5%BEasvydis+Ma%C5%BEeikiuose&gs_l=psy-ab.3...17401.20012.0.20306.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.z-Wb4-qQ3bg&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
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
        mMediaPlayer = MediaPlayer.create(paintball.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paintball);

        ImageView tel = (ImageView) findViewById(R.id.telefono);
        ImageView tel1 = (ImageView) findViewById(R.id.telefono1);
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "+370 693 90205";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        tel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "+370 612 38661";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_EI_WB9_WB_E_ESQPA5_XWITG_K_Q_DA_C5_BEASVYDIS_MA_C5_BEEIKIUOSE_OQ_DA_C5_BEASVYDIS_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_3_17401_20012_0_20306_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_Z_WB4_Q_Q3BG_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
