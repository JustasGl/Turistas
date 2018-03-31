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

public class TelsiuRestoranai_fragment extends Fragment {

    public static final String HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_8_P8_WF_TO_EC_LX6_QSHW76O_DQ_Q_RESTORANAI_TEL_C5_A1IUOSE_OQ_RESTORANAI_TEL_C5_A1IUOSE_GS_L_PSY_AB_3_0I19K1J0I22I10I30I19K1_112270_114908_0_115740_9_9_0_0_0_0_74_612_9_9_0_0_1_1_64_PSY_AB_0_9_610_0J0I20I263K1J0I22I30K1J0I22I30I19K1_0_FVND_MWUHBO8 = "https://www.google.lt/search?rlz=1C1CHBF_enLT747LT747&ei=_8P8WfToEcLX6QShw76oDQ&q=Restoranai+Tel%C5%A1iuose&oq=Restoranai+Tel%C5%A1iuose&gs_l=psy-ab.3..0i19k1j0i22i10i30i19k1.112270.114908.0.115740.9.9.0.0.0.0.74.612.9.9.0....0...1.1.64.psy-ab..0.9.610...0j0i20i263k1j0i22i30k1j0i22i30i19k1.0.fvndMWUHbo8";
    public static final String ARNAKVYNE = "ARNAKVYNE";
    public static final String LISITĖJA = "Lisitėja";
    public static final String JONŽIEDIS = "Jonžiedis";
    public static final String RAUDONASIS_ŠANCHAJUS = "Raudonasis Šanchajus";
    public static final String ANT_KALNO = "Ant kalno";
    public static final String SENOJI_KVORTA = "Senoji Kvorta";
    public static final String SVEČIŲ_NAMAI_SINCHRONAS = "Svečių namai Sinchronas";
    public static final String JANČAUSKIENĖS = "Jančauskienės";
    public static final String TELA = "Tela";
    public static final String TEATRO_KAVINĖ = "Teatro kavinė";
    public static final String DŽIUGO_NAMAI = "Džiugo namai";
    public static final String UŽSUKITE_TELŠIUOSE = "Užsukite Telšiuose";
    private MediaPlayer mMediaPlayer;
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };

    public TelsiuRestoranai_fragment() {
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

        final ArrayList<word> Trestoranai = new ArrayList<word>();
        Trestoranai.add(new word(R.drawable.telsiu_restoranai, UŽSUKITE_TELŠIUOSE));
        Trestoranai.add(new word(R.drawable.dziugonamai, DŽIUGO_NAMAI));
        Trestoranai.add(new word(R.drawable.teatro, TEATRO_KAVINĖ));
        Trestoranai.add(new word(R.drawable.tela, TELA));
        Trestoranai.add(new word(R.drawable.ljancauskienes, JANČAUSKIENĖS));
        Trestoranai.add(new word(R.drawable.guesthouse, SVEČIŲ_NAMAI_SINCHRONAS));
        Trestoranai.add(new word(R.drawable.oldquart, SENOJI_KVORTA));
        Trestoranai.add(new word(R.drawable.antkalno, ANT_KALNO));
        Trestoranai.add(new word(R.drawable.raudonasissanchajus, RAUDONASIS_ŠANCHAJUS));
        Trestoranai.add(new word(R.drawable.jonziedis, JONŽIEDIS));
        Trestoranai.add(new word(R.drawable.lisiteja, LISITĖJA));
        Trestoranai.add(new word(R.drawable.daugiaup, ""));

        Adaptoreditor adapteris = new Adaptoreditor(getActivity(), Trestoranai);
        ListView Listtranslated = (ListView) rootView.findViewById(R.id.list);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                word listas = Trestoranai.get(position);

                switch (position) {
                    case 1:
                        skamb();
                        Intent intent = new Intent(getActivity(), dziugonamai.class);
                        startActivity(intent);
                        break;
                    case 2:
                        skamb();
                        Intent intentas = new Intent(getActivity(), teatrokavine.class);
                        startActivity(intentas);
                        break;
                    case 3:
                        skamb();
                        Intent intentas1 = new Intent(getActivity(), tela.class);
                        startActivity(intentas1);
                        break;
                    case 4:
                        skamb();
                        Intent intentas2 = new Intent(getActivity(), jancauskienes.class);
                        startActivity(intentas2);
                        break;
                    case 5:
                        skamb();
                        Intent intentas3 = new Intent(getActivity(), guesthouse.class);
                        intentas3.putExtra(ARNAKVYNE, false);
                        startActivity(intentas3);
                        break;
                    case 6:
                        skamb();
                        Intent intentas4 = new Intent(getActivity(), oldquart.class);
                        startActivity(intentas4);
                        break;
                    case 7:
                        skamb();
                        Intent intentas5 = new Intent(getActivity(), antkalno.class);
                        startActivity(intentas5);
                        break;
                    case 8:
                        skamb();
                        Intent intentas6 = new Intent(getActivity(), sanchajus.class);
                        startActivity(intentas6);
                        break;
                    case 9:
                        skamb();
                        Intent intentas7 = new Intent(getActivity(), jonziedis.class);
                        startActivity(intentas7);
                        break;
                    case 10:
                        skamb();
                        Intent intentas8 = new Intent(getActivity(), lisiteja.class);
                        startActivity(intentas8);
                        break;
                    case 11:
                        skamb();
                        String daugiau = HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_8_P8_WF_TO_EC_LX6_QSHW76O_DQ_Q_RESTORANAI_TEL_C5_A1IUOSE_OQ_RESTORANAI_TEL_C5_A1IUOSE_GS_L_PSY_AB_3_0I19K1J0I22I10I30I19K1_112270_114908_0_115740_9_9_0_0_0_0_74_612_9_9_0_0_1_1_64_PSY_AB_0_9_610_0J0I20I263K1J0I22I30K1J0I22I30I19K1_0_FVND_MWUHBO8;
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
