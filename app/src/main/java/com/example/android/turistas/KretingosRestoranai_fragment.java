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
public class KretingosRestoranai_fragment extends Fragment {


    public static final String HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_S_MB8_WF_CY_OQI_C6_QSUN_K_W_DG_Q_RESTORANAI_KRETINGOJE_OQ_RESTORANAI_KRETINGOJE_GS_L_PSY_AB_3_0J0I22I30K1L3_95439_97930_0_98090_10_10_0_0_0_0_96_655_10_10_0_0_1_1_64_PSY_AB_0_10_655_0_V7_TO_VOZZIK4 = "https://www.google.lt/search?rlz=1C1CHBF_enLT747LT747&ei=sMb8WfCyOqiC6QSunK_wDg&q=Restoranai+Kretingoje&oq=Restoranai+Kretingoje&gs_l=psy-ab.3..0j0i22i30k1l3.95439.97930.0.98090.10.10.0.0.0.0.96.655.10.10.0....0...1.1.64.psy-ab..0.10.655....0.v7ToVOZZik4";
    public static final String VIENARAGIO_MALŪNAS = "Vienaragio malūnas";
    public static final String SMAGRATIS = "Smagratis";
    public static final String PAS_GRAFĄ = "Pas grafą";
    public static final String UŽSUKITE_KRETINGOJE = "Užsukite Kretingoje";
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

    public KretingosRestoranai_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container,false);

        Toolbar myToolbar = (Toolbar)rootView.findViewById(R.id.my_toolbar);
        myToolbar.setVisibility(View.GONE);

        final ArrayList<word> Prestoranai = new ArrayList<word>();
        Prestoranai.add(new word(R.drawable.kretingos_restoranai, UŽSUKITE_KRETINGOJE));
        Prestoranai.add(new word(R.drawable.pasgrafa, PAS_GRAFĄ));
        Prestoranai.add(new word(R.drawable.smagratis, SMAGRATIS));
        Prestoranai.add(new word(R.drawable.vienaragiomalunas, VIENARAGIO_MALŪNAS));
        Prestoranai.add(new word(R.drawable.daugiaup, ""));

        Adaptoreditor adapteris = new Adaptoreditor(getActivity(), Prestoranai);
        ListView Listtranslated = (ListView)rootView.findViewById(R.id.list);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {


                switch (position){
                    case 1:
                        skamb ();
                        Intent intent = new Intent(getActivity(), pasgrafa.class);
                        startActivity(intent);
                        break;
                    case 2:
                        skamb ();
                        Intent intentas = new Intent(getActivity(), smagratis.class);
                        startActivity(intentas);
                        break;
                    case 3:
                        skamb ();
                        Intent intentas1 = new Intent(getActivity(), vienaragiomalunas.class);
                        startActivity(intentas1);
                        break;
                    case 4:
                        skamb ();
                        String daugiau = HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_S_MB8_WF_CY_OQI_C6_QSUN_K_W_DG_Q_RESTORANAI_KRETINGOJE_OQ_RESTORANAI_KRETINGOJE_GS_L_PSY_AB_3_0J0I22I30K1L3_95439_97930_0_98090_10_10_0_0_0_0_96_655_10_10_0_0_1_1_64_PSY_AB_0_10_655_0_V7_TO_VOZZIK4;
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                        startActivity(i);
                        break;
                }
            }
        });
        return rootView;
    }

}
