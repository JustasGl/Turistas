package com.example.android.turistas;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class TauragesLinksmybes extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_XMD8_WZPPLKXP6_ATD2_JU_QBW_Q_PRAMOGOS_TAURAG_C4_97JE_OQ_PRAMOGOS_TAURAG_C4_97JE_GS_L_PSY_AB_3_0I19K1_23566_26587_0_26803_9_9_0_0_0_0_122_638_7J2_9_0_0_1_1_64_PSY_AB_0_9_637_0J0I22I30K1J0I22I30I19K1_0_03P_ISKN_BUYO = "https://www.google.lt/search?rlz=1C1CHBF_enLT747LT747&ei=XMD8WZPPLKXP6ATD2JuQBw&q=Pramogos+Taurag%C4%97je&oq=Pramogos+Taurag%C4%97je&gs_l=psy-ab.3..0i19k1.23566.26587.0.26803.9.9.0.0.0.0.122.638.7j2.9.0....0...1.1.64.psy-ab..0.9.637...0j0i22i30k1j0i22i30i19k1.0.03pISknBUyo";
    public static final String TENISAS = "Tenisas";
    public static final String BASEINAI = "Baseinai";
    public static final String AERODROMAS = "Aerodromas";
    public static final String DAŽASVYDIS = "Dažasvydis";
    public static final String WAKE_PARK = "Wake Park";
    public static final String BOULINGAS = "Boulingas";
    public static final String ŠOKIAI = "Šokiai";

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

        final ArrayList<word> Taulinksmybes = new ArrayList<word>();
        Taulinksmybes.add(new word(R.drawable.bildukas, ŠOKIAI));
        Taulinksmybes.add(new word(R.drawable.boulingas, BOULINGAS));
        Taulinksmybes.add(new word(R.drawable.wake, WAKE_PARK));
        Taulinksmybes.add(new word(R.drawable.paintball, DAŽASVYDIS));
        Taulinksmybes.add(new word(R.drawable.parachute, AERODROMAS));
        Taulinksmybes.add(new word(R.drawable.plaukimas, BASEINAI));
        Taulinksmybes.add(new word(R.drawable.tenis, TENISAS));
        Taulinksmybes.add(new word(R.drawable.daugiauk, ""));

        Adaptorgrid adapteris = new Adaptorgrid(TauragesLinksmybes.this, Taulinksmybes);
        GridView Listtranslated = (GridView) findViewById(R.id.grid);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                word listas = Taulinksmybes.get(position);

                switch (position) {
                    case 0:
                        Intent intents = new Intent(TauragesLinksmybes.this, tauklubai.class);
                        startActivity(intents);
                        break;
                    case 1:
                        Intent intent = new Intent(TauragesLinksmybes.this, tauboulingas.class);
                        startActivity(intent);
                        break;
                    case 2:
                        Intent intentas = new Intent(TauragesLinksmybes.this, tauwake.class);
                        startActivity(intentas);
                        break;
                    case 3:
                        Intent intentas1 = new Intent(TauragesLinksmybes.this, taudazasvydis.class);
                        startActivity(intentas1);
                        break;
                    case 4:
                        Intent intentas3 = new Intent(TauragesLinksmybes.this, tauaerodromas.class);
                        startActivity(intentas3);
                        break;
                    case 5:
                        Intent intentas6 = new Intent(TauragesLinksmybes.this, vytautobamso.class);
                        startActivity(intentas6);
                        break;
                    case 6:
                        Intent intentas7 = new Intent(TauragesLinksmybes.this, tautenis.class);
                        startActivity(intentas7);
                        break;
                    case 7:
                        String daugiau = HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_XMD8_WZPPLKXP6_ATD2_JU_QBW_Q_PRAMOGOS_TAURAG_C4_97JE_OQ_PRAMOGOS_TAURAG_C4_97JE_GS_L_PSY_AB_3_0I19K1_23566_26587_0_26803_9_9_0_0_0_0_122_638_7J2_9_0_0_1_1_64_PSY_AB_0_9_637_0J0I22I30K1J0I22I30I19K1_0_03P_ISKN_BUYO;
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                        startActivity(i);
                        break;
                }
            }
        });

    }
}
