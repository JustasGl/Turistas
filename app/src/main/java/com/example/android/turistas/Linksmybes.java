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

public class Linksmybes extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_A8Z8_WB20_CYI_R6_ASM8_ZJW_AQ_Q_PRAMOGOS_C5_BDEMAITIJOJE_OQ_PRAMOGOS_C5_BDEMAITIJOJE_GS_L_PSY_AB_3_0I19K1_79023_86679_0_86839_22_21_1_0_0_0_88_1272_20_20_0_0_1_1_64_PSY_AB_1_21_1272_0J35I39K1J0I5I10I30K1J0I5I30K1J0I22I30K1J0I22I30I19K1J0I13I30K1_0_O_YFA_JFPDA50 = "https://www.google.lt/search?rlz=1C1CHBF_enLT747LT747&ei=a8z8Wb20CYiR6ASm8ZjwAQ&q=Pramogos+%C5%BDemaitijoje&oq=Pramogos+%C5%BDemaitijoje&gs_l=psy-ab.3..0i19k1.79023.86679.0.86839.22.21.1.0.0.0.88.1272.20.20.0....0...1.1.64.psy-ab..1.21.1272...0j35i39k1j0i5i10i30k1j0i5i30k1j0i22i30k1j0i22i30i19k1j0i13i30k1.0.oYfaJFPda50";
    public static final String SKUODAS = "Skuodas";
    public static final String KRETINGA = "Kretinga";
    public static final String PLUNGĖ = "Plungė";
    public static final String TAURAGĖ = "Tauragė";
    public static final String ŠIAULIAI = "Šiauliai";
    public static final String TELŠIAI = "Telšiai";
    public static final String MAŽEIKIAI = "Mažeikiai";
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
        mMediaPlayer = MediaPlayer.create(Linksmybes.this, R.raw.garsas);
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

        final ArrayList<word> visosLinksmybes = new ArrayList<word>();
        visosLinksmybes.add(new word(R.drawable.restoranaimazeikiuose, MAŽEIKIAI));
        visosLinksmybes.add(new word(R.drawable.restoranai_telsiuose, TELŠIAI));
        visosLinksmybes.add(new word(R.drawable.restoranai_siauliuose, ŠIAULIAI));
        visosLinksmybes.add(new word(R.drawable.restoranai_taurageje, TAURAGĖ));
        visosLinksmybes.add(new word(R.drawable.restoranai_plungeje, PLUNGĖ));
        visosLinksmybes.add(new word(R.drawable.restoranai_kretingoje, KRETINGA));
        visosLinksmybes.add(new word(R.drawable.restoranai_skuode, SKUODAS));
        visosLinksmybes.add(new word(R.drawable.daugiaup, ""));

        Adaptoreditor adapteris = new Adaptoreditor(Linksmybes.this, visosLinksmybes);
        ListView Listtranslated = (ListView)findViewById(R.id.list);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                word listas = visosLinksmybes.get(position);

                switch (position) {
                    case 0:
                        skamb();
                        Intent intent = new Intent(Linksmybes.this, MazeikiuLinksmybes.class);
                        startActivity(intent);
                        break;
                    case 1:
                        skamb();
                        Intent intentas = new Intent(Linksmybes.this, TelsiuLinksmybes.class);
                        startActivity(intentas);
                        break;
                    case 2:
                        skamb();
                        Intent intentas1 = new Intent(Linksmybes.this, SiauliuLinksmybes.class);
                        startActivity(intentas1);
                        break;
                    case 3:
                        skamb();
                        Intent intentas2 = new Intent(Linksmybes.this, TauragesLinksmybes.class);
                        startActivity(intentas2);
                        break;
                    case 4:
                        skamb();
                        Intent intentas3 = new Intent(Linksmybes.this, PlungesLinksmybes.class);
                        startActivity(intentas3);
                        break;
                    case 5:
                        skamb();
                        Intent intentas4 = new Intent(Linksmybes.this, KretingosLinksmybes.class);
                        startActivity(intentas4);
                        break;
                    case 6:
                        skamb();
                        Intent intentas5 = new Intent(Linksmybes.this, SkuodoLinksmybes.class);
                        startActivity(intentas5);
                        break;
                    case 7:
                        skamb();
                        String daugiau = HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_A8Z8_WB20_CYI_R6_ASM8_ZJW_AQ_Q_PRAMOGOS_C5_BDEMAITIJOJE_OQ_PRAMOGOS_C5_BDEMAITIJOJE_GS_L_PSY_AB_3_0I19K1_79023_86679_0_86839_22_21_1_0_0_0_88_1272_20_20_0_0_1_1_64_PSY_AB_1_21_1272_0J35I39K1J0I5I10I30K1J0I5I30K1J0I22I30K1J0I22I30I19K1J0I13I30K1_0_O_YFA_JFPDA50;
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                        startActivity(i);
                        break;
                }
            }
        });
    }
}
