package com.example.android.turistas;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.WindowManager;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.android.turistas.R.id.telefono;

public class apptut extends AppCompatActivity {
    public static final String TRUMPAI_SPUSTELĖJUS_ATSIDARYS_RESTORANŲ_SĄRAŠAS = "Trumpai spustelėjus atsidarys restoranų sąrašas.";
    public static final String BRAUKITE_Į_KAIRĘ_PUSĘ_NORĖDAMI_PAMATYTI_KITŲ_ŽEMAITIJOS_MIESTŲ_MAITINIMO_ĮSTAIGAS = "Braukite į kairę pusę norėdami pamatyti kitų Žemaitijos miestų maitinimo įstaigas.";
    public static final String BRAUKITE_Į_KAIRĘ_PUSĘ_NORĖDAMI_PAMATYTI_KITŲ_ŽEMAITIJOS_MIESTŲ_MAITINIMO_ĮSTAIGAS_IR_T_T = "Braukite į kairę pusę norėdami pamatyti kitų Žemaitijos miestų maitinimo įstaigas ir t.t.";
    public static final String NORĖDAMI_SUŽINOTI_DAUGIAU_SPUSTELĖKITE_ANT_NUOTRAUKOS = "Norėdami sužinoti daugiau, spustelėkite ant nuotraukos.";
    public static final String SPUSTELĖKITE_TELEFONO_IKONĄ_NORĖDAMI_PASKAMBINTI_NURODYTU_NUMERIU_ARBA_ŽEMĖLAPIO_IKONĄ_NORĖDAMI_ATIDARYTI_ŽEMĖLAPĮ_SU_NUORODOMIS_NORĖDAMI_SUŽINOTI_PLAČIAU_SPUSTELĖKITE_ANT_MYGTUKO_DAUGIAU = "Spustelėkite telefono ikoną norėdami paskambinti nurodytu numeriu arba žemėlapio ikoną norėdami atidaryti žemėlapį su nuorodomis. Norėdami sužinoti plačiau, spustelėkite ant mygtuko „Daugiau“.";
    public static final String KAIP_NAUDOTIS_APLIKACIJA = "Kaip naudotis aplikacija";
    public static final String ILGIAU_PALAIKIUS_ATSIDARYS_ŽEMĖLAPIS_KURIAME_SUŽYMĖTOS_ŽEMAITIJOS_MAITINIMO_ĮSTAIGOS = "Ilgiau palaikius, atsidarys žemėlapis, kuriame sužymėtos Žemaitijos maitinimo įstaigos.";
    public static final String TRUMPAI_SPUSTELĖJUS_ATSIDARYS_LANKYTINŲ_VIETŲ_SĄRAŠAS = "Trumpai spustelėjus atsidarys lankytinų vietų sąrašas.";
    public static final String SPUSTELĖJUS_ANT_LANKYTINOS_VIETOS_NUOTRAUKOS_ATSIDARYS_GALERIJA = "Spustelėjus ant lankytinos vietos nuotraukos, atsidarys galerija.";
    public static final String SPUSTELĖJUS_ANT_RODYKLĖS_PEREISITE_PRIE_KITO_LANKYTINO_OBJEKTO = "Spustelėjus ant rodyklės pereisite prie kito lankytino objekto.";
    public static final String SPUSTELĖJUS_ILGIAU_ANT_NUOTRAUKOS_JI_PADIDĖS = "Spustelėjus ilgiau ant nuotraukos, ji padidės.";
    public static final String ILGIAU_PALAIKIUS_ATSIDARYS_ŽEMĖLAPIS_KURIAME_SUŽYMĖTOS_ŽEMAITIJOS_LANKYTINOS_VIETOS = "Ilgiau palaikius atsidarys žemėlapis, kuriame sužymėtos Žemaitijos lankytinos vietos.";
    public static final String TRUMPAI_SPUSTELĖJUS_ATSIDARYS_NAKVYNIŲ_SĄRAŠAS = "Trumpai spustelėjus atsidarys nakvynių sąrašas.";
    public static final String SPUSTELĖKITE_ANT_NUOTRAUKOS_NORĖDAMI_PAMATYTI_DAUGIAU_NAKVYNIŲ_VIETŲ_MIESTE = "Spustelėkite ant nuotraukos norėdami pamatyti daugiau nakvynių vietų mieste.";
    public static final String NORĖDAMI_SUŽINOTI_DAUGIAU_SPUSTELĖKITE_NUOTRAUKĄ = "Norėdami sužinoti daugiau, spustelėkite nuotrauką.";
    public static final String ILGIAU_PALAIKIUS_ATSIDARYS_ŽEMĖLAPIS_KURIAME_SUŽYMĖTOS_ŽEMAITIJOS_NAKVYNĖS_VIETOS = "Ilgiau palaikius, atsidarys žemėlapis, kuriame sužymėtos Žemaitijos nakvynės vietos.";
    public static final String TOKĮ_PAT_PRINCIPĄ_NAUDOKITE_PASIRINKĘ_PRAMOGŲ_MYGTUKĄ = "Tokį pat principą naudokite pasirinkę pramogų mygtuką.";
    public static final String TRUMPAI_SPUSTELĖJUS_ATSIDARYS_MARŠRUTŲ_SĄRAŠAS = "Trumpai spustelėjus atsidarys maršrutų sąrašas.";
    public static final String TRUMPAI_SPUSTELĖJUS_ATSIDARYS_MARŠRUTAS = "Trumpai spustelėjus atsidarys maršrutas.";
    public static final String SPUSTELĖJUS_ANT_RODYKLĖS_ATSIDARYS_NAUJAS_MARŠRUTAS = "Spustelėjus ant rodyklės, atsidarys naujas maršrutas.";
    public static final String ILGIAU_PALAIKIUS_ATSIDARYS_ŽEMĖLAPIS_SU_MARŠRUTU = "Ilgiau palaikius, atsidarys žemėlapis su maršrutu.";
    public static final String ILGIAU_PALAIKIUS_ATSIDARYS_APLANKAS_SU_VISAIS_APLIKACIJOS_MARŠRUTAIS = "Ilgiau palaikius, atsidarys aplankas su visais aplikacijos maršrutais.";
    public static final String NORĖDAMI_SUŽINOTI_DAUGIAU_APIE_ŽEMAITIJĄ_SPUSTELĖKITE_ANT_ŽEMAITIJOS_HERBO_NUOTRAUKOS = "Norėdami sužinoti daugiau apie Žemaitiją, spustelėkite ant Žemaitijos herbo nuotraukos.";
    public static final String SPUSTELĖJUS_ANT_ŠIOS_IKONOS_BUS_PARODYTAS_PAVYZDYS_KAIP_NAUDOTIS_APLIKACIJA = "Spustelėjus ant šios ikonos, bus parodytas pavyzdys, kaip naudotis aplikacija.";
    public static final String SPUSTELĖJUS_ANT_ŠIOS_NUORODOS_ATSIDARYS_INFORMACIJA_APIE_APLIKACIJOS_AUTORIŲ = "Spustelėjus ant šios nuorodos, atsidarys informacija apie aplikacijos autorių.";
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

