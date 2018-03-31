package com.example.android.turistas;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lanktyvtinos_vietos extends AppCompatActivity {


    public static final String HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_IMF8_WEA_FB8F_F6_QSY15_DG_BG_Q_RESTORANAI_C5_BDEMAITIJOJE_OQ_RESTORANAI_C5_BDEMAITIJOJE_GS_L_PSY_AB_3_0I22I30K1_110638_112676_0_112827_11_11_0_0_0_0_88_795_11_11_0_0_1_1_64_PSY_AB_0_11_789_0J33I22I29I30K1J33I160K1_0_AIDJ_PT_SP_NE = "https://www.google.lt/search?rlz=1C1CHBF_enLT747LT747&ei=IMf8WeaFB8fF6QSY15DgBg&q=Restoranai+%C5%BDemaitijoje&oq=Restoranai+%C5%BDemaitijoje&gs_l=psy-ab.3..0i22i30k1.110638.112676.0.112827.11.11.0.0.0.0.88.795.11.11.0....0...1.1.64.psy-ab..0.11.789...0j33i22i29i30k1j33i160k1.0.AidjPtSP-NE";
    public static final String IREIKSME = "IREIKSME";
    public static final String DAUTARŲ_DVARAS = "Dautarų dvaras";
    public static final String ŠALTOJO_KARO_MUZIEJUS = "Šaltojo karo muziejus";
    public static final String ŽEMAIČIŲ_KALVARIJA = "Žemaičių kalvarija";
    public static final String RENAVO_DVARAS = "Renavo dvaras";
    public static final String BIRŽUVĖNŲ_DVARAS = "Biržuvėnų dvaras";
    public static final String LENKIMŲ_ŠV_ONOS_BAŽNYČIA = "Lenkimų Šv. Onos bažnyčia";
    public static final String KRETINGOS_VANDENS_MALŪNAS = "Kretingos vandens malūnas";
    public static final String KRETINGOS_VIEŠPATIES_APREIŠKIMO_ŠVČ_MERGELEI_MARIJAI_PARAPIJA = "Kretingos Viešpaties apreiškimo Švč. Mergelei Marijai parapija";
    public static final String KRETINGOS_MUZIEJUS = "Kretingos muziejus";
    public static final String VENTOS_REGIONINIO_PARKO_APŽVALGOS_BOKŠTAS = "Ventos regioninio parko apžvalgos bokštas";
    public static final String SKULPTŪRŲ_PARKAS = "Skulptūrų parkas";
    public static final String ŽEMAITIJOS_KAIMO_BUITIES_MUZIEJUS = "Žemaitijos kaimo buities muziejus";
    public static final String ŠV_MERGELĖS_MARIJOS_ĖMIMO_Į_DANGŲ_BAŽNYČIA = "Šv. Mergelės Marijos ėmimo į dangų bažnyčia";
    public static final String GARDŲ_OZO_PĖSČIŪJŲ_TAKAS = "Gardų Ozo pėsčiūjų takas";
    public static final String ENERGETINIAI_LABIRINTAI = "Energetiniai labirintai";
    public static final String PLUNGĖS_DVARAS = "Plungės dvaras";
    private MediaPlayer mMediaPlayer;
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onStop() {
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
        mMediaPlayer = MediaPlayer.create(Lanktyvtinos_vietos.this, R.raw.garsas);
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

        final ArrayList<word> visiRestoranai = new ArrayList<word>();
        visiRestoranai.add(new word(R.drawable.plungesdvar, PLUNGĖS_DVARAS));
        visiRestoranai.add(new word(R.drawable.labirintas, ENERGETINIAI_LABIRINTAI));
        visiRestoranai.add(new word(R.drawable.gardu, GARDŲ_OZO_PĖSČIŪJŲ_TAKAS));
        visiRestoranai.add(new word(R.drawable.baznyc, ŠV_MERGELĖS_MARIJOS_ĖMIMO_Į_DANGŲ_BAŽNYČIA));
        visiRestoranai.add(new word(R.drawable.muziejus, ŽEMAITIJOS_KAIMO_BUITIES_MUZIEJUS));
        visiRestoranai.add(new word(R.drawable.skulpturos, SKULPTŪRŲ_PARKAS));
        visiRestoranai.add(new word(R.drawable.restoranai_skuode, VENTOS_REGIONINIO_PARKO_APŽVALGOS_BOKŠTAS));
        visiRestoranai.add(new word(R.drawable.kmuziejus, KRETINGOS_MUZIEJUS));
        visiRestoranai.add(new word(R.drawable.baznycia_plati, KRETINGOS_VIEŠPATIES_APREIŠKIMO_ŠVČ_MERGELEI_MARIJAI_PARAPIJA));
        visiRestoranai.add(new word(R.drawable.malunas_platus, KRETINGOS_VANDENS_MALŪNAS));
        visiRestoranai.add(new word(R.drawable.baznycia_platus, LENKIMŲ_ŠV_ONOS_BAŽNYČIA));
        visiRestoranai.add(new word(R.drawable.birzuvenud_platus, BIRŽUVĖNŲ_DVARAS));
        visiRestoranai.add(new word(R.drawable.renavas_platus, RENAVO_DVARAS));
        visiRestoranai.add(new word(R.drawable.zemkalv_plokscias, ŽEMAIČIŲ_KALVARIJA));
        visiRestoranai.add(new word(R.drawable.skaro_plokscias, ŠALTOJO_KARO_MUZIEJUS));
        visiRestoranai.add(new word(R.drawable.dautarai_plokscias, DAUTARŲ_DVARAS));

        Collections.sort(visiRestoranai, new Comparator<word>() {
            @Override
            public int compare(word word, word t1) {
                return word.getTag().compareTo(t1.getTag());
            }
        });
        visiRestoranai.add(new word(R.drawable.daugiaup, ""));
        Adaptoreditor2 adapteris = new Adaptoreditor2(Lanktyvtinos_vietos.this, visiRestoranai);
        ListView Listtranslated = (ListView) findViewById(R.id.list);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                word listas = visiRestoranai.get(position);

                switch (position) {
                    case 0:
                        skamb();
                        Intent intent = new Intent(Lanktyvtinos_vietos.this, lankytinos_vietosgalerry.class);
                        intent.putExtra(IREIKSME, position);
                        startActivity(intent);
                        break;
                    case 1:
                        skamb();
                        Intent intentas = new Intent(Lanktyvtinos_vietos.this, lankytinos_vietosgalerry.class);
                        intentas.putExtra(IREIKSME, position);
                        startActivity(intentas);
                        break;
                    case 2:
                        skamb();
                        Intent intentas1 = new Intent(Lanktyvtinos_vietos.this, lankytinos_vietosgalerry.class);
                        intentas1.putExtra(IREIKSME, position);
                        startActivity(intentas1);
                        break;
                    case 3:
                        skamb();
                        Intent intentas2 = new Intent(Lanktyvtinos_vietos.this, lankytinos_vietosgalerry.class);
                        intentas2.putExtra(IREIKSME, position);
                        startActivity(intentas2);
                        break;
                    case 4:
                        skamb();
                        Intent intentas3 = new Intent(Lanktyvtinos_vietos.this, lankytinos_vietosgalerry.class);
                        intentas3.putExtra(IREIKSME, position);
                        startActivity(intentas3);
                        break;
                    case 5:
                        skamb();
                        Intent intentas4 = new Intent(Lanktyvtinos_vietos.this, lankytinos_vietosgalerry.class);
                        intentas4.putExtra(IREIKSME, position);
                        startActivity(intentas4);
                        break;
                    case 6:
                        skamb();
                        Intent intentas5 = new Intent(Lanktyvtinos_vietos.this, lankytinos_vietosgalerry.class);
                        intentas5.putExtra(IREIKSME, position);
                        startActivity(intentas5);
                        break;
                    case 7:
                        skamb();
                        Intent intentas6 = new Intent(Lanktyvtinos_vietos.this, lankytinos_vietosgalerry.class);
                        intentas6.putExtra(IREIKSME, position);
                        startActivity(intentas6);
                        break;
                    case 8:
                        skamb();
                        Intent intentas7 = new Intent(Lanktyvtinos_vietos.this, lankytinos_vietosgalerry.class);
                        intentas7.putExtra(IREIKSME, position);
                        startActivity(intentas7);
                        break;
                    case 9:
                        skamb();
                        Intent intentas8 = new Intent(Lanktyvtinos_vietos.this, lankytinos_vietosgalerry.class);
                        intentas8.putExtra(IREIKSME, position);
                        startActivity(intentas8);
                        break;
                    case 10:
                        skamb();
                        Intent intentas9 = new Intent(Lanktyvtinos_vietos.this, lankytinos_vietosgalerry.class);
                        intentas9.putExtra(IREIKSME, position);
                        startActivity(intentas9);
                        break;
                    case 11:
                        skamb();
                        Intent intentas10 = new Intent(Lanktyvtinos_vietos.this, lankytinos_vietosgalerry.class);
                        intentas10.putExtra(IREIKSME, position);
                        startActivity(intentas10);
                        break;
                    case 12:
                        skamb();
                        Intent intentas11 = new Intent(Lanktyvtinos_vietos.this, lankytinos_vietosgalerry.class);
                        intentas11.putExtra(IREIKSME, position);
                        startActivity(intentas11);
                        break;
                    case 13:
                        skamb();
                        Intent intentas12 = new Intent(Lanktyvtinos_vietos.this, lankytinos_vietosgalerry.class);
                        intentas12.putExtra(IREIKSME, position);
                        startActivity(intentas12);
                        break;
                    case 14:
                        skamb();
                        Intent intentas13 = new Intent(Lanktyvtinos_vietos.this, lankytinos_vietosgalerry.class);
                        intentas13.putExtra(IREIKSME, position);
                        startActivity(intentas13);
                        break;
                    case 15:
                        skamb();
                        Intent intentas15 = new Intent(Lanktyvtinos_vietos.this, lankytinos_vietosgalerry.class);
                        intentas15.putExtra(IREIKSME, position);
                        startActivity(intentas15);
                        break;
                    case 16:
                        skamb();
                        String daugiau = HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_IMF8_WEA_FB8F_F6_QSY15_DG_BG_Q_RESTORANAI_C5_BDEMAITIJOJE_OQ_RESTORANAI_C5_BDEMAITIJOJE_GS_L_PSY_AB_3_0I22I30K1_110638_112676_0_112827_11_11_0_0_0_0_88_795_11_11_0_0_1_1_64_PSY_AB_0_11_789_0J33I22I29I30K1J33I160K1_0_AIDJ_PT_SP_NE;
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                        startActivity(i);
                        break;

                }
            }
        });
    }
}
