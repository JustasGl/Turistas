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

public class SiauliuLinksmybes extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_08_D8_WD_TW_M8_OE6_ATPS_J_4_DQ_Q_PRAMOGOS_C5_A0IAULIUOSE_OQ_PRAMOGOS_C5_A0IAULIUOSE_GS_L_PSY_AB_3_0J0I22I30K1L4_138365_140029_0_140227_10_10_0_0_0_0_81_652_10_10_0_0_1_1_64_PSY_AB_0_10_648_0_64XA_N0_AMFD8 = "https://www.google.lt/search?rlz=1C1CHBF_enLT747LT747&ei=08D8WdTwM8Oe6ATpsJ-4DQ&q=Pramogos+%C5%A0iauliuose&oq=Pramogos+%C5%A0iauliuose&gs_l=psy-ab.3..0j0i22i30k1l4.138365.140029.0.140227.10.10.0.0.0.0.81.652.10.10.0....0...1.1.64.psy-ab..0.10.648....0.64xaN0AMFD8";
    public static final String TENISAS = "Tenisas";
    public static final String BASEINAI = "Baseinai";
    public static final String ŽIRGYNAI = "Žirgynai";
    public static final String KINO_TEATRAI = "Kino teatrai";
    public static final String AERODROMAS = "Aerodromas";
    public static final String LEDO_ARENA = "Ledo Arena";
    public static final String DAŽASVYDIS = "Dažasvydis";
    public static final String CABLE_PARK = "Cable Park";
    public static final String BOULINGAS = "Boulingas";
    public static final String ŠOKIAI = "Šokiai";
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
        mMediaPlayer = MediaPlayer.create(SiauliuLinksmybes.this, R.raw.garsas);
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

        final ArrayList<word> Slinksmybes = new ArrayList<word>();
        Slinksmybes.add(new word(R.drawable.bildukas, ŠOKIAI));
        Slinksmybes.add(new word(R.drawable.boulingas, BOULINGAS));
        Slinksmybes.add(new word(R.drawable.wake, CABLE_PARK));
        Slinksmybes.add(new word(R.drawable.paintball, DAŽASVYDIS));
        Slinksmybes.add(new word(R.drawable.ledoarena, LEDO_ARENA));
        Slinksmybes.add(new word(R.drawable.parachute, AERODROMAS));
        Slinksmybes.add(new word(R.drawable.movie, KINO_TEATRAI));
        Slinksmybes.add(new word(R.drawable.zirgas, ŽIRGYNAI));
        Slinksmybes.add(new word(R.drawable.plaukimas, BASEINAI));
        Slinksmybes.add(new word(R.drawable.tenis, TENISAS));
        Slinksmybes.add(new word(R.drawable.daugiauk, ""));

        Adaptorgrid adapteris = new Adaptorgrid(SiauliuLinksmybes.this, Slinksmybes);
        GridView Listtranslated = (GridView) findViewById(R.id.grid);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                word listas = Slinksmybes.get(position);

                switch (position) {
                    case 0:
                        skamb();
                        Intent intents = new Intent(SiauliuLinksmybes.this, sklubai.class);
                        startActivity(intents);
                        break;
                    case 1:
                        skamb();
                        Intent intent = new Intent(SiauliuLinksmybes.this, sboulingas.class);
                        startActivity(intent);
                        break;
                    case 2:
                        skamb();
                        Intent intentas = new Intent(SiauliuLinksmybes.this, swake.class);
                        startActivity(intentas);
                        break;
                    case 3:
                        skamb();
                        Intent intentas1 = new Intent(SiauliuLinksmybes.this, sdazasvydis.class);
                        startActivity(intentas1);
                        break;
                    case 4:
                        skamb();
                        Intent intentas2 = new Intent(SiauliuLinksmybes.this, sledoarena.class);
                        startActivity(intentas2);
                        break;
                    case 5:
                        skamb();
                        Intent intentas3 = new Intent(SiauliuLinksmybes.this, saerodromas.class);
                        startActivity(intentas3);
                        break;
                    case 6:
                        skamb();
                        Intent intentas4 = new Intent(SiauliuLinksmybes.this, skinas.class);
                        startActivity(intentas4);
                        break;
                    case 7:
                        skamb();
                        Intent intentas5 = new Intent(SiauliuLinksmybes.this, szirgas.class);
                        startActivity(intentas5);
                        break;
                    case 8:
                        skamb();
                        Intent intentas6 = new Intent(SiauliuLinksmybes.this, splaukimas.class);
                        startActivity(intentas6);
                        break;
                    case 9:
                        skamb();
                        Intent intentas7 = new Intent(SiauliuLinksmybes.this, stenis.class);
                        startActivity(intentas7);
                        break;
                    case 10:
                        skamb();
                        String daugiau = HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_08_D8_WD_TW_M8_OE6_ATPS_J_4_DQ_Q_PRAMOGOS_C5_A0IAULIUOSE_OQ_PRAMOGOS_C5_A0IAULIUOSE_GS_L_PSY_AB_3_0J0I22I30K1L4_138365_140029_0_140227_10_10_0_0_0_0_81_652_10_10_0_0_1_1_64_PSY_AB_0_10_648_0_64XA_N0_AMFD8;
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                        startActivity(i);
                        break;
                }
            }
        });

    }
}