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
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TauragesRestoranai_fragmentas extends Fragment {


    public static final String HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_4C_X8_WERQ_CKXG6_AS1_JJW_BA_Q_RESTORANAI_TAURAG_C4_97JE_OQ_RESTORANAI_TAURAG_C4_97JE_GS_L_PSY_AB_3_0I22I30K1_148820_151268_0_151811_9_9_0_0_0_0_71_572_9_9_0_0_1_1_64_PSY_AB_0_9_569_0J35I39K1J0I20I263K1J0I22I10I30K1_0_I0K_VLV7VU0C = "https://www.google.lt/search?rlz=1C1CHBF_enLT747LT747&ei=4cX8WerqCKXg6AS1-JjwBA&q=Restoranai+Taurag%C4%97je&oq=Restoranai+Taurag%C4%97je&gs_l=psy-ab.3..0i22i30k1.148820.151268.0.151811.9.9.0.0.0.0.71.572.9.9.0....0...1.1.64.psy-ab..0.9.569...0j35i39k1j0i20i263k1j0i22i10i30k1.0.I0kVlv7vu0c";
    public static final String HESBURGER = "Hesburger";
    public static final String EL_GRECO = "El Greco";
    public static final String SKONIO_DŽIAZAS = "Skonio džiazas";
    public static final String STAR_PIZZA = "Star pizza";
    public static final String SAUKSTELIS = "Saukstelis";
    public static final String UŽSUKITE_TAURAGĖJE = "Užsukite Tauragėje";
    private MediaPlayer mMediaPlayer;

    @Override
    public void onStop() {
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
        mMediaPlayer = MediaPlayer.create(getActivity(), R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    public TauragesRestoranai_fragmentas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container,false);

        Toolbar myToolbar = (Toolbar)rootView.findViewById(R.id.my_toolbar);
        myToolbar.setVisibility(View.GONE);

        final ArrayList<word> Taurestoranai = new ArrayList<word>();
        Taurestoranai.add(new word(R.drawable.taurages_restoranai, UŽSUKITE_TAURAGĖJE));
        Taurestoranai.add(new word(R.drawable.saukstelis, SAUKSTELIS));
        Taurestoranai.add(new word(R.drawable.starrpizza, STAR_PIZZA));
        Taurestoranai.add(new word(R.drawable.skoniodziazas, SKONIO_DŽIAZAS));
        Taurestoranai.add(new word(R.drawable.elgreco, EL_GRECO));
        Taurestoranai.add(new word(R.drawable.hesburger, HESBURGER));
        Taurestoranai.add(new word(R.drawable.daugiaup, ""));

        Adaptoreditor adapteris = new Adaptoreditor(getActivity(), Taurestoranai);
        ListView Listtranslated = (ListView)rootView.findViewById(R.id.list);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                word listas = Taurestoranai.get(position);

                switch (position){
                    case 1:
                        skamb ();
                        Intent intent = new Intent(getActivity(), saukstelis.class);
                        startActivity(intent);
                        break;
                    case 2:
                        skamb ();
                        Intent intentas = new Intent(getActivity(), starrpizza.class);
                        startActivity(intentas);
                        break;
                    case 3:
                        skamb ();
                        Intent intentas1 = new Intent(getActivity(), skoniodziazas.class);
                        startActivity(intentas1);
                        break;
                    case 4:
                        skamb ();
                        Intent intentas2 = new Intent(getActivity(), elgreco.class);
                        startActivity(intentas2);
                        break;
                    case 5:
                        skamb ();
                        Intent intentas3 = new Intent(getActivity(), hesburger.class);
                        startActivity(intentas3);
                        break;

                    case 6:
                        skamb ();
                        String daugiau = HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_4C_X8_WERQ_CKXG6_AS1_JJW_BA_Q_RESTORANAI_TAURAG_C4_97JE_OQ_RESTORANAI_TAURAG_C4_97JE_GS_L_PSY_AB_3_0I22I30K1_148820_151268_0_151811_9_9_0_0_0_0_71_572_9_9_0_0_1_1_64_PSY_AB_0_9_569_0J35I39K1J0I20I263K1J0I22I10I30K1_0_I0K_VLV7VU0C;
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                        startActivity(i);
                        break;
                }
            }
        });
        return rootView;
    }

}
