package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class tbaseinai extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_ZIJ_WB_SVBOI_B6_QTY6_LKABG_Q_BASEINAI_TEL_C5_A1IUOSE_OQ_BASEINAI_TEL_C5_A1IUOSE_GS_L_PSY_AB_3_7418_9208_0_9478_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_34BTJ_SDB4_E8_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&ei=Zij-WbSVBOiB6QTY6LKABg&q=Baseinai+Tel%C5%A1iuose&oq=Baseinai+Tel%C5%A1iuose&gs_l=psy-ab.3...7418.9208.0.9478.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.34btjSDB4E8&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String LYGUMŲ_G_47_TELŠIAI_87125 = "Lygumų g. 47, Telšiai 87125";
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
        mMediaPlayer = MediaPlayer.create(tbaseinai.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tbaseinai);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = LYGUMŲ_G_47_TELŠIAI_87125;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = " (8-444) 78488";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_ZIJ_WB_SVBOI_B6_QTY6_LKABG_Q_BASEINAI_TEL_C5_A1IUOSE_OQ_BASEINAI_TEL_C5_A1IUOSE_GS_L_PSY_AB_3_7418_9208_0_9478_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_34BTJ_SDB4_E8_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
