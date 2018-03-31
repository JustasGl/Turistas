package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class virginijauspicerija extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_PF78_WF_S_DIKJA_PR_YM5G_P_Q_VIRGINIJAUS_PIZZA_PLUNG_C4_97JE_OQ_VIRGINIJAUS_PIZZA_PLUNG_C4_97JE_GS_L_PSY_AB_3_57491_59890_0_60248_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_HXI_PYWZ6_BKS_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=Pf78Wf_sDIKJaPrYm5gP&q=Virginijaus+Pizza+Plung%C4%97je&oq=Virginijaus+Pizza+Plung%C4%97je&gs_l=psy-ab.3...57491.59890.0.60248.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.HxiPYWZ6Bks&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String VYTAUTO_G_13_PLUNGĖ_90123 = "Vytauto g. 13, Plungė 90123";
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
        mMediaPlayer = MediaPlayer.create(virginijauspicerija.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virginijauspicerija);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = VYTAUTO_G_13_PLUNGĖ_90123;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-623) 41655";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_PF78_WF_S_DIKJA_PR_YM5G_P_Q_VIRGINIJAUS_PIZZA_PLUNG_C4_97JE_OQ_VIRGINIJAUS_PIZZA_PLUNG_C4_97JE_GS_L_PSY_AB_3_57491_59890_0_60248_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_HXI_PYWZ6_BKS_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
