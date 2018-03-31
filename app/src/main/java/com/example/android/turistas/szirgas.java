package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class szirgas extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_BIW_958_BIH_954_EI_JYR_WB6_DBOY_Q6_QT8V6_XACA_Q_C5_BDIRGYNAS_C5_A0IAULIUOSE_OQ_C5_BDIRGYNAS_C5_A0IAULIUOSE_GS_L_PSY_AB_3_10101_11297_0_11445_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_1_JLP53_U4_HL_E_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&biw=958&bih=954&ei=Jyr-Wb6DBoyQ6QT8v6XACA&q=%C5%BDirgynas+%C5%A0iauliuose&oq=%C5%BDirgynas+%C5%A0iauliuose&gs_l=psy-ab.3...10101.11297.0.11445.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.1Jlp53U4HlE&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String ŽUVININKŲ_G_18_ŠIAULIŲ_M_ŠIAULIŲ_M_SAV_LT_76249_8_650 = "Žuvininkų g. 18, Šiaulių m., Šiaulių m. sav., LT-76249 8 650";
    public static final String ŽAČIŲ_K_MEŠKUIČIŲ_SEN_ŠIAULIŲ_R_SAV_LT_81478 = "Žačių k., Meškuičių sen., Šiaulių r. sav., LT-81478";
    public static final String NAISIŲ_K_MEŠKUIČIŲ_SEN_ŠIAULIŲ_R_SAV_LT_81473 = "Naisių k., Meškuičių sen., Šiaulių r. sav., LT-81473";
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
        mMediaPlayer = MediaPlayer.create(szirgas.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_szirgas);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = NAISIŲ_K_MEŠKUIČIŲ_SEN_ŠIAULIŲ_R_SAV_LT_81473;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "8 606 52534";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });

        ImageView adress1 = (ImageView) findViewById(R.id.adreso1);
        ImageView tel1 = (ImageView) findViewById(R.id.telefono1);
        adress1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = ŽAČIŲ_K_MEŠKUIČIŲ_SEN_ŠIAULIŲ_R_SAV_LT_81478;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "8 698 27525";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView adress2 = (ImageView) findViewById(R.id.adreso2);
        ImageView tel2 = (ImageView) findViewById(R.id.telefono2);
        adress2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = ŽUVININKŲ_G_18_ŠIAULIŲ_M_ŠIAULIŲ_M_SAV_LT_76249_8_650;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "8 650 66871";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_BIW_958_BIH_954_EI_JYR_WB6_DBOY_Q6_QT8V6_XACA_Q_C5_BDIRGYNAS_C5_A0IAULIUOSE_OQ_C5_BDIRGYNAS_C5_A0IAULIUOSE_GS_L_PSY_AB_3_10101_11297_0_11445_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_1_JLP53_U4_HL_E_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
