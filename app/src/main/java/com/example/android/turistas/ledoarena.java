package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ledoarena extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_Q_LEDO_ARENA_MA_C5_BEEIKIUOSE_SA_X_VED_0AH_UKEWI_T4E_HW0Q_PXAH_WILHO_KHCO_PDRK_QUZ_EICQ_BIW_1920_BIH_971_GFE_RD_CR_DCR_0_EI_DWF9_WCF_PDY7_FT_AH4N_LA4_CA = "https://www.google.com/search?client=firefox-b&q=Ledo+arena+Ma%C5%BEeikiuose&sa=X&ved=0ahUKEwiT4eHW0qPXAhWILhoKHcoPDrkQuzEICQ&biw=1920&bih=971&gfe_rd=cr&dcr=0&ei=dwf9WcfPDY7FtAH4nLa4CA";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String SENKELIO_G_3_MAŽEIKIAI_89126 = "Senkelio g. 3, Mažeikiai 89126";
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
        mMediaPlayer = MediaPlayer.create(ledoarena.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ledoarena);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = SENKELIO_G_3_MAŽEIKIAI_89126;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-688) 26733";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_Q_LEDO_ARENA_MA_C5_BEEIKIUOSE_SA_X_VED_0AH_UKEWI_T4E_HW0Q_PXAH_WILHO_KHCO_PDRK_QUZ_EICQ_BIW_1920_BIH_971_GFE_RD_CR_DCR_0_EI_DWF9_WCF_PDY7_FT_AH4N_LA4_CA;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
