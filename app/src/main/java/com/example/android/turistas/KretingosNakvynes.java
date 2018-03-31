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

public class KretingosNakvynes extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_WMZ8_WCJ0_M8N_C6_QSO5A_KACA_Q_NAKVYN_C4_97S_KRETINGOJE_OQ_NAKVYN_C4_97S_KRETINGOJE_GS_L_PSY_AB_3_0I22I30K1_8609_10473_0_11993_10_10_0_0_0_0_324_901_9J3_1_10_0_0_1_1_64_PSY_AB_0_8_766_33I160K1_0_G_WRID8_DM7RK = "https://www.google.lt/search?rlz=1C1CHBF_enLT747LT747&ei=WMz8Wcj0M8nC6QSo5aKACA&q=Nakvyn%C4%97s+Kretingoje&oq=Nakvyn%C4%97s+Kretingoje&gs_l=psy-ab.3..0i22i30k1.8609.10473.0.11993.10.10.0.0.0.0.324.901.9j3-1.10.0....0...1.1.64.psy-ab..0.8.766...33i160k1.0.gWRID8Dm7rk";
    public static final String ARNAKVYNE = "ARNAKVYNE";
    public static final String AIROVITA = "Airovita";
    public static final String VIK_GRETA = " VikGreta";
    public static final String SMAGRATIS = "Smagratis";
    public static final String TOP_3_VIEŠBUČIŲ = "Top 3 Viešbučių";
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
        mMediaPlayer = MediaPlayer.create(KretingosNakvynes.this, R.raw.garsas);
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


        final ArrayList<word> Knakvynes = new ArrayList<word>();
        Knakvynes.add(new word(R.drawable.plunges_nakvynes, TOP_3_VIEŠBUČIŲ));
        Knakvynes.add(new word(R.drawable.smagratis, SMAGRATIS));
        Knakvynes.add(new word(R.drawable.vikgreta, VIK_GRETA));
        Knakvynes.add(new word(R.drawable.airovita, AIROVITA));
        Knakvynes.add(new word(R.drawable.daugiaup, ""));

        Adaptoreditor adapteris = new Adaptoreditor(KretingosNakvynes.this, Knakvynes);
        ListView Listtranslated = (ListView) findViewById(R.id.list);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                word listas = Knakvynes.get(position);

                switch (position) {
                    case 1:
                        skamb();
                        Intent intent = new Intent(KretingosNakvynes.this, smagratis.class);
                        intent.putExtra(ARNAKVYNE, true);
                        startActivity(intent);
                        break;
                    case 2:
                        skamb();
                        Intent intentas = new Intent(KretingosNakvynes.this, vikgreta.class);
                        startActivity(intentas);
                        break;
                    case 3:
                        skamb();
                        Intent intentas1 = new Intent(KretingosNakvynes.this, airovita.class);
                        startActivity(intentas1);
                        break;
                    case 4:
                        skamb();
                        String daugiau = HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_WMZ8_WCJ0_M8N_C6_QSO5A_KACA_Q_NAKVYN_C4_97S_KRETINGOJE_OQ_NAKVYN_C4_97S_KRETINGOJE_GS_L_PSY_AB_3_0I22I30K1_8609_10473_0_11993_10_10_0_0_0_0_324_901_9J3_1_10_0_0_1_1_64_PSY_AB_0_8_766_33I160K1_0_G_WRID8_DM7RK;
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                        startActivity(i);
                        break;
                }
            }
        });
    }
}
