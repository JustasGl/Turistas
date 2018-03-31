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

public class MazeikiuLinksmybes extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_0BN8_WZJZ_EOTA6_ATVL66_QDG_Q_PRAMOGOS_MA_C5_BEEIKIUOSE_OQ_PRAMOGOS_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_3_0I19K1J0I22I30I19K1_1461143_1462748_0_1463046_11_11_0_0_0_0_77_651_11_11_0_0_1_1_64_PSY_AB_0_11_649_0J0I22I30K1_0_ABX5_SWY_U22C = "https://www.google.lt/search?rlz=1C1CHBF_enLT747LT747&ei=0bn8WZjzEOTa6ATvl66QDg&q=Pramogos+Ma%C5%BEeikiuose&oq=Pramogos+Ma%C5%BEeikiuose&gs_l=psy-ab.3..0i19k1j0i22i30i19k1.1461143.1462748.0.1463046.11.11.0.0.0.0.77.651.11.11.0....0...1.1.64.psy-ab..0.11.649...0j0i22i30k1.0.ABx5SwyU22c";
    public static final String TENISAS = "Tenisas";
    public static final String BASEINAI = "Baseinai";
    public static final String ŽIRGYNAI = "Žirgynai";
    public static final String KINO_TEATRAS = "Kino teatras";
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
        mMediaPlayer = MediaPlayer.create(MazeikiuLinksmybes.this, R.raw.garsas);
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

        final ArrayList<word> Mlinksmybes = new ArrayList<word>();
        Mlinksmybes.add(new word(R.drawable.bildukas, ŠOKIAI));
        Mlinksmybes.add(new word(R.drawable.boulingas, BOULINGAS));
        Mlinksmybes.add(new word(R.drawable.wake, CABLE_PARK));
        Mlinksmybes.add(new word(R.drawable.paintball, DAŽASVYDIS));
        Mlinksmybes.add(new word(R.drawable.ledoarena, LEDO_ARENA));
        Mlinksmybes.add(new word(R.drawable.parachute, AERODROMAS));
        Mlinksmybes.add(new word(R.drawable.movie, KINO_TEATRAS));
        Mlinksmybes.add(new word(R.drawable.zirgas, ŽIRGYNAI));
        Mlinksmybes.add(new word(R.drawable.plaukimas, BASEINAI));
        Mlinksmybes.add(new word(R.drawable.tenis, TENISAS));
        Mlinksmybes.add(new word(R.drawable.daugiauk, ""));

        Adaptorgrid adapteris = new Adaptorgrid(MazeikiuLinksmybes.this, Mlinksmybes);
        GridView Listtranslated = (GridView) findViewById(R.id.grid);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                word listas = Mlinksmybes.get(position);

                switch (position) {
                    case 0:
                        skamb();
                        Intent intents = new Intent(MazeikiuLinksmybes.this, bildukas.class);
                        startActivity(intents);
                        break;
                    case 1:
                        skamb();
                        Intent intent = new Intent(MazeikiuLinksmybes.this, boulingas.class);
                        startActivity(intent);
                        break;
                    case 2:
                        skamb();
                        Intent intentas = new Intent(MazeikiuLinksmybes.this, wake.class);
                        startActivity(intentas);
                        break;
                    case 3:
                        skamb();
                        Intent intentas1 = new Intent(MazeikiuLinksmybes.this, paintball.class);
                        startActivity(intentas1);
                        break;
                    case 4:
                        skamb();
                        Intent intentas2 = new Intent(MazeikiuLinksmybes.this, ledoarena.class);
                        startActivity(intentas2);
                        break;
                    case 5:
                        skamb();
                        Intent intentas3 = new Intent(MazeikiuLinksmybes.this, parachute.class);
                        startActivity(intentas3);
                        break;
                    case 6:
                        skamb();
                        Intent intentas4 = new Intent(MazeikiuLinksmybes.this, movie.class);
                        startActivity(intentas4);
                        break;
                    case 7:
                        skamb();
                        Intent intentas5 = new Intent(MazeikiuLinksmybes.this, zirgas.class);
                        startActivity(intentas5);
                        break;
                    case 8:
                        skamb();
                        Intent intentas6 = new Intent(MazeikiuLinksmybes.this, plaukimas.class);
                        startActivity(intentas6);
                        break;
                    case 9:
                        skamb();
                        Intent intentas7 = new Intent(MazeikiuLinksmybes.this, tenis.class);
                        startActivity(intentas7);
                        break;
                    case 10:
                        skamb();
                        String daugiau = HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_0BN8_WZJZ_EOTA6_ATVL66_QDG_Q_PRAMOGOS_MA_C5_BEEIKIUOSE_OQ_PRAMOGOS_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_3_0I19K1J0I22I30I19K1_1461143_1462748_0_1463046_11_11_0_0_0_0_77_651_11_11_0_0_1_1_64_PSY_AB_0_11_649_0J0I22I30K1_0_ABX5_SWY_U22C;
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                        startActivity(i);
                        break;
                }
            }
        });

    }
}