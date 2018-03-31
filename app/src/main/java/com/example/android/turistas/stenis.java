package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class stenis extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_BIW_958_BIH_954_EI_QIR_WAJ_TDQ_GC6_QT1Y6_DYCQ_Q_TENISAS_C5_A0IAULIUOSE_OQ_TENISAS_C5_A0IAULIUOSE_GS_L_PSY_AB_3_10609_11574_0_11904_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_J_JOYCDHF_SDW_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&biw=958&bih=954&ei=Qir-WajTDqGC6QT1y6DYCQ&q=Tenisas+%C5%A0iauliuose&oq=Tenisas+%C5%A0iauliuose&gs_l=psy-ab.3...10609.11574.0.11904.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.jJOYCdhfSdw&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String GARDINO_G_8_ŠIAULIAI_78232 = "78232, Gardino g. 8, Šiauliai 78232";
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
        mMediaPlayer = MediaPlayer.create(stenis.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stenis);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = GARDINO_G_8_ŠIAULIAI_78232;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-41) 462776";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_BIW_958_BIH_954_EI_QIR_WAJ_TDQ_GC6_QT1Y6_DYCQ_Q_TENISAS_C5_A0IAULIUOSE_OQ_TENISAS_C5_A0IAULIUOSE_GS_L_PSY_AB_3_10609_11574_0_11904_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_J_JOYCDHF_SDW_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });

    }
}
