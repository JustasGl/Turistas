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

public class MazeikiuNakvynes extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_ICR8_WFE_XKYKV6_ATC34J_QDW_Q_NAKVYN_C4_97S_MA_C5_BEEIKIUOSE_OQ_NAKVYN_C4_97S_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_3_0I22I30K1L3_2612_4228_0_4324_11_11_0_0_0_0_68_615_10_10_0_0_1_1_64_PSY_AB_1_10_613_0_RCSCR8W1_V5S = "https://www.google.lt/search?rlz=1C1CHBF_enLT747LT747&ei=icr8WfeXKYKv6ATc34jQDw&q=Nakvyn%C4%97s+Ma%C5%BEeikiuose&oq=Nakvyn%C4%97s+Ma%C5%BEeikiuose&gs_l=psy-ab.3..0i22i30k1l3.2612.4228.0.4324.11.11.0.0.0.0.68.615.10.10.0....0...1.1.64.psy-ab..1.10.613....0.Rcscr8w1V5s";
    public static final String ARNAKVYNE = "ARNAKVYNE";
    public static final String ASTRUM_PALACE = "Astrum Palace";
    public static final String HOTEL_PALMA = "Hotel Palma";
    public static final String HOTEL_SYNET = "Hotel Synet ";
    public static final String ARKA = "Arka";
    public static final String LAISVES_30 = "Laisves 30";
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
        mMediaPlayer = MediaPlayer.create(MazeikiuNakvynes.this, R.raw.garsas);
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

            final ArrayList<word> Mnakvynes = new ArrayList<word>();
            Mnakvynes.add(new word(R.drawable.mazeikiu_nakvynes, TOP_5_VIEŠBUČIŲ));
            Mnakvynes.add(new word(R.drawable.nlaisves30, LAISVES_30));
            Mnakvynes.add(new word(R.drawable.narkos, ARKA));
            Mnakvynes.add(new word(R.drawable.synet, HOTEL_SYNET));
            Mnakvynes.add(new word(R.drawable.ngama, HOTEL_PALMA));
            Mnakvynes.add(new word(R.drawable.astrum, ASTRUM_PALACE));
            Mnakvynes.add(new word(R.drawable.daugiaup, ""));

            Adaptoreditor adapteris = new Adaptoreditor(MazeikiuNakvynes.this, Mnakvynes);
            ListView Listtranslated = (ListView)findViewById(R.id.list);
            Listtranslated.setAdapter(adapteris);
            Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                    word listas = Mnakvynes.get(position);

                    switch (position){
                        case 1:
                            skamb ();
                            Intent intent = new Intent(MazeikiuNakvynes.this, Laisves30.class);
                            intent.putExtra(ARNAKVYNE,true);
                            startActivity(intent);
                            break;
                        case 2:
                            skamb ();
                            Intent intentas = new Intent(MazeikiuNakvynes.this, arkos.class);
                            intentas.putExtra(ARNAKVYNE,true);
                            startActivity(intentas);
                            break;
                        case 3:
                            skamb ();
                            Intent intentas1 = new Intent(MazeikiuNakvynes.this, synet.class);
                            startActivity(intentas1);
                            break;
                        case 4:
                            skamb ();
                            Intent intentas2 = new Intent(MazeikiuNakvynes.this, Gama.class);
                            intentas2.putExtra(ARNAKVYNE,true);
                            startActivity(intentas2);
                            break;
                        case 5:
                            skamb ();
                            Intent intentas3 = new Intent(MazeikiuNakvynes.this, Rosso.class);
                            intentas3.putExtra(ARNAKVYNE,true);
                            startActivity(intentas3);
                            break;
                        case 6:
                            skamb ();
                            String daugiau = HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_ICR8_WFE_XKYKV6_ATC34J_QDW_Q_NAKVYN_C4_97S_MA_C5_BEEIKIUOSE_OQ_NAKVYN_C4_97S_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_3_0I22I30K1L3_2612_4228_0_4324_11_11_0_0_0_0_68_615_10_10_0_0_1_1_64_PSY_AB_1_10_613_0_RCSCR8W1_V5S;
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                            startActivity(i);
                            break;
                    }
                }
            });
    }
}
