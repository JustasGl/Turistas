package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class splaukimas extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_BIW_958_BIH_954_EI_NCR_WA7_EBJPB6_QSAY5_T4_CQ_Q_BASEINAS_C5_A0IAULIUOSE_OQ_BASEINAS_C5_A0IAULIUOSE_GS_L_PSY_AB_3_9702_11853_0_12128_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_4_VJRAB_SKXA_I_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&biw=958&bih=954&ei=NCr-Wa7EBJPb6QSAy5T4CQ&q=Baseinas+%C5%A0iauliuose&oq=Baseinas+%C5%A0iauliuose&gs_l=psy-ab.3...9702.11853.0.12128.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.4VJRAbSKxaI&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String ŠIAULIŲ_PL_4A_ŠNIŪRAIČIAI_82101 = "Šiaulių pl. 4a, Šniūraičiai 82101";
    public static final String AUŠROS_G_1_ŠIAULIAI_81493 = "Aušros g. 1, Šiauliai 81493";
    public static final String GUMBINĖS_G_10_ŠIAULIAI_77166 = "Gumbinės g. 10, Šiauliai 77166";
    public static final String DAINŲ_G_33_A_ŠIAULIAI_78236 = "Dainų g. 33A, Šiauliai 78236";
    public static final String EŽERO_G_11_A_ŠIAULIAI_77147 = "Ežero g. 11A, Šiauliai 77147";
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
        mMediaPlayer = MediaPlayer.create(splaukimas.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splaukimas);

        ImageView adress = (ImageView) findViewById(R.id.adreso1);
        ImageView tel = (ImageView) findViewById(R.id.telefono1);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = EŽERO_G_11_A_ŠIAULIAI_77147;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-41) 520508";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });

        ImageView adress1 = (ImageView) findViewById(R.id.adreso);
        ImageView tel1 = (ImageView) findViewById(R.id.telefono);
        adress1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = DAINŲ_G_33_A_ŠIAULIAI_78236;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-41) 457176";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });

        ImageView adress2 = (ImageView) findViewById(R.id.adreso3);
        ImageView tel2 = (ImageView) findViewById(R.id.telefono3);
        adress2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = GUMBINĖS_G_10_ŠIAULIAI_77166;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-635) 11777";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView adress3 = (ImageView) findViewById(R.id.adreso2);
        ImageView tel3 = (ImageView) findViewById(R.id.telefono2);
        adress3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = AUŠROS_G_1_ŠIAULIAI_81493;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-41) 589120";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });

        ImageView adress4 = (ImageView) findViewById(R.id.adreso4);
        ImageView tel4 = (ImageView) findViewById(R.id.telefono4);
        adress4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = ŠIAULIŲ_PL_4A_ŠNIŪRAIČIAI_82101;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-621) 05577";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_BIW_958_BIH_954_EI_NCR_WA7_EBJPB6_QSAY5_T4_CQ_Q_BASEINAS_C5_A0IAULIUOSE_OQ_BASEINAS_C5_A0IAULIUOSE_GS_L_PSY_AB_3_9702_11853_0_12128_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_4_VJRAB_SKXA_I_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
