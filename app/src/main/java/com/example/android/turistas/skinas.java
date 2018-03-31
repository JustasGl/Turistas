package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class skinas extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_BIW_958_BIH_954_EI_FCR_WD6_MEIIY6_ASQY_I2_ACG_Q_KINAS_C5_A0IAULIUOSE_OQ_KINAS_C5_A0IAULIUOSE_GS_L_PSY_AB_3_15632_16441_0_16665_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_YE_X6_L_HLE_YA_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&biw=958&bih=954&ei=FCr-Wd6MEIiy6ASqyI2ACg&q=Kinas+%C5%A0iauliuose&oq=Kinas+%C5%A0iauliuose&gs_l=psy-ab.3...15632.16441.0.16665.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.yeX6_lHLeYA&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String TILŽĖS_G_225_ŠIAULIAI_76200 = "Tilžės g. 225, Šiauliai 76200";
    public static final String AIDO_G_8_ŠIAULIAI_78322 = "Aido g. 8, Šiauliai 78322";
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
        mMediaPlayer = MediaPlayer.create(skinas.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skinas);

        ImageView adress = (ImageView) findViewById(R.id.adreso1);
        ImageView tel = (ImageView) findViewById(R.id.telefono1);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = AIDO_G_8_ŠIAULIAI_78322;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-605) 05952";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });

        ImageView adress1 = (ImageView) findViewById(R.id.adreso);
        ImageView tel1 = (ImageView) findViewById(R.id.telefono);
        adress1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = TILŽĖS_G_225_ŠIAULIAI_76200;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-41) 422923";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_BIW_958_BIH_954_EI_FCR_WD6_MEIIY6_ASQY_I2_ACG_Q_KINAS_C5_A0IAULIUOSE_OQ_KINAS_C5_A0IAULIUOSE_GS_L_PSY_AB_3_15632_16441_0_16665_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_YE_X6_L_HLE_YA_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });

    }
}
