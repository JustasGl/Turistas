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

public class TauragesNakvynes extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_NMZ8_WA_WDO8_TX6_AT0Q7ZG_BG_Q_NAKVYN_C4_97S_TAURAG_C4_97JE_OQ_NAKVYN_C4_97S_TAURAG_C4_97JE_GS_L_PSY_AB_3_0I22I30K1L2_11459_18466_0_18658_11_10_1_0_0_0_104_660_9J1_10_0_0_1_1_64_PSY_AB_0_11_661_0J35I39K1J0I30K1J0I8I13I30K1_0_7JU_APEW_I6_FY = "https://www.google.lt/search?rlz=1C1CHBF_enLT747LT747&ei=NMz8WaWDO8TX6AT0q7zgBg&q=Nakvyn%C4%97s+Taurag%C4%97je&oq=Nakvyn%C4%97s+Taurag%C4%97je&gs_l=psy-ab.3..0i22i30k1l2.11459.18466.0.18658.11.10.1.0.0.0.104.660.9j1.10.0....0...1.1.64.psy-ab..0.11.661...0j35i39k1j0i30k1j0i8i13i30k1.0.7juAPewI6FY";
    public static final String GLOBEPARK = "Globepark";
    public static final String VYTAUTO_BAMSO_SODYBA = "Vytauto Bamso Sodyba";
    public static final String TAURAGĖS_VIEŠBUTIS = "Tauragės viešbutis";
    public static final String TOP_3_VIEŠBUČIŲ = "Top 3 Viešbučių";
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
        mMediaPlayer = MediaPlayer.create(TauragesNakvynes.this, R.raw.garsas);
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


        final ArrayList<word> Taunakvynes = new ArrayList<word>();
        Taunakvynes.add(new word(R.drawable.taurages_nakvynes, TOP_3_VIEŠBUČIŲ));
        Taunakvynes.add(new word(R.drawable.tauragesviesbutis, TAURAGĖS_VIEŠBUTIS));
        Taunakvynes.add(new word(R.drawable.vytautobamso, VYTAUTO_BAMSO_SODYBA));
        Taunakvynes.add(new word(R.drawable.globepark, GLOBEPARK));
        Taunakvynes.add(new word(R.drawable.daugiaup, ""));

        Adaptoreditor adapteris = new Adaptoreditor(TauragesNakvynes.this, Taunakvynes);
        ListView Listtranslated = (ListView)findViewById(R.id.list);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                word listas = Taunakvynes.get(position);

                switch (position){
                    case 1:
                        skamb ();
                        Intent intent = new Intent(TauragesNakvynes.this, tauragesviesbutis.class);
                        startActivity(intent);
                        break;
                    case 2:
                        skamb ();
                        Intent intentas = new Intent(TauragesNakvynes.this, vytautobamso.class);
                        startActivity(intentas);
                        break;
                    case 3:
                        skamb ();
                        Intent intentas1 = new Intent(TauragesNakvynes.this, globepark.class);
                        startActivity(intentas1);
                        break;
                    case 4:
                        skamb ();
                        String daugiau = HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_NMZ8_WA_WDO8_TX6_AT0Q7ZG_BG_Q_NAKVYN_C4_97S_TAURAG_C4_97JE_OQ_NAKVYN_C4_97S_TAURAG_C4_97JE_GS_L_PSY_AB_3_0I22I30K1L2_11459_18466_0_18658_11_10_1_0_0_0_104_660_9J1_10_0_0_1_1_64_PSY_AB_0_11_661_0J35I39K1J0I30K1J0I8I13I30K1_0_7JU_APEW_I6_FY;
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                        startActivity(i);
                        break;
                }
            }
        });
    }
}
