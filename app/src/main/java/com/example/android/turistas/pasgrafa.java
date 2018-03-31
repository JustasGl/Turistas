package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class pasgrafa extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_UF78_WY6_MNYKXAB_LHNR_AF_Q_PAS_GRAF_C4_85_KRETINGA_OQ_PAS_GRAF_C4_85_KRETINGA_GS_L_PSY_AB_3_22155_37139_0_37194_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_Z9D_UO_K1_O0F_A_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=uf78WY6MNYKxabLHnrAF&q=Pas+Graf%C4%85+Kretinga&oq=Pas+Graf%C4%85+Kretinga&gs_l=psy-ab.3...22155.37139.0.37194.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.z9dUoK1O0fA&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String VILNIAUS_G_20_KRETINGA_97104 = " Vilniaus g. 20, Kretinga 97104";
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
        mMediaPlayer = MediaPlayer.create(pasgrafa.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasgrafa);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = VILNIAUS_G_20_KRETINGA_97104;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-445) 51366";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_UF78_WY6_MNYKXAB_LHNR_AF_Q_PAS_GRAF_C4_85_KRETINGA_OQ_PAS_GRAF_C4_85_KRETINGA_GS_L_PSY_AB_3_22155_37139_0_37194_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_Z9D_UO_K1_O0F_A_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });

    }
}
