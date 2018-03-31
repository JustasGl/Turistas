package com.example.android.turistas;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import static android.widget.ImageView.ScaleType.CENTER_CROP;
import static android.widget.ImageView.ScaleType.FIT_CENTER;

public class lankytinos_vietosgalerry extends AppCompatActivity {
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_EI_QV8E_WR2_VMIV_OW_AKL54_XQDA_Q_DAUTAR_C5_B3_DVARAS_OQ_DAUTAR_C5_B3_DVARAS_GS_L_PSY_AB_12_500_500_0_1286_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_L_I4_GTY_TQ_O_M_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&ei=qv8eWr2VMIvOwAKL54XQDA&q=Dautar%C5%B3+dvaras&oq=Dautar%C5%B3+dvaras&gs_l=psy-ab.12...500.500.0.1286.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.lI4GTyTQ-oM&gfe_rd=cr&dcr=0";
    public static final String DAUTARŲ_DVARAS = "Dautarų dvaras";
    public static final String KAI_TĄ_PAČIĄ_DIENĄ_TĖVAS_APIE_MŪSŲ_SUŽADĖTUVES_PAPASAKOJO_CARUI_ŠIS_ATSAKĖ_GERAI_ŽINĄS_MANO_SUŽADĖTINĮ_IR_PASVEIKINO_MANE_SU_PUIKIU_PASIRINKIMU = "      Kai tą pačią dieną tėvas apie mūsų sužadėtuves papasakojo carui, šis atsakė gerai žinąs mano sužadėtinį ir pasveikino mane su puikiu pasirinkimu.";
    public static final String PO_KALĖDŲ_B_I_BOCKAS_OFICIALIAI_PAPRAŠĖ_MANO_TĖVŲ_MANO_RANKOS_JIE_SUTIKO_IR_ŠIA_PROGA_VASARIO_2_D_TA_PROGA_ĮVYKO_IŠKILMINGOS_MIŠIOS_DALYVAUJANT_GIMINAIČIAMS_IŠ_ABIEJŲ_PUSIŲ = "     Po Kalėdų B.I. Bockas oficialiai paprašė mano tėvų mano rankos, jie sutiko ir šia proga vasario 2 d. ta proga įvyko iškilmingos Mišios dalyvaujant giminaičiams iš abiejų pusių.\n";
    public static final String PER_TAS_AŠTUONIAS_PLAUKIOJIMO_DIENAS_MANO_LIKIMAS_BUVO_NUSPRĘSTAS_IR_NORS_DAR_NIEKO_NEBUVO_IŠTARTA_BET_BŪNA_JAUSMŲ_AIŠKESNIŲ_UŽ_ŽODŽIUS_IR_SIELOJE_AŠ_GALUTINAI_ŽINOJAU_KAD_ANKSČIAU_AR_VĖLIAU_TAPSIU_VIENO_IŠ_JACHTOS_NEVA_KARININKŲ_LEITENANTO_B_I_BOCKO_ŽMONA = "      Per tas aštuonias plaukiojimo dienas mano likimas buvo nuspręstas, ir nors dar nieko nebuvo ištarta, bet būna jausmų, aiškesnių už žodžius, ir sieloje aš galutinai žinojau, kad anksčiau ar vėliau tapsiu vieno iš jachtos „Neva“ karininkų – leitenanto B.I. Bocko žmona.\n";
    public static final String PO_TRIJŲ_LABAI_ĮTEMPTŲ_DIENŲ_IR_SUNKAUS_DARBO_BUVO_1905_M_PAREIKALAVUSIO_IŠ_MANO_TĖVO_CARINĖS_RUSIJOS_IMPERIJOS_VYRIAUSYBĖS_VADOVO_DAUG_JĖGŲ_JAM_BUVO_REIKALINGAS_NORS_TRUMPAS_BET_PILNAVERTIS_POILSIS_CARAS_PATS_APIE_TAI_PATS_SUMĄSTĖ_IR_PASIŪLĖ_JACHTA_NEVA_PAPLAUKIOTI_PO_SUOMIŲ_ĮLANKĄ_GERESNIO_POILSIO_SUGALVOTI_NEĮMANOMA_JŪROJE_KAIP_NIEKUR_KITUR_TĖVAS_ATSIJUNGDAVO_NUO_VISŲ_TARNYBOS_REIKALŲ_POKALBIŲ_ATASKAITŲ_IR_POPIERIŲ_NUO_VISO_MILŽINIŠKO_ADMINISTRACINIO_APARATO_STŪMIANČIO_RUSIJOS_IMPERIJOS_GYVENIMĄ_PIRMYN_BUVO_NUSPRĘSTA_KAD_KARTU_SU_TĖČIU_PLAUKIAME_IR_MES_VISI = "Po trijų labai įtemptų dienų ir sunkaus darbo (buvo 1905 m.), pareikalavusio iš mano tėvo (carinės Rusijos imperijos vyriausybės vadovo) daug jėgų, jam buvo reikalingas nors trumpas, bet pilnavertis poilsis. Caras pats apie tai pats sumąstė ir pasiūlė jachta „Neva“ paplaukioti po Suomių įlanką. Geresnio poilsio sugalvoti neįmanoma – jūroje, kaip niekur kitur, tėvas atsijungdavo nuo visų tarnybos reikalų, pokalbių, ataskaitų ir popierių – nuo viso milžiniško administracinio aparato, stūmiančio Rusijos imperijos gyvenimą pirmyn.  Buvo nuspręsta, kad kartu su tėčiu plaukiame ir mes visi.\n";
    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_BIW_958_BIH_954_EI_YJ_YDWVNB_DYR_OW_QK1I4_XG_BW_Q_C5_A0ALTOJO_KARO_MUZIEJUS_OQ_C5_A0ALTOJO_KARO_MUZIEJUS_GS_L_PSY_AB_12_35I39K1J0I203K1L3J0J0I30K1L5_2050_5303_0_6654_5_3_2_0_0_0_208_606_0J2J1_3_0_0_1_1_64_PSY_AB_0_5_721_0I13I30K1J0I13K1_0_QP_SN_XLO8_L24_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&biw=958&bih=954&ei=YjYDWvnbDYrOwQK1i4XgBw&q=%C5%A0altojo+karo+muziejus&oq=%C5%A0altojo+karo+muziejus&gs_l=psy-ab.12..35i39k1j0i203k1l3j0j0i30k1l5.2050.5303.0.6654.5.3.2.0.0.0.208.606.0j2j1.3.0....0...1.1.64.psy-ab..0.5.721...0i13i30k1j0i13k1.0.qpSnXLO8L24&gfe_rd=cr&dcr=0";
    public static final String ŠALTOJO_KARO_MUZIEJUS = "Šaltojo karo muziejus";
    public static final String MUZIEJUS_ŽEMAITIJOS_NACIONALINIAME_PARKE_UŽ_24_KM_Į_ŠIAURĘ_NUO_PLUNGĖS_ĮRENGTAS_BUVUSIAME_SOVIETŲ_SĄJUNGOS_BALISTINIŲ_RAKETŲ_ŠACHTINIAME_PALEIDIMO_KOMPLEKSE_PLOKŠTINĖS_RAKETŲ_BAZĖJE_LANKYTOJUS_PASITINKA_SUT­VAR­KY­TA_AP­LIN­KA_ĮRENG­TA_AP­ŽVAL­GOS_AIKŠ­TE­LĖ_SU­MON­TUO­TOS_VĖ­DI­NI­MO_IR_DRĖG­MĖS_SU­RIN­KI­MO_SIS­TE­MOS_PAS­TA­TY­TAS_AD­MI­NIST­RA­CI­NIS_PA­STA­TAS_LAN­KY­TO­JŲ_CENT­RAS_AUTENTIŠKOS_ĮRANGOS_IŠLIKĘ_PALYGINTI_NEDAUG_NES_DAUG_KAS_PO_SOVIETŲ_KARIŠKIŲ_PASITRAUKIMO_BUVO_NUNIOKOTA_VANDALŲ_PROJEKTO_KURIS_ĮGYVENDINTAS_UŽ_EUROPOS_SĄJUNGOS_LĖŠAS_VERTĖ_6_4_MLN_LITŲ_1_MUZIEJAUS_EKSPOZICIJOS_KONCEPCIJOS_AUTORIUS_BEI_VIENAS_IŠ_JO_KŪRĖJŲ_FORTIFIKACIJOS_ISTORIJOS_TYRINĖTOJAS_VLADIMIRAS_ORLOVAS_SPECIALIAI_ŠIAM_MUZIEJUI_SUKURTAS_DOKUMENTINIS_FILMAS_ŠALTASIS_KARAS_BAIMĖS_ŠEŠĖLIS_REŽ_RIMAS_BRUŽAS_2_MUZIEJŲ_SUPROJEKTAVO_LIETUVOS_BENDROVĖ_TAEM_ARCHITEKTAI_PROJEKTO_VADOVAS_AIDAS_JASTREMSKAS = "Muziejus Žemaitijos nacionaliniame parke, už 24 km į šiaurę nuo Plungės. Įrengtas buvusiame Sovietų Sąjungos balistinių raketų šachtiniame paleidimo komplekse, Plokštinės raketų bazėje. Lankytojus pasitinka sut\u00ADvar\u00ADky\u00ADta ap\u00ADlin\u00ADka, įreng\u00ADta ap\u00ADžval\u00ADgos aikš\u00ADte\u00ADlė. Su\u00ADmon\u00ADtuo\u00ADtos vė\u00ADdi\u00ADni\u00ADmo ir drėg\u00ADmės su\u00ADrin\u00ADki\u00ADmo sis\u00ADte\u00ADmos. Pas\u00ADta\u00ADty\u00ADtas ad\u00ADmi\u00ADnist\u00ADra\u00ADci\u00ADnis pa\u00ADsta\u00ADtas (lan\u00ADky\u00ADto\u00ADjų cent\u00ADras). Autentiškos įrangos išlikę palyginti nedaug, nes daug kas po sovietų kariškių pasitraukimo buvo nuniokota vandalų. Projekto, kuris įgyvendintas už Europos Sąjungos lėšas, vertė – 6,4 mln. litų.[1]Muziejaus ekspozicijos koncepcijos autorius bei vienas iš jo kūrėjų – fortifikacijos istorijos tyrinėtojas Vladimiras Orlovas. Specialiai šiam muziejui sukurtas dokumentinis filmas „Šaltasis karas – baimės šešėlis“ (rež. Rimas Bružas).[2] Muziejų suprojektavo Lietuvos bendrovė TAEM Architektai, projekto vadovas Aidas Jastremskas.";
    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_Q_C5_BDEMAI_C4_8_DI_C5_B3_KALVARIJA_IE_UTF_8_OE_UTF_8_CLIENT_FIREFOX_B_AB_GFE_RD_CR_DCR_0_EI_RI_YDWOI_XLNLI8_AFOV7_CW_BA = "https://www.google.com/search?q=%C5%BDemai%C4%8Di%C5%B3+kalvarija&ie=utf-8&oe=utf-8&client=firefox-b-ab&gfe_rd=cr&dcr=0&ei=riYDWoiXLNLi8Afov7CwBA";
    public static final String ŽEMAIČIŲ_KALVARIJA = "Žemaičių Kalvarija";
    public static final String MIESTELIS_PLUNGĖS_RAJONO_SAVIVALDYBĖS_TERITORIJOJE_ŽEMAIČIŲ_KALVARIJOS_BAŽNYČIA_NUO_SENO_GARSĖJA_STEBUKLINGA_NUKRYŽIUOTOJO_JĖZAUS_FIGŪRA_IR_STEBUKLINGU_DIEVO_MOTINOS_SU_KŪDIKIU_PAVEIKSLU_ATVEŽTU_IŠ_ROMOS_XVII_A_VIDURYS_LABAI_GRAŽI_IR_ĮSPŪDINGA_ŽEMAIČIŲ_KALVARIJOS_KATEDRA_TAIP_PAT_NE_KĄ_MAŽIAU_ĮDOMIOS_KRYŽIAUS_KELIO_KOPLYTĖLĖS_MIESTELYJE_KASMET_LIEPOS_MĖNESĮ_VYKSTA_DIDIEJI_ŽEMAIČIŲ_KALVARIJOS_ATLAIDAI_PASIŽYMINTIS_ŽMONIŲ_GAUSA = "Miestelis Plungės rajono savivaldybės teritorijoje. Žemaičių Kalvarijos bažnyčia nuo seno garsėja stebuklinga Nukryžiuotojo Jėzaus figūra ir stebuklingu Dievo Motinos su Kūdikiu paveikslu, atvežtu iš Romos (XVII a. vidurys). Labai graži ir įspūdinga Žemaičių kalvarijos katedra taip pat ne ką mažiau įdomios Kryžiaus kelio koplytėlės. Miestelyje kasmet liepos mėnesį vyksta Didieji Žemaičių Kalvarijos atlaidai, pasižymintis žmonių gausa.";
    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_EI_XH_QDWR_ORND_LTW_QLRI5_SIBW_Q_RENAVO_DVARAS_OQ_RENAVO_DVARAS_GS_L_PSY_AB_12_0I203K1L10_315640_315640_0_316550_1_1_0_0_0_0_258_258_2_1_1_0_0_1_64_PSY_AB_0_1_257_0_I_TV9G_MG9_KI_Y_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&ei=XhQDWrORNdLTwQLri5SIBw&q=Renavo+dvaras&oq=Renavo+dvaras&gs_l=psy-ab.12..0i203k1l10.315640.315640.0.316550.1.1.0.0.0.0.258.258.2-1.1.0....0...1..64.psy-ab..0.1.257....0.iTV9gMg9KiY&gfe_rd=cr&dcr=0";
    public static final String LITHUANIA_RENAVAS_89403 = "Lithuania, Renavas 89403";
    public static final String RENAVO_DVARAS_DVARAS_IR_JĮ_JUOSIANTIS_PARKAS_MAŽEIKIŲ_RAJONO_SEDOS_SENIŪNIJOS_RENAVO_KAIME_ANT_VARDUVOS_UPĖS_KRANTO_VIENAS_ĮDOMIAUSIŲ_IR_GERIAUSIAI_IŠLIKUSIŲ_DVARO_ANSAMBLIŲ_ŽEMAITIJOJE = "Renavo dvaras – dvaras ir jį juosiantis parkas Mažeikių rajono Sedos seniūnijos Renavo kaime, ant Varduvos upės kranto. Vienas įdomiausių ir geriausiai išlikusių dvaro ansamblių Žemaitijoje.";
    public static final String TAI_NAUJAI_RESTAURUOJAMAS_DVARAS_IR_JIS_ATRODO_LABAI_ĮSPŪDINGAI = "Tai naujai restauruojamas dvaras ir jis atrodo labai įspūdingai.\n";
    public static final String RENAVO_DVARAS = "Renavo dvaras";
    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_EI_LX_QDWSNC_CT_DRW_AK8O6E4_DA_Q_BIR_C5_BEUV_C4_97N_C5_B3_DVARAS_OQ_BIR_C5_BEUV_C4_97N_C5_B3_DVARAS_GS_L_PSY_AB_12_0I19K1L4J0I22I30I19K1L3J38_1570_1637_0_2373_2_2_0_0_0_0_248_248_2_1_1_0_0_1_1_64_PSY_AB_1_1_247_0_XU_OYYFP_HF4O_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&ei=LxQDWsncCtDRwAK8o6e4DA&q=Bir%C5%BEuv%C4%97n%C5%B3+dvaras&oq=Bir%C5%BEuv%C4%97n%C5%B3+dvaras&gs_l=psy-ab.12..0i19k1l4j0i22i30i19k1l3j38.1570.1637.0.2373.2.2.0.0.0.0.248.248.2-1.1.0....0...1.1.64.psy-ab..1.1.247....0.xuOyyfpHf4o&gfe_rd=cr&dcr=0";
    public static final String BIRŽUVĖNAI_88239 = "Biržuvėnai 88239";
    public static final String BIRŽUVĖNŲ_DVARO_SODYBA_VALSTYBĖS_SAUGOMAS_KULTŪROS_PAMINKLAS_UNIKALUS_KODAS_730_DVARO_SODYBA_RYTINĖJE_TELŠIŲ_RAJONO_SAVIVALDYBĖS_TERITORIJOS_DALYJE_BIRŽUVĖNUOSE_LUOKĖS_SENIŪNIJA_ABIPUS_VIRVYČIOS_UPĖS_NUO_XIV_A_MINIMAS_BIRŽUVĖNŲ_KARALIŠKASIS_DVARAS_KURIS_VĖLIAU_TAPO_PRIVAČIA_VALDA_JĮ_VALDĖ_ŽEMAIČIŲ_KARUŽA_JONAS_SEBASTIJONAS_KENSTARTAS_PAJŪRIO_SENIŪNAS_ALEKSANDRAS_VAINA_PO_1637_M_1670_M_IŠ_VLADISLOVO_VAINOS_DVARĄ_ĮSIGIJO_TVERŲ_SENIŪNAS_MIKALOJUS_GORSKIS_ŠI_DVARININKŲ_GIMINĖ_XVIII_XX_A_PRADŽIOJE_PASTATĖ_DVARO_SODYBĄ_SU_RŪMAIS_OFICINOMIS_PAGALBINIAIS_GYVENAMAISIAIS_KUMETYNAI_IR_ŪKINIAIS_GAMYBINIAIS_ARKLIDĖ_VEŽIMINĖ_KALVĖ_VANDENS_MALŪNAS_IR_KT_PASTATAIS_UŽTVENKĖ_VIRVYČIOS_UPĘ_1909_M_ĮKŪRĖ_KARTONO_FABRIKĄ_VEIKĖ_IKI_1938_M_PASTATĖ_LENTPJŪVĘ = "Biržuvėnų dvaro sodyba (valstybės saugomas kultūros paminklas: unikalus kodas 730) – dvaro sodyba rytinėje Telšių rajono savivaldybės teritorijos dalyje, Biržuvėnuose (Luokės seniūnija), abipus Virvyčios upės. Nuo XIV a. minimas Biržuvėnų karališkasis dvaras, kuris vėliau tapo privačia valda. Jį valdė Žemaičių karuža Jonas Sebastijonas Kenstartas, Pajūrio seniūnas Aleksandras Vaina (po 1637 m.). 1670 m. iš Vladislovo Vainos dvarą įsigijo Tverų seniūnas Mikalojus Gorskis. Ši dvarininkų giminė XVIII–XX a. pradžioje pastatė dvaro sodybą su rūmais, oficinomis, pagalbiniais gyvenamaisiais (kumetynai) ir ūkiniais gamybiniais (arklidė, vežiminė, kalvė, vandens malūnas ir kt.) pastatais, užtvenkė Virvyčios upę, 1909 m. įkūrė kartono fabriką (veikė iki 1938 m.), pastatė lentpjūvę.";
    public static final String BIRŽUVĖNŲ_DVARAS = "Biržuvėnų dvaras";
    public static final String PLUNGĖS_DVARAS = "Plungės dvaras";
    public static final String HTTPS_LT_WIKIPEDIA_ORG_WIKI_LENKIM_C5_B3_C5_A0V_ONOS_BA_C5_BENY_C4_8_DIA = "https://lt.wikipedia.org/wiki/Lenkim%C5%B3_%C5%A0v._Onos_ba%C5%BEny%C4%8Dia";
    public static final String S_DAUKANTO_GATVĖ_61_LENKIMAI_98301 = "S. Daukanto gatvė 61, Lenkimai 98301";
    public static final String SIMONAS_DAUKANTAS_NUPIRKO_BAŽNYČIAI_PAVEIKSLŲ_SUMOKĖJO_UŽ_GALINIO_ALTORIAUS_ĮRENGIMĄ_BAŽNYČIOS_ŠVENTORIUJE_1847_M_PALAIDOTA_SIMONO_DAUKANTO_MOTINA_ANT_JOS_KAPO_IŠLIKĘS_XIX_A_1_OSIOS_PUSĖS_LIETUVIŠKAS_TEKSTAS_CITATA_PAGAL_DABARTINES_RAŠYBOS_TAISYKLES = "Simonas Daukantas nupirko bažnyčiai paveikslų, sumokėjo už galinio altoriaus įrengimą. Bažnyčios šventoriuje 1847 m. palaidota Simono Daukanto motina. Ant jos kapo išlikęs XIX a. 1-osios pusės lietuviškas tekstas (citata pagal dabartines rašybos taisykles):";
    public static final String LENKIMŲ_ŠV_ONOS_BAŽNYČIA_STOVI_LENKIMŲ_MIESTELYJE_1_KM_Į_PIETRYČIUS_NUO_LIETUVOS_IR_LATVIJOS_VALSTYBĖS_SIENOS_IR_NUO_ŠVENTOSIOS_UPĖS_BAŽNYČIA_STAČIAKAMPIO_PLANO_VIENABOKŠTĖ_SU_APSIDE_ŠVENTORIAUS_TVORA_AKMENŲ_MŪRO_JAME_STOVI_AKMENŲ_IR_PLYTŲ_MŪRO_VARPINĖ = "Lenkimų Šv. Onos bažnyčia stovi Lenkimų miestelyje, 1 km į pietryčius nuo Lietuvos ir Latvijos valstybės sienos ir nuo Šventosios upės. Bažnyčia stačiakampio plano, vienabokštė, su apside. Šventoriaus tvora akmenų mūro. Jame stovi akmenų ir plytų mūro varpinė.\n";
    public static final String LENKIMŲ_ŠV_ONOS_BAŽNYČIA = "Lenkimų Šv. Onos bažnyčia";
    public static final String HTTP_WWW_KRETINGOSENCIKLOPEDIJA_LT_LT_STRAIPSNIAI_KULTURA_KULTUROS_PAVELDAS_ARCHITEKTUROS_PAVELDAS_MALUNAI_KRETINGOS_DVARO_VANDENS_MALUNAS = "http://www.kretingosenciklopedija.lt/lt/straipsniai/kultura/kulturos_paveldas/architekturos_paveldas/malunai/kretingos_dvaro_vandens_malunas/";
    public static final String VILNIAUS_G_33_KRETINGA = "Vilniaus g. 33, Kretinga";
    public static final String PASTATAS_DVIAUKŠTIS_KOMPAKTIŠKO_TŪRIO_IŠTĘSTO_STAČIAKAMPIO_PLANO_R_FASADAS_PIRMO_SENIAUSIO_AUKŠTO_LYGYJE_UŽPILTAS_ŽEMĖMIS_KELIANT_VILNIAUS_G_LYGĮ_BUVĘS_KELIAS_KRETINGA_SALANTAI_MATMENYS_PLOTAS_21_7_X_10_45_X_11_34_M_KRETINGOS_MALŪNAS_TURĖJO_IR_ŪKINIŲ_PASTATŲ_TAČIAU_JIE_NEIŠLIKO = "Pastatas dviaukštis, kompaktiško tūrio, ištęsto stačiakampio plano, r. fasadas pirmo, seniausio, aukšto lygyje užpiltas žemėmis keliant Vilniaus g. lygį (buvęs kelias Kretinga–Salantai). Matmenys: plotas 21,7 x 10,45 x 11,34 m. Kretingos malūnas turėjo ir ūkinių pastatų, tačiau jie neišliko.";
    public static final String VYSKUPO_IGNOTO_JOKŪBO_MASALSKIO_PASKIRTAS_MATININKAS_PRANCIŠKUS_JODKA_1771_M_SUDARĖ_IŠSAMŲ_KRETINGOS_GRAFYSTĖS_INVENTORIŲ_SU_ŽEMIŲ_PLANAIS_IR_KT_JAME_RAŠOMA_KAD_DVARO_SODYBA_TEBESTOVĖJO_PRIE_DUPULČIO_TIES_SANTAKA_SU_AKMENA_PRIE_UŽTVANKOS_MINIMAS_SENAS_VANDENS_MALŪNAS = "Vyskupo Ignoto Jokūbo Masalskio paskirtas matininkas Pranciškus Jodka 1771 m. sudarė išsamų Kretingos grafystės inventorių su žemių planais ir kt. Jame rašoma, kad dvaro sodyba tebestovėjo prie Dupulčio, ties santaka su Akmena. Prie užtvankos minimas senas vandens malūnas.\n";
    public static final String M_KARLOŠTATĄ_KRETINGĄ_VALDANT_LDK_DIDIKUI_KAZIMIERUI_JONUI_POVILUI_SAPIEGAI_BUVO_SUDARYTAS_DVARO_INVENTORIUS_KURIS_LIUDIJA_KAD_DVARĄ_SUDARĖ_SODYBA_PALIVARKAS_IR_DVARUI_PRIKLAUSANTYS_KAIMAI_SODYBA_BUVO_PRIE_AKMENOS_IR_DUPULČIO_SANTAKOS_RŪMAI_VANDENS_MALŪNAS_KLUONAS_IR_KITI_PAGALBINIAI_ŪKINIAI_PASTATAI_STOVĖJO_PRIE_TVENKINIO_VISI_PASTATAI_BUVO_MEDINIAI = "1672 m. Karloštatą [Kretingą] valdant LDK didikui Kazimierui Jonui Povilui Sapiegai, buvo sudarytas dvaro inventorius, kuris liudija, kad dvarą sudarė sodyba, palivarkas ir dvarui priklausantys kaimai. Sodyba buvo prie Akmenos ir Dupulčio santakos; rūmai, vandens malūnas, kluonas ir kiti pagalbiniai ūkiniai pastatai stovėjo prie tvenkinio. Visi pastatai buvo mediniai.\n";
    public static final String KRETINGOS_VANDENS_MALŪNAS = "Kretingos vandens malūnas";
    public static final String HTTPS_LT_WIKIPEDIA_ORG_WIKI_KRETINGOS_VIE_C5_A1PATIES_APREI_C5_A1KIMO_C5_A0V_C4_8_D_MERGELEI_MARIJAI_BA_C5_BENY_C4_8_DIA = "https://lt.wikipedia.org/wiki/Kretingos_Vie%C5%A1paties_Aprei%C5%A1kimo_%C5%A0v%C4%8D._Mergelei_Marijai_ba%C5%BEny%C4%8Dia";
    public static final String VILNIAUS_G_2_KRETINGA = "Vilniaus g. 2, Kretinga";
    public static final String M_BAŽNYČIA_ATNAUJINTA_IR_PADIDINTA_XVIII_A_VEIKĖ_PARAPINĖ_MOKYKLA_1836_M_PERTVARKYTA_Į_VALDINĘ_XVIII_A_PRANCIŠKONAI_PASTATĖ_ŠV_ANTANO_GARBEI_SKIRTĄ_ALTORIŲ_KURĮ_1795_M_LIEPOS_22_D_KONSEKRAVO_ŽEMAIČIŲ_VYSKUPAS_ANTANAS_DOMININKAS_TIŠKEVIČIUS = "1672 m. bažnyčia atnaujinta ir padidinta. XVIII a. veikė parapinė mokykla (1836 m. pertvarkyta į valdinę). XVIII a. pranciškonai pastatė Šv. Antano garbei skirtą altorių, kurį 1795 m. liepos 22 d. konsekravo žemaičių vyskupas Antanas Domininkas Tiškevičius.";
    public static final String KRETINGOS_VIEŠPATIES_APREIŠKIMO_ŠVČ_MERGELEI_MARIJAI_BAŽNYČIA_STOVI_KRETINGOJE_TURI_GOTIKOS_IR_RENESANSO_BRUOŽŲ_TAI_YRA_SENIAUSIA_IŠLIKUSI_BAŽNYČIA_ŽEMAITIJOJE_PASTATYTA_1617_M_PIRMOJI_KATALIKŲ_BAŽNYČIA_PASTATYTA_1602_M_KRETINGSODYJE_IR_ĮSTEIGTAS_BERNARDINŲ_VIENUOLYNAS_1610_1617_M_ŽEMAIČIŲ_SENIŪNO_IR_LIETUVOS_DIDŽIOSIOS_KUNIGAIKŠTYSTĖS_ETMONO_JONO_CHODKEVIČIAUS_INICIATYVA_PASTATYTA_NAUJA_MŪRINĖ_BAŽNYČIA_SU_VIENUOLYNU = "Kretingos Viešpaties Apreiškimo Švč. Mergelei Marijai bažnyčia stovi Kretingoje. Turi gotikos ir renesanso bruožų. Tai yra seniausia išlikusi bažnyčia Žemaitijoje, pastatyta 1617 m. Pirmoji katalikų bažnyčia pastatyta 1602 m. (Kretingsodyje) ir įsteigtas bernardinų vienuolynas. 1610–1617 m. Žemaičių seniūno ir Lietuvos Didžiosios Kunigaikštystės etmono Jono Chodkevičiaus iniciatyva pastatyta nauja mūrinė bažnyčia su vienuolynu.\n";
    public static final String KRETINGOS_VIESPATIES_APREISKIMO_ŠVČ_MERGELEI_MARIJAI_PARAPIJA = "Kretingos Viespaties apreiskimo Švč. Mergelei Marijai parapija";
    public static final String HTTP_WWW_KRETINGOSMUZIEJUS_LT = "http://www.kretingosmuziejus.lt/";
    public static final String VILNIAUS_G_20_KRETINGA_97104 = "Vilniaus g. 20, Kretinga 97104";
    public static final String KRETINGOS_DVARO_PARKAS_MIŠRAUS_STILIAUS_PARKAS_UŽIMANTIS_23_HA_PLOTĄ_JAM_PRADŽIĄ_DAVĖ_VILNIAUS_VYSKUPO_IGNO_JOKŪBO_MASALSKIO_ĮKURTAS_DIDŽIULIS_VAISMEDŽIŲ_SODAS_VĖLIAU_DVARĄ_VALDĘ_GRAFAI_ZUBOVAI_ŠALIA_JO_ĮKŪRĖ_LANDŠAFTINIO_ANGLIŠKOJO_STILIAUS_PARKĄ_KURIS_XIX_A_PIRMOJE_PUSĖJE_MINIMAS_TARP_PENKIŲ_GRAŽIAUSIŲ_TELŠIŲ_APSKRITIES_PARKŲ_1874_METAIS_DVARĄ_VARŽYTINĖSE_ĮSIGIJO_GRAFAS_JUOZAPAS_TIŠKEVIČIUS_BŪDAMAS_TURTINGAS_VEIKLUS_IR_INTELEKTUALUS_ŽMOGUS_JIS_REKONSTRAVO_DVARO_RŪMUS_ĮRENGĖ_GARSŲJĮ_ŽIEMOS_SODĄ_DIDŽIAUSIĄ_EUROPOJE_TO_METO_PRIVAČIOJE_VALDOJE_IR_1875_METAIS_PRADĖJO_ATNAUJINTI_PARKA_PARKO_PROJEKTAVIMAS_BUVO_PATIKĖTAS_DVARO_MATININKUI_ŠOSTAKUI_O_ŽELDINIUS_IR_GĖLYNUS_FORMAVO_VENGRŲ_KILMĖS_DARŽININKAS_RŪMŲ_MUZIKANTAS_HAIDUKAS_DARŽININKYSTĖS_MOKSLUS_BAIGĘS_VOKIETIJOJE_PAGAL_PARENGTUS_PLANUS_BUVO_PERTVARKYTA_PRIEŠAIS_RŪMUS_ESANTI_REPREZENTACINĖ_PARKO_DALIS_SUFORMUOTI_PRANCŪZIŠKO_STILIAUS_PARKAMS_BŪDINGI_GEOMETRINĖS_FORMOS_GĖLYNAI_KURIUOS_PUOŠĖ_FONTANAI_SU_SKULPTŪROMIS_GRETA_JŲ_PASODINTI_INTRODUKUOTI_MEDŽIAI_IR_DEKORATYVINIAI_KRŪMAI_KARPOMŲ_MAŽALAPIŲ_LIEPŲ_ALĖJOS_SUDARIUSIOS_ARKOS_PAVIDALO_PAVĖSINGUS_TUNELIUS_ALĖJOS_JUNGĖ_PARKĄ_SU_VAISMEDŽIŲ_SODU_JŲ_SANKIRTOJE_BUVO_ĮRENGTOS_GERAI_APŠVIESTOS_POILSIO_AIKŠTELĖS_TAKAI_IŠGRĮSTI_SMULKIAIS_AKMENUKAIS_ARBA_PLŪKTI_IŠ_ŽVYRO_NUO_GATVĖS_PARKĄ_SKYRĖ_ZUBOVŲ_LAIKAIS_STATYTA_AKMENŲ_SIENA_IR_NAUJAI_IŠMŪRYTA_PLYTŲ_TVORA_RYTINIAME_VASAROS_SODO_PAKRAŠTYJE_VEŠĖJO_KAŠTONŲ_ALĖJOS = "Kretingos dvaro parkas – mišraus stiliaus parkas, užimantis 23 ha plotą. Jam pradžią davė Vilniaus vyskupo Igno Jokūbo Masalskio įkurtas didžiulis vaismedžių sodas. Vėliau dvarą valdę grafai Zubovai šalia jo įkūrė landšaftinio (angliškojo) stiliaus parką, kuris XIX a. pirmoje pusėje minimas tarp penkių gražiausių Telšių apskrities parkų. 1874 metais dvarą varžytinėse įsigijo grafas Juozapas Tiškevičius. Būdamas turtingas, veiklus ir intelektualus žmogus, jis rekonstravo dvaro rūmus, įrengė garsųjį Žiemos sodą (didžiausią Europoje to meto privačioje valdoje) ir 1875 metais pradėjo atnaujinti parka. Parko projektavimas buvo patikėtas dvaro matininkui Šostakui, o želdinius ir gėlynus formavo vengrų kilmės daržininkas, rūmų muzikantas Haidukas, daržininkystės mokslus baigęs Vokietijoje. Pagal parengtus planus buvo pertvarkyta priešais rūmus esanti reprezentacinė parko dalis: suformuoti prancūziško stiliaus parkams būdingi geometrinės formos gėlynai, kuriuos puošė fontanai su skulptūromis, greta jų pasodinti introdukuoti medžiai ir dekoratyviniai krūmai, karpomų mažalapių liepų alėjos, sudariusios arkos pavidalo pavėsingus tunelius. Alėjos jungė parką su vaismedžių sodu. Jų sankirtoje buvo įrengtos gerai apšviestos poilsio aikštelės, takai išgrįsti smulkiais akmenukais arba plūkti iš žvyro. Nuo gatvės parką skyrė Zubovų laikais statyta akmenų siena ir naujai išmūryta plytų tvora. Rytiniame Vasaros sodo pakraštyje vešėjo kaštonų alėjos.";
    public static final String KRETINGOS_TIŠKEVIČIŲ_RŪMAI_IR_MUZIEJUS_PARKAS = "Kretingos Tiškevičių rūmai ir muziejus, parkas";
    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1161_BIH_954_EI_B_TO_CWTN0_D4_SZA6_XUD_AP_Q_VENTOS_REGIONINIO_PARKO_AP_C5_BEVALGOS_BOK_C5_A1TAS_PAPIL_C4_97_OQ_VENTOS_REGIONINIO_PARKO_AP_C5_BEVALGOS_BOK_C5_A1TAS_PAPIL_C4_97_GS_L_PSY_AB_3_33I160K1L2_940_1275_0_1715_2_2_0_0_0_0_138_262_0J2_2_0_0_1_1_64_PSY_AB_0_2_262_0_TDCW_J5Y_AJ2_I_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1161&bih=954&ei=bToCWtn0D4Sza6-XudAP&q=Ventos+regioninio+parko+ap%C5%BEvalgos+bok%C5%A1tas+Papil%C4%97&oq=Ventos+regioninio+parko+ap%C5%BEvalgos+bok%C5%A1tas+Papil%C4%97&gs_l=psy-ab.3..33i160k1l2.940.1275.0.1715.2.2.0.0.0.0.138.262.0j2.2.0....0...1.1.64.psy-ab..0.2.262....0.TdcwJ5yAJ2I&gfe_rd=cr&dcr=0";
    public static final String PAPILĖ_85246 = "1011, Papilė 85246";
    public static final String ANT_VENTOS_UPĖS_KRANTO_ŠĮ_PAVASARĮ_IŠKILO_NAUJAS_APŽVALGOS_BOKŠTAS_IŠ_KURIO_ATSIVERIA_PLATUS_VAIZDAS_Į_VENTOS_KRAŠTOVAIZDŽIO_DRAUSTINĮ_PAPILĖS_MIESTĄ_IR_PILIAKALNIUS_VENTOS_UPĖS_VINGIUS_JURAKALNIO_GEOLOGINĘ_ATODANGĄ_ŠIO_15_M_AUKŠČIO_BOKŠTO_ĮRENGIMAS_DALIS_PROJEKTO_SAUGOMŲ_TERITORIJŲ_TVARKYMAS_II_ETAPAS_KURIAM_ĮGYVENDINTI_SKIRTA_VIRŠ_21_MLN_EURŲ_ES_INVESTICIJŲ_IR_JAU_YRA_PASTATYTA_13_APŽVALGOS_BOKŠTŲ_VISOJE_LIETUVOJE_O_DAR_TRYS_STATOMI_ŠIUO_METU_IŠ_MEDŽIO_IR_METALO_KONSTRUKCIJŲ_PAGAMINTAS_MODERNUS_VENTOS_REGIONINIO_PARKO_APŽVALGOS_BOKŠTAS_SAVO_FORMA_PRIMENA_GĖLĖS_ŽIEDĄ_TODĖL_NATŪRALIAI_ĮSILIEJA_Į_GAMTĄ_PASIGĖRĖJUS_ĮSPŪDINGAIS_VAIZDAIS_IŠ_15_M_AUKŠČIO_LANKYTOJAI_KVIEČIAMI_PASIVAIKŠČIOTI_PO_VENTOS_REGIONINĮ_PARKĄ_JURAKALNIO_GEOLOGINIU_PAŽINTINIU_TAKU_IR_APŽIŪRĖTI_VENTOS_KAIRIAJAME_ŠLAITE_RANDAMUS_JUROS_PERIODO_GEOLOGINIUS_SLUOKSNIUS_PAŽINTINIS_TAKAS_TAIP_PAT_VEDA_IKI_RAŠYTOJO_SIMONO_DAUKANTO_MEMORIALINIO_MUZIEJAUS_PAPILĖJE = "Ant Ventos upės kranto šį pavasarį iškilo naujas apžvalgos bokštas, iš kurio atsiveria platus vaizdas į Ventos kraštovaizdžio draustinį, Papilės miestą ir piliakalnius, Ventos upės vingius, Jurakalnio geologinę atodangą. Šio 15 m. aukščio bokšto įrengimas – dalis projekto „Saugomų teritorijų tvarkymas (II etapas)“, kuriam įgyvendinti skirta virš 21 mln. eurų ES investicijų ir jau yra pastatyta 13 apžvalgos bokštų visoje Lietuvoje, o dar trys statomi šiuo metu. Iš medžio ir metalo konstrukcijų pagamintas modernus Ventos regioninio parko apžvalgos bokštas savo forma primena gėlės žiedą, todėl natūraliai įsilieja į gamtą. Pasigėrėjus įspūdingais vaizdais iš 15 m. aukščio lankytojai kviečiami pasivaikščioti po Ventos regioninį parką Jurakalnio geologiniu–pažintiniu taku ir apžiūrėti Ventos kairiajame šlaite randamus Juros periodo geologinius sluoksnius. Pažintinis takas taip pat veda iki rašytojo Simono Daukanto memorialinio muziejaus Papilėje.";
    public static final String VENTOS_REGIONINIO_PARKO_APŽVALGOS_BOKŠTAS = "Ventos regioninio parko apžvalgos bokštas";
    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1161_BIH_954_EI_TG_CWRMW_EOI_HA_PJ5SS_AK_Q_SKULPT_C5_ABR_C5_B3_PARKAS_PLUNG_C4_97JE_OQ_SKULPT_C5_ABR_C5_B3_PARKAS_PLUNG_C4_97JE_GS_L_PSY_AB_3_1206_7599_0_7932_12_10_2_0_0_0_235_1977_0J5J5_10_0_0_1_1_64_PSY_AB_0_11_1898_0I203K1J0I22I30K1J35I39K1J33I160K1J0I19K1_0_NF_MK_TFJW_FEE_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1161&bih=954&ei=_TgCWrmwEoiHaPj5ssAK&q=Skulpt%C5%ABr%C5%B3+parkas+Plung%C4%97je&oq=Skulpt%C5%ABr%C5%B3+parkas+Plung%C4%97je&gs_l=psy-ab.3...1206.7599.0.7932.12.10.2.0.0.0.235.1977.0j5j5.10.0....0...1.1.64.psy-ab..0.11.1898...0i203k1j0i22i30k1j35i39k1j33i160k1j0i19k1.0.NfMkTFJwFEE&gfe_rd=cr&dcr=0";
    public static final String PLUNGĖ_90117 = "Plungė 90117";
    public static final String ĮKURTAS_VIENAME_KRANTINĖS_GALE_PARKE_RADOME_TIEK_NUOLATINES_AKMENS_IR_METALO_SKULPTŪRAS_TIEK_LAIKINAS_GRAŽI_VIETA_PASIVAIKŠČIOTI = "įkurtas viename krantinės gale. Parke radome tiek nuolatines akmens ir metalo skulptūras, tiek laikinas. Graži vieta pasivaikščioti.";
    public static final String SKULPTŪRŲ_PARKAS = "Skulptūrų parkas";
    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_Q_C5_BDEMAITIJOS_KAIMO_BUITIES_MUZIEJUS_CLIENT_FIREFOX_B_SOURCE_LNMS_SA_X_VED_0AH_UKEWJ9J_ZF_QS_K3_XAH_VDLMAKHCU_ZA8_EQ_AUICSG_A_BIW_1161_BIH_954_DPR_1_GFE_RD_CR_DCR_0_EI_JI_ICWQAD_F8FI8_AFV25Y_ADW = "https://www.google.com/search?q=%C5%BDemaitijos+kaimo+buities+muziejus&client=firefox-b&source=lnms&sa=X&ved=0ahUKEwj9jZfQsK3XAhVDLMAKHcuZA8EQ_AUICSgA&biw=1161&bih=954&dpr=1&gfe_rd=cr&dcr=0&ei=JiICWqadF8fi8Afv25yADw";
    public static final String ŽEMAITIJOS_KAIMO_MUZIEJUS = "Žemaitijos Kaimo muziejus";
    public static final String M_GEGUŽĖS_15_D_KULTŪROS_MINISTERIJOS_PAVEDIMU_SUDARYTA_KOMISIJA_KURIAI_BUVO_PATIKĖTA_ATRINKTI_TROBESIUS_IR_KITUS_EKSPONATUS_SKIRTUS_TELŠIŲ_KAIMO_BUITIES = "1963 m. gegužės 15 d. Kultūros ministerijos pavedimu sudaryta komisija, kuriai buvo patikėta atrinkti trobesius ir kitus eksponatus, skirtus Telšių kaimo buities ";
    public static final String MUZIEJAUS_ĮKŪRIMO_DARBAMS_IŠ_PRADŽIŲ_VADOVAVO_ŽEMAIČIŲ_MUZIEJAUS_ALKA_VYR_MOKSLINIS_BENDRADARBIS_PETRAS_SNARSKIS_VĖLIAU_VITAS_VALATKA_TAIS_METAIS_TELŠIŲ_KRAŠTOTYROS_MUZIEJAUS_DIREKTORIUMI_DIRBO_BRONIUS_ŠVĖGŽDAVIČIUS = "Muziejaus įkūrimo darbams iš pradžių vadovavo Žemaičių muziejaus \"ALKA\" vyr. mokslinis bendradarbis Petras Snarskis, vėliau Vitas Valatka. Tais metais Telšių kraštotyros muziejaus direktoriumi dirbo Bronius Švėgždavičius.\n";
    public static final String M_GEGUŽĖS_6_D_ŽEMAIČIŲ_BUITIES_MUZIEJUI_PASKIRTAS_15_HA_PLOTAS_PIETVAKARINĖJE_MASČIO_EŽERO_PUSĖJE_BŪSIMO_TELŠIŲ_MIESTO_PARKO_TERITORIJOJE = "1967 m. gegužės 6 d. Žemaičių buities muziejui paskirtas 15 ha plotas pietvakarinėje Masčio ežero pusėje, būsimo Telšių miesto parko teritorijoje. \n";
    public static final String ŽEMAITIJOS_KAIMO_MUZIEJAUS_ĮKŪRIMO_PLANĄ_PRADĖTA_REALIZUOTI_1963_M_MUZIEJININKŲ_KULTŪROS_VEIKĖJŲ_SUMANYMUS_TĄSYK_PARĖMĖ_LIETUVOS_MINISTRŲ_TARYBA_1963_METAIS_LIETUVOJE_BUVO_NU_ŽEMAITIJOS_BUITIES_MUZIEJUJE_NUOTRAUKA_IŠ_MUZIEJAUS_RINKINIŲMATYTA_SUKURTI_LIAUDIES_BUITIES_MUZIEJŲ_RUMŠIŠKIŲ_PRIE_KAUNO_MARIŲ_IR_TRIS_REGIONINIUS_MUZIEJUS_TELŠIUOSE_ROKIŠKYJE_IR_ALYTUJE = "Žemaitijos kaimo muziejaus įkūrimo planą pradėta realizuoti 1963 m. Muziejininkų, kultūros veikėjų sumanymus tąsyk parėmė Lietuvos Ministrų taryba – 1963  metais Lietuvoje buvo nuŽemaitijos buities muziejuje. Nuotrauka iš muziejaus rinkiniųmatyta sukurti Liaudies buities muziejų (Rumšiškių) prie Kauno marių ir tris regioninius muziejus (Telšiuose, Rokiškyje ir Alytuje).\n";
    public static final String SUMANYMAS_TELŠIUOSE_ĮKURTI_ŽEMAITIJOS_KAIMO_MUZIEJŲ_PO_ATVIRU_DANGUMI_GIMĖ_PRIEŠ_II_ĄJĮ_PASAULINĮ_KARĄ_TADA_PLANUOTA_ĮSTEIGTI_VADINAMĄJĮ_ORO_MUZIEJŲ_TADA_ŠIS_SUMANYMAS_NEBUVO_PRADĖTAS_ĮGYVENDINTI = "Sumanymas Telšiuose įkurti Žemaitijos kaimo muziejų po atviru dangumi gimė  prieš II-ąjį pasaulinį karą. Tada planuota įsteigti vadinamąjį Oro muziejų. Tada šis sumanymas nebuvo pradėtas įgyvendinti. \n";
    public static final String ŽEMAITIJOS_KAIMO_BUITIES_MUZIEJUS = "Žemaitijos kaimo buities muziejus";
    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_EI_RSECWTR0_NOICG_AA_GTQA_QAQ_Q_TEL_C5_A1I_C5_B3_C5_A0VENTOS_MERGEL_C4_97S_MARIJOS_C4_96MIMO_C4_AF_DANG_C5_B3_BA_C5_BENY_C4_8_DIA_OQ_TEL_C5_A1I_C5_B3_C5_A0VENTOS_MERGEL_C4_97S_MARIJOS_C4_96MIMO_C4_AF_DANG_C5_B3_BA_C5_BENY_C4_8_DIA_GS_L_PSY_AB_3_0I22I30K1J38_8260_8687_0_8918_2_2_0_0_0_0_223_431_2_2_2_0_0_1_1_64_PSY_AB_0_2_430_0_9_UN_LG0_YSKEG_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&ei=RSECWtr0NOicgAaGtqaQAQ&q=Tel%C5%A1i%C5%B3+%C5%A0ventos+Mergel%C4%97s+Marijos+%C4%96mimo+%C4%AF+Dang%C5%B3+ba%C5%BEny%C4%8Dia&oq=Tel%C5%A1i%C5%B3+%C5%A0ventos+Mergel%C4%97s+Marijos+%C4%96mimo+%C4%AF+Dang%C5%B3+ba%C5%BEny%C4%8Dia&gs_l=psy-ab.3..0i22i30k1j38.8260.8687.0.8918.2.2.0.0.0.0.223.431.2-2.2.0....0...1.1.64.psy-ab..0.2.430....0.9UnLg0Yskeg&gfe_rd=cr&dcr=0";
    public static final String TELŠIŲ_ŠVENTOS_MERGELĖS_MARIJOS_ĖMIMO_Į_DANGŲ_BAŽNYČIA_TELŠIŲ_MAŽOJI_BAŽNYTĖLĖ = "Telšių Šventos Mergelės Marijos Ėmimo į Dangų bažnyčia (Telšių Mažoji bažnytėlė)";
    public static final String KALVOS_VIRŠŪNĖJE_BALTUOJANTI_DAILI_ŠV_MERGELĖS_MARIJOS_ĖMIMO_Į_DANGŲ_BAŽNYČIA_MANOMA_KAD_ŠIOJE_VIETOJE_PIRMOJI_BAŽNYČIA_BUVO_PASTATYTA_MAŽDAUG_1536_M_BŪTINAI_UŽKOPKITE_PRIE_JOS_NES_NUO_KALVOS_ATSIVERIA_GRAŽI_PANORAMA_Į_MIEGAMUOSIUS_TELŠIŲ_RAJONUS_BEI_MASČIO_EŽERĄ = "Kalvos viršūnėje baltuojanti daili Šv. Mergelės Marijos ėmimo į dangų bažnyčia. Manoma, kad šioje vietoje pirmoji bažnyčia buvo pastatyta maždaug 1536 m. Būtinai užkopkite prie jos, nes nuo kalvos atsiveria graži panorama į miegamuosius Telšių rajonus bei Masčio ežerą. ";
    public static final String ŠV_MERGELĖS_MARIJOS_ĖMIMO_Į_DANGŲ_BAŽNYČIA = "Šv. Mergelės Marijos ėmimo į dangų bažnyčia";
    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_Q_GARD_C5_B3_OZO_P_C4_97S_C4_8_DI_C5_ABJ_C5_B3_TAKAS_CLIENT_FIREFOX_B_SOURCE_LNMS_SA_X_VED_0AH_UKEWITZEJKRA3_XAH_VKD8_AKHUV_GDQG_Q_AUICSG_A_BIW_1161_BIH_954_DPR_1_GFE_RD_CR_DCR_0_EI_C_B8_CWOI7_HCFI8_AFV25Y_ADW = "https://www.google.com/search?q=Gard%C5%B3+Ozo+P%C4%97s%C4%8Di%C5%ABj%C5%B3+takas&client=firefox-b&source=lnms&sa=X&ved=0ahUKEwitzejkra3XAhVKD8AKHUvGDqgQ_AUICSgA&biw=1161&bih=954&dpr=1&gfe_rd=cr&dcr=0&ei=cB8CWoi7Hcfi8Afv25yADw";
    public static final String GARDŲ_OZAS_90444 = "Gardų ozas 90444";
    public static final String OZAS_YRA_ILGA_NET_3_5_KM_ILGIO_SIAURA_KALVA_SUDARYTA_DAUGIAUSIAI_IŠ_SMĖLIO_IR_ŽVYRO_JI_SUSIDARĖ_IŠ_NUOGULŲ_KURIOS_KLOSTĖSI_LEDYNO_VIDUJE_TIRPSTANT_VANDENIUI_PRIEŠ_12_13_TŪKSTANČIŲ_METŲ_GARDŲ_OZO_AUKŠTIS_NUO_PAPĖDŽIŲ_IKI_AUKŠČIAUSIŲ_GŪBRIO_KETERŲ_VIETOMIS_SIEKIA_10_15_METRŲ_ŠTAI_TOKIAME_OZE_PAŽINTINIS_TAKAS_IR_YRA_ĮRENGTAS = "Ozas yra ilga – net 3,5 km ilgio – siaura kalva, sudaryta daugiausiai iš smėlio ir žvyro. Ji susidarė iš nuogulų, kurios klostėsi ledyno viduje, tirpstant vandeniui prieš 12-13 tūkstančių metų. Gardų ozo aukštis nuo papėdžių iki aukščiausių gūbrio keterų vietomis siekia 10–15 metrų. Štai tokiame oze pažintinis takas ir yra įrengtas.";
    public static final String GARDŲ_OZO_PĖSČIŪJŲ_TAKAS = "Gardų Ozo Pėsčiūjų takas";
    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1161_BIH_954_EI_RRW_CWRB_TIAY_KG_ABRIP_W_DW_Q_ENERGETINIAI_LABIRINTAI_OQ_ENERGETINIAI_LABIRINTAI_GS_L_PSY_AB_12_0I19K1L4J0I22I30I19K1L4J38_301434_301434_0_302259_1_1_0_0_0_0_231_231_2_1_1_0_0_1_64_PSY_AB_0_1_231_0_DW8_YQ_HZV_9O_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1161&bih=954&ei=RRwCWrbTIayKgAbrip_wDw&q=Energetiniai+Labirintai&oq=Energetiniai+Labirintai&gs_l=psy-ab.12..0i19k1l4j0i22i30i19k1l4j38.301434.301434.0.302259.1.1.0.0.0.0.231.231.2-1.1.0....0...1..64.psy-ab..0.1.231....0.Dw8YqHZV_9o&gfe_rd=cr&dcr=0";
    public static final String ENERGY_LABYRINTH_AND_GEOMETRIC_SHAPES_PARK = "Energy labyrinth and geometric shapes Park";
    public static final String PLUNGĖS_RAJONE_ĮKURTI_ENERGETINIAI_LABIRINTAI_NĖRA_TIE_TRADICINIAI_MUMS_ĮPRASTI_KLAIDIEJI_LABIRINTAI_KURIAIS_EINANT_TARP_DAUGELIO_KELIŲ_REIKIA_RASTI_TĄ_VIENINTELĮ_TEISINGĄ_ATVESIANTĮ_TAVE_Į_LABIRINTO_CENTRĄ_ARBA_IŠVESIANTĮ_LAUK_ENERGETINIAI_LABIRINTAI_NEKLAIDINA_JIE_TURI_AIŠKIĄ_PRADŽIĄ_IR_PABAIGĄ_O_NORINT_JUOS_PEREITI_TEREIKIA_SEKTI_VIENU_AIŠKIU_TAKU_ŠIŲ_LABIRINTŲ_PASKIRTIS_KELIAUJANČIAM_JUO_ŽMOGUI_LEISTI_PABŪTI_SU_SAVIMI_PAMĄSTYTI_ATSIPALAIDUOTI_PAMEDITUOTI = "Plungės rajone įkurti energetiniai labirintai nėra tie tradiciniai, mums įprasti klaidieji labirintai, kuriais einant tarp daugelio kelių reikia rasti tą vienintelį teisingą, atvesiantį tave į labirinto centrą arba išvesiantį lauk. Energetiniai labirintai neklaidina, jie turi aiškią pradžią ir pabaigą, o norint juos pereiti tereikia sekti vienu aiškiu taku. Šių labirintų paskirtis – keliaujančiam juo žmogui leisti pabūti su savimi, pamąstyti, atsipalaiduoti, pamedituoti. ";
    public static final String ENERGETINIAI_LABIRINTAI = "Energetiniai Labirintai";
    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1161_BIH_954_EI_QRW_CWR_GBBIF_TG_AAMU_LI_IAW_Q_PLUNG_C4_97S_DVARAS_OQ_PLUNG_C4_97S_DVARAS_GS_L_PSY_AB_12_0J0I30K1J0I8I30K1J0I5I10I30K1_1146_1146_0_2806_1_1_0_0_0_0_401_401_4_1_1_0_0_1_1_64_PSY_AB_0_1_401_0_J0_HV1_XOP554_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b&biw=1161&bih=954&ei=QRwCWrGBBIfTgAamuLiIAw&q=Plung%C4%97s+dvaras&oq=Plung%C4%97s+dvaras&gs_l=psy-ab.12..0j0i30k1j0i8i30k1j0i5i10i30k1.1146.1146.0.2806.1.1.0.0.0.0.401.401.4-1.1.0....0...1.1.64.psy-ab..0.1.401....0.j0Hv1XOP554&gfe_rd=cr&dcr=0";
    public static final String PARKO_G_1_PLUNGĖ = "Parko g. 1, Plungė";
    public static final String UŽ_DVARO_RŪMŲ_DIDELIS_58_3_HEKTARŲ_PARKAS_SU_TVENKINIAIS_TILTELIAIS_PER_JUOS_MANOMA_KAD_PARKAS_ĮKURTAS_XVIII_AMŽIAUS_VIDURYJE_PARKE_RADOME_IR_SENĄ_ĄŽUOLĄ_VADINAMĄ_PERKŪNO_ĄŽUOLU_PASAKOJAMA_KAD_PAGONYBĖS_LAIKAIS_ŠALIA_MEDŽIO_ŠVENTĄJĄ_UGNĮ_KŪRENO_VAIDILUTĖ_GALINDA_VIENĄ_DIENĄ_JOS_MYLIMASIS_IŠJOJO_GINTI_TĖVYNĖS_NUO_KRYŽIUOČIŲ_IR_NEGRĮŽO_GALINDA_VIS_RAUDODAVO_TODĖL_VAIDILA_MATYDAMA_SIELVARTO_APIMTĄ_VAIDILUTĘ_MOKĖ_JĄ_NELIETI_AŠARŲ_IR_SAKĖ_KAD_TIK_ŠVENTOJI_UGNIS_GALI_UŽGESINTI_ŽEMIŠKĄJĄ_MEILĘ_KARTĄ_GALINDAI_RAUDANT_PO_PLAČIAŠAKIU_ĄŽUOLU_Į_JĮ_TRENKĖ_PERKŪNAS_ĄŽUOLAS_SUDREBĖJO_Į_JO_KAMIENĄ_PRIKRITO_ŽEMIŲ_IŠ_KURIŲ_NETRUKUS_IŠAUGO_YPATINGAI_GRAŽI_GĖLĖ_NUO_TO_LAIKO_ŽMONĖS_ĄŽUOLĄ_VADINA_PERKŪNO_ĄŽUOLU = "Už dvaro rūmų – didelis 58,3 hektarų parkas. Su tvenkiniais, tilteliais per juos. Manoma, kad parkas įkurtas XVIII amžiaus viduryje. Parke radome ir seną ąžuolą vadinamą Perkūno ąžuolu. Pasakojama, kad pagonybės laikais šalia medžio šventąją ugnį kūreno vaidilutė Galinda. Vieną dieną jos mylimasis išjojo ginti tėvynės nuo kryžiuočių ir negrįžo. Galinda vis raudodavo, todėl vaidila, matydama sielvarto apimtą vaidilutę, mokė ją nelieti ašarų ir sakė, kad tik šventoji ugnis gali užgesinti žemiškąją meilę. Kartą Galindai raudant po plačiašakiu ąžuolu, į jį trenkė perkūnas. Ąžuolas sudrebėjo, į jo kamieną prikrito žemių, iš kurių netrukus išaugo ypatingai graži gėlė. Nuo to laiko žmonės ąžuolą vadina Perkūno ąžuolu.";
    public static final String TARP_ARKLIDŽIŲ_IR_DVARO_PLATI_ERDVĖ_SU_ŽOLYNAIS_GĖLYNAIS_TVENKINIU_PILNU_LELIJŲ_BEI_ŽINOMA_ŽIEDU_EINANČIU_KELIU_LEIDŽIANČIU_PRIVAŽIUOTI_PRIE_RŪMŲ_IŠ_KARTO_ĮSIVAIZDAVAU_KAIP_OGINSKIŲ_LAIKAIS_PER_RŪMUOSE_RENGTAS_PUOTAS_ČIA_SU_KARIETOMIS_PRIVAŽIUODAVO_DAUGYBĖ_SVEČIŲ_APSUKUSIOS_PUSRATĮ_KARIETOS_SUSTODAVO_PRIE_PAGRINDINIO_ĮĖJIMO_Į_RŪMUS_IŠ_JŲ_ELEGANTIŠKAI_IŠLIPDAVO_DAMOS_PŪSTOMIS_SUKNELĖMIS_IR_LAIKYDAMOS_VYRAMS_UŽ_PARANKIŲ_LĖTAI_UŽKOPDAVO_PAGRINDINIAIS_RŪMŲ_LAIPTAIS = "Tarp arklidžių ir dvaro – plati erdvė su žolynais, gėlynais, tvenkiniu pilnu lelijų bei, žinoma, žiedu einančiu keliu, leidžiančiu privažiuoti prie rūmų. Iš karto įsivaizdavau, kaip Oginskių laikais, per rūmuose rengtas puotas, čia su karietomis privažiuodavo daugybė svečių. Apsukusios pusratį, karietos sustodavo prie pagrindinio įėjimo į rūmus, iš jų elegantiškai išlipdavo damos pūstomis suknelėmis, ir laikydamos vyrams už parankių, lėtai užkopdavo pagrindiniais rūmų laiptais";
    public static final String NE_KĄ_MAŽIAU_ĮSPŪDINGOS_IR_IŠLIKUSIOS_NEOGOTIKINIO_STILIAUS_RAUDONŲ_PLYTŲ_DVARO_ARKLIDĖS = "Ne ką mažiau įspūdingos ir išlikusios neogotikinio stiliaus, raudonų plytų dvaro arklidės. ";
    public static final String NEORENESANSO_STILIAUS_RŪMUS_KURIE_DABAR_DIDINGAI_STOVI_REKONSTRUOTI_IR_DŽIUGINA_LANKYTOJŲ_AKIS_1879_M_PASTATĖ_KUNIGAIKŠČIAI_OGINSKIAI_TAI_BUVO_OGINSKIŲ_DVARO_REZIDENCINIAI_RŪMAI = "Neorenesanso stiliaus rūmus, kurie dabar didingai stovi rekonstruoti ir džiugina lankytojų akis, 1879 m. pastatė kunigaikščiai Oginskiai. Tai buvo Oginskių dvaro rezidenciniai rūmai.\n";
    public static final String IREIKSME = "IREIKSME";
    int i, sk = 0, max = 15;
    Vibrator vibrator;
    String str_location;
    String daugiau;
    ImageView plius, minus, img;
    int pirminisnuotraukosplotis, pirminisnuotraukosilgis;
    Animation blink;
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
        mMediaPlayer = MediaPlayer.create(lankytinos_vietosgalerry.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lankytinos_vietosgalerry);

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

