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

public class PlungesNakvynes extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_SMZ8_WBEV_IU_KN6_ASC_7Y4_DA_Q_NAKVYN_C4_97S_PLUNG_C4_97JE_OQ_NAKVYN_C4_97S_PLUNG_C4_97JE_GS_L_PSY_AB_3_0I13I30K1J0I22I30K1L2J0I13I5I30K1J0I8I13I30K1L3_12131_14963_0_15379_8_8_0_0_0_0_76_503_8_8_0_0_1_1_64_PSY_AB_0_8_503_0_TMZ_BCYIE_U0_U = "https://www.google.lt/search?rlz=1C1CHBF_enLT747LT747&ei=SMz8WbevIuKn6ASC_7y4DA&q=Nakvyn%C4%97s+Plung%C4%97je&oq=Nakvyn%C4%97s+Plung%C4%97je&gs_l=psy-ab.3..0i13i30k1j0i22i30k1l2j0i13i5i30k1j0i8i13i30k1l3.12131.14963.0.15379.8.8.0.0.0.0.76.503.8.8.0....0...1.1.64.psy-ab..0.8.503....0.tmzBCyieU0U";
    public static final String HOTEL_PORTO = "Hotel Porto";
    public static final String KRISTA_APARTMENTS = "Krista Apartments";
    public static final String NG_APARTMENTS = "NG Apartments ";
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
        mMediaPlayer = MediaPlayer.create(PlungesNakvynes.this, R.raw.garsas);
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


        final ArrayList<word> Pnakvynes = new ArrayList<word>();
        Pnakvynes.add(new word(R.drawable.plunges_nakvynes, TOP_3_VIEŠBUČIŲ));
        Pnakvynes.add(new word(R.drawable.ngapartments, NG_APARTMENTS));
        Pnakvynes.add(new word(R.drawable.kristapartments, KRISTA_APARTMENTS));
        Pnakvynes.add(new word(R.drawable.hotelporto, HOTEL_PORTO));
        Pnakvynes.add(new word(R.drawable.daugiaup, ""));

        Adaptoreditor adapteris = new Adaptoreditor(PlungesNakvynes.this, Pnakvynes);
        ListView Listtranslated = (ListView)findViewById(R.id.list);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                word listas = Pnakvynes.get(position);

                switch (position){
                    case 1:
                        skamb ();
                        Intent intent = new Intent(PlungesNakvynes.this, ngapartments.class);
                        startActivity(intent);
                        break;
                    case 2:
                        skamb ();
                        Intent intentas = new Intent(PlungesNakvynes.this, kristapartments.class);
                        startActivity(intentas);
                        break;
                    case 3:
                        skamb ();
                        Intent intentas1 = new Intent(PlungesNakvynes.this, hotelporto.class);
                        startActivity(intentas1);
                        break;
                    case 4:
                        skamb ();
                        String daugiau = HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_SMZ8_WBEV_IU_KN6_ASC_7Y4_DA_Q_NAKVYN_C4_97S_PLUNG_C4_97JE_OQ_NAKVYN_C4_97S_PLUNG_C4_97JE_GS_L_PSY_AB_3_0I13I30K1J0I22I30K1L2J0I13I5I30K1J0I8I13I30K1L3_12131_14963_0_15379_8_8_0_0_0_0_76_503_8_8_0_0_1_1_64_PSY_AB_0_8_503_0_TMZ_BCYIE_U0_U;
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                        startActivity(i);
                        break;
                }
            }
        });
    }
}
