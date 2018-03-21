package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class pklubai extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_DIR_WEJ7_GOTI6_ASOW66_IBQ_Q_NAKTINIAI_KLUBAI_PLUNG_C4_97JE_OQ_NAKTINIAI_KLUBAI_PLUNG_C4_97JE_GS_L_PSY_AB_3_2650_4337_0_7068_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_K_CFW_ZO_CNN_A_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&ei=dir-Wej7GOTi6ASOw66IBQ&q=Naktiniai+klubai+Plung%C4%97je&oq=Naktiniai+klubai+Plung%C4%97je&gs_l=psy-ab.3...2650.4337.0.7068.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.K-CFwZoCNnA&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String SENAMIESČIO_A_3_PLUNGĖ_90162 = "Senamiesčio a. 3, Plungė 90162";
    public static final String DARIAUS_IR_GIRĖNO_G_2_A_PLUNGĖ_90167 = "Dariaus ir Girėno g. 2A, Plungė 90167";
    public static final String STOTIES_G_46_PLUNGĖ_90115 = "Stoties g. 46, Plungė 90115";
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
        mMediaPlayer = MediaPlayer.create(pklubai.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pklubai);

        ImageView adress = (ImageView)findViewById(R.id.adreso);
        ImageView tel = (ImageView)findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String str_location = STOTIES_G_46_PLUNGĖ_90115;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String phone = "(8-448) 71487";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });

        ImageView adress1 = (ImageView)findViewById(R.id.adreso1);
        ImageView tel1 = (ImageView)findViewById(R.id.telefono1);
        adress1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String str_location = DARIAUS_IR_GIRĖNO_G_2_A_PLUNGĖ_90167;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String phone = "((8-448) 51451";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView adress2 = (ImageView)findViewById(R.id.adreso2);
        ImageView tel2 = (ImageView)findViewById(R.id.telefono2);
        adress2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String str_location = SENAMIESČIO_A_3_PLUNGĖ_90162;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String phone = "(8-615) 41836";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView)findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_DIR_WEJ7_GOTI6_ASOW66_IBQ_Q_NAKTINIAI_KLUBAI_PLUNG_C4_97JE_OQ_NAKTINIAI_KLUBAI_PLUNG_C4_97JE_GS_L_PSY_AB_3_2650_4337_0_7068_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_K_CFW_ZO_CNN_A_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
