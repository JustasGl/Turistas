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

import com.example.android.turistas.Adaptoreditor;
import com.example.android.turistas.Black_Bar;
import com.example.android.turistas.R;
import com.example.android.turistas.Sbaras;
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

public class SiauliuRestoranai_fragment extends Fragment {


    private MediaPlayer mMediaPlayer;
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };

    public SiauliuRestoranai_fragment() {
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

        final ArrayList<word> Srestoranai = new ArrayList<word>();
        Srestoranai.add(new word(R.drawable.siauliu_restoranai, this.getString(R.string.UzsukiteSiauliuose)));
        Srestoranai.add(new word(R.drawable.sbaras, this.getString(R.string.S_Baras)));
        Srestoranai.add(new word(R.drawable.tastestudy, this.getString(R.string.Skonio_studija)));
        Srestoranai.add(new word(R.drawable.sodzius, this.getString(R.string.Senasis_sodzius)));
        Srestoranai.add(new word(R.drawable.blackbar, this.getString(R.string.Black_Bar)));
        Srestoranai.add(new word(R.drawable.siauliuarkos, this.getString(R.string.Arkos)));
        Srestoranai.add(new word(R.drawable.donvino, this.getString(R.string.DonVino)));
        Srestoranai.add(new word(R.drawable.juone_pastuoge, this.getString(R.string.Juone_pastuoge)));
        Srestoranai.add(new word(R.drawable.my_thai, this.getString(R.string.My_thai)));
        Srestoranai.add(new word(R.drawable.can_can, this.getString(R.string.Can_Can)));
        Srestoranai.add(new word(R.drawable.blic_bar, this.getString(R.string.Blic_Bar)));
        Srestoranai.add(new word(R.drawable.daugiaup, ""));

        Adaptoreditor adapteris = new Adaptoreditor(getActivity(), Srestoranai);
        ListView Listtranslated = (ListView) rootView.findViewById(R.id.list);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                switch (position) {
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
                        String daugiau = getActivity().getString(R.string.Google_Siauliu_Restoranai);
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                        startActivity(i);
                        break;
                }

            }
        });
        return rootView;
    }

}
