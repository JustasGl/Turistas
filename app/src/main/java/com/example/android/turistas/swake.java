package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class swake extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_1YN_WDUW_BA_XB6_QSY_K6_ADW_Q_WAKE_PARKAI_C5_A0IAULIUOSE_OQ_WAKE_PARKAI_C5_A0IAULIUOSE_GS_L_PSY_AB_3_7485_9534_0_9751_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_1_IAXK_BO_O1U_Y_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&ei=1yn-WduwBaXb6QSy_K6ADw&q=Wake+parkai+%C5%A0iauliuose&oq=Wake+parkai+%C5%A0iauliuose&gs_l=psy-ab.3...7485.9534.0.9751.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.1IAXkBoO1uY&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String N_23_16_50_7_E = "55°47'14.8\"N 23°16'50.7\"E";
    public static final String N_23_19_46_1_E = "55°55'48.3\"N 23°19'46.1\"E";
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
        mMediaPlayer = MediaPlayer.create(swake.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swake);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = N_23_19_46_1_E;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "+37060680133";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });

        ImageView adress1 = (ImageView) findViewById(R.id.adreso1);
        ImageView tel1 = (ImageView) findViewById(R.id.telefono1);
        adress1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = N_23_16_50_7_E;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "+37069171717";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_1YN_WDUW_BA_XB6_QSY_K6_ADW_Q_WAKE_PARKAI_C5_A0IAULIUOSE_OQ_WAKE_PARKAI_C5_A0IAULIUOSE_GS_L_PSY_AB_3_7485_9534_0_9751_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_1_IAXK_BO_O1U_Y_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
