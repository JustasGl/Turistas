package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class tboulingas extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_HCJ_WDYZ_OS_PI6_ATT9_I7G_DW_Q_BOULINGAS_TEL_C5_A1IUOSE_OQ_BOULINGAS_TEL_C5_A1IUOSE_GS_L_PSY_AB_3_11786_13345_0_13494_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_D_PI_BD_P5Z5_M_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&ei=HCj-WdyzOsPI6ATT9I7gDw&q=Boulingas+Tel%C5%A1iuose&oq=Boulingas+Tel%C5%A1iuose&gs_l=psy-ab.3...11786.13345.0.13494.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.dPiBd_P5z5M&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String ŠVIESOS_G_19_TELŠIAI = "Šviesos g. 19, Telšiai";
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
        mMediaPlayer = MediaPlayer.create(tboulingas.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tboulingas);

        ImageView adress = (ImageView)findViewById(R.id.adreso);
        ImageView tel = (ImageView)findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String str_location = ŠVIESOS_G_19_TELŠIAI;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String phone = "(8 641) 28507";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView)findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_HCJ_WDYZ_OS_PI6_ATT9_I7G_DW_Q_BOULINGAS_TEL_C5_A1IUOSE_OQ_BOULINGAS_TEL_C5_A1IUOSE_GS_L_PSY_AB_3_11786_13345_0_13494_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_D_PI_BD_P5Z5_M_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
