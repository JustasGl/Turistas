package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import static android.R.attr.duration;

public class ptenis extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_M_SZ_WZD1_BOLN6_QTQVQCG_Q_TENISAS_PLUNG_C4_97JE_OQ_TENISAS_PLUNG_C4_97JE_GS_L_PSY_AB_3_11362_12378_0_12568_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_C11_YBJ_A_X_PC_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&ei=mSz-WZD1BOLN6QTQvqcg&q=Tenisas+Plung%C4%97je&oq=Tenisas+Plung%C4%97je&gs_l=psy-ab.3...11362.12378.0.12568.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.c11YBjA-xPc&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String NUMERIS_NEPATEIKTAS = "Numeris nepateiktas";
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
        mMediaPlayer = MediaPlayer.create(ptenis.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptenis);


        ImageView adress = (ImageView)findViewById(R.id.adreso);
        ImageView tel = (ImageView)findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                Toast.makeText(ptenis.this, NUMERIS_NEPATEIKTAS, Toast.LENGTH_SHORT).show();
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "861040905";
                skamb();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView)findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_M_SZ_WZD1_BOLN6_QTQVQCG_Q_TENISAS_PLUNG_C4_97JE_OQ_TENISAS_PLUNG_C4_97JE_GS_L_PSY_AB_3_11362_12378_0_12568_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_C11_YBJ_A_X_PC_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
