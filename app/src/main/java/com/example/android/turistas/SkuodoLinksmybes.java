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
import android.widget.GridView;

import java.util.ArrayList;

public class SkuodoLinksmybes extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_LT_SEARCH_Q_PRAMOGOS_SKUODE_RLZ_1_C1_CHBF_EN_LT747_LT747_OQ_PRAMOGOS_SKUODE_AQS_CHROME_69I57_6768J0J7_SOURCEID_CHROME_IE_UTF_8 = "https://www.google.lt/search?q=Pramogos+Skuode&rlz=1C1CHBF_enLT747LT747&oq=Pramogos+Skuode&aqs=chrome..69i57.6768j0j7&sourceid=chrome&ie=UTF-8";
    public static final String BASEINAI = "Baseinai";
    public static final String DAŽASVYDIS = "Dažasvydis";
    public static final String ŠOKIAI = "Šokiai";
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
        mMediaPlayer = MediaPlayer.create(SkuodoLinksmybes.this, R.raw.garsas);
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

        final ArrayList<word> Skuodlinksmybes = new ArrayList<word>();
        Skuodlinksmybes.add(new word(R.drawable.bildukas, ŠOKIAI));
        Skuodlinksmybes.add(new word(R.drawable.paintball, DAŽASVYDIS));;
        Skuodlinksmybes.add(new word(R.drawable.plaukimas, BASEINAI));
        Skuodlinksmybes.add(new word(R.drawable.daugiauk, ""));

        Adaptorgrid adapteris = new Adaptorgrid(SkuodoLinksmybes.this, Skuodlinksmybes);
        GridView Listtranslated = (GridView) findViewById(R.id.grid);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                word listas = Skuodlinksmybes.get(position);

                switch (position) {
                    case 0:
                        skamb();
                        Intent intents = new Intent(SkuodoLinksmybes.this, skuodklubai.class);
                        startActivity(intents);
                        break;
                    case 1:
                        skamb();
                        Intent intentas1 = new Intent(SkuodoLinksmybes.this, spaintball.class);
                        startActivity(intentas1);
                        break;
                    case 2:
                        skamb();
                        Intent intentas6 = new Intent(SkuodoLinksmybes.this, skuodplaukimas.class);
                        startActivity(intentas6);
                        break;
                    case 3:
                        skamb();
                        String daugiau = HTTPS_WWW_GOOGLE_LT_SEARCH_Q_PRAMOGOS_SKUODE_RLZ_1_C1_CHBF_EN_LT747_LT747_OQ_PRAMOGOS_SKUODE_AQS_CHROME_69I57_6768J0J7_SOURCEID_CHROME_IE_UTF_8;
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                        startActivity(i);
                        break;
                }
            }
        });

    }
}
