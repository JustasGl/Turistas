package layout;


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

import com.example.android.turistas.Adaptoreditor;
import com.example.android.turistas.Black_Bar;
import com.example.android.turistas.R;
import com.example.android.turistas.Sbaras;
import com.example.android.turistas.SiauliuRestoranai;
import com.example.android.turistas.TasteStudy;
import com.example.android.turistas.blic_bar;
import com.example.android.turistas.can_can;
import com.example.android.turistas.donvino;
import com.example.android.turistas.juone_pastuoge;
import com.example.android.turistas.my_thai;
import com.example.android.turistas.siauliuarkos;
import com.example.android.turistas.sodzius;
import com.example.android.turistas.word;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SiauliuRestoranai_fragment extends Fragment {


    public static final String HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_D_MT8_WZCL_DYR36_AT864I4_BQ_Q_RESTORANAI_C5_A0IAULIUOSE_OQ_RESTORANAI_C5_A0IAULIUOSE_GS_L_PSY_AB_3_0J0I22I30K1L5_356008_363880_0_364007_16_14_2_0_0_0_221_1055_11J1J1_13_0_0_1_1_64_PSY_AB_1_15_1064_35I39K1J0I20I263K1J0I22I10I30K1_0_K_ZMRF_P2_QB7_Q = "https://www.google.lt/search?rlz=1C1CHBF_enLT747LT747&ei=dMT8WZClDYr36AT864i4BQ&q=Restoranai+%C5%A0iauliuose&oq=Restoranai+%C5%A0iauliuose&gs_l=psy-ab.3..0j0i22i30k1l5.356008.363880.0.364007.16.14.2.0.0.0.221.1055.11j1j1.13.0....0...1.1.64.psy-ab..1.15.1064...35i39k1j0i20i263k1j0i22i10i30k1.0.kZMrfP2Qb7Q";
    public static final String BLIC_BAR = "Blic Bar";
    public static final String CAN_CAN = "Can Can";
    public static final String MY_THAI = "My thai";
    public static final String JUONE_PASTUOGE = "Juone pastuoge";
    public static final String DON_VINO = "DonVino";
    public static final String ARKOS = "Arkos";
    public static final String BLACK_BAR = "Black Bar";
    public static final String SENASIS_SODZIUS = "Senasis sodzius";
    public static final String SKONIO_STUDIJA = "Skonio studija";
    public static final String S_BARAS = "S Baras";
    public static final String UŽSUKITE_ŠIAULIUOSE = "Užsukite Šiauliuose";
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
    public SiauliuRestoranai_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);
        Toolbar myToolbar = (Toolbar)rootView.findViewById(R.id.my_toolbar);
        myToolbar.setVisibility(View.GONE);

        final ArrayList<word> Srestoranai = new ArrayList<word>();
        Srestoranai.add(new word(R.drawable.siauliu_restoranai, UŽSUKITE_ŠIAULIUOSE));
        Srestoranai.add(new word(R.drawable.sbaras, S_BARAS));
        Srestoranai.add(new word(R.drawable.tastestudy, SKONIO_STUDIJA));
        Srestoranai.add(new word(R.drawable.sodzius, SENASIS_SODZIUS));
        Srestoranai.add(new word(R.drawable.blackbar, BLACK_BAR));
        Srestoranai.add(new word(R.drawable.siauliuarkos, ARKOS));
        Srestoranai.add(new word(R.drawable.donvino, DON_VINO));
        Srestoranai.add(new word(R.drawable.juone_pastuoge, JUONE_PASTUOGE));
        Srestoranai.add(new word(R.drawable.my_thai, MY_THAI));
        Srestoranai.add(new word(R.drawable.can_can, CAN_CAN));
        Srestoranai.add(new word(R.drawable.blic_bar, BLIC_BAR));
        Srestoranai.add(new word(R.drawable.daugiaup, ""));

        Adaptoreditor adapteris = new Adaptoreditor(getActivity(), Srestoranai);
        ListView Listtranslated = (ListView)rootView.findViewById(R.id.list);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                word listas = Srestoranai.get(position);

                switch (position){
                    case 1:
                        skamb();
                        Intent intent = new Intent(getActivity(), Sbaras.class);
                        startActivity(intent);
                        break;
                    case 2:
                        skamb();
                        Intent intentas = new Intent(getActivity(), TasteStudy.class);
                        startActivity(intentas);
                        break;
                    case 3:
                        skamb();
                        Intent intentas1 = new Intent(getActivity(), sodzius.class);
                        startActivity(intentas1);
                        break;
                    case 4:
                        skamb();
                        Intent intentas2 = new Intent(getActivity(), Black_Bar.class);
                        startActivity(intentas2);
                        break;
                    case 5:
                        skamb();
                        Intent intentas3 = new Intent(getActivity(), siauliuarkos.class);
                        startActivity(intentas3);
                        break;
                    case 6:
                        skamb();
                        Intent intentas4 = new Intent(getActivity(), donvino.class);
                        startActivity(intentas4);
                        break;
                    case 7:
                        skamb();
                        Intent intentas5 = new Intent(getActivity(), juone_pastuoge.class);
                        startActivity(intentas5);
                        break;
                    case 8:
                        skamb();
                        Intent intentas6 = new Intent(getActivity(), my_thai.class);
                        startActivity(intentas6);
                        break;
                    case 9:
                        skamb();
                        Intent intentas7 = new Intent(getActivity(), can_can.class);
                        startActivity(intentas7);
                        break;
                    case 10:
                        skamb();
                        Intent intentas8 = new Intent(getActivity(), blic_bar.class);
                        startActivity(intentas8);
                        break;
                    case 11:
                        skamb();
                        String daugiau = HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_D_MT8_WZCL_DYR36_AT864I4_BQ_Q_RESTORANAI_C5_A0IAULIUOSE_OQ_RESTORANAI_C5_A0IAULIUOSE_GS_L_PSY_AB_3_0J0I22I30K1L5_356008_363880_0_364007_16_14_2_0_0_0_221_1055_11J1J1_13_0_0_1_1_64_PSY_AB_1_15_1064_35I39K1J0I20I263K1J0I22I10I30K1_0_K_ZMRF_P2_QB7_Q;
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                        startActivity(i);
                        break;
                }

            }
        });
        return rootView;
    }

}
