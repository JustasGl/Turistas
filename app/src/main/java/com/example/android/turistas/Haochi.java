package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Haochi extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_O_PT8_WENJ_GMQA6_ASMO_YOYDA_Q_HAO_CHI_MA_C5_BEEIKIUOSE_OQ_HAO_CHI_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_3_715748_719352_0_719406_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_PUM_N3P_F7_LAQ_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=oPT8WenjGMqa6ASmoYOYDA&q=Hao+chi+Ma%C5%BEeikiuose&oq=Hao+chi+Ma%C5%BEeikiuose&gs_l=psy-ab.3...715748.719352.0.719406.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.PumN3pF7LAQ&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String VIEKŠNIŲ_G_20_D_MAŽEIKIAI_89235 = "Viekšnių g. 20D, Mažeikiai 89235";
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
        mMediaPlayer = MediaPlayer.create(Haochi.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haochi);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = VIEKŠNIŲ_G_20_D_MAŽEIKIAI_89235;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-658) 87711";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_O_PT8_WENJ_GMQA6_ASMO_YOYDA_Q_HAO_CHI_MA_C5_BEEIKIUOSE_OQ_HAO_CHI_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_3_715748_719352_0_719406_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_PUM_N3P_F7_LAQ_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