        i = getIntent().getIntExtra(IREIKSME, 0);
        img = (ImageView) findViewById(R.id.galerija);
        plius = (ImageView) findViewById(R.id.pirmyn);
        minus = (ImageView) findViewById(R.id.atgal);
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        plius.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                skamb();
                i++;
                if (i > max) {
                    i = max;
                }
                setelements();
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                skamb();
                i--;
                if (i < 0) {
                    i = 0;
                }
                setelements();
            }
        });

        img.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                sk++;
                skamb();
                if (sk % 2 != 0) {
                    plius.setVisibility(View.GONE);
                    minus.setVisibility(View.GONE);
                    img.requestLayout();
                    pirminisnuotraukosplotis = img.getLayoutParams().width;
                    pirminisnuotraukosilgis = img.getLayoutParams().height;
                    img.setScaleType(CENTER_CROP);
                    vibrator.vibrate(200);

                } else {
                    if (i == 0) {

                    } else {
                        minus.setVisibility(View.VISIBLE);
                    }

                    if (i == max) {

                    } else {
                        plius.setVisibility(View.VISIBLE);
                    }

                    img.requestLayout();
                    img.getLayoutParams().width = pirminisnuotraukosplotis;
                    img.getLayoutParams().height = pirminisnuotraukosilgis;
                    img.setScaleType(FIT_CENTER);
                    vibrator.vibrate(200);

                }
                return false;
            }
        });

        setelements();
    }

    void setelements() {
        TextView pvd = (TextView) findViewById(R.id.pavadinimas);
        blink = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        TextView apr = (TextView) findViewById(R.id.aprasymas);
        ImageView map = (ImageView) findViewById(R.id.mapas);
        ImageView gs = (ImageView) findViewById(R.id.gsearch);

        if (i == 8) {
            minus.startAnimation(blink);
            pvd.startAnimation(blink);
            img.startAnimation(blink);
            apr.startAnimation(blink);
            plius.setAnimation(blink);
            map.startAnimation(blink);
            gs.startAnimation(blink);

            apr.setText(NEORENESANSO_STILIAUS_RŪMUS_KURIE_DABAR_DIDINGAI_STOVI_REKONSTRUOTI_IR_DŽIUGINA_LANKYTOJŲ_AKIS_1879_M_PASTATĖ_KUNIGAIKŠČIAI_OGINSKIAI_TAI_BUVO_OGINSKIŲ_DVARO_REZIDENCINIAI_RŪMAI +
                    "\n" +
                    NE_KĄ_MAŽIAU_ĮSPŪDINGOS_IR_IŠLIKUSIOS_NEOGOTIKINIO_STILIAUS_RAUDONŲ_PLYTŲ_DVARO_ARKLIDĖS +
                    TARP_ARKLIDŽIŲ_IR_DVARO_PLATI_ERDVĖ_SU_ŽOLYNAIS_GĖLYNAIS_TVENKINIU_PILNU_LELIJŲ_BEI_ŽINOMA_ŽIEDU_EINANČIU_KELIU_LEIDŽIANČIU_PRIVAŽIUOTI_PRIE_RŪMŲ_IŠ_KARTO_ĮSIVAIZDAVAU_KAIP_OGINSKIŲ_LAIKAIS_PER_RŪMUOSE_RENGTAS_PUOTAS_ČIA_SU_KARIETOMIS_PRIVAŽIUODAVO_DAUGYBĖ_SVEČIŲ_APSUKUSIOS_PUSRATĮ_KARIETOS_SUSTODAVO_PRIE_PAGRINDINIO_ĮĖJIMO_Į_RŪMUS_IŠ_JŲ_ELEGANTIŠKAI_IŠLIPDAVO_DAMOS_PŪSTOMIS_SUKNELĖMIS_IR_LAIKYDAMOS_VYRAMS_UŽ_PARANKIŲ_LĖTAI_UŽKOPDAVO_PAGRINDINIAIS_RŪMŲ_LAIPTAIS +
                    UŽ_DVARO_RŪMŲ_DIDELIS_58_3_HEKTARŲ_PARKAS_SU_TVENKINIAIS_TILTELIAIS_PER_JUOS_MANOMA_KAD_PARKAS_ĮKURTAS_XVIII_AMŽIAUS_VIDURYJE_PARKE_RADOME_IR_SENĄ_ĄŽUOLĄ_VADINAMĄ_PERKŪNO_ĄŽUOLU_PASAKOJAMA_KAD_PAGONYBĖS_LAIKAIS_ŠALIA_MEDŽIO_ŠVENTĄJĄ_UGNĮ_KŪRENO_VAIDILUTĖ_GALINDA_VIENĄ_DIENĄ_JOS_MYLIMASIS_IŠJOJO_GINTI_TĖVYNĖS_NUO_KRYŽIUOČIŲ_IR_NEGRĮŽO_GALINDA_VIS_RAUDODAVO_TODĖL_VAIDILA_MATYDAMA_SIELVARTO_APIMTĄ_VAIDILUTĘ_MOKĖ_JĄ_NELIETI_AŠARŲ_IR_SAKĖ_KAD_TIK_ŠVENTOJI_UGNIS_GALI_UŽGESINTI_ŽEMIŠKĄJĄ_MEILĘ_KARTĄ_GALINDAI_RAUDANT_PO_PLAČIAŠAKIU_ĄŽUOLU_Į_JĮ_TRENKĖ_PERKŪNAS_ĄŽUOLAS_SUDREBĖJO_Į_JO_KAMIENĄ_PRIKRITO_ŽEMIŲ_IŠ_KURIŲ_NETRUKUS_IŠAUGO_YPATINGAI_GRAŽI_GĖLĖ_NUO_TO_LAIKO_ŽMONĖS_ĄŽUOLĄ_VADINA_PERKŪNO_ĄŽUOLU);

            apr.startAnimation(blink);
            str_location = PARKO_G_1_PLUNGĖ;
            daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1161_BIH_954_EI_QRW_CWR_GBBIF_TG_AAMU_LI_IAW_Q_PLUNG_C4_97S_DVARAS_OQ_PLUNG_C4_97S_DVARAS_GS_L_PSY_AB_12_0J0I30K1J0I8I30K1J0I5I10I30K1_1146_1146_0_2806_1_1_0_0_0_0_401_401_4_1_1_0_0_1_1_64_PSY_AB_0_1_401_0_J0_HV1_XOP554_GFE_RD_CR_DCR_0;
        }

        if (i == 2) {
            minus.startAnimation(blink);
            pvd.startAnimation(blink);
            img.startAnimation(blink);
            apr.startAnimation(blink);
            plius.setAnimation(blink);
            minus.setVisibility(View.VISIBLE);
            map.startAnimation(blink);
            gs.startAnimation(blink);

            pvd.setText(ENERGETINIAI_LABIRINTAI);
            img.setImageResource(R.drawable.elabirintai);
            apr.setText(PLUNGĖS_RAJONE_ĮKURTI_ENERGETINIAI_LABIRINTAI_NĖRA_TIE_TRADICINIAI_MUMS_ĮPRASTI_KLAIDIEJI_LABIRINTAI_KURIAIS_EINANT_TARP_DAUGELIO_KELIŲ_REIKIA_RASTI_TĄ_VIENINTELĮ_TEISINGĄ_ATVESIANTĮ_TAVE_Į_LABIRINTO_CENTRĄ_ARBA_IŠVESIANTĮ_LAUK_ENERGETINIAI_LABIRINTAI_NEKLAIDINA_JIE_TURI_AIŠKIĄ_PRADŽIĄ_IR_PABAIGĄ_O_NORINT_JUOS_PEREITI_TEREIKIA_SEKTI_VIENU_AIŠKIU_TAKU_ŠIŲ_LABIRINTŲ_PASKIRTIS_KELIAUJANČIAM_JUO_ŽMOGUI_LEISTI_PABŪTI_SU_SAVIMI_PAMĄSTYTI_ATSIPALAIDUOTI_PAMEDITUOTI);

            str_location = ENERGY_LABYRINTH_AND_GEOMETRIC_SHAPES_PARK;
            daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1161_BIH_954_EI_RRW_CWRB_TIAY_KG_ABRIP_W_DW_Q_ENERGETINIAI_LABIRINTAI_OQ_ENERGETINIAI_LABIRINTAI_GS_L_PSY_AB_12_0I19K1L4J0I22I30I19K1L4J38_301434_301434_0_302259_1_1_0_0_0_0_231_231_2_1_1_0_0_1_64_PSY_AB_0_1_231_0_DW8_YQ_HZV_9O_GFE_RD_CR_DCR_0;
        }

        if (i == 3) {
            minus.startAnimation(blink);
            pvd.startAnimation(blink);
            img.startAnimation(blink);
            apr.startAnimation(blink);
            plius.setAnimation(blink);
            map.startAnimation(blink);
            gs.startAnimation(blink);

            pvd.setText(GARDŲ_OZO_PĖSČIŪJŲ_TAKAS);
            img.setImageResource(R.drawable.ozo);
            apr.setText(OZAS_YRA_ILGA_NET_3_5_KM_ILGIO_SIAURA_KALVA_SUDARYTA_DAUGIAUSIAI_IŠ_SMĖLIO_IR_ŽVYRO_JI_SUSIDARĖ_IŠ_NUOGULŲ_KURIOS_KLOSTĖSI_LEDYNO_VIDUJE_TIRPSTANT_VANDENIUI_PRIEŠ_12_13_TŪKSTANČIŲ_METŲ_GARDŲ_OZO_AUKŠTIS_NUO_PAPĖDŽIŲ_IKI_AUKŠČIAUSIŲ_GŪBRIO_KETERŲ_VIETOMIS_SIEKIA_10_15_METRŲ_ŠTAI_TOKIAME_OZE_PAŽINTINIS_TAKAS_IR_YRA_ĮRENGTAS);

            str_location = GARDŲ_OZAS_90444;
            daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_Q_GARD_C5_B3_OZO_P_C4_97S_C4_8_DI_C5_ABJ_C5_B3_TAKAS_CLIENT_FIREFOX_B_SOURCE_LNMS_SA_X_VED_0AH_UKEWITZEJKRA3_XAH_VKD8_AKHUV_GDQG_Q_AUICSG_A_BIW_1161_BIH_954_DPR_1_GFE_RD_CR_DCR_0_EI_C_B8_CWOI7_HCFI8_AFV25Y_ADW;
        }


        if (i == 13) {
            minus.startAnimation(blink);
            pvd.startAnimation(blink);
            img.startAnimation(blink);
            apr.startAnimation(blink);
            plius.setAnimation(blink);
            map.startAnimation(blink);
            gs.startAnimation(blink);

            pvd.setText(ŠV_MERGELĖS_MARIJOS_ĖMIMO_Į_DANGŲ_BAŽNYČIA);
            img.setImageResource(R.drawable.baznycia);
            apr.setText(KALVOS_VIRŠŪNĖJE_BALTUOJANTI_DAILI_ŠV_MERGELĖS_MARIJOS_ĖMIMO_Į_DANGŲ_BAŽNYČIA_MANOMA_KAD_ŠIOJE_VIETOJE_PIRMOJI_BAŽNYČIA_BUVO_PASTATYTA_MAŽDAUG_1536_M_BŪTINAI_UŽKOPKITE_PRIE_JOS_NES_NUO_KALVOS_ATSIVERIA_GRAŽI_PANORAMA_Į_MIEGAMUOSIUS_TELŠIŲ_RAJONUS_BEI_MASČIO_EŽERĄ);

            str_location = TELŠIŲ_ŠVENTOS_MERGELĖS_MARIJOS_ĖMIMO_Į_DANGŲ_BAŽNYČIA_TELŠIŲ_MAŽOJI_BAŽNYTĖLĖ;
            daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_EI_RSECWTR0_NOICG_AA_GTQA_QAQ_Q_TEL_C5_A1I_C5_B3_C5_A0VENTOS_MERGEL_C4_97S_MARIJOS_C4_96MIMO_C4_AF_DANG_C5_B3_BA_C5_BENY_C4_8_DIA_OQ_TEL_C5_A1I_C5_B3_C5_A0VENTOS_MERGEL_C4_97S_MARIJOS_C4_96MIMO_C4_AF_DANG_C5_B3_BA_C5_BENY_C4_8_DIA_GS_L_PSY_AB_3_0I22I30K1J38_8260_8687_0_8918_2_2_0_0_0_0_223_431_2_2_2_0_0_1_1_64_PSY_AB_0_2_430_0_9_UN_LG0_YSKEG_GFE_RD_CR_DCR_0;
        }

        if (i == 14) {
            minus.startAnimation(blink);
            pvd.startAnimation(blink);
            img.startAnimation(blink);
            apr.startAnimation(blink);
            plius.setAnimation(blink);
            map.startAnimation(blink);
            gs.startAnimation(blink);

            pvd.setText(ŽEMAITIJOS_KAIMO_BUITIES_MUZIEJUS);
            img.setImageResource(R.drawable.zlbm);
            apr.setText("\n" +
                    SUMANYMAS_TELŠIUOSE_ĮKURTI_ŽEMAITIJOS_KAIMO_MUZIEJŲ_PO_ATVIRU_DANGUMI_GIMĖ_PRIEŠ_II_ĄJĮ_PASAULINĮ_KARĄ_TADA_PLANUOTA_ĮSTEIGTI_VADINAMĄJĮ_ORO_MUZIEJŲ_TADA_ŠIS_SUMANYMAS_NEBUVO_PRADĖTAS_ĮGYVENDINTI +
                    ŽEMAITIJOS_KAIMO_MUZIEJAUS_ĮKŪRIMO_PLANĄ_PRADĖTA_REALIZUOTI_1963_M_MUZIEJININKŲ_KULTŪROS_VEIKĖJŲ_SUMANYMUS_TĄSYK_PARĖMĖ_LIETUVOS_MINISTRŲ_TARYBA_1963_METAIS_LIETUVOJE_BUVO_NU_ŽEMAITIJOS_BUITIES_MUZIEJUJE_NUOTRAUKA_IŠ_MUZIEJAUS_RINKINIŲMATYTA_SUKURTI_LIAUDIES_BUITIES_MUZIEJŲ_RUMŠIŠKIŲ_PRIE_KAUNO_MARIŲ_IR_TRIS_REGIONINIUS_MUZIEJUS_TELŠIUOSE_ROKIŠKYJE_IR_ALYTUJE +
                    M_GEGUŽĖS_6_D_ŽEMAIČIŲ_BUITIES_MUZIEJUI_PASKIRTAS_15_HA_PLOTAS_PIETVAKARINĖJE_MASČIO_EŽERO_PUSĖJE_BŪSIMO_TELŠIŲ_MIESTO_PARKO_TERITORIJOJE +
                    MUZIEJAUS_ĮKŪRIMO_DARBAMS_IŠ_PRADŽIŲ_VADOVAVO_ŽEMAIČIŲ_MUZIEJAUS_ALKA_VYR_MOKSLINIS_BENDRADARBIS_PETRAS_SNARSKIS_VĖLIAU_VITAS_VALATKA_TAIS_METAIS_TELŠIŲ_KRAŠTOTYROS_MUZIEJAUS_DIREKTORIUMI_DIRBO_BRONIUS_ŠVĖGŽDAVIČIUS +
                    M_GEGUŽĖS_15_D_KULTŪROS_MINISTERIJOS_PAVEDIMU_SUDARYTA_KOMISIJA_KURIAI_BUVO_PATIKĖTA_ATRINKTI_TROBESIUS_IR_KITUS_EKSPONATUS_SKIRTUS_TELŠIŲ_KAIMO_BUITIES);

            str_location = ŽEMAITIJOS_KAIMO_MUZIEJUS;
            daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_Q_C5_BDEMAITIJOS_KAIMO_BUITIES_MUZIEJUS_CLIENT_FIREFOX_B_SOURCE_LNMS_SA_X_VED_0AH_UKEWJ9J_ZF_QS_K3_XAH_VDLMAKHCU_ZA8_EQ_AUICSG_A_BIW_1161_BIH_954_DPR_1_GFE_RD_CR_DCR_0_EI_JI_ICWQAD_F8FI8_AFV25Y_ADW;
        }
        if (i == 10) {
            minus.startAnimation(blink);
            pvd.startAnimation(blink);
            img.startAnimation(blink);
            apr.startAnimation(blink);
            plius.setAnimation(blink);
            map.startAnimation(blink);
            gs.startAnimation(blink);

            pvd.setText(SKULPTŪRŲ_PARKAS);
            img.setImageResource(R.drawable.skultura);
            apr.setText(ĮKURTAS_VIENAME_KRANTINĖS_GALE_PARKE_RADOME_TIEK_NUOLATINES_AKMENS_IR_METALO_SKULPTŪRAS_TIEK_LAIKINAS_GRAŽI_VIETA_PASIVAIKŠČIOTI);
            str_location = PLUNGĖ_90117;
            daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1161_BIH_954_EI_TG_CWRMW_EOI_HA_PJ5SS_AK_Q_SKULPT_C5_ABR_C5_B3_PARKAS_PLUNG_C4_97JE_OQ_SKULPT_C5_ABR_C5_B3_PARKAS_PLUNG_C4_97JE_GS_L_PSY_AB_3_1206_7599_0_7932_12_10_2_0_0_0_235_1977_0J5J5_10_0_0_1_1_64_PSY_AB_0_11_1898_0I203K1J0I22I30K1J35I39K1J33I160K1J0I19K1_0_NF_MK_TFJW_FEE_GFE_RD_CR_DCR_0;
        }
        if (i == 11) {
            minus.startAnimation(blink);
            pvd.startAnimation(blink);
            img.startAnimation(blink);
            apr.startAnimation(blink);
            plius.setAnimation(blink);
            map.startAnimation(blink);
            gs.startAnimation(blink);

            pvd.setText(VENTOS_REGIONINIO_PARKO_APŽVALGOS_BOKŠTAS);
            img.setImageResource(R.drawable.apbokstas);
            apr.setText(ANT_VENTOS_UPĖS_KRANTO_ŠĮ_PAVASARĮ_IŠKILO_NAUJAS_APŽVALGOS_BOKŠTAS_IŠ_KURIO_ATSIVERIA_PLATUS_VAIZDAS_Į_VENTOS_KRAŠTOVAIZDŽIO_DRAUSTINĮ_PAPILĖS_MIESTĄ_IR_PILIAKALNIUS_VENTOS_UPĖS_VINGIUS_JURAKALNIO_GEOLOGINĘ_ATODANGĄ_ŠIO_15_M_AUKŠČIO_BOKŠTO_ĮRENGIMAS_DALIS_PROJEKTO_SAUGOMŲ_TERITORIJŲ_TVARKYMAS_II_ETAPAS_KURIAM_ĮGYVENDINTI_SKIRTA_VIRŠ_21_MLN_EURŲ_ES_INVESTICIJŲ_IR_JAU_YRA_PASTATYTA_13_APŽVALGOS_BOKŠTŲ_VISOJE_LIETUVOJE_O_DAR_TRYS_STATOMI_ŠIUO_METU_IŠ_MEDŽIO_IR_METALO_KONSTRUKCIJŲ_PAGAMINTAS_MODERNUS_VENTOS_REGIONINIO_PARKO_APŽVALGOS_BOKŠTAS_SAVO_FORMA_PRIMENA_GĖLĖS_ŽIEDĄ_TODĖL_NATŪRALIAI_ĮSILIEJA_Į_GAMTĄ_PASIGĖRĖJUS_ĮSPŪDINGAIS_VAIZDAIS_IŠ_15_M_AUKŠČIO_LANKYTOJAI_KVIEČIAMI_PASIVAIKŠČIOTI_PO_VENTOS_REGIONINĮ_PARKĄ_JURAKALNIO_GEOLOGINIU_PAŽINTINIU_TAKU_IR_APŽIŪRĖTI_VENTOS_KAIRIAJAME_ŠLAITE_RANDAMUS_JUROS_PERIODO_GEOLOGINIUS_SLUOKSNIUS_PAŽINTINIS_TAKAS_TAIP_PAT_VEDA_IKI_RAŠYTOJO_SIMONO_DAUKANTO_MEMORIALINIO_MUZIEJAUS_PAPILĖJE);
            str_location = PAPILĖ_85246;
            daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_BIW_1161_BIH_954_EI_B_TO_CWTN0_D4_SZA6_XUD_AP_Q_VENTOS_REGIONINIO_PARKO_AP_C5_BEVALGOS_BOK_C5_A1TAS_PAPIL_C4_97_OQ_VENTOS_REGIONINIO_PARKO_AP_C5_BEVALGOS_BOK_C5_A1TAS_PAPIL_C4_97_GS_L_PSY_AB_3_33I160K1L2_940_1275_0_1715_2_2_0_0_0_0_138_262_0J2_2_0_0_1_1_64_PSY_AB_0_2_262_0_TDCW_J5Y_AJ2_I_GFE_RD_CR_DCR_0;
        }

        if (i == 5) {
            minus.startAnimation(blink);
            pvd.startAnimation(blink);
            img.startAnimation(blink);
            apr.startAnimation(blink);
            plius.setAnimation(blink);
            map.startAnimation(blink);
            gs.startAnimation(blink);

            pvd.setText(KRETINGOS_TIŠKEVIČIŲ_RŪMAI_IR_MUZIEJUS_PARKAS);
            img.setImageResource(R.drawable.kretmuziejus);
            apr.setText(KRETINGOS_DVARO_PARKAS_MIŠRAUS_STILIAUS_PARKAS_UŽIMANTIS_23_HA_PLOTĄ_JAM_PRADŽIĄ_DAVĖ_VILNIAUS_VYSKUPO_IGNO_JOKŪBO_MASALSKIO_ĮKURTAS_DIDŽIULIS_VAISMEDŽIŲ_SODAS_VĖLIAU_DVARĄ_VALDĘ_GRAFAI_ZUBOVAI_ŠALIA_JO_ĮKŪRĖ_LANDŠAFTINIO_ANGLIŠKOJO_STILIAUS_PARKĄ_KURIS_XIX_A_PIRMOJE_PUSĖJE_MINIMAS_TARP_PENKIŲ_GRAŽIAUSIŲ_TELŠIŲ_APSKRITIES_PARKŲ_1874_METAIS_DVARĄ_VARŽYTINĖSE_ĮSIGIJO_GRAFAS_JUOZAPAS_TIŠKEVIČIUS_BŪDAMAS_TURTINGAS_VEIKLUS_IR_INTELEKTUALUS_ŽMOGUS_JIS_REKONSTRAVO_DVARO_RŪMUS_ĮRENGĖ_GARSŲJĮ_ŽIEMOS_SODĄ_DIDŽIAUSIĄ_EUROPOJE_TO_METO_PRIVAČIOJE_VALDOJE_IR_1875_METAIS_PRADĖJO_ATNAUJINTI_PARKA_PARKO_PROJEKTAVIMAS_BUVO_PATIKĖTAS_DVARO_MATININKUI_ŠOSTAKUI_O_ŽELDINIUS_IR_GĖLYNUS_FORMAVO_VENGRŲ_KILMĖS_DARŽININKAS_RŪMŲ_MUZIKANTAS_HAIDUKAS_DARŽININKYSTĖS_MOKSLUS_BAIGĘS_VOKIETIJOJE_PAGAL_PARENGTUS_PLANUS_BUVO_PERTVARKYTA_PRIEŠAIS_RŪMUS_ESANTI_REPREZENTACINĖ_PARKO_DALIS_SUFORMUOTI_PRANCŪZIŠKO_STILIAUS_PARKAMS_BŪDINGI_GEOMETRINĖS_FORMOS_GĖLYNAI_KURIUOS_PUOŠĖ_FONTANAI_SU_SKULPTŪROMIS_GRETA_JŲ_PASODINTI_INTRODUKUOTI_MEDŽIAI_IR_DEKORATYVINIAI_KRŪMAI_KARPOMŲ_MAŽALAPIŲ_LIEPŲ_ALĖJOS_SUDARIUSIOS_ARKOS_PAVIDALO_PAVĖSINGUS_TUNELIUS_ALĖJOS_JUNGĖ_PARKĄ_SU_VAISMEDŽIŲ_SODU_JŲ_SANKIRTOJE_BUVO_ĮRENGTOS_GERAI_APŠVIESTOS_POILSIO_AIKŠTELĖS_TAKAI_IŠGRĮSTI_SMULKIAIS_AKMENUKAIS_ARBA_PLŪKTI_IŠ_ŽVYRO_NUO_GATVĖS_PARKĄ_SKYRĖ_ZUBOVŲ_LAIKAIS_STATYTA_AKMENŲ_SIENA_IR_NAUJAI_IŠMŪRYTA_PLYTŲ_TVORA_RYTINIAME_VASAROS_SODO_PAKRAŠTYJE_VEŠĖJO_KAŠTONŲ_ALĖJOS);
            str_location = VILNIAUS_G_20_KRETINGA_97104;
            daugiau = HTTP_WWW_KRETINGOSMUZIEJUS_LT;
        }

        if (i == 4) {
            minus.startAnimation(blink);
            pvd.startAnimation(blink);
            img.startAnimation(blink);
            apr.startAnimation(blink);
            plius.setAnimation(blink);
            map.startAnimation(blink);
            gs.startAnimation(blink);

            pvd.setText(KRETINGOS_VIESPATIES_APREISKIMO_ŠVČ_MERGELEI_MARIJAI_PARAPIJA);
            img.setImageResource(R.drawable.baznycia_ilga);
            apr.setText(KRETINGOS_VIEŠPATIES_APREIŠKIMO_ŠVČ_MERGELEI_MARIJAI_BAŽNYČIA_STOVI_KRETINGOJE_TURI_GOTIKOS_IR_RENESANSO_BRUOŽŲ_TAI_YRA_SENIAUSIA_IŠLIKUSI_BAŽNYČIA_ŽEMAITIJOJE_PASTATYTA_1617_M_PIRMOJI_KATALIKŲ_BAŽNYČIA_PASTATYTA_1602_M_KRETINGSODYJE_IR_ĮSTEIGTAS_BERNARDINŲ_VIENUOLYNAS_1610_1617_M_ŽEMAIČIŲ_SENIŪNO_IR_LIETUVOS_DIDŽIOSIOS_KUNIGAIKŠTYSTĖS_ETMONO_JONO_CHODKEVIČIAUS_INICIATYVA_PASTATYTA_NAUJA_MŪRINĖ_BAŽNYČIA_SU_VIENUOLYNU +
                    "\n" +
                    M_BAŽNYČIA_ATNAUJINTA_IR_PADIDINTA_XVIII_A_VEIKĖ_PARAPINĖ_MOKYKLA_1836_M_PERTVARKYTA_Į_VALDINĘ_XVIII_A_PRANCIŠKONAI_PASTATĖ_ŠV_ANTANO_GARBEI_SKIRTĄ_ALTORIŲ_KURĮ_1795_M_LIEPOS_22_D_KONSEKRAVO_ŽEMAIČIŲ_VYSKUPAS_ANTANAS_DOMININKAS_TIŠKEVIČIUS);
            str_location = VILNIAUS_G_2_KRETINGA;
            daugiau = HTTPS_LT_WIKIPEDIA_ORG_WIKI_KRETINGOS_VIE_C5_A1PATIES_APREI_C5_A1KIMO_C5_A0V_C4_8_D_MERGELEI_MARIJAI_BA_C5_BENY_C4_8_DIA;
        }

        if (i == 6) {
            minus.startAnimation(blink);
            pvd.startAnimation(blink);
            img.startAnimation(blink);
            apr.startAnimation(blink);
            plius.setAnimation(blink);
            map.startAnimation(blink);
            gs.startAnimation(blink);

            pvd.setText(KRETINGOS_VANDENS_MALŪNAS);
            img.setImageResource(R.drawable.malunas_ilgas);
            apr.setText(M_KARLOŠTATĄ_KRETINGĄ_VALDANT_LDK_DIDIKUI_KAZIMIERUI_JONUI_POVILUI_SAPIEGAI_BUVO_SUDARYTAS_DVARO_INVENTORIUS_KURIS_LIUDIJA_KAD_DVARĄ_SUDARĖ_SODYBA_PALIVARKAS_IR_DVARUI_PRIKLAUSANTYS_KAIMAI_SODYBA_BUVO_PRIE_AKMENOS_IR_DUPULČIO_SANTAKOS_RŪMAI_VANDENS_MALŪNAS_KLUONAS_IR_KITI_PAGALBINIAI_ŪKINIAI_PASTATAI_STOVĖJO_PRIE_TVENKINIO_VISI_PASTATAI_BUVO_MEDINIAI +
                    "\n" +
                    VYSKUPO_IGNOTO_JOKŪBO_MASALSKIO_PASKIRTAS_MATININKAS_PRANCIŠKUS_JODKA_1771_M_SUDARĖ_IŠSAMŲ_KRETINGOS_GRAFYSTĖS_INVENTORIŲ_SU_ŽEMIŲ_PLANAIS_IR_KT_JAME_RAŠOMA_KAD_DVARO_SODYBA_TEBESTOVĖJO_PRIE_DUPULČIO_TIES_SANTAKA_SU_AKMENA_PRIE_UŽTVANKOS_MINIMAS_SENAS_VANDENS_MALŪNAS +
                    "\n" +
                    PASTATAS_DVIAUKŠTIS_KOMPAKTIŠKO_TŪRIO_IŠTĘSTO_STAČIAKAMPIO_PLANO_R_FASADAS_PIRMO_SENIAUSIO_AUKŠTO_LYGYJE_UŽPILTAS_ŽEMĖMIS_KELIANT_VILNIAUS_G_LYGĮ_BUVĘS_KELIAS_KRETINGA_SALANTAI_MATMENYS_PLOTAS_21_7_X_10_45_X_11_34_M_KRETINGOS_MALŪNAS_TURĖJO_IR_ŪKINIŲ_PASTATŲ_TAČIAU_JIE_NEIŠLIKO);
            str_location = VILNIAUS_G_33_KRETINGA;
            daugiau = HTTP_WWW_KRETINGOSENCIKLOPEDIJA_LT_LT_STRAIPSNIAI_KULTURA_KULTUROS_PAVELDAS_ARCHITEKTUROS_PAVELDAS_MALUNAI_KRETINGOS_DVARO_VANDENS_MALUNAS;
        }

        if (i == 7) {
            minus.startAnimation(blink);
            pvd.startAnimation(blink);
            img.startAnimation(blink);
            apr.startAnimation(blink);
            plius.setAnimation(blink);
            map.startAnimation(blink);
            gs.startAnimation(blink);

            pvd.setText(LENKIMŲ_ŠV_ONOS_BAŽNYČIA);
            img.setImageResource(R.drawable.baznycia_ilgas);
            apr.setText(LENKIMŲ_ŠV_ONOS_BAŽNYČIA_STOVI_LENKIMŲ_MIESTELYJE_1_KM_Į_PIETRYČIUS_NUO_LIETUVOS_IR_LATVIJOS_VALSTYBĖS_SIENOS_IR_NUO_ŠVENTOSIOS_UPĖS_BAŽNYČIA_STAČIAKAMPIO_PLANO_VIENABOKŠTĖ_SU_APSIDE_ŠVENTORIAUS_TVORA_AKMENŲ_MŪRO_JAME_STOVI_AKMENŲ_IR_PLYTŲ_MŪRO_VARPINĖ +
                    "\n" +
                    SIMONAS_DAUKANTAS_NUPIRKO_BAŽNYČIAI_PAVEIKSLŲ_SUMOKĖJO_UŽ_GALINIO_ALTORIAUS_ĮRENGIMĄ_BAŽNYČIOS_ŠVENTORIUJE_1847_M_PALAIDOTA_SIMONO_DAUKANTO_MOTINA_ANT_JOS_KAPO_IŠLIKĘS_XIX_A_1_OSIOS_PUSĖS_LIETUVIŠKAS_TEKSTAS_CITATA_PAGAL_DABARTINES_RAŠYBOS_TAISYKLES);
            str_location = S_DAUKANTO_GATVĖ_61_LENKIMAI_98301;
            daugiau = HTTPS_LT_WIKIPEDIA_ORG_WIKI_LENKIM_C5_B3_C5_A0V_ONOS_BA_C5_BENY_C4_8_DIA;
        }
        if (i == 0) {
            minus.setVisibility(View.GONE);
            map.startAnimation(blink);
            gs.startAnimation(blink);
            pvd.setText(PLUNGĖS_DVARAS);
            pvd.startAnimation(blink);
            img.setImageResource(R.drawable.plungesdvaras);
            img.startAnimation(blink);
            pvd.setText(BIRŽUVĖNŲ_DVARAS);
            img.setImageResource(R.drawable.birzuvenud_ilgas);
            apr.setText(BIRŽUVĖNŲ_DVARO_SODYBA_VALSTYBĖS_SAUGOMAS_KULTŪROS_PAMINKLAS_UNIKALUS_KODAS_730_DVARO_SODYBA_RYTINĖJE_TELŠIŲ_RAJONO_SAVIVALDYBĖS_TERITORIJOS_DALYJE_BIRŽUVĖNUOSE_LUOKĖS_SENIŪNIJA_ABIPUS_VIRVYČIOS_UPĖS_NUO_XIV_A_MINIMAS_BIRŽUVĖNŲ_KARALIŠKASIS_DVARAS_KURIS_VĖLIAU_TAPO_PRIVAČIA_VALDA_JĮ_VALDĖ_ŽEMAIČIŲ_KARUŽA_JONAS_SEBASTIJONAS_KENSTARTAS_PAJŪRIO_SENIŪNAS_ALEKSANDRAS_VAINA_PO_1637_M_1670_M_IŠ_VLADISLOVO_VAINOS_DVARĄ_ĮSIGIJO_TVERŲ_SENIŪNAS_MIKALOJUS_GORSKIS_ŠI_DVARININKŲ_GIMINĖ_XVIII_XX_A_PRADŽIOJE_PASTATĖ_DVARO_SODYBĄ_SU_RŪMAIS_OFICINOMIS_PAGALBINIAIS_GYVENAMAISIAIS_KUMETYNAI_IR_ŪKINIAIS_GAMYBINIAIS_ARKLIDĖ_VEŽIMINĖ_KALVĖ_VANDENS_MALŪNAS_IR_KT_PASTATAIS_UŽTVENKĖ_VIRVYČIOS_UPĘ_1909_M_ĮKŪRĖ_KARTONO_FABRIKĄ_VEIKĖ_IKI_1938_M_PASTATĖ_LENTPJŪVĘ);
            str_location = BIRŽUVĖNAI_88239;
            daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_EI_LX_QDWSNC_CT_DRW_AK8O6E4_DA_Q_BIR_C5_BEUV_C4_97N_C5_B3_DVARAS_OQ_BIR_C5_BEUV_C4_97N_C5_B3_DVARAS_GS_L_PSY_AB_12_0I19K1L4J0I22I30I19K1L3J38_1570_1637_0_2373_2_2_0_0_0_0_248_248_2_1_1_0_0_1_1_64_PSY_AB_1_1_247_0_XU_OYYFP_HF4O_GFE_RD_CR_DCR_0;
        }
        if (i == 9) {
            minus.startAnimation(blink);
            pvd.startAnimation(blink);
            img.startAnimation(blink);
            apr.startAnimation(blink);
            plius.setAnimation(blink);
            map.startAnimation(blink);
            gs.startAnimation(blink);

            pvd.setText(RENAVO_DVARAS);
            img.setImageResource(R.drawable.renavas_ilgas);
            apr.setText(TAI_NAUJAI_RESTAURUOJAMAS_DVARAS_IR_JIS_ATRODO_LABAI_ĮSPŪDINGAI +
                    RENAVO_DVARAS_DVARAS_IR_JĮ_JUOSIANTIS_PARKAS_MAŽEIKIŲ_RAJONO_SEDOS_SENIŪNIJOS_RENAVO_KAIME_ANT_VARDUVOS_UPĖS_KRANTO_VIENAS_ĮDOMIAUSIŲ_IR_GERIAUSIAI_IŠLIKUSIŲ_DVARO_ANSAMBLIŲ_ŽEMAITIJOJE);
            str_location = LITHUANIA_RENAVAS_89403;
            daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_EI_XH_QDWR_ORND_LTW_QLRI5_SIBW_Q_RENAVO_DVARAS_OQ_RENAVO_DVARAS_GS_L_PSY_AB_12_0I203K1L10_315640_315640_0_316550_1_1_0_0_0_0_258_258_2_1_1_0_0_1_64_PSY_AB_0_1_257_0_I_TV9G_MG9_KI_Y_GFE_RD_CR_DCR_0;
        }

        if (i == 15) {

            plius.setVisibility(View.GONE);
            minus.startAnimation(blink);
            pvd.startAnimation(blink);
            img.startAnimation(blink);
            apr.startAnimation(blink);
            map.startAnimation(blink);
            gs.startAnimation(blink);

            pvd.setText(ŽEMAIČIŲ_KALVARIJA);
            img.setImageResource(R.drawable.zemkalv_ilgas);
            apr.setText(MIESTELIS_PLUNGĖS_RAJONO_SAVIVALDYBĖS_TERITORIJOJE_ŽEMAIČIŲ_KALVARIJOS_BAŽNYČIA_NUO_SENO_GARSĖJA_STEBUKLINGA_NUKRYŽIUOTOJO_JĖZAUS_FIGŪRA_IR_STEBUKLINGU_DIEVO_MOTINOS_SU_KŪDIKIU_PAVEIKSLU_ATVEŽTU_IŠ_ROMOS_XVII_A_VIDURYS_LABAI_GRAŽI_IR_ĮSPŪDINGA_ŽEMAIČIŲ_KALVARIJOS_KATEDRA_TAIP_PAT_NE_KĄ_MAŽIAU_ĮDOMIOS_KRYŽIAUS_KELIO_KOPLYTĖLĖS_MIESTELYJE_KASMET_LIEPOS_MĖNESĮ_VYKSTA_DIDIEJI_ŽEMAIČIŲ_KALVARIJOS_ATLAIDAI_PASIŽYMINTIS_ŽMONIŲ_GAUSA);
            str_location = ŽEMAIČIŲ_KALVARIJA;
            daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_Q_C5_BDEMAI_C4_8_DI_C5_B3_KALVARIJA_IE_UTF_8_OE_UTF_8_CLIENT_FIREFOX_B_AB_GFE_RD_CR_DCR_0_EI_RI_YDWOI_XLNLI8_AFOV7_CW_BA;
        }
        if (i == 12) {
            minus.startAnimation(blink);
            pvd.startAnimation(blink);
            img.startAnimation(blink);
            apr.startAnimation(blink);
            map.startAnimation(blink);
            gs.startAnimation(blink);
            plius.startAnimation(blink);
            plius.setVisibility(View.VISIBLE);

            pvd.setText(ŠALTOJO_KARO_MUZIEJUS);
            img.setImageResource(R.drawable.skaro_ilgas);
            apr.setText(MUZIEJUS_ŽEMAITIJOS_NACIONALINIAME_PARKE_UŽ_24_KM_Į_ŠIAURĘ_NUO_PLUNGĖS_ĮRENGTAS_BUVUSIAME_SOVIETŲ_SĄJUNGOS_BALISTINIŲ_RAKETŲ_ŠACHTINIAME_PALEIDIMO_KOMPLEKSE_PLOKŠTINĖS_RAKETŲ_BAZĖJE_LANKYTOJUS_PASITINKA_SUT­VAR­KY­TA_AP­LIN­KA_ĮRENG­TA_AP­ŽVAL­GOS_AIKŠ­TE­LĖ_SU­MON­TUO­TOS_VĖ­DI­NI­MO_IR_DRĖG­MĖS_SU­RIN­KI­MO_SIS­TE­MOS_PAS­TA­TY­TAS_AD­MI­NIST­RA­CI­NIS_PA­STA­TAS_LAN­KY­TO­JŲ_CENT­RAS_AUTENTIŠKOS_ĮRANGOS_IŠLIKĘ_PALYGINTI_NEDAUG_NES_DAUG_KAS_PO_SOVIETŲ_KARIŠKIŲ_PASITRAUKIMO_BUVO_NUNIOKOTA_VANDALŲ_PROJEKTO_KURIS_ĮGYVENDINTAS_UŽ_EUROPOS_SĄJUNGOS_LĖŠAS_VERTĖ_6_4_MLN_LITŲ_1_MUZIEJAUS_EKSPOZICIJOS_KONCEPCIJOS_AUTORIUS_BEI_VIENAS_IŠ_JO_KŪRĖJŲ_FORTIFIKACIJOS_ISTORIJOS_TYRINĖTOJAS_VLADIMIRAS_ORLOVAS_SPECIALIAI_ŠIAM_MUZIEJUI_SUKURTAS_DOKUMENTINIS_FILMAS_ŠALTASIS_KARAS_BAIMĖS_ŠEŠĖLIS_REŽ_RIMAS_BRUŽAS_2_MUZIEJŲ_SUPROJEKTAVO_LIETUVOS_BENDROVĖ_TAEM_ARCHITEKTAI_PROJEKTO_VADOVAS_AIDAS_JASTREMSKAS);
            str_location = ŠALTOJO_KARO_MUZIEJUS;
            daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_BIW_958_BIH_954_EI_YJ_YDWVNB_DYR_OW_QK1I4_XG_BW_Q_C5_A0ALTOJO_KARO_MUZIEJUS_OQ_C5_A0ALTOJO_KARO_MUZIEJUS_GS_L_PSY_AB_12_35I39K1J0I203K1L3J0J0I30K1L5_2050_5303_0_6654_5_3_2_0_0_0_208_606_0J2J1_3_0_0_1_1_64_PSY_AB_0_5_721_0I13I30K1J0I13K1_0_QP_SN_XLO8_L24_GFE_RD_CR_DCR_0;
        }
        if (i == 1) {
            minus.startAnimation(blink);
            minus.setVisibility(View.VISIBLE);
            pvd.startAnimation(blink);
            img.startAnimation(blink);
            apr.startAnimation(blink);
            plius.setAnimation(blink);
            map.startAnimation(blink);
            gs.startAnimation(blink);
            pvd.setText(DAUTARŲ_DVARAS);
            img.setImageResource(R.drawable.dautarai_sq);
            apr.setText(PO_TRIJŲ_LABAI_ĮTEMPTŲ_DIENŲ_IR_SUNKAUS_DARBO_BUVO_1905_M_PAREIKALAVUSIO_IŠ_MANO_TĖVO_CARINĖS_RUSIJOS_IMPERIJOS_VYRIAUSYBĖS_VADOVO_DAUG_JĖGŲ_JAM_BUVO_REIKALINGAS_NORS_TRUMPAS_BET_PILNAVERTIS_POILSIS_CARAS_PATS_APIE_TAI_PATS_SUMĄSTĖ_IR_PASIŪLĖ_JACHTA_NEVA_PAPLAUKIOTI_PO_SUOMIŲ_ĮLANKĄ_GERESNIO_POILSIO_SUGALVOTI_NEĮMANOMA_JŪROJE_KAIP_NIEKUR_KITUR_TĖVAS_ATSIJUNGDAVO_NUO_VISŲ_TARNYBOS_REIKALŲ_POKALBIŲ_ATASKAITŲ_IR_POPIERIŲ_NUO_VISO_MILŽINIŠKO_ADMINISTRACINIO_APARATO_STŪMIANČIO_RUSIJOS_IMPERIJOS_GYVENIMĄ_PIRMYN_BUVO_NUSPRĘSTA_KAD_KARTU_SU_TĖČIU_PLAUKIAME_IR_MES_VISI +
                    "\n" +
                    PER_TAS_AŠTUONIAS_PLAUKIOJIMO_DIENAS_MANO_LIKIMAS_BUVO_NUSPRĘSTAS_IR_NORS_DAR_NIEKO_NEBUVO_IŠTARTA_BET_BŪNA_JAUSMŲ_AIŠKESNIŲ_UŽ_ŽODŽIUS_IR_SIELOJE_AŠ_GALUTINAI_ŽINOJAU_KAD_ANKSČIAU_AR_VĖLIAU_TAPSIU_VIENO_IŠ_JACHTOS_NEVA_KARININKŲ_LEITENANTO_B_I_BOCKO_ŽMONA +
                    "\n" +
                    PO_KALĖDŲ_B_I_BOCKAS_OFICIALIAI_PAPRAŠĖ_MANO_TĖVŲ_MANO_RANKOS_JIE_SUTIKO_IR_ŠIA_PROGA_VASARIO_2_D_TA_PROGA_ĮVYKO_IŠKILMINGOS_MIŠIOS_DALYVAUJANT_GIMINAIČIAMS_IŠ_ABIEJŲ_PUSIŲ +
                    "\n" +
                    KAI_TĄ_PAČIĄ_DIENĄ_TĖVAS_APIE_MŪSŲ_SUŽADĖTUVES_PAPASAKOJO_CARUI_ŠIS_ATSAKĖ_GERAI_ŽINĄS_MANO_SUŽADĖTINĮ_IR_PASVEIKINO_MANE_SU_PUIKIU_PASIRINKIMU);
            str_location = DAUTARŲ_DVARAS;
            daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_EI_QV8E_WR2_VMIV_OW_AKL54_XQDA_Q_DAUTAR_C5_B3_DVARAS_OQ_DAUTAR_C5_B3_DVARAS_GS_L_PSY_AB_12_500_500_0_1286_0_0_0_0_0_0_0_0_0_0_0_1_1_64_PSY_AB_0_0_0_0_L_I4_GTY_TQ_O_M_GFE_RD_CR_DCR_0;
        }
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        gs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
