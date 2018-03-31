package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class my_thai extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_UVZ8_WA_LQ_OITXA_LE_JRT_AF_Q_MY_THAI_C5_A0IAULIUOSE_OQ_MY_THAI_C5_A0IAULIUOSE_GS_L_PSY_AB_3_24688_33722_0_33816_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_CY_KIOW_TO_VZ_Q_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=uvz8WaLqOITxaLeJrtAF&q=My+Thai+%C5%A0iauliuose&oq=My+Thai+%C5%A0iauliuose&gs_l=psy-ab.3...24688.33722.0.33816.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.cyKIOwToVzQ&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String P_VIŠINSKIO_G_41_ŠIAULIAI_76351 = "P. Višinskio g. 41, Šiauliai 76351";
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
        mMediaPlayer = MediaPlayer.create(my_thai.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_thai);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = P_VIŠINSKIO_G_41_ŠIAULIAI_76351;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-600) 03056";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_UVZ8_WA_LQ_OITXA_LE_JRT_AF_Q_MY_THAI_C5_A0IAULIUOSE_OQ_MY_THAI_C5_A0IAULIUOSE_GS_L_PSY_AB_3_24688_33722_0_33816_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_CY_KIOW_TO_VZ_Q_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });

    }
}
