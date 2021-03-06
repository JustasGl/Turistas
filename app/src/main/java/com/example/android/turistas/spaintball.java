package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class spaintball extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_SI3_WYDVM8JG6_ASMPAN_IBA_Q_DA_C5_BEASVYDIS_SKUODE_OQ_DA_C5_BEASVYDIS_SKUODE_GS_L_PSY_AB_3_6182_10179_0_10324_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_Z_BNL_OFS_G58O_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&ei=Si3-WYDVM8jg6ASmpanIBA&q=Da%C5%BEasvydis+Skuode&oq=Da%C5%BEasvydis+Skuode&gs_l=psy-ab.3...6182.10179.0.10324.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.zBnlOFsG58o&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String ADRESAS_NENURODYTAS = "Adresas nenurodytas";
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
        mMediaPlayer = MediaPlayer.create(spaintball.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spaintball);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                Toast.makeText(spaintball.this, ADRESAS_NENURODYTAS, Toast.LENGTH_SHORT).show();
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "8 6762 26302";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_SI3_WYDVM8JG6_ASMPAN_IBA_Q_DA_C5_BEASVYDIS_SKUODE_OQ_DA_C5_BEASVYDIS_SKUODE_GS_L_PSY_AB_3_6182_10179_0_10324_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_Z_BNL_OFS_G58O_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
