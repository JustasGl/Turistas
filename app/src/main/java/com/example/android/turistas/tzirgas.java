package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class tzirgas extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_WSJ_WYDD_IUY_C6_ATCTB_MQ_Q_C5_BDIRGYNAS_TEL_C5_A1IUOSE_OQ_C5_BDIRGYNAS_TEL_C5_A1IUOSE_GS_L_PSY_AB_3_3797_5149_0_5322_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_HX_JWRC6_MD_O_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&ei=WSj-WYDdIuyC6ATCtbMQ&q=%C5%BDirgynas+Tel%C5%A1iuose&oq=%C5%BDirgynas+Tel%C5%A1iuose&gs_l=psy-ab.3...3797.5149.0.5322.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.HxJWRc6Md_o&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String KALNĖNAI_BUOŽĖNAI_88438 = "Kalnėnai, Buožėnai 88438";
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
        mMediaPlayer = MediaPlayer.create(tzirgas.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tzirgas);

        ImageView adress = (ImageView)findViewById(R.id.adreso);
        ImageView tel = (ImageView)findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String str_location = KALNĖNAI_BUOŽĖNAI_88438;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String phone = " +370 610 24295";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView)findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_WSJ_WYDD_IUY_C6_ATCTB_MQ_Q_C5_BDIRGYNAS_TEL_C5_A1IUOSE_OQ_C5_BDIRGYNAS_TEL_C5_A1IUOSE_GS_L_PSY_AB_3_3797_5149_0_5322_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_HX_JWRC6_MD_O_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
