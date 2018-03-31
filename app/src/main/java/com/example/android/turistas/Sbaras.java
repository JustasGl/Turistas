package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Sbaras extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_P_V8_WDUN_HIP6A_YWGVEG_C_Q_S_BARAS_C5_A0IAULIUOSE_OQ_S_BARAS_C5_A0IAULIUOSE_GS_L_PSY_AB_12_5020_5020_0_6857_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_Y2Y_JU6Y_C18_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=P_v8WdunHIP6aYWGvegC&q=S+Baras+%C5%A0iauliuose&oq=S+Baras+%C5%A0iauliuose&gs_l=psy-ab.12...5020.5020.0.6857.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.y2yJU6y-C18&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String ALEKSANDRIJOS_G_3_ŠIAULIAI_76264 = "Aleksandrijos g. 3, Šiauliai 76264";
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
        mMediaPlayer = MediaPlayer.create(Sbaras.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbaras);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = ALEKSANDRIJOS_G_3_ŠIAULIAI_76264;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-41) 457368";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_P_V8_WDUN_HIP6A_YWGVEG_C_Q_S_BARAS_C5_A0IAULIUOSE_OQ_S_BARAS_C5_A0IAULIUOSE_GS_L_PSY_AB_12_5020_5020_0_6857_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_Y2Y_JU6Y_C18_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });

    }
}