         final ArrayList<word4> kaipnaudotis = new ArrayList<word4>();
            kaipnaudotis.add(new word4(TRUMPAI_SPUSTELĖJUS_ATSIDARYS_RESTORANŲ_SĄRAŠAS,R.drawable.spustelkite, KAIP_NAUDOTIS_APLIKACIJA));
            kaipnaudotis.add(new word4(BRAUKITE_Į_KAIRĘ_PUSĘ_NORĖDAMI_PAMATYTI_KITŲ_ŽEMAITIJOS_MIESTŲ_MAITINIMO_ĮSTAIGAS,R.drawable.slide));
            kaipnaudotis.add(new word4(BRAUKITE_Į_KAIRĘ_PUSĘ_NORĖDAMI_PAMATYTI_KITŲ_ŽEMAITIJOS_MIESTŲ_MAITINIMO_ĮSTAIGAS_IR_T_T,R.drawable.trslide));
            kaipnaudotis.add(new word4(NORĖDAMI_SUŽINOTI_DAUGIAU_SPUSTELĖKITE_ANT_NUOTRAUKOS,R.drawable.sresspulstelkite));
            kaipnaudotis.add(new word4(SPUSTELĖKITE_TELEFONO_IKONĄ_NORĖDAMI_PASKAMBINTI_NURODYTU_NUMERIU_ARBA_ŽEMĖLAPIO_IKONĄ_NORĖDAMI_ATIDARYTI_ŽEMĖLAPĮ_SU_NUORODOMIS_NORĖDAMI_SUŽINOTI_PLAČIAU_SPUSTELĖKITE_ANT_MYGTUKO_DAUGIAU,R.drawable.nuorodos));
            kaipnaudotis.add(new word4(ILGIAU_PALAIKIUS_ATSIDARYS_ŽEMĖLAPIS_KURIAME_SUŽYMĖTOS_ŽEMAITIJOS_MAITINIMO_ĮSTAIGOS,R.drawable.spustelkite));

            kaipnaudotis.add(new word4("",R.drawable.empty));

