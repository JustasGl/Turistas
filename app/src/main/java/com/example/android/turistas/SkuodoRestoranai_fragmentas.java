package com.example.android.turistas;


import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SkuodoRestoranai_fragmentas extends Fragment {


    public static final String HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_FMF8_WBJI_BCUE6_ATHR_YTW_DG_Q_RESTORANAI_SKUODE_OQ_RESTORANAI_SKUODE_GS_L_PSY_AB_3_0I22I30K1L2_10263_10988_0_11131_6_6_0_0_0_0_127_493_5J1_6_0_0_1_1_64_PSY_AB_0_6_492_0_0_8I_RN0_X8_EGJO = "https://www.google.lt/search?rlz=1C1CHBF_enLT747LT747&ei=FMf8WbjiBcue6AThrYTwDg&q=Restoranai+Skuode&oq=Restoranai+Skuode&gs_l=psy-ab.3..0i22i30k1l2.10263.10988.0.11131.6.6.0.0.0.0.127.493.5j1.6.0....0...1.1.64.psy-ab..0.6.492...0.0.8iRN0X8EGJo";
    public static final String VESPERA = "Vespera";
    public static final String PAS_NERIJŲ = "Pas Nerijų";
    public static final String UŽSUKITE_SKUODE = "Užsukite Skuode";
    private MediaPlayer mMediaPlayer;
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };

    public SkuodoRestoranai_fragmentas() {
    }

    @Override
    public void onStop() {
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
        mMediaPlayer = MediaPlayer.create(getActivity(), R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        Toolbar myToolbar = (Toolbar) rootView.findViewById(R.id.my_toolbar);
        myToolbar.setVisibility(View.GONE);

        final ArrayList<word> Prestoranai = new ArrayList<word>();
        Prestoranai.add(new word(R.drawable.skuodo_restoranai, UŽSUKITE_SKUODE));
        Prestoranai.add(new word(R.drawable.pasneriju, PAS_NERIJŲ));
        Prestoranai.add(new word(R.drawable.vespera, VESPERA));
        Prestoranai.add(new word(R.drawable.daugiaup, ""));

        Adaptoreditor adapteris = new Adaptoreditor(getActivity(), Prestoranai);
        ListView Listtranslated = (ListView) rootView.findViewById(R.id.list);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                word listas = Prestoranai.get(position);

                switch (position) {
                    case 1:
                        skamb();
                        Intent intent = new Intent(getActivity(), pasneriju.class);
                        startActivity(intent);
                        break;
                    case 2:
                        skamb();
                        Intent intentas = new Intent(getActivity(), vespera.class);
                        startActivity(intentas);
                        break;
                    case 3:
                        skamb();
                        String daugiau = HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_FMF8_WBJI_BCUE6_ATHR_YTW_DG_Q_RESTORANAI_SKUODE_OQ_RESTORANAI_SKUODE_GS_L_PSY_AB_3_0I22I30K1L2_10263_10988_0_11131_6_6_0_0_0_0_127_493_5J1_6_0_0_1_1_64_PSY_AB_0_6_492_0_0_8I_RN0_X8_EGJO;
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                        startActivity(i);
                        break;
                }
            }
        });
        return rootView;
    }

}
