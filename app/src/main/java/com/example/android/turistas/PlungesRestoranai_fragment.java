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
public class PlungesRestoranai_fragment extends Fragment {


    public static final String HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_ECB8_WY_0_NC_WA6_QS196_OW_CQ_Q_RESTORANAI_PLUNG_C4_97JE_OQ_RESTORANAI_PLUNG_C4_97JE_GS_L_PSY_AB_3_0I22I30K1_52384_54025_0_54199_8_8_0_0_0_0_68_505_8_8_0_0_1_1_64_PSY_AB_0_8_501_0J0I13K1J0I13I5I30K1J0I8I13I30K1_0_TUDDRCFWR_U = "https://www.google.lt/search?rlz=1C1CHBF_enLT747LT747&ei=ecb8WY-0NcWA6QS196OwCQ&q=Restoranai+Plung%C4%97je&oq=Restoranai+Plung%C4%97je&gs_l=psy-ab.3..0i22i30k1.52384.54025.0.54199.8.8.0.0.0.0.68.505.8.8.0....0...1.1.64.psy-ab..0.8.501...0j0i13k1j0i13i5i30k1j0i8i13i30k1.0.TUDDRCFwr-U";
    public static final String GRILL_BAR_GANDI = "Grill Bar Gandi";
    public static final String STONKŲ_SODYBA = "Stonkų Sodyba";
    public static final String BRAVO_PIZZA = "Bravo Pizza";
    public static final String UŽSUKITE_PLUNGĖJE = "Užsukite Plungėje";
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

    public PlungesRestoranai_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        Toolbar myToolbar = (Toolbar)rootView.findViewById(R.id.my_toolbar);
        myToolbar.setVisibility(View.GONE);

        final ArrayList<word> Prestoranai = new ArrayList<word>();
        Prestoranai.add(new word(R.drawable.plunges_restoranai, UŽSUKITE_PLUNGĖJE));
        Prestoranai.add(new word(R.drawable.virginijauspicerija, BRAVO_PIZZA));
        Prestoranai.add(new word(R.drawable.stonkusodyba, STONKŲ_SODYBA));
        Prestoranai.add(new word(R.drawable.grilbar, GRILL_BAR_GANDI));
        Prestoranai.add(new word(R.drawable.daugiaup, ""));

        Adaptoreditor adapteris = new Adaptoreditor(getActivity(), Prestoranai);
        ListView Listtranslated = (ListView)rootView.findViewById(R.id.list);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                word listas = Prestoranai.get(position);

                switch (position){
                    case 1:
                        skamb();
                        Intent intent = new Intent(getActivity(), virginijauspicerija.class);
                        startActivity(intent);
                        break;
                    case 2:
                        skamb();
                        Intent intentas = new Intent(getActivity(), stonkusodyba.class);
                        startActivity(intentas);
                        break;
                    case 3:
                        skamb();
                        Intent intentas1 = new Intent(getActivity(), grilbar.class);
                        startActivity(intentas1);
                        break;
                    case 4:
                        skamb();
                        String daugiau = HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_ECB8_WY_0_NC_WA6_QS196_OW_CQ_Q_RESTORANAI_PLUNG_C4_97JE_OQ_RESTORANAI_PLUNG_C4_97JE_GS_L_PSY_AB_3_0I22I30K1_52384_54025_0_54199_8_8_0_0_0_0_68_505_8_8_0_0_1_1_64_PSY_AB_0_8_501_0J0I13K1J0I13I5I30K1J0I8I13I30K1_0_TUDDRCFWR_U;
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                        startActivity(i);
                        break;
                }
            }
        });
        return rootView;
    }

}
