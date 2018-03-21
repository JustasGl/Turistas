package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class teatrokavine extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_VN8_WYZ_LONPUAFR_QHSG_G_Q_TEATRO_KAVIN_C4_97_TEL_C5_A1IUOSE_OQ_TEATRO_KAVIN_C4_97_TEL_C5_A1IUOSE_GS_L_PSY_AB_3_13098_18173_0_18222_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_37T4_LCP_GZC4_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=_vn8WYzLONPUafrQhsgG&q=Teatro+kavin%C4%97Tel%C5%A1iuose&oq=Teatro+kavin%C4%97Tel%C5%A1iuose&gs_l=psy-ab.3...13098.18173.0.18222.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.37t4LcpGZc4&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
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
        mMediaPlayer = MediaPlayer.create(teatrokavine.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teatrokavine);

        ImageView adress = (ImageView)findViewById(R.id.adreso);
        ImageView tel = (ImageView)findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String str_location = "87333";
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String phone = "(8-603) 08742";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView)findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_VN8_WYZ_LONPUAFR_QHSG_G_Q_TEATRO_KAVIN_C4_97_TEL_C5_A1IUOSE_OQ_TEATRO_KAVIN_C4_97_TEL_C5_A1IUOSE_GS_L_PSY_AB_3_13098_18173_0_18222_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_37T4_LCP_GZC4_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