            kaipnaudotis.add(new word4(TRUMPAI_SPUSTELĖJUS_ATSIDARYS_LANKYTINŲ_VIETŲ_SĄRAŠAS,R.drawable.spustelkiteakis));
            kaipnaudotis.add(new word4(SPUSTELĖJUS_ANT_LANKYTINOS_VIETOS_NUOTRAUKOS_ATSIDARYS_GALERIJA,R.drawable.likon));
            kaipnaudotis.add(new word4(SPUSTELĖJUS_ANT_RODYKLĖS_PEREISITE_PRIE_KITO_LANKYTINO_OBJEKTO,R.drawable.galeryi));
            kaipnaudotis.add(new word4(SPUSTELĖJUS_ILGIAU_ANT_NUOTRAUKOS_JI_PADIDĖS,R.drawable.galilgas));
            kaipnaudotis.add(new word4(ILGIAU_PALAIKIUS_ATSIDARYS_ŽEMĖLAPIS_KURIAME_SUŽYMĖTOS_ŽEMAITIJOS_LANKYTINOS_VIETOS,R.drawable.spustelkiteakis));

        kaipnaudotis.add(new word4("",R.drawable.empty));

        kaipnaudotis.add(new word4(TRUMPAI_SPUSTELĖJUS_ATSIDARYS_NAKVYNIŲ_SĄRAŠAS,R.drawable.nakvynesikon));
        kaipnaudotis.add(new word4(SPUSTELĖKITE_ANT_NUOTRAUKOS_NORĖDAMI_PAMATYTI_DAUGIAU_NAKVYNIŲ_VIETŲ_MIESTE,R.drawable.nikon));
        kaipnaudotis.add(new word4(NORĖDAMI_SUŽINOTI_DAUGIAU_SPUSTELĖKITE_NUOTRAUKĄ,R.drawable.tnikon));
        kaipnaudotis.add(new word4(SPUSTELĖKITE_TELEFONO_IKONĄ_NORĖDAMI_PASKAMBINTI_NURODYTU_NUMERIU_ARBA_ŽEMĖLAPIO_IKONĄ_NORĖDAMI_ATIDARYTI_ŽEMĖLAPĮ_SU_NUORODOMIS_NORĖDAMI_SUŽINOTI_PLAČIAU_SPUSTELĖKITE_ANT_MYGTUKO_DAUGIAU,R.drawable.nuorodos));
        kaipnaudotis.add(new word4(ILGIAU_PALAIKIUS_ATSIDARYS_ŽEMĖLAPIS_KURIAME_SUŽYMĖTOS_ŽEMAITIJOS_NAKVYNĖS_VIETOS,R.drawable.nakvynesikon));

        kaipnaudotis.add(new word4(TOKĮ_PAT_PRINCIPĄ_NAUDOKITE_PASIRINKĘ_PRAMOGŲ_MYGTUKĄ,R.drawable.empty));

        kaipnaudotis.add(new word4(TRUMPAI_SPUSTELĖJUS_ATSIDARYS_MARŠRUTŲ_SĄRAŠAS,R.drawable.marsrutaiikon));
        kaipnaudotis.add(new word4(TRUMPAI_SPUSTELĖJUS_ATSIDARYS_MARŠRUTAS,R.drawable.mmarsrutai));
        kaipnaudotis.add(new word4(SPUSTELĖJUS_ANT_RODYKLĖS_ATSIDARYS_NAUJAS_MARŠRUTAS,R.drawable.marsrutairod));
        kaipnaudotis.add(new word4(ILGIAU_PALAIKIUS_ATSIDARYS_ŽEMĖLAPIS_SU_MARŠRUTU,R.drawable.mmarsrutai));
        kaipnaudotis.add(new word4(ILGIAU_PALAIKIUS_ATSIDARYS_APLANKAS_SU_VISAIS_APLIKACIJOS_MARŠRUTAIS,R.drawable.marsrutaiikon));

        kaipnaudotis.add(new word4("",R.drawable.empty));

        kaipnaudotis.add(new word4(NORĖDAMI_SUŽINOTI_DAUGIAU_APIE_ŽEMAITIJĄ_SPUSTELĖKITE_ANT_ŽEMAITIJOS_HERBO_NUOTRAUKOS,R.drawable.zemgitikon));

        kaipnaudotis.add(new word4(SPUSTELĖJUS_ANT_ŠIOS_IKONOS_BUS_PARODYTAS_PAVYZDYS_KAIP_NAUDOTIS_APLIKACIJA,R.drawable.tutikon));

        kaipnaudotis.add(new word4(SPUSTELĖJUS_ANT_ŠIOS_NUORODOS_ATSIDARYS_INFORMACIJA_APIE_APLIKACIJOS_AUTORIŲ,R.drawable.apieappikon));

        Adaptoreditor5 adapteris = new Adaptoreditor5(apptut.this, kaipnaudotis);
        ListView Listtranslated = (ListView)findViewById(R.id.list);
        Listtranslated.setAdapter(adapteris);
    }
}
