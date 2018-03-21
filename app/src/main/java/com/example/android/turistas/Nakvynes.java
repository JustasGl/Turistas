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
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class Nakvynes extends AppCompatActivity {

    public static final String HTTPS_WWW_TURIZMAS_LT_PAIESKA_NAKVYN_C4_97_C5_BDEMAITIJOJE = "https://www.turizmas.lt/paieska/nakvyn%C4%97+%C5%BDemaitijoje";
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
        mMediaPlayer = MediaPlayer.create(Nakvynes.this, R.raw.garsas);
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

        final ArrayList<word> visosNakvynes = new ArrayList<word>();
        visosNakvynes.add(new word(R.drawable.restoranaimazeikiuose, MAŽEIKIAI));
        visosNakvynes.add(new word(R.drawable.restoranai_telsiuose, TELŠIAI));
        visosNakvynes.add(new word(R.drawable.restoranai_siauliuose, ŠIAULIAI));
        visosNakvynes.add(new word(R.drawable.restoranai_taurageje, TAURAGĖ));
        visosNakvynes.add(new word(R.drawable.restoranai_plungeje, PLUNGĖ));
        visosNakvynes.add(new word(R.drawable.restoranai_kretingoje, KRETINGA));
        visosNakvynes.add(new word(R.drawable.restoranai_skuode, SKUODAS));
        visosNakvynes.add(new word(R.drawable.daugiaup, ""));

        Adaptoreditor adapteris = new Adaptoreditor(Nakvynes.this, visosNakvynes);
        ListView Listtranslated = (ListView)findViewById(R.id.list);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                word listas = visosNakvynes.get(position);

                switch (position) {
                    case 0:
                        skamb ();
                        Intent intent = new Intent(Nakvynes.this, MazeikiuNakvynes.class);
                        startActivity(intent);
                        break;
                    case 1:
                        skamb ();
                        Intent intentas = new Intent(Nakvynes.this, TelsiuNakvynes.class);
                        startActivity(intentas);
                        break;
                    case 2:
                        skamb ();
                        Intent intentas1 = new Intent(Nakvynes.this, SiauliuNakvynes.class);
                        startActivity(intentas1);
                        break;
                    case 3:
                        skamb ();
                        Intent intentas2 = new Intent(Nakvynes.this, TauragesNakvynes.class);
                        startActivity(intentas2);
                        break;
                    case 4:
                        skamb ();
                        Intent intentas3 = new Intent(Nakvynes.this, PlungesNakvynes.class);
                        startActivity(intentas3);
                        break;
                    case 5:
                        skamb ();
                        Intent intentas4 = new Intent(Nakvynes.this, KretingosNakvynes.class);
                        startActivity(intentas4);
                        break;
                    case 6:
                        skamb ();
                        Intent intentas5 = new Intent(Nakvynes.this, SkuodoNakvynes.class);
                        startActivity(intentas5);
                        break;
                    case 7:
                        skamb ();
                        String daugiau = HTTPS_WWW_TURIZMAS_LT_PAIESKA_NAKVYN_C4_97_C5_BDEMAITIJOJE;
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                        startActivity(i);
                        break;
                }
            }
        });
    }
}
