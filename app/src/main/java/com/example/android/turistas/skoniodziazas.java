package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class skoniodziazas extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_Q_SKONIO_D_C5_BEIAZAS_TAURAG_C4_97JE_SPELL_1_SA_X_VED_0AH_UKEWJRZQ_LMYA_PXAH_UL2_RO_KHE8S_AW_YQVW_UIIYG_A_BIW_1920_BIH_971_GFE_RD_CR_DCR_0_EI_8_P38_WYZ9_MNDBT_AH446V4_AQ = "https://www.google.com/search?client=firefox-b&q=Skonio+d%C5%BEiazas+Taurag%C4%97je&spell=1&sa=X&ved=0ahUKEwjrzqLMyaPXAhUL2RoKHe8sAwYQvwUIIygA&biw=1920&bih=971&gfe_rd=cr&dcr=0&ei=8P38WYz9MNDBtAH446v4AQ";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String A_BAŽNYČIŲ_G_TAURAGĖ_72253 = "20A, Bažnyčių g., Tauragė 72253";
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
        mMediaPlayer = MediaPlayer.create(skoniodziazas.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skoniodziazas);

        ImageView adress = (ImageView)findViewById(R.id.adreso);
        ImageView tel = (ImageView)findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = A_BAŽNYČIŲ_G_TAURAGĖ_72253;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-698) 72941";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView)findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_Q_SKONIO_D_C5_BEIAZAS_TAURAG_C4_97JE_SPELL_1_SA_X_VED_0AH_UKEWJRZQ_LMYA_PXAH_UL2_RO_KHE8S_AW_YQVW_UIIYG_A_BIW_1920_BIH_971_GFE_RD_CR_DCR_0_EI_8_P38_WYZ9_MNDBT_AH446V4_AQ;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
