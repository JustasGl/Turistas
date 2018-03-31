package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class juone_pastuoge extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_Q_PZ8_WAA_MN4_SSA_Y2_WQ_MG_K_Q_JUON_C4_97_PASTUOG_C4_97_C5_A0IAULIUOSE_OQ_JUON_C4_97_PASTUOG_C4_97_C5_A0IAULIUOSE_GS_L_PSY_AB_3_5994_16248_0_16497_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_P3GE4_I20_RSE_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=qPz8WaaMN4SSaY2WqMgK&q=Juon%C4%97+pastuog%C4%97+%C5%A0iauliuose&oq=Juon%C4%97+pastuog%C4%97+%C5%A0iauliuose&gs_l=psy-ab.3...5994.16248.0.16497.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.P3ge4I20RSE&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String AUŠROS_AL_31_ŠIAULIAI_76300 = "Aušros al. 31, Šiauliai 76300";
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
        mMediaPlayer = MediaPlayer.create(juone_pastuoge.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juone_pastuoge);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = AUŠROS_AL_31_ŠIAULIAI_76300;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "+370-444-53748";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_Q_PZ8_WAA_MN4_SSA_Y2_WQ_MG_K_Q_JUON_C4_97_PASTUOG_C4_97_C5_A0IAULIUOSE_OQ_JUON_C4_97_PASTUOG_C4_97_C5_A0IAULIUOSE_GS_L_PSY_AB_3_5994_16248_0_16497_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_P3GE4_I20_RSE_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });

    }
}
