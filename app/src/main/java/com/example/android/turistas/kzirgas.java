package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class kzirgas extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_CY3_WAV5_GE_TI6_ASOW66_IBQ_Q_C5_BDIRGYNAS_KRETINGOJE_OQ_C5_BDIRGYNAS_KRETINGOJE_GS_L_PSY_AB_3_6538_7652_0_7842_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_K0_VDO1_ADWD4_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&ei=Cy3-Wav5GeTi6ASOw66IBQ&q=%C5%BDirgynas+Kretingoje&oq=%C5%BDirgynas+Kretingoje&gs_l=psy-ab.3...6538.7652.0.7842.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.K0VDO1ADwd4&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String ŽIBININKŲ_K_KRETINGOS_RAJ = "Žibininkų k., Kretingos raj.";
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
        mMediaPlayer = MediaPlayer.create(kzirgas.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kzirgas);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = ŽIBININKŲ_K_KRETINGOS_RAJ;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "+370 690 40538.";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_CY3_WAV5_GE_TI6_ASOW66_IBQ_Q_C5_BDIRGYNAS_KRETINGOJE_OQ_C5_BDIRGYNAS_KRETINGOJE_GS_L_PSY_AB_3_6538_7652_0_7842_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_K0_VDO1_ADWD4_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
