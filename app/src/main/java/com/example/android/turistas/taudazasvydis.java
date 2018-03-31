package com.example.android.turistas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class taudazasvydis extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_BIW_958_BIH_954_EI_2_CR_WC_Q_FYN_X6_ASVI_Y7_QCG_Q_DA_C5_BEASVYDIS_TAURAG_C4_97JE_OQ_DA_C5_BEASVYDIS_TAURAG_C4_97JE_GS_L_PSY_AB_3_8877_10966_0_11089_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_XMXS_8_NQ8A4_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&biw=958&bih=954&ei=2Cr-Wc-qFYnX6ASViY7QCg&q=Da%C5%BEasvydis+Taurag%C4%97je&oq=Da%C5%BEasvydis+Taurag%C4%97je&gs_l=psy-ab.3...8877.10966.0.11089.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.xmxs_8NQ8a4&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taudazasvydis);

        ImageView tel1 = (ImageView) findViewById(R.id.telefono1);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = getString(R.string.taudazasvydis1);
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        tel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = getString(R.string.taudazasvydis2);
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_BIW_958_BIH_954_EI_2_CR_WC_Q_FYN_X6_ASVI_Y7_QCG_Q_DA_C5_BEASVYDIS_TAURAG_C4_97JE_OQ_DA_C5_BEASVYDIS_TAURAG_C4_97JE_GS_L_PSY_AB_3_8877_10966_0_11089_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_XMXS_8_NQ8A4_GFE_RD_CR_DCR_0;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
