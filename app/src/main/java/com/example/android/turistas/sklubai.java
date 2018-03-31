package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class sklubai extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_X_CN_WD_XJKQJ_F6_QT59A_XIBG_Q_NAKTINIAI_KLUBAI_C5_A0IAULIUOSE_OQ_NAKTINIAI_KLUBAI_C5_A0IAULIUOSE_GS_L_PSY_AB_3_0I71K1L4_2317_2317_0_2581_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_IP_N7_S9A_HI7K_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&ei=xCn-WdXJKqjF6QT59aXIBg&q=Naktiniai+klubai+%C5%A0iauliuose&oq=Naktiniai+klubai+%C5%A0iauliuose&gs_l=psy-ab.3..0i71k1l4.2317.2317.0.2581.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.IpN7S9aHI7k&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String VILNIAUS_G_225_ŠIAULIAI_76344 = "Vilniaus g. 225, Šiauliai 76344";
    public static final String VILNIAUS_G_126_ŠIAULIAI_76291 = "Vilniaus g. 126, Šiauliai 76291";
    public static final String VASARIO_16_OSIOS_G_48_ŠIAULIAI_76291 = "Vasario 16-osios g. 48, Šiauliai 76291";
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
        mMediaPlayer = MediaPlayer.create(sklubai.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sklubai);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = VASARIO_16_OSIOS_G_48_ŠIAULIAI_76291;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-640) 77774";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });

        ImageView adress1 = (ImageView) findViewById(R.id.adreso1);
        ImageView tel1 = (ImageView) findViewById(R.id.telefono1);
        adress1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = VILNIAUS_G_126_ŠIAULIAI_76291;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-684) 01800";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });

        ImageView adress2 = (ImageView) findViewById(R.id.adreso2);
        ImageView tel2 = (ImageView) findViewById(R.id.telefono2);
        adress2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = VILNIAUS_G_225_ŠIAULIAI_76344;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-41) 502410";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_X_CN_WD_XJKQJ_F6_QT59A_XIBG_Q_NAKTINIAI_KLUBAI_C5_A0IAULIUOSE_OQ_NAKTINIAI_KLUBAI_C5_A0IAULIUOSE_GS_L_PSY_AB_3_0I71K1L4_2317_2317_0_2581_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_IP_N7_S9A_HI7K_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
