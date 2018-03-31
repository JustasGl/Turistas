package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class saerodromas extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_Q_AERODROMAS_C5_A0IAULIUOSE_SPELL_1_SA_X_VED_0AH_UKEWI_F_Z_M56_XXAH_WMPZO_KHXXACBG_QVW_UIIYG_A_BIW_958_BIH_954_GFE_RD_CR_DCR_0_EI_EYR_WDUM_MJDFT_AGC57_VG = "https://www.google.com/search?client=firefox-b-ab&q=Aerodromas+%C5%A0iauliuose&spell=1&sa=X&ved=0ahUKEwiF-Z_m56XXAhWMPZoKHXXACBgQvwUIIygA&biw=958&bih=954&gfe_rd=cr&dcr=0&ei=Eyr-WdumMJDFtAGc57Vg";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String ZOKNIŲ_AERODROMAS = "Zoknių Aerodromas";
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
        mMediaPlayer = MediaPlayer.create(saerodromas.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saerodromas);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String str_location = ZOKNIŲ_AERODROMAS;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String phone = "(8-41) 542005";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_Q_AERODROMAS_C5_A0IAULIUOSE_SPELL_1_SA_X_VED_0AH_UKEWI_F_Z_M56_XXAH_WMPZO_KHXXACBG_QVW_UIIYG_A_BIW_958_BIH_954_GFE_RD_CR_DCR_0_EI_EYR_WDUM_MJDFT_AGC57_VG;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });

    }
}
