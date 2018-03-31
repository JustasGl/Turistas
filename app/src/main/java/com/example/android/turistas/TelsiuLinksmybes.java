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

public class TelsiuLinksmybes extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_VC_D8_WD2_PHU_LG6_ASA7P7_ACW_Q_PRAMOGOS_TELSIUOSE_OQ_PRAMOGOS_TELSIUOSE_GS_L_PSY_AB_3_0J0I5I30K1J0I8I30K1_2315_4594_0_6489_4_4_0_0_0_0_68_244_4_4_0_0_1_1_64_PSY_AB_0_4_242_0I13K1J0I13I5I30K1J0I8I13I30K1J0I13I30K1_0_6_RB_GBAZ2_DEQ = "https://www.google.lt/search?rlz=1C1CHBF_enLT747LT747&ei=VcD8Wd2PHuLg6ASA7p7ACw&q=Pramogos+Telsiuose&oq=Pramogos+Telsiuose&gs_l=psy-ab.3..0j0i5i30k1j0i8i30k1.2315.4594.0.6489.4.4.0.0.0.0.68.244.4.4.0....0...1.1.64.psy-ab..0.4.242...0i13k1j0i13i5i30k1j0i8i13i30k1j0i13i30k1.0.6RbGBAZ2DEQ";
    public static final String BASEINAI = "Baseinai";
    public static final String ŽIRGYNAI = "Žirgynai";
    public static final String KINO_TEATRAS = "„Kino teatras";
    public static final String AERODROMAS = "Aerodromas";
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
        mMediaPlayer = MediaPlayer.create(TelsiuLinksmybes.this, R.raw.garsas);
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

        final ArrayList<word> Tlinksmybes = new ArrayList<word>();
        Tlinksmybes.add(new word(R.drawable.bildukas, ŠOKIAI));
        Tlinksmybes.add(new word(R.drawable.boulingas, BOULINGAS));
        Tlinksmybes.add(new word(R.drawable.parachute, AERODROMAS));
        Tlinksmybes.add(new word(R.drawable.movie, KINO_TEATRAS));
        Tlinksmybes.add(new word(R.drawable.zirgas, ŽIRGYNAI));
        Tlinksmybes.add(new word(R.drawable.plaukimas, BASEINAI));
        Tlinksmybes.add(new word(R.drawable.daugiauk, ""));

        Adaptorgrid adapteris = new Adaptorgrid(TelsiuLinksmybes.this, Tlinksmybes);
        GridView Listtranslated = (GridView) findViewById(R.id.grid);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                word listas = Tlinksmybes.get(position);
                skamb();
                switch (position) {
                    case 0:
                        Intent intents = new Intent(TelsiuLinksmybes.this, tklubai.class);
                        startActivity(intents);
                        break;
                    case 1:
                        Intent intent = new Intent(TelsiuLinksmybes.this, tboulingas.class);
                        startActivity(intent);
                        break;
                    case 2:
                        Intent intentas3 = new Intent(TelsiuLinksmybes.this, aerodromas.class);
                        startActivity(intentas3);
                        break;
                    case 3:
                        Intent intentas4 = new Intent(TelsiuLinksmybes.this, tkinoteatras.class);
                        startActivity(intentas4);
                        break;
                    case 4:
                        Intent intentas5 = new Intent(TelsiuLinksmybes.this, tzirgas.class);
                        startActivity(intentas5);
                        break;
                    case 5:
                        Intent intentas6 = new Intent(TelsiuLinksmybes.this, tbaseinai.class);
                        startActivity(intentas6);
                        break;
                    case 6:
                        String daugiau = HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_VC_D8_WD2_PHU_LG6_ASA7P7_ACW_Q_PRAMOGOS_TELSIUOSE_OQ_PRAMOGOS_TELSIUOSE_GS_L_PSY_AB_3_0J0I5I30K1J0I8I30K1_2315_4594_0_6489_4_4_0_0_0_0_68_244_4_4_0_0_1_1_64_PSY_AB_0_4_242_0I13K1J0I13I5I30K1J0I8I13I30K1J0I13I30K1_0_6_RB_GBAZ2_DEQ;
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                        startActivity(i);
                        break;
                }
            }
        });

    }
}
