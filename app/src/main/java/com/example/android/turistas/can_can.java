package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class can_can extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_3VZ8_WYSEI4R9A_YTIL9G_H_Q_CAN_CAN_C5_A0IAULIUOSE_OQ_CAN_CAN_C5_A0IAULIUOSE_GS_L_PSY_AB_3_11096_12494_0_12883_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_J_OS97_ASNI0_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=3vz8WYSEI4r9aYTIl9gH&q=Can+can+%C5%A0iauliuose&oq=Can+can+%C5%A0iauliuose&gs_l=psy-ab.3...11096.12494.0.12883.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.J_os97Asni0&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String AIDO_G_8_ŠIAULIAI_78322 = "Aido g. 8, Šiauliai 78322";
    public static final String TILŽĖS_G_225_ŠIAULIAI_76200 = "Tilžės g. 225, Šiauliai 76200";
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
        mMediaPlayer = MediaPlayer.create(can_can.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_can_can);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str_location = TILŽĖS_G_225_ŠIAULIAI_76200;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "(8-659) 78570";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });

        ImageView adress2 = (ImageView) findViewById(R.id.adreso2);
        ImageView tel2 = (ImageView) findViewById(R.id.telefono2);
        adress2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str_location = AIDO_G_8_ŠIAULIAI_78322;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "(8-659) 04150";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_3VZ8_WYSEI4R9A_YTIL9G_H_Q_CAN_CAN_C5_A0IAULIUOSE_OQ_CAN_CAN_C5_A0IAULIUOSE_GS_L_PSY_AB_3_11096_12494_0_12883_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_J_OS97_ASNI0_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
