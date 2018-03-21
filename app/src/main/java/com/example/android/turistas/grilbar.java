package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class grilbar extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_S_P78_WZBX_BMAQA4JDM_YAH_Q_22_GANDI_22_BAR_26_GRILL_PLUNG_C4_97JE_OQ_22_GANDI_22_BAR_26_GRILL_PLUNG_C4_97JE_GS_L_PSY_AB_12_4432_4432_0_5391_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_F4_C2_R8_RXPT0_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=sP78WZbxBMaqa4jdmYAH&q=%22Gandi%22+Bar+%26+Grill+Plung%C4%97je&oq=%22Gandi%22+Bar+%26+Grill+Plung%C4%97je&gs_l=psy-ab.12...4432.4432.0.5391.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.F4C2R8Rxpt0&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String GANDINGOS_G_8_B_PLUNGĖ_90131 = "Gandingos g. 8B, Plungė 90131";
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
        mMediaPlayer = MediaPlayer.create(grilbar.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grilbar);

        ImageView adress = (ImageView)findViewById(R.id.adreso);
        ImageView tel = (ImageView)findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String str_location = GANDINGOS_G_8_B_PLUNGĖ_90131;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String phone = "(8-606) 18808";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView)findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_S_P78_WZBX_BMAQA4JDM_YAH_Q_22_GANDI_22_BAR_26_GRILL_PLUNG_C4_97JE_OQ_22_GANDI_22_BAR_26_GRILL_PLUNG_C4_97JE_GS_L_PSY_AB_12_4432_4432_0_5391_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_F4_C2_R8_RXPT0_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
