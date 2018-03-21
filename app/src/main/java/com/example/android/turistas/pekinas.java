package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static com.example.android.turistas.R.string.Mažeikiai;


public class pekinas extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_P_P8_WE_XGMJ_F6_QSUZ_ISG_BG_Q_PEKINAS_MA_C5_BEEIKIUOSE_OQ_PEKINAS_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_3_205045_213065_0_213295_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_MPQCEFYN5VK_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=p_P8We-XGMjF6QSuzISgBg&q=Pekinas+Ma%C5%BEeikiuose&oq=Pekinas+Ma%C5%BEeikiuose&gs_l=psy-ab.3...205045.213065.0.213295.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.MPQCefyn5vk&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String ŽEMAITIJOS_G_47_MAŽEIKIAI_89132 = "Žemaitijos g. 47, Mažeikiai 89132";
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
        mMediaPlayer = MediaPlayer.create(pekinas.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pekinas);

        ImageView adress = (ImageView)findViewById(R.id.adreso);
        ImageView tel = (ImageView)findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = ŽEMAITIJOS_G_47_MAŽEIKIAI_89132;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-443)50005";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });

        ImageView googlesearch = (ImageView)findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_P_P8_WE_XGMJ_F6_QSUZ_ISG_BG_Q_PEKINAS_MA_C5_BEEIKIUOSE_OQ_PEKINAS_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_3_205045_213065_0_213295_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_MPQCEFYN5VK_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
