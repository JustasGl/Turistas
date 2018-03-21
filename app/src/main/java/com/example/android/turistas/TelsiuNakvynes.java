package com.example.android.turistas;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TelsiuNakvynes extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_8SV8_WFMA_EO_XR6_ASD9_ZHICQ_Q_NAKVYN_C4_97S_TEL_C5_A1IUOSE_OQ_NAKVYN_C4_97S_TEL_C5_A1IUOSE_GS_L_PSY_AB_3_0I22I30K1L2_64094_65494_0_65614_9_9_0_0_0_0_73_520_8_8_0_0_1_1_64_PSY_AB_1_8_516_0_WKTL_TI4BMBK = "https://www.google.lt/search?rlz=1C1CHBF_enLT747LT747&ei=8sv8WfmaEoXR6ASd9ZHICQ&q=Nakvyn%C4%97s+Tel%C5%A1iuose&oq=Nakvyn%C4%97s+Tel%C5%A1iuose&gs_l=psy-ab.3..0i22i30k1l2.64094.65494.0.65614.9.9.0.0.0.0.73.520.8.8.0....0...1.1.64.psy-ab..1.8.516....0.wktlTi4bmbk";
    public static final String ARNAKVYNE = "ARNAKVYNE";
    public static final String VIEŠBUTIS_SINCHRONAS = "Viešbutis Sinchronas";
    public static final String PAS_STEFĄ = "Pas Stefą";
    public static final String VIEŠBUTIS_TELŠIAI = "Viešbutis     Telšiai ";
    public static final String MEŠKOS_GUOLIS = "Meškos Guolis ";
    public static final String DŽIUGO_KALNAS = " Džiugo Kalnas ";
    public static final String TOP_5_VIEŠBUČIŲ = "Top 5 Viešbučių";
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
        mMediaPlayer = MediaPlayer.create(TelsiuNakvynes.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

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

        final ArrayList<word> Tnakvynes = new ArrayList<word>();
        Tnakvynes.add(new word(R.drawable.telsiu_nakvynes, TOP_5_VIEŠBUČIŲ));
        Tnakvynes.add(new word(R.drawable.dziugokalnas, DŽIUGO_KALNAS));
        Tnakvynes.add(new word(R.drawable.meskosguolis, MEŠKOS_GUOLIS));
        Tnakvynes.add(new word(R.drawable.viesbutistelsiai, VIEŠBUTIS_TELŠIAI));
        Tnakvynes.add(new word(R.drawable.passtefa, PAS_STEFĄ));
        Tnakvynes.add(new word(R.drawable.sinchronas, VIEŠBUTIS_SINCHRONAS));
        Tnakvynes.add(new word(R.drawable.daugiaup, ""));

        Adaptoreditor adapteris = new Adaptoreditor(TelsiuNakvynes.this, Tnakvynes);
        ListView Listtranslated = (ListView)findViewById(R.id.list);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                word listas = Tnakvynes.get(position);

                switch (position){
                    case 1:
                        skamb ();
                        Intent intent = new Intent(TelsiuNakvynes.this, dziugokalnas.class);
                        startActivity(intent);
                        break;
                    case 2:
                        skamb ();
                        Intent intentas = new Intent(TelsiuNakvynes.this, meskosguolis.class);
                        startActivity(intentas);
                        break;
                    case 3:
                        skamb ();
                        Intent intentas1 = new Intent(TelsiuNakvynes.this, viesbutistelsiai.class);
                        startActivity(intentas1);
                        break;
                    case 4:
                        skamb ();
                        Intent intentas2 = new Intent(TelsiuNakvynes.this, passtefa.class);
                        startActivity(intentas2);
                        break;
                    case 5:
                        skamb ();
                        Intent intentas3 = new Intent(TelsiuNakvynes.this, guesthouse.class);
                        intentas3.putExtra(ARNAKVYNE,true);
                        startActivity(intentas3);
                        break;
                    case 6:
                        skamb ();
                        String daugiau = HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_8SV8_WFMA_EO_XR6_ASD9_ZHICQ_Q_NAKVYN_C4_97S_TEL_C5_A1IUOSE_OQ_NAKVYN_C4_97S_TEL_C5_A1IUOSE_GS_L_PSY_AB_3_0I22I30K1L2_64094_65494_0_65614_9_9_0_0_0_0_73_520_8_8_0_0_1_1_64_PSY_AB_1_8_516_0_WKTL_TI4BMBK;
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                        startActivity(i);
                        break;
                }
            }
        });
    }
}
