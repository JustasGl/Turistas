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

public class MazeikiuRestoranai_fragmentas extends Fragment {


    public static final String HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_YMH8_WD_TDM_7B6_QTPYO_OG_CW_Q_RESTORANAI_MA_C5_BEEIKIUOSE_OQ_RESTORANAI_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_3_0I19K1J0I22I30I19K1_662419_669186_0_669586_22_22_0_0_0_0_120_1514_21J1_22_0_0_1_1_64_PSY_AB_0_22_1506_0J35I39K1J0I20I263K1J0I22I30K1_0_P_LL5V_VN1_SI = "https://www.google.lt/search?rlz=1C1CHBF_enLT747LT747&ei=YMH8WdTDM-7b6QTPyoOgCw&q=Restoranai+Ma%C5%BEeikiuose&oq=Restoranai+Ma%C5%BEeikiuose&gs_l=psy-ab.3..0i19k1j0i22i30i19k1.662419.669186.0.669586.22.22.0.0.0.0.120.1514.21j1.22.0....0...1.1.64.psy-ab..0.22.1506...0j35i39k1j0i20i263k1j0i22i30k1.0._pLL5vVN1SI";
    public static final String ARNAKVYNE = "ARNAKVYNE";
    public static final String CHARLIE = "Charlie";
    public static final String CAN_CAN = "Can Can";
    public static final String PICASSO = "Picasso";
    public static final String PALMA = "Palma";
    public static final String ROSSO = "Rosso";
    public static final String ROALA = "Roala";
    public static final String LAISVĖS_30 = "Laisvės 30";
    public static final String HAO_CHI = "Hao Chi";
    public static final String ARKOS = "Arkos";
    public static final String PEKINAS = "Pekinas";
    public static final String UŽSUKITE_MAŽEIKIUOSE = "Užsukite Mažeikiuose";
    private MediaPlayer mMediaPlayer;
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };

    public MazeikiuRestoranai_fragmentas() {
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


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        Toolbar myToolbar = (Toolbar) rootView.findViewById(R.id.my_toolbar);
        myToolbar.setVisibility(View.GONE);
        final ArrayList<word> Mrestoranai = new ArrayList<word>();
        Mrestoranai.add(new word(R.drawable.mazeikiu_restoranai, UŽSUKITE_MAŽEIKIUOSE));
        Mrestoranai.add(new word(R.drawable.pekinas, PEKINAS));
        Mrestoranai.add(new word(R.drawable.arkos, ARKOS));
        Mrestoranai.add(new word(R.drawable.haochi, HAO_CHI));
        Mrestoranai.add(new word(R.drawable.laisves30, LAISVĖS_30));
        Mrestoranai.add(new word(R.drawable.roala, ROALA));
        Mrestoranai.add(new word(R.drawable.rosso, ROSSO));
        Mrestoranai.add(new word(R.drawable.gama, PALMA));
        Mrestoranai.add(new word(R.drawable.picasso, PICASSO));
        Mrestoranai.add(new word(R.drawable.cacan, CAN_CAN));
        Mrestoranai.add(new word(R.drawable.charlie, CHARLIE));
        Mrestoranai.add(new word(R.drawable.daugiaup, ""));

        Adaptoreditor adapteris = new Adaptoreditor(getActivity(), Mrestoranai);
        ListView Listtranslated = (ListView) rootView.findViewById(R.id.list);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {


                switch (position) {
                    case 1:
                        mMediaPlayer = MediaPlayer.create(getActivity(), R.raw.garsas);
                        mMediaPlayer.start();
                        mMediaPlayer.setOnCompletionListener(mCompletionListener);
                        Intent intent = new Intent(getActivity(), pekinas.class);
                        startActivity(intent);
                        break;
                    case 2:
                        skamb();
                        Intent intentas = new Intent(getActivity(), arkos.class);
                        startActivity(intentas);
                        break;
                    case 3:
                        skamb();
                        Intent intentas1 = new Intent(getActivity(), Haochi.class);
                        startActivity(intentas1);
                        break;
                    case 4:
                        skamb();
                        Intent intentas2 = new Intent(getActivity(), Laisves30.class);
                        intentas2.putExtra(ARNAKVYNE, false);
                        startActivity(intentas2);
                        break;
                    case 5:
                        skamb();
                        Intent intentas3 = new Intent(getActivity(), Roala.class);
                        startActivity(intentas3);
                        break;
                    case 6:
                        skamb();
                        Intent intentas4 = new Intent(getActivity(), Rosso.class);
                        startActivity(intentas4);
                        break;
                    case 7:
                        skamb();
                        Intent intentas5 = new Intent(getActivity(), Gama.class);
                        startActivity(intentas5);
                        break;
                    case 8:
                        skamb();
                        Intent intentas6 = new Intent(getActivity(), Picasso.class);
                        startActivity(intentas6);
                        break;
                    case 9:
                        skamb();
                        Intent intentas7 = new Intent(getActivity(), Cancan.class);
                        startActivity(intentas7);
                        break;
                    case 10:
                        skamb();
                        Intent intentas8 = new Intent(getActivity(), Charlie.class);
                        startActivity(intentas8);
                        break;
                    case 11:
                        skamb();
                        String daugiau = HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_YMH8_WD_TDM_7B6_QTPYO_OG_CW_Q_RESTORANAI_MA_C5_BEEIKIUOSE_OQ_RESTORANAI_MA_C5_BEEIKIUOSE_GS_L_PSY_AB_3_0I19K1J0I22I30I19K1_662419_669186_0_669586_22_22_0_0_0_0_120_1514_21J1_22_0_0_1_1_64_PSY_AB_0_22_1506_0J35I39K1J0I20I263K1J0I22I30K1_0_P_LL5V_VN1_SI;
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                        startActivity(i);
                        break;
                }
            }
        });
        return rootView;
    }

    private void skamb() {
        mMediaPlayer = MediaPlayer.create(getActivity(), R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }
}
