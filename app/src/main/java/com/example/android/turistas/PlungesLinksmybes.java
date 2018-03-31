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

public class PlungesLinksmybes extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_E_MD8_WZM_HBO_WP6_AT8VOF4_CQ_Q_PRAMOGOS_PLUNG_C4_97JE_OQ_PRAMOGOS_PLUNG_C4_97JE_GS_L_PSY_AB_3_0I19K1_30857_32365_0_33725_8_8_0_0_0_0_77_529_8_8_0_0_1_1_64_PSY_AB_0_8_526_0J0I20I263K1J0I22I30K1J0I22I10I30K1J0I22I30I19K1J0I13K1J0I13I5I30K1J0I8I13I30K1_0_GJ94_FCJY_ULK = "https://www.google.lt/search?rlz=1C1CHBF_enLT747LT747&ei=eMD8WZmHBoWP6AT8vof4CQ&q=Pramogos+Plung%C4%97je&oq=Pramogos+Plung%C4%97je&gs_l=psy-ab.3..0i19k1.30857.32365.0.33725.8.8.0.0.0.0.77.529.8.8.0....0...1.1.64.psy-ab..0.8.526...0j0i20i263k1j0i22i30k1j0i22i10i30k1j0i22i30i19k1j0i13k1j0i13i5i30k1j0i8i13i30k1.0.GJ94FCjyULk";
    public static final String TENISAS = "Tenisas";
    public static final String BASEINAI = "Baseinai";
    public static final String ŽIRGYNAI = "Žirgynai";
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
        mMediaPlayer = MediaPlayer.create(PlungesLinksmybes.this, R.raw.garsas);
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

        final ArrayList<word> taulinksmybes = new ArrayList<word>();
        taulinksmybes.add(new word(R.drawable.bildukas, ŠOKIAI));
        taulinksmybes.add(new word(R.drawable.boulingas, BOULINGAS));
        taulinksmybes.add(new word(R.drawable.zirgas, ŽIRGYNAI));
        taulinksmybes.add(new word(R.drawable.plaukimas, BASEINAI));
        taulinksmybes.add(new word(R.drawable.tenis, TENISAS));
        taulinksmybes.add(new word(R.drawable.daugiauk, ""));

        Adaptorgrid adapteris = new Adaptorgrid(PlungesLinksmybes.this, taulinksmybes);
        GridView Listtranslated = (GridView) findViewById(R.id.grid);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                word listas = taulinksmybes.get(position);

                switch (position) {
                    case 0:
                        skamb();
                        Intent intents = new Intent(PlungesLinksmybes.this, pklubai.class);
                        startActivity(intents);
                        break;
                    case 1:
                        skamb();
                        Intent intent = new Intent(PlungesLinksmybes.this, pboulingas.class);
                        startActivity(intent);
                        break;
                    case 2:
                        skamb();
                        Intent intentas5 = new Intent(PlungesLinksmybes.this, pzirgas.class);
                        startActivity(intentas5);
                        break;
                    case 3:
                        skamb();
                        Intent intentas6 = new Intent(PlungesLinksmybes.this, pplaukimas.class);
                        startActivity(intentas6);
                        break;
                    case 4:
                        skamb();
                        Intent intentas7 = new Intent(PlungesLinksmybes.this, ptenis.class);
                        startActivity(intentas7);
                        break;
                    case 5:
                        skamb();
                        String daugiau = HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_E_MD8_WZM_HBO_WP6_AT8VOF4_CQ_Q_PRAMOGOS_PLUNG_C4_97JE_OQ_PRAMOGOS_PLUNG_C4_97JE_GS_L_PSY_AB_3_0I19K1_30857_32365_0_33725_8_8_0_0_0_0_77_529_8_8_0_0_1_1_64_PSY_AB_0_8_526_0J0I20I263K1J0I22I30K1J0I22I10I30K1J0I22I30I19K1J0I13K1J0I13I5I30K1J0I8I13I30K1_0_GJ94_FCJY_ULK;
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                        startActivity(i);
                        break;
                }
            }
        });

    }
}
