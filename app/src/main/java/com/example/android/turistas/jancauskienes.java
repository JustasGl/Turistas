package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class jancauskienes extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_SVR8_WA_S6_IP_LNA_OK_P4G_P_Q_L_JAN_C4_8_DAUSKIEN_C4_97S_C4_AFMON_C4_97_TEL_C5_A1IUOSE_OQ_L_JAN_C4_8_DAUSKIEN_C4_97S_C4_AFMON_C4_97_TEL_C5_A1IUOSE_GS_L_PSY_AB_12_4469_4800_0_5685_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_KJ6_PG_LZB5_M_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=Svr8WaS6IpLNaOK_p4gP&q=L.+Jan%C4%8Dauskien%C4%97s+%C4%AFmon%C4%97+Tel%C5%A1iuose&oq=L.+Jan%C4%8Dauskien%C4%97s+%C4%AFmon%C4%97+Tel%C5%A1iuose&gs_l=psy-ab.12...4469.4800.0.5685.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.KJ6PgLZb5_M&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String RESPUBLIKOS_G_20_TELŠIAI_87334 = " Respublikos g. 20, Telšiai 87334";
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
        mMediaPlayer = MediaPlayer.create(jancauskienes.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jancauskienes);

        ImageView adress = (ImageView)findViewById(R.id.adreso);
        ImageView tel = (ImageView)findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = RESPUBLIKOS_G_20_TELŠIAI_87334;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-444) 74898";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView)findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_SVR8_WA_S6_IP_LNA_OK_P4G_P_Q_L_JAN_C4_8_DAUSKIEN_C4_97S_C4_AFMON_C4_97_TEL_C5_A1IUOSE_OQ_L_JAN_C4_8_DAUSKIEN_C4_97S_C4_AFMON_C4_97_TEL_C5_A1IUOSE_GS_L_PSY_AB_12_4469_4800_0_5685_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_KJ6_PG_LZB5_M_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });

    }
}
