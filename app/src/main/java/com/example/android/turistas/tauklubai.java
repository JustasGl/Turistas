package com.example.android.turistas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class tauklubai extends AppCompatActivity {
    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_Y_CN_WF_OG_L8_SR6_ATT9_YM_YAQ_Q_NAKTINIAI_KLUBAI_TAURAG_C4_97JE_OQ_NAKTINIAI_KLUBAI_TAURAG_C4_97JE_GS_L_PSY_AB_3_1286_4241_0_4480_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_5D_QM0RVCD8_E_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&ei=yCn-WfOgL8SR6ATt9YmYAQ&q=Naktiniai+klubai+Taurag%C4%97je&oq=Naktiniai+klubai+Taurag%C4%97je&gs_l=psy-ab.3...1286.4241.0.4480.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.5dQM0rvcd8E&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String VYTAUTO_G_83_TAURAGĖ = "Vytauto g. 83, Tauragė";
    public static final String VYTAUTO_G_83_3_TAURAGĖ = "Vytauto g. 83-3, Tauragė";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tauklubai);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str_location = VYTAUTO_G_83_3_TAURAGĖ;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "(8 670) 99237";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });

        ImageView adress1 = (ImageView) findViewById(R.id.adreso1);
        ImageView tel1 = (ImageView) findViewById(R.id.telefono1);
        adress1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str_location = VYTAUTO_G_83_TAURAGĖ;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "(8 446) 61523";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_EI_Y_CN_WF_OG_L8_SR6_ATT9_YM_YAQ_Q_NAKTINIAI_KLUBAI_TAURAG_C4_97JE_OQ_NAKTINIAI_KLUBAI_TAURAG_C4_97JE_GS_L_PSY_AB_3_1286_4241_0_4480_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_5D_QM0RVCD8_E_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
