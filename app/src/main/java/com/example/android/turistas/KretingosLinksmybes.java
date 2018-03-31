package com.example.android.turistas;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class KretingosLinksmybes extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_MS_D8_WD_KRJ6_GB6_QS16_YAW_AQ_Q_PRAMOGOS_KRETINGOJE_OQ_PRAMOGOS_KRETINGOJE_GS_L_PSY_AB_3_0I19K1J0I22I30I19K1L2_53996_55867_0_56049_10_10_0_0_0_0_97_674_10_10_0_0_1_1_64_PSY_AB_0_10_672_0J0I20I263K1J0I22I30K1J0I13K1J0I10I19K1_0_1YFI_7_WH_WV_Y = "https://www.google.lt/search?rlz=1C1CHBF_enLT747LT747&ei=msD8WdKRJ6GB6QS16YawAQ&q=Pramogos+Kretingoje&oq=Pramogos+Kretingoje&gs_l=psy-ab.3..0i19k1j0i22i30i19k1l2.53996.55867.0.56049.10.10.0.0.0.0.97.674.10.10.0....0...1.1.64.psy-ab..0.10.672...0j0i20i263k1j0i22i30k1j0i13k1j0i10i19k1.0.1yfi_7WhWvY";
    public static final String ŽIRGYNAI = "Žirgynai";
    public static final String AERODROMAS = "Aerodromas";
    public static final String DAŽASVYDIS = "Dažasvydis";
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
        mMediaPlayer = MediaPlayer.create(KretingosLinksmybes.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_grid);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        Toolbar myChildToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myChildToolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        final Drawable upArrow = getResources().getDrawable(R.drawable.up);
        upArrow.setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);

        final ArrayList<word> Klinksmybes = new ArrayList<word>();
        Klinksmybes.add(new word(R.drawable.paintball, DAŽASVYDIS));
        Klinksmybes.add(new word(R.drawable.parachute, AERODROMAS));
        Klinksmybes.add(new word(R.drawable.zirgas, ŽIRGYNAI));
        Klinksmybes.add(new word(R.drawable.daugiauk, ""));

        Adaptorgrid adapteris = new Adaptorgrid(KretingosLinksmybes.this, Klinksmybes);
        GridView Listtranslated = (GridView) findViewById(R.id.grid);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                word listas = Klinksmybes.get(position);

                switch (position) {
                    case 0:
                        skamb();
                        Intent intentas1 = new Intent(KretingosLinksmybes.this, kpaintball.class);
                        startActivity(intentas1);
                        break;
                    case 1:
                        skamb();
                        Intent intentas3 = new Intent(KretingosLinksmybes.this, kparachute.class);
                        startActivity(intentas3);
                        break;
                    case 2:
                        skamb();
                        Intent intentas5 = new Intent(KretingosLinksmybes.this, kzirgas.class);
                        startActivity(intentas5);
                        break;
                    case 3:
                        skamb();
                        String daugiau = HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_MS_D8_WD_KRJ6_GB6_QS16_YAW_AQ_Q_PRAMOGOS_KRETINGOJE_OQ_PRAMOGOS_KRETINGOJE_GS_L_PSY_AB_3_0I19K1J0I22I30I19K1L2_53996_55867_0_56049_10_10_0_0_0_0_97_674_10_10_0_0_1_1_64_PSY_AB_0_10_672_0J0I20I263K1J0I22I30K1J0I13K1J0I10I19K1_0_1YFI_7_WH_WV_Y;
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                        startActivity(i);
                        break;
                }
            }
        });

    }
}
