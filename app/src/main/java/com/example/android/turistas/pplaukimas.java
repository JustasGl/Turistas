package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class pplaukimas extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_L_SZ_WZLHNSAV6_ASHYO6_YCW_Q_BASEINAI_PLUNG_C4_97JE_OQ_BASEINAI_PLUNG_C4_97JE_GS_L_PSY_AB_3_0I71K1L4_1784_1889_0_1982_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_D_IIZ_C1TU_F4_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&ei=lSz-WZLHNsav6ASHyo6YCw&q=Baseinai+Plung%C4%97je&oq=Baseinai+Plung%C4%97je&gs_l=psy-ab.3..0i71k1l4.1784.1889.0.1982.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.D_IIzC1tuF4&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String RIETAVO_G_16_PLUNGĖ = "Rietavo g. 16, Plungė";
    public static final String TELŠIŲ_G_13_PLUNGĖ = "Telšių g. 13, Plungė";
    public static final String MARDOSŲ_K_NAUSODŽIO_SEN_PLUNGĖS_R = "Mardosų k., Nausodžio sen., Plungės r.";
    public static final String I_KONČIAUS_G_3_PLUNGĖ = "I. Končiaus g. 3, Plungė";
    public static final String HOTEL_PORTO_PLUNGĖ = "hotel porto plungė";
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
        mMediaPlayer = MediaPlayer.create(pplaukimas.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pplaukimas);

        ImageView adress = (ImageView)findViewById(R.id.adreso);
        ImageView tel = (ImageView)findViewById(R.id.telefono);

        ImageView adress1 = (ImageView)findViewById(R.id.adreso1);
        ImageView tel1 = (ImageView)findViewById(R.id.telefono1);

        ImageView adress2 = (ImageView)findViewById(R.id.adreso2);
        ImageView tel2 = (ImageView)findViewById(R.id.telefono2);

        ImageView adress3 = (ImageView)findViewById(R.id.adreso3);
        ImageView tel3 = (ImageView)findViewById(R.id.telefono3);
        ImageView tel4 = (ImageView)findViewById(R.id.telefono4);

        ImageView adress4 = (ImageView)findViewById(R.id.adreso4);
        ImageView tel5 = (ImageView)findViewById(R.id.telefono5);
        ImageView tel6 = (ImageView)findViewById(R.id.telefono6);

        ImageView adress5 = (ImageView)findViewById(R.id.adreso5);
        ImageView tel7 = (ImageView)findViewById(R.id.telefono7);
        ImageView tel8 = (ImageView)findViewById(R.id.telefono8);

        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = HOTEL_PORTO_PLUNGĖ;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "+370 674 22255";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);

            }
        });
        adress1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = I_KONČIAUS_G_3_PLUNGĖ;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "+370 655 77666";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);

            }
        });
        adress2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = MARDOSŲ_K_NAUSODŽIO_SEN_PLUNGĖS_R;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "+370 620 26033";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);

            }
        });
        adress3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = TELŠIŲ_G_13_PLUNGĖ;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "+370 448 55 098";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);

            }
        });
        tel4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "+370 615 34 806";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);

            }
        });
        adress4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            skamb();
            String str_location = RIETAVO_G_16_PLUNGĖ;
            String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
            startActivity(i);
        }
    });
        tel5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            skamb();
            String phone = "+370 682 67 065";
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
            startActivity(intent);

        }
    });
        tel6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            skamb();
            String phone = "+370 448 71 181";
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
            startActivity(intent);

        }
    });
        adress5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = "56.041534, 21.888288";
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "+370 614 74284";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);

            }
        });
        tel8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "+370 698 10312";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);

            }
        });
        ImageView googlesearch = (ImageView)findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_L_SZ_WZLHNSAV6_ASHYO6_YCW_Q_BASEINAI_PLUNG_C4_97JE_OQ_BASEINAI_PLUNG_C4_97JE_GS_L_PSY_AB_3_0I71K1L4_1784_1889_0_1982_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_D_IIZ_C1TU_F4_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
