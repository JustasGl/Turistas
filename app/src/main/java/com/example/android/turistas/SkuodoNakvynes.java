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
import android.widget.ListView;

import java.util.ArrayList;

public class SkuodoNakvynes extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_ZCZ8_WF6V_MOQR6_AS_Z7J_YCA_Q_NAKVYN_C4_97S_SKUODE_OQ_NAKVYN_C4_97S_SKUODE_GS_L_PSY_AB_3_0I22I30K1_1729_3977_0_4449_6_6_0_0_0_0_124_441_5J1_6_0_0_1_1_64_PSY_AB_0_5_376_33I160K1_0_DQ_AFZY7OM_VI = "https://www.google.lt/search?rlz=1C1CHBF_enLT747LT747&ei=Zcz8Wf6vMoqr6AS_z7jYCA&q=Nakvyn%C4%97s+Skuode&oq=Nakvyn%C4%97s+Skuode&gs_l=psy-ab.3..0i22i30k1.1729.3977.0.4449.6.6.0.0.0.0.124.441.5j1.6.0....0...1.1.64.psy-ab..0.5.376...33i160k1.0.dqAFzy7omVI";
    public static final String ARNAKVYNE = "ARNAKVYNE";
    public static final String UŽEIGA_AROMA = "Užeiga Aroma";
    public static final String PAS_NERIJŲ = "Pas Nerijų";
    public static final String TOP_2_VIEŠBUČIŲ = "Top 2 Viešbučių";
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
        mMediaPlayer = MediaPlayer.create(SkuodoNakvynes.this, R.raw.garsas);
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


        final ArrayList<word> Skuodonakvynes = new ArrayList<word>();
        Skuodonakvynes.add(new word(R.drawable.skuodo_nakvynes, TOP_2_VIEŠBUČIŲ));
        Skuodonakvynes.add(new word(R.drawable.pasneriju2, PAS_NERIJŲ));
        Skuodonakvynes.add(new word(R.drawable.aroma, UŽEIGA_AROMA));
        Skuodonakvynes.add(new word(R.drawable.daugiaup, ""));

        Adaptoreditor adapteris = new Adaptoreditor(SkuodoNakvynes.this, Skuodonakvynes);
        ListView Listtranslated = (ListView) findViewById(R.id.list);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                word listas = Skuodonakvynes.get(position);

                switch (position) {
                    case 1:
                        skamb();
                        Intent intent = new Intent(SkuodoNakvynes.this, pasneriju.class);
                        intent.putExtra(ARNAKVYNE, true);
                        startActivity(intent);
                        break;
                    case 2:
                        skamb();
                        Intent intentas = new Intent(SkuodoNakvynes.this, aroma.class);
                        startActivity(intentas);
                        break;
                    case 3:
                        skamb();
                        String daugiau = HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_ZCZ8_WF6V_MOQR6_AS_Z7J_YCA_Q_NAKVYN_C4_97S_SKUODE_OQ_NAKVYN_C4_97S_SKUODE_GS_L_PSY_AB_3_0I22I30K1_1729_3977_0_4449_6_6_0_0_0_0_124_441_5J1_6_0_0_1_1_64_PSY_AB_0_5_376_33I160K1_0_DQ_AFZY7OM_VI;
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                        startActivity(i);
                        break;
                }
            }
        });
    }
}
