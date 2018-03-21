package com.example.android.turistas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class opengoogle extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_IMF8_WEA_FB8F_F6_QSY15_DG_BG_Q_RESTORANAI_C5_BDEMAITIJOJE_OQ_RESTORANAI_C5_BDEMAITIJOJE_GS_L_PSY_AB_3_0I22I30K1_110638_112676_0_112827_11_11_0_0_0_0_88_795_11_11_0_0_1_1_64_PSY_AB_0_11_789_0J33I22I29I30K1J33I160K1_0_AIDJ_PT_SP_NE = "https://www.google.lt/search?rlz=1C1CHBF_enLT747LT747&ei=IMf8WeaFB8fF6QSY15DgBg&q=Restoranai+%C5%BDemaitijoje&oq=Restoranai+%C5%BDemaitijoje&gs_l=psy-ab.3..0i22i30k1.110638.112676.0.112827.11.11.0.0.0.0.88.795.11.11.0....0...1.1.64.psy-ab..0.11.789...0j33i22i29i30k1j33i160k1.0.AidjPtSP-NE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new OpenGoogle_fragmentas())
                .commit();*/
        String daugiau = HTTPS_WWW_GOOGLE_LT_SEARCH_RLZ_1_C1_CHBF_EN_LT747_LT747_EI_IMF8_WEA_FB8F_F6_QSY15_DG_BG_Q_RESTORANAI_C5_BDEMAITIJOJE_OQ_RESTORANAI_C5_BDEMAITIJOJE_GS_L_PSY_AB_3_0I22I30K1_110638_112676_0_112827_11_11_0_0_0_0_88_795_11_11_0_0_1_1_64_PSY_AB_0_11_789_0J33I22I29I30K1J33I160K1_0_AIDJ_PT_SP_NE;
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
        startActivity(i);
    }
}
