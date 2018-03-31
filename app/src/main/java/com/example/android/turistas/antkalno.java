package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class antkalno extends AppCompatActivity {

    public static final String TEL = "tel";
    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_Q_ANT_KALNO_TEL_C5_A1IUOSE_SPELL_1_SA_X_VED_0AH_UKEWICZD_PSXQ_PXAH_VGU_RO_KHRV_MBQ_IQBQGJ_KAA_BIW_1920_BIH_971_GFE_RD_CR_DCR_0_EI_1_R8_WDQY_EIQ_AT_AH_Z_KDYDA = "https://www.google.com/search?client=firefox-b&q=Ant+kalno+Tel%C5%A1iuose&spell=1&sa=X&ved=0ahUKEwiczdPSxqPXAhVGuRoKHRvMBqIQBQgjKAA&biw=1920&bih=971&gfe_rd=cr&dcr=0&ei=1_r8WdqyEIqAtAH_zKDYDA";
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
        mMediaPlayer = MediaPlayer.create(antkalno.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antkalno);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = getApplicationContext().getString(R.string.AntKalnoAddres);
                String map = getApplicationContext().getString(R.string.mapsLink) + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = getApplicationContext().getString(R.string.AntKalnoJavaTelnr);
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_Q_ANT_KALNO_TEL_C5_A1IUOSE_SPELL_1_SA_X_VED_0AH_UKEWICZD_PSXQ_PXAH_VGU_RO_KHRV_MBQ_IQBQGJ_KAA_BIW_1920_BIH_971_GFE_RD_CR_DCR_0_EI_1_R8_WDQY_EIQ_AT_AH_Z_KDYDA;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
