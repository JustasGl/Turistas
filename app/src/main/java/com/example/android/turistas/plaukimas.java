package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class plaukimas extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_ZGJ9_WYM6_LSA_IA_JHNJ_SG_Q_BASEINAI_MA_C5_BEEIKIUOSE_OQ_BASEINAI_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_3_16760_18234_0_18617_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_J_MM_XT_SHYMLG_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=zgj9WYm6LsaIaJHNjSg&q=Baseinai+Ma%C5%BEeikiuose&oq=Baseinai+Ma%C5%BEeikiuose&gs_l=psy-ab.3...16760.18234.0.18617.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.jMmXtSHYmlg&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String PUŠYNO_NAMAI = "Pušyno namai";
    public static final String NAFTININKŲ_G_9_MAŽEIKIAI_89239 = "Naftininkų g. 9, Mažeikiai 89239";
    public static final String PAVENČIŲ_G_15_MAŽEIKIAI_89184 = "Pavenčių g. 15, Mažeikiai 89184";
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
        mMediaPlayer = MediaPlayer.create(plaukimas.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plaukimas);

        ImageView adress = (ImageView)findViewById(R.id.adreso);
        ImageView tel = (ImageView)findViewById(R.id.telefono);

        ImageView adress1 = (ImageView)findViewById(R.id.adreso1);
        ImageView tel1 = (ImageView)findViewById(R.id.telefono1);

        ImageView adress2 = (ImageView)findViewById(R.id.adreso2);
        ImageView tel2 = (ImageView)findViewById(R.id.telefono2);

        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String str_location = PAVENČIŲ_G_15_MAŽEIKIAI_89184;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String phone = "(8-443) 90060";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);

            }
        });
        adress1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String str_location = NAFTININKŲ_G_9_MAŽEIKIAI_89239;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String phone = "(8-607) 86184";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);

            }
        });
        adress2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String str_location = PUŠYNO_NAMAI;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String phone = "+370 615 99 404";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);

            }
        });
        ImageView googlesearch = (ImageView)findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_ZGJ9_WYM6_LSA_IA_JHNJ_SG_Q_BASEINAI_MA_C5_BEEIKIUOSE_OQ_BASEINAI_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_3_16760_18234_0_18617_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_J_MM_XT_SHYMLG_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}