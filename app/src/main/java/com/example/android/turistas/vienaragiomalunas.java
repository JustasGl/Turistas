package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class vienaragiomalunas extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_MP_8_WD3N_E4_OUAO7HG_ZAG_Q_VIENARAGIO_MAL_C5_ABNAS_KRETINGA_OQ_VIENARAGIO_MAL_C5_ABNAS_KRETINGA_GS_L_PSY_AB_3_4047_8785_0_9030_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_IES1F3_D_WT_U_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=MP_8Wd3nE4Ouao7hgZAG&q=Vienaragio+mal%C5%ABnas+Kretinga&oq=Vienaragio+mal%C5%ABnas+Kretinga&gs_l=psy-ab.3...4047.8785.0.9030.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.IEs1f3_dWtU&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String KRETINGA_BIRUTĖS_G_19_MALŪNO_TAKAS_1 = "Kretinga, Birutės g.19/Malūno takas 1";
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
        mMediaPlayer = MediaPlayer.create(vienaragiomalunas.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vienaragiomalunas);

        ImageView adress = (ImageView)findViewById(R.id.adreso);
        ImageView tel = (ImageView)findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String str_location = KRETINGA_BIRUTĖS_G_19_MALŪNO_TAKAS_1;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String phone = "(8-615) 98778";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView)findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_MP_8_WD3N_E4_OUAO7HG_ZAG_Q_VIENARAGIO_MAL_C5_ABNAS_KRETINGA_OQ_VIENARAGIO_MAL_C5_ABNAS_KRETINGA_GS_L_PSY_AB_3_4047_8785_0_9030_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_IES1F3_D_WT_U_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });

    }
}
