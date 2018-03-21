package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class siauliuarkos extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_FFZ8_WD_5_FS_S6AV_C8L5_AL_Q_ARKOS_C5_A0IAULIUOSE_OQ_ARKOS_C5_A0IAULIUOSE_GS_L_PSY_AB_3_14905_18592_0_19126_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_KPK_OQ_HY9L_A_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=ffz8Wd_5FsS6avC8l5AL&q=Arkos+%C5%A0iauliuose&oq=Arkos+%C5%A0iauliuose&gs_l=psy-ab.3...14905.18592.0.19126.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.Kpk-oqHY9lA&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String VILNIAUS_G_213_ŠIAULIAI_76348 = "Vilniaus g. 213, Šiauliai 76348";
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
        mMediaPlayer = MediaPlayer.create(siauliuarkos.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siauliuarkos);

        ImageView adress = (ImageView)findViewById(R.id.adreso);
        ImageView tel = (ImageView)findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String str_location = VILNIAUS_G_213_ŠIAULIAI_76348;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String phone = "(8-41) 520205";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView)findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_FFZ8_WD_5_FS_S6AV_C8L5_AL_Q_ARKOS_C5_A0IAULIUOSE_OQ_ARKOS_C5_A0IAULIUOSE_GS_L_PSY_AB_3_14905_18592_0_19126_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_KPK_OQ_HY9L_A_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
