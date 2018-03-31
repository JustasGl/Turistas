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

public class SiauliuNakvynes extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_W8Z8_WAS_O5VO_BMZ_EJ_KG_N_Q_NAKVYN_C4_97S_C5_A0IAULIUOSE_OQ_NAKVYN_C4_97S_C5_A0IAULIUOSE_GS_L_PSY_AB_3_0I22I30K1L2_120749_125133_0_125268_19_19_0_0_0_0_78_1188_19_19_0_0_1_1_64_PSY_AB_0_19_1187_0J46J35I39K1J0I46K1J0I10K1J0I30K1J0I8I13I30K1_0_5D_CAQR_WPS2_M = "https://www.google.lt/search?rlz=1C1CHBF_enLT747LT747&ei=w8z8Was_o5voBMzEjKgN&q=Nakvyn%C4%97s+%C5%A0iauliuose&oq=Nakvyn%C4%97s+%C5%A0iauliuose&gs_l=psy-ab.3..0i22i30k1l2.120749.125133.0.125268.19.19.0.0.0.0.78.1188.19.19.0....0...1.1.64.psy-ab..0.19.1187...0j46j35i39k1j0i46k1j0i10k1j0i30k1j0i8i13i30k1.0.5dCAQrWPS2M";
    public static final String GRAFO_ZUBOVO = "Grafo Zubovo";
    public static final String JURO_GUEST_HOUSE = "Juro Guest House";
    public static final String GRAFAITĖ = "Grafaitė";
    public static final String TURNĖ_GUEST_HOUSE = "Turnė Guest House";
    public static final String HOTEL_ŠIAULIAI = "Hotel Šiauliai";
    public static final String TOP_5_VIEŠBUČIŲ = "Top 5 Viešbučių";
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
        mMediaPlayer = MediaPlayer.create(SiauliuNakvynes.this, R.raw.garsas);
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


        final ArrayList<word> Snakvynes = new ArrayList<word>();
        Snakvynes.add(new word(R.drawable.siauliu_nakvynes, TOP_5_VIEŠBUČIŲ));
        Snakvynes.add(new word(R.drawable.hotelsiauliai, HOTEL_ŠIAULIAI));
        Snakvynes.add(new word(R.drawable.turne, TURNĖ_GUEST_HOUSE));
        Snakvynes.add(new word(R.drawable.grafaite, GRAFAITĖ));
        Snakvynes.add(new word(R.drawable.juroh, JURO_GUEST_HOUSE));
        Snakvynes.add(new word(R.drawable.zubovo, GRAFO_ZUBOVO));
        Snakvynes.add(new word(R.drawable.daugiaup, ""));

        Adaptoreditor adapteris = new Adaptoreditor(SiauliuNakvynes.this, Snakvynes);
        ListView Listtranslated = (ListView) findViewById(R.id.list);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                word listas = Snakvynes.get(position);

                switch (position) {
                    case 1:
                        skamb();
                        Intent intent = new Intent(SiauliuNakvynes.this, hotelsiauliai.class);
                        startActivity(intent);
                        break;
                    case 2:
                        skamb();
                        Intent intentas = new Intent(SiauliuNakvynes.this, turne.class);
                        startActivity(intentas);
                        break;
                    case 3:
                        skamb();
                        Intent intentas1 = new Intent(SiauliuNakvynes.this, grafaite.class);
                        startActivity(intentas1);
                        break;
                    case 4:
                        skamb();
                        Intent intentas2 = new Intent(SiauliuNakvynes.this, siauresvartai.class);
                        startActivity(intentas2);
                        break;
                    case 5:
                        skamb();
                        Intent intentas3 = new Intent(SiauliuNakvynes.this, zubovo.class);
                        startActivity(intentas3);
                        break;
                    case 6:
                        skamb();
                        String daugiau = HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_W8Z8_WAS_O5VO_BMZ_EJ_KG_N_Q_NAKVYN_C4_97S_C5_A0IAULIUOSE_OQ_NAKVYN_C4_97S_C5_A0IAULIUOSE_GS_L_PSY_AB_3_0I22I30K1L2_120749_125133_0_125268_19_19_0_0_0_0_78_1188_19_19_0_0_1_1_64_PSY_AB_0_19_1187_0J46J35I39K1J0I46K1J0I10K1J0I30K1J0I8I13I30K1_0_5D_CAQR_WPS2_M;
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                        startActivity(i);
                        break;
                }
            }
        });
    }
}
