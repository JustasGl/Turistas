package com.example.android.turistas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class tauboulingas extends AppCompatActivity {

    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_Q_BOULINGAS_TAURAG_C4_97JE_SPELL_1_SA_X_VED_0AH_UKEWJLYVR_D6_KXXAH_VFAZO_KHZCD_B2_YQVW_UIIYG_A_BIW_958_BIH_954_GFE_RD_CR_DCR_0_EI_Z_SR_WBAQ_JP_DFT_AGC57_VG = "https://www.google.com/search?client=firefox-b-ab&q=Boulingas+Taurag%C4%97je&spell=1&sa=X&ved=0ahUKEwjlyvrD6KXXAhVFAZoKHZCdB2YQvwUIIygA&biw=958&bih=954&gfe_rd=cr&dcr=0&ei=zSr-WbaqJpDFtAGc57Vg";
    public static final String TEL = "tel";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String GEDIMINO_G_26_TAURAGĖ_72264 = "Gedimino g. 26, Tauragė 72264";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tauboulingas);

        ImageView adress = (ImageView) findViewById(R.id.adreso);
        ImageView tel = (ImageView) findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str_location = GEDIMINO_G_26_TAURAGĖ_72264;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "(8-446) 56283";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView) findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_Q_BOULINGAS_TAURAG_C4_97JE_SPELL_1_SA_X_VED_0AH_UKEWJLYVR_D6_KXXAH_VFAZO_KHZCD_B2_YQVW_UIIYG_A_BIW_958_BIH_954_GFE_RD_CR_DCR_0_EI_Z_SR_WBAQ_JP_DFT_AGC57_VG;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
