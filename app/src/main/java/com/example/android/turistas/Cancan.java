package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Cancan extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_GPN8_WABA_OC_S5AF_OHK_AJ_Q_CAN_CAN_MA_C5_BEEIKIUOSE_OQ_CAN_CAN_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_3_4148_6569_0_6923_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_A9L_DBVPWP9_M_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1920&bih=971&ei=GPn8WabaOcS5afOhk-AJ&q=Can+can+Ma%C5%BEeikiuose&oq=Can+can+Ma%C5%BEeikiuose&gs_l=psy-ab.3...4148.6569.0.6923.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.a9lDbvpwp9M&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String ŽEMAITIJOS_G_20B_5_MAŽEIKIAI_89151 = "Žemaitijos g. 20b-5, Mažeikiai 89151";
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
        mMediaPlayer = MediaPlayer.create(Cancan.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancan);

        ImageView adress = (ImageView)findViewById(R.id.adreso);
        ImageView tel = (ImageView)findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String str_location = ŽEMAITIJOS_G_20B_5_MAŽEIKIAI_89151;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String phone = "(8-659) 13265";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView)findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1920_BIH_971_EI_GPN8_WABA_OC_S5AF_OHK_AJ_Q_CAN_CAN_MA_C5_BEEIKIUOSE_OQ_CAN_CAN_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_3_4148_6569_0_6923_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_A9L_DBVPWP9_M_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
