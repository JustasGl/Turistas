package com.example.android.turistas;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Vibrator;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.android.turistas.R.id.aprasymas;
import static com.example.android.turistas.R.id.atgal;
import static com.example.android.turistas.R.id.pavadinimas;
import static com.example.android.turistas.R.id.text3;
import static com.example.android.turistas.R.id.text4;

public class marsrutaugaleru extends AppCompatActivity {
    public static final String GRĮŽIMAS_IŠ_PLUNGĖS_Į_MAŽEIKIUS_UŽTRUNKA_1_VAL = "Grįžimas iš Plungės į Mažeikius užtrunka 1 val.";
    public static final String OGINSKIŲ_DVARO_RŪMAI_PLUNGĖJE_ČIA_BUVO_PIRMĄ_KARTĄ_LIETUVOJE_UŽDEGTA_ELEKTROS_LEMPUTĖ = "Oginskių dvaro rūmai Plungėje. Čia buvo pirmą kartą Lietuvoje uždegta elektros lemputė.";
    public static final String IŠ_RIETAVO_VAŽIUOJATE_31_MIN_IKI_PLUNGĖS = "Iš Rietavo važiuojate 31 min. iki Plungės.";
    public static final String RIETAVAS_ŠV_ARKANGELO_MYKOLO_BAŽNYČIA = "Rietavas. Šv. Arkangelo Mykolo bažnyčia.";
    public static final String IŠ_MINIJOS_VAŽIUOJATE_1VAL_16_MIN_IKI_RIETAVO = "Iš Minijos važiuojate 1val. 16 min. iki Rietavo.";
    public static final String MINIJA_ARBA_MINGĖ_ŽVEJŲ_GATVINIS_KAIMAS_ŠILUTĖS_RAJONO_SAVIVALDYBĖJE_MINIJOS_UPE_TURITE_GALIMYBĘ_IŠPLAUKTI_VALTIMI_Į_KURŠIŲ_MARIAS = " Minija arba Mingė – žvejų gatvinis kaimas Šilutės rajono savivaldybėje. Minijos upe turite galimybę išplaukti valtimi į Kuršių marias.";
    public static final String APLANKĘ_VENTĖS_RAGĄ_APIE_17_MIN_VAŽIUOJATE_Į_MINIJOS_KAIMĄ = "Aplankę Ventės ragą, apie 17 min. važiuojate į Minijos kaimą.";
    public static final String VENTĖS_RAGAS_PUSIASALIS_PRIE_KURŠIŲ_MARIŲ_VISAI_NETOLI_NEMUNO_UPĖS_ŽIOČIŲ = "Ventės ragas - pusiasalis prie Kuršių marių, visai netoli Nemuno upės žiočių.";
    public static final String TRUKMĖ_9_00_10_00_VAL_ŠIOS_KELIONĖS_METU_APLANKOTE_KLAPĖDOS_ZOOLOGIJOS_SODĄ_VENTĖS_RAGĄ_GALITE_STEBĖTI_ŽIEDUOJAMUS_PAUKŠČIUS_MINIJOS_KAIMĄ_YRA_GALIMYBĖ_PAPLAUKIOTI_VALTIMIS_ŠV_ARKANGELO_MYKOLO_BAŽNYČIĄ_RIETAVE_OGINSKIŲ_DVARO_RŪMUS_PLUNGEJE_NORINT_STEBĖTI_PAUKŠČIŲ_ŽIEDAVIMĄ_Į_VENTĖS_RAGĄ_REKOMENDUOJAMA_VYKTI_ARBA_VĖLYVĄ_PAVASARĮ_ARBA_ANKSTYVĄ_RUDENĮ = "Trukmė : 9:00 - 10:00 val. \nŠios kelionės metu aplankote Klapėdos zoologijos sodą, Ventės ragą (galite stebėti žieduojamus paukščius), Minijos kaimą (yra galimybė paplaukioti valtimis),  Šv. Arkangelo Mykolo bažnyčią Rietave, Oginskių dvaro rūmus Plungeje. Norint stebėti paukščių žiedavimą, į Ventės ragą rekomenduojama vykti arba vėlyvą pavasarį, arba ankstyvą rudenį.";
    public static final String KLAIPĖDA_ŠILUTĖ_PLUNGĖ = "Klaipėda – Šilutė – Plungė";
    public static final String PO_TO_VAŽIUOJATE_Į_VENTĘ_APIE_1_VAL = "Po to važiuojate į Ventę apie 1 val.";
    public static final String KLAIPĖDOS_ZOOLOGIJOS_SODAS = "Klaipėdos zoologijos sodas.";
    public static final String IKI_KLAIPĖDOS_VAŽIUOJATE_1_VAL_37_MIN = "Iki Klaipėdos važiuojate 1 val. 37 min.";
    public static final String IŠVAŽIUOJATE_IŠ_MAŽEIKIŲ = "Išvažiuojate iš Mažeikių.";
    public static final String GRĮŽTATE_Į_MAŽEIKIUS = "Grįžtate į Mažeikius.";
    public static final String IKI_MAŽEIKIŲ_APIE_47_KM_T_Y_40_MIN_KELIO = "Iki Mažeikių - apie 47 km. t.y., 40 min. kelio. ";
    public static final String TRUIKINŲ_ŠALTINIS_ARBA_ŠMITOS_VERSMĖ_HIDROGEOLOGINIS_GAMTOS_PAVELDO_OBJEKTAS = "Truikinų šaltinis  (arba Šmitos versmė) – hidrogeologinis gamtos paveldo objektas.";
    public static final String PO_TO_9_MIN_VAŽIUOJATE_IKI_TRUIKINŲ_ŠALTINIO = "Po to 9 min. važiuojate iki Truikinų šaltinio.";
    public static final String APUOLĖS_PILIAKALNIS = "Apuolės piliakalnis.";
    public static final String IŠ_MOSĖDŽIO_VAŽIUOJATE_IKI_APUOLĖS = "Iš Mosėdžio važiuojate iki Apuolės.";
    public static final String MOSĖDŽIO_AKMENŲ_MUZIEJUS = "Mosėdžio akmenų muziejus.";
    public static final String PAVAIKŠČIOJĘ_PO_ŠAUKLIŲ_RIEDULYNĄ_APIE_7_MIN_VAŽIUOJATE_IKI_MOSĖDŽIO = "Pavaikščioję po Šauklių riedulyną, apie 7 min. važiuojate iki Mosėdžio.";
    public static final String ŠAUKLIŲ_RIEDULYNAS = "Šauklių riedulynas.";
    public static final String PO_TO_11_MIN_VAŽIUOJATE_IKI_ŠAUKLIŲ_RIEDULYNO = "Po to 11 min. važiuojate iki Šauklių riedulyno.";
    public static final String ORVIDŲ_SODYBA = "Orvidų sodyba.";
    public static final String TRUKMĖ_7_00_VAL_ŠIOS_KELIONĖS_METU_APLANKOTE_ŠALTOJO_KARO_MUZIEJŲ_ORVIDŲ_SODYBĄ_ŠAUKLIŲ_RIEDULYNĄ_MOSĖDŽIO_AKMENŲ_MUZIEJŲ_APUOLĖS_PILIAKALNĮ_TRUIKINŲ_ŠALTINĮ_Į_ŠAUKLIŲ_RIEDULYNĄ_REKOMENDUOJAMA_VYKTI_NUO_VĖLYVO_PAVASARIO_IKI_RUDENS_KAD_NEBŪTŲ_PATVINĘ = "Trukmė - 7:00 val.\nŠios kelionės metu aplankote Šaltojo karo muziejų, Orvidų sodybą, Šauklių riedulyną, Mosėdžio akmenų muziejų, Apuolės piliakalnį, Truikinų šaltinį. Į Šauklių riedulyną rekomenduojama vykti nuo vėlyvo pavasario iki rudens, kad nebūtų patvinę.";
    public static final String PLUNGĖ_SKUODAS = "Plungė – Skuodas";
    public static final String APLANKĘ_ŠALTOJO_KARO_MUZIEJŲ_VAŽIUOJATE_LINK_SKUODO_APIE_36_MIN_LANKYTINAS_OBJEKTAS_ORVIDŲ_SODYBA = "Aplankę Šaltojo karo muziejų, važiuojate link Skuodo apie 36 min. Lankytinas objektas - Orvidų sodyba.";
    public static final String ŠALTOJO_KARO_MUZIEJUS = "Šaltojo karo muziejus.";
    public static final String VAŽIUOJATE_APIE_50_MIN_IKI_ŠALTOJO_KARO_MUZIEJAUS_PLATELIŲ_SEN_PLUNGĖS_RAJ = "Važiuojate apie 50 min. iki Šaltojo karo muziejaus (Platelių sen. Plungės raj.).";
    public static final String IŠVYKSTATE_IŠ_MAŽEIKIŲ = "Išvykstate iš Mažeikių.";
    public static final String GRĮŽTATE_Į_MAŽEIKIUS_KELIONĖ_UŽTRUKS_APIE_1_VAL_57_1_KM = "Grįžtate į Mažeikius. Kelionė užtruks apie 1 val. (57.1 km.).";
    public static final String SEDA_MAŽEIKIŲ_RAJ_ŠV_MERGELĖS_MARIJOS_ĖMIMO_Į_DANGŲ_BAŽNYČIA = "Seda (Mažeikių raj.).\nŠv. Mergelės Marijos ėmimo į dangų bažnyčia.";
    public static final String APLANKĘ_OGINSKIO_RŪMUS_ŽEMAIČIŲ_DAILĖS_MUZIEJŲ_VAŽIUOJATE_Į_SEDĄ = "Aplankę Oginskio rūmus Žemaičių dailės muziejų, važiuojate į Sedą.";
    public static final String PLUNGĖ_OGINSKIO_RŪMAI_SODYBA_UŽIMA_58_3_HA_PARKO_PLOTO = "Plungė. Oginskio rūmai. Sodyba užima 58,3 ha parko ploto.";
    public static final String KELIONĖ_Į_PLUNGĘ_TĘSIAMA_62_2_KM_58_MIN = "Kelionė į Plungę tęsiama: ~62.2 km. 58 min.";
    public static final String STOVYKLA_BALSIUSOE_NAUJAI_ĮRENGTAME_BALSIŲ_SLĖNYJE_PASINAUDODAMI_SPECIALIA_ALPINISTINE_ĮRANGA_PARKO_LANKYTOJAI_GALI_IŠBANDYTI_SAVO_JĖGAS_NUSILEIDIMO_TRASOSE_KURIOS_NUTIESTOS_PER_VIRVYTĖS_UPĘ = "Stovykla Balsiusoe. Naujai įrengtame „Balsių slėnyje“, pasinaudodami specialia alpinistine įranga, parko lankytojai gali išbandyti savo jėgas nusileidimo trasose, kurios nutiestos per Virvytės upę.";
    public static final String VAŽIUODAMI_LINK_PLUNGĖS_GALITE_SUSTOTI_BALSIUOSE = "Važiuodami link Plungės, galite sustoti Balsiuose.";
    public static final String ŠIAUDINĖS_BAŽNYČIA = "Šiaudinės bažnyčia.";
    public static final String PO_TO_VAŽIUOJATE_APIE_8_MIN_IKI_ŠIAUDINĖS_KAIMO = "Po to važiuojate apie 8 min. iki Šiaudinės kaimo.";
    public static final String PENKIOLIKAKAMIENĖ_LIEPA_VALSTYBINIS_GAMTOS_PAVELDO_OBJEKTAS_JOS_AMŽIUS_APIE_150_METŲ = "Penkiolikakamienė liepa – valstybinis gamtos paveldo objektas; jos amžius - apie 150 metų.";
    public static final String EINATE_700_M_IKI_PENKIOLIKAKAMIENĖS_LIEPOS = "Einate 700 m. iki penkiolikakamienės liepos.";
    public static final String PAPILĖ_SIMONO_DAUKANTO_KAPAS_IR_PAMINKLAS = "Papilė. Simono Daukanto kapas ir paminklas.";
    public static final String TRUKMĖ_7_00_8_00_VAL_ŠIOS_KELIONĖS_METU_APLANKOTE_NAUJOSIOS_AKMENĖS_KALKAKMENIO_KARJIERĄ_SIMONO_DAUKANTO_KAPĄ_IR_PAMINKLĄ_PAPILĖS_PENKIOLIKAKAMIENĘ_LIEPĄ_ŠIAUDINĖS_MEDINĘ_BAŽNYČIĄ_BALSIUS_PASIRINKTINAI_OGINSKIO_RŪMUS_IR_ŽEMAIČIŲ_DAILĖS_MUZIEJŲ_PLUNGĖJE_ŠV_MERGELĖS_MARIJOS_ĖMIMO_Į_DANGŲ_BAŽNYČIĄ_SEDOJE = "Trukmė : 7:00 - 8:00 val. \nŠios kelionės metu aplankote Naujosios Akmenės kalkakmenio karjierą, Simono Daukanto kapą ir paminklą, Papilės penkiolikakamienę liepą, Šiaudinės medinę bažnyčią, Balsius(pasirinktinai), Oginskio rūmus ir Žemaičių dailės muziejų Plungėje, Šv. Mergelės Marijos ėmimo į dangų bažnyčią Sedoje.";
    public static final String AKMENĖ_PLUNGĖ = "Akmenė – Plungė";
    public static final String APLANKĘ_KARJIERĄ_VAŽIUOJATE_Į_PAPILĘ_APIE_24_MIN = "Aplankę karjierą, važiuojate į Papilę apie 24 min.";
    public static final String KALKAKMENIO_KARJIERAS_NORINT_APLANKYTI_BŪTINA_SUSITARTI_IŠ_ANKSTO_ČIA_VAIKŠTANT_ATRODO_KAD_ESATE_TOLI_NUO_LIETUVIŠKŲ_LYGUMŲ_VAIZDAI_LYG_KALNUOSE_LYG_TARPEKLYJE = "Kalkakmenio karjieras. Norint aplankyti, būtina susitarti iš anksto. Čia vaikštant atrodo, kad esate toli nuo lietuviškų lygumų – vaizdai lyg kalnuose, lyg tarpeklyje.";
    public static final String IKI_NAUJOSIOS_AKMENĖS_KALKAKMENIO_KARJIERO_VAŽIUOJATE_APIE_37_MIN = "Iki Naujosios Akmenės kalkakmenio karjiero važiuojate apie 37 min.";
    public static final String NUO_GAMYKLOS_IKI_MAŽEIKIŲ_VAŽIUOJATE_APIE_20_MIN = "Nuo gamyklos iki Mažeikių važiuojate apie 20 min.";
    public static final String DIDŽIAUSIA_GAMYKLA_BALTIJOS_ŠALYSE_ORLEN_LIETUVA = "Didžiausia gamykla Baltijos šalyse - „Orlen Lietuva“.";
    public static final String Į_MAŽEIKIUS_GRĮŠTATE_PRO_PIKELIUS_PAKELIUI_PRAVAŽIUODAMI_PRO_NAFTOS_PERDIRBIMO_GAMYKLĄ = "Į Mažeikius grįštate pro Pikelius pakeliui pravažiuodami pro naftos perdirbimo gamyklą.";
    public static final String DAUTARŲ_DVARAS = "Dautarų dvaras.";
    public static final String PO_TO_VAŽIUOJATE_21_MIN_IKI_DAUTARŲ = "Po to važiuojate 21 min. iki Dautarų.";
    public static final String RENAVO_DVARAS = "Renavo dvaras.";
    public static final String APŽIŪRĖJĘ_DVARĄ_VAŽIUOJATE_APIE_44_MIN_IKI_RENAVO = "Apžiūrėję dvarą, važiuojate apie 44 min. iki Renavo.";
    public static final String PAVIRVYTĖS_DVARAS_ĮSIKŪRĘS_VIRVYTĖS_UPĖS_DEŠINIAJAME_KRANTE = "Pavirvytės dvaras įsikūręs Virvytės upės dešiniajame krante.";
    public static final String APLANKĘ_MUZIEJŲ_VAŽIUOJATE_APIE_9_MIN_IKI_PAVIRVYTĖS_DVARO = "Aplankę muziejų, važiuojate apie 9 min. iki Pavirvytės dvaro.";
    public static final String LIETUVOS_AVIACIJOS_PRADININKO_A_GRIŠKEVIČIAUS_MEMORIALINIS_MUZIEJUS = "Lietuvos aviacijos pradininko A.Griškevičiaus memorialinis muziejus.";
    public static final String M_EINATE_IKI_A_GRIŠKEVIČIAUS_MEMORIALINIO_MUZIEJAUS = "350 m. einate iki A.Griškevičiaus memorialinio muziejaus.";
    public static final String PAMINKLAS_YRA_4_M_AUKŠČIO_BETONINIS_JAME_PAVAIZDUOTA_VYTAUTAS_DIDYSIS_TRAKŲ_PILIS_VYTIS_ŠV_ALOYZAS_TRIJŲ_KRYŽIŲ_KALNAS_IR_ŽEMAIČIŲ_SIMBOLIS_MEŠKA_1983_1984_M_IR_1999_M_RESTAURUOTAS = "Paminklas yra 4 m. aukščio, betoninis. Jame pavaizduota: Vytautas Didysis, Trakų pilis, Vytis, šv. Aloyzas, Trijų kryžių kalnas ir žemaičių simbolis – meška. \n1983–1984 m. ir 1999 m.  restauruotas.";
    public static final String TRUKMĖ_6_00_VAL_APLANKOTE_PAMINKLĄ_BIRŽIŠKOMS_VYTAUTO_DIDŽIOJO_PAMINKLĄ_A_GRIŠKEVIČIAUS_MUZIEJŲ_PAVIRVYTĖS_RENAVO_DAUTARŲ_DVARUS_IR_GRĮŽTATE_PRO_ORLEN_LIETUVA_NAFTOS_PERDIRBIMO_GAMYKLĄ = "Trukmė - 6:00 val. \nAplankote: paminklą Biržiškoms, Vytauto Didžiojo paminklą, A. Griškevičiaus muziejų, Pavirvytės, Renavo, Dautarų dvarus ir grįžtate pro „Orlen Lietuva“ naftos perdirbimo gamyklą.";
    public static final String MAŽEIKIŲ_RAJONAS = "Mažeikių rajonas";
    public static final String PO_TO_300_M_PĖŠČIOMIS_EINATE_IKI_VYTAUTO_DIDŽIOJO_PAMINKLO = "Po to 300 m. pėščiomis einate iki Vytauto Didžiojo paminklo.";
    public static final String VIEKŠNIAI_PAMINKLAS_BIRŽIŠKOMS = "Viekšniai. Paminklas Biržiškoms.";
    public static final String KELIONĖ_IKI_VIEKŠNIŲ_APIE_16_MIN = "Kelionė iki Viekšnių, apie 16 min.";
    public static final String IŠVAŽIUOJATE_IŠ_MAŽEIKIŲ1 = "Išvažiuojate iš Mažeikių";
    public static final String KELIONĖ_PO_TELŠIŲ_RAJONĄ_BAIGTA_GRĮŽTATE_Į_MAŽEIKIUS = "Kelionė po Telšių rajoną baigta. Grįžtate į Mažeikius.";
    public static final String JOMNTŲ_MIŠKO_PAŽINTINIS_TAKAS_GAUSUS_GAMTOS_PAMINKLŲ_ČIA_ĮRENGTOS_ATOKVĖPIO_VIETOS_INFORMACINIAI_STENDAI = "Jomntų miško pažintinis takas, gausus gamtos paminklų. Čia įrengtos atokvėpio vietos, informaciniai stendai.";
    public static final String IŠ_RAINIŲ_VAŽIUOJATE_LINK_JOMANTŲ_MIŠKO = "Iš Rainių važiuojate link Jomantų miško.";
    public static final String RAINIŲ_KOPLYČIA_PAMINKLAS_BOLŠEVIKŲ_NUKANKINTIEMS_POLITINIAMS_KALINIAMS_ATMINTI = "Rainių koplyčia. Paminklas bolševikų nukankintiems politiniams kaliniams atminti.";
    public static final String IŠ_LUOKĖS_VAŽIUOJATE_Į_RAINIUS = "Iš Luokės važiuojate į Rainius.";
    public static final String LUOKĖJE_SKANIŲ_PATIEKALŲ_KVIEČIA_PARAGAUTI_KAVINĖ_ŠATRIJOS_LEGENDOS_O_NORINTYS_UŽSISAKYTI_KULINARINIO_PAVELDO_DEGUSTACIJĄ_KVIEČIAMI_Į_KAVINĘ_PREMJERA_TURINČIĄ_KULINARINIO_PAVELDO_FONDO_ŽENKLĄ = "Luokėje skanių patiekalų kviečia paragauti kavinė „Šatrijos legendos\", o norintys užsisakyti kulinarinio paveldo degustaciją, kviečiami į  kavinę „Premjera“, turinčią kulinarinio paveldo fondo ženklą.";
    public static final String APLANKĘ_ŠATRIJOS_KALNĄ_GRĮŽTATE_Į_LUOKĘ = "Aplankę Šatrijos kalną, grįžtate į Luokę.";
    public static final String ĮKOPIATE_Į_LEGENDOMIS_APIPINTĄ_ŠATRIJOS_KALNĄ = "Įkopiate į legendomis apipintą Šatrijos kalną.";
    public static final String IŠ_BIRŽUVĖNŲ_VAŽIUOJATE_LINK_LUOKĖS_IR_SUKATE_Į_PAŠATRIJOS_KAIMĄ = "Iš Biržuvėnų važiuojate link Luokės ir sukate į Pašatrijos kaimą.";
    public static final String KOMPLEKSĄ_SUDARO_PONŲ_NAMAS_OFICINA_ARKLIDĖ_IR_VEŽIMINĖ = "Kompleksą sudaro: Ponų namas, oficina, arklidė ir vežiminė.“";
    public static final String APLANKOTE_NAUJAI_ATGIMUSĮ_EUROPOS_SĄJUNGOS_LĖŠOMIS_REKONSTRUOTĄ_BIRŽUVĖNŲ_DVARO_SODYBOS_KOMPLEKSĄ = "Aplankote naujai atgimusį, Europos Sąjungos lėšomis rekonstruotą, Biržuvėnų dvaro sodybos kompleksą.";
    public static final String ČIA_EKSPONUOJAMI_PRIEŠKARINIŲ_POKARINIŲ_IR_VIENETINIŲ_MOTOCIKLŲ_MODELIAI_PAGAMINTI_1901_1945_METAIS = "Čia eksponuojami prieškarinių, pokarinių ir vienetinių motociklų modeliai, pagaminti 1901-1945 metais.";
    public static final String TRUKMĖ_7_00_VAL = "Trukmė : 7:00 val.";
    public static final String TELŠIŲ_RAJ = "Telšių raj.";
    public static final String APŽIŪRITE_VIENINTELĮ_LIETUVOJE_SENOVINIŲ_MOTOCIKLŲ_MUZIEJŲ = "Apžiūrite vienintelį Lietuvoje senovinių motociklų muziejų.";
    public static final String BIRŽUVĖNAI = "Biržuvėnai.";
    public static final String VAŽIUOJATE_LINK_TELŠIŲ_APIE_35_KILOMETRUS_ŽIEDE_SUKATE_Į_KAIRĘ_ĮVAŽIUOJATE_Į_A11_KELIĄ_KITAME_ŽIEDE_SUKATE_Į_DEŠINĘ_IR_VAŽIUOJATE_IKI_BIRŽUVĖNŲ = "Važiuojate link Telšių apie 35 kilometrus, žiede sukate į kairę (įvažiuojate į A11 kelią), kitame žiede sukate į dešinę ir važiuojate iki Biržuvėnų.";
    public static final String EKSKURSIJA_PO_TELŠIUS_BAIGTA_GRĮŽTATE_ATGAL_Į_MAŽEIKIUS = "Ekskursija po Telšius baigta. Grįžtate atgal į Mažeikius.";
    public static final String PARKE_EKSPONUOJAMI_9_AUTORIŲ_DARBAI = "Parke eksponuojami 9 autorių darbai.“";
    public static final String APLANKIUS_MUZIEJŲ_LAIKĄ_GALITE_PRALEISTI_MASČIO_EŽERO_PAKRANTĖJE_BEI_SKULPTŪRŲ_PARKE = "Aplankius muziejų, laiką galite praleisti Masčio ežero pakrantėje bei skulptūrų parke.";
    public static final String EKSPOZICIJOJE_SUKAUPTA_DAUGIAU_KAIP_60_TŪKST_EKSPONATŲ = "Ekspozicijoje sukaupta daugiau kaip 60 tūkst. eksponatų.";
    public static final String PO_PIETŲ_APLANKOTE_GARSŲJĮ_ŽEMAIČIŲ_MUZIEJŲ_ALKA = "Po pietų aplankote garsųjį Žemaičių muziejų „Alka“.";
    public static final String PAPIETAUTI_GALITE_KAVINĖSE_ANT_KALNELIO_SINCHRONAS_ARBA_SENAMIESTIS = "Papietauti galite kavinėse: „Ant kalnelio“, „Sinchronas“ arba „Senamiestis“.";
    public static final String PO_TO_KELIAUJATE_PAPIETAUTI = "Po to keliaujate papietauti.";
    public static final String ČIA_PALAIDOTI_3_TELŠIŲ_VYSKUPAI = "Čia palaidoti 3 Telšių vyskupai. ";
    public static final String NUSILEIDŽIATE_Į_PASLAPTINGUOSIUS_KATEDROS_POŽEMIUS = "Nusileidžiate į paslaptinguosius katedros požemius.";
    public static final String UŽEINATE_Į_DIDINGĄJĄ_ŠV_ANTANO_PADUVIEČIO_KATEDRĄ_GROŽYTĖS_ĮSPŪDINGOMIS_DURIMIS_KURIOSE_MENIŠKAI_PAVAIZDUOTA_ŽEMAITIJOS_KRIKŠTO_ISTORIJA = "Užeinate į didingąją Šv. Antano Paduviečio katedrą, grožytės įspūdingomis durimis, kuriose meniškai pavaizduota Žemaitijos krikšto istorija.";
    public static final String KELIONĘ_TĘSIAME_PĖSČIOMIS = "Kelionę tęsiame pėsčiomis.";
    public static final String DIDŽIOJI_ŽEMAIČIŲ_SIENA = "Didžioji žemaičių siena.";
    public static final String GROŽĖDAMIESI_VIENU_IŠ_7_SAUGOMŲ_SENAMIESČIŲ_LIETUVOJE_ATRANDATE_NUOSTABIAUSIAS_TELŠIŲ_MIESTO_MAŽOSIOS_ARCHITEKTŪROS_PUOŠMENAS = " Grožėdamiesi vienu iš 7 saugomų senamiesčių Lietuvoje, atrandate nuostabiausias Telšių miesto mažosios architektūros puošmenas.";
    public static final String KITAS_OBJEKTAS_TELŠIŲ_ŠVČ_MERGELĖS_MARIJOS_ĖMIMO_Į_DANGŲ_BAŽNYČIA = "Kitas objektas - Telšių Švč. Mergelės Marijos Ėmimo į dangų bažnyčia";
    public static final String APLANKOTE_ŽEMAITIJOS_SIMBOLĮ_MEŠKĄ = "Aplankote Žemaitijos simbolį - mešką";
    public static final String TRUKMĖ_6_30_7_00_VAL_APLANKOTE_ŽEMAITIJOS_SOSTINĘ_TELŠIUS = "Trukmė : 6:30 - 7:00 val.\nAplankote Žemaitijos sostinę - Telšius. ";
    public static final String TELŠIAI = "Telšiai";
    public static final String TELŠIŲ_PANORAMA = "Telšių panorama.";
    public static final String VAŽIUOJATE_40_KILOMETRŲ_APIE_37_MINUTES_ATVYKSTATE_Į_TELŠIUS = "Važiuojate 40 kilometrų apie 37 minutes. Atvykstate į Telšius.";
    public static final String IREIKSME = "IREIKSME";
    int i;
    ImageView iprieki,atgal;
    int maks=5;
    private MediaPlayer mMediaPlayer;
    Animation blink;
    @Override
    protected void onStop() {
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
        mMediaPlayer = MediaPlayer.create(marsrutaugaleru.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list2);

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

        i=getIntent().getIntExtra(IREIKSME,0);
        blink = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        iprieki = (ImageView) findViewById(R.id.iprieki);
        atgal = (ImageView) findViewById(R.id.atgal);
        iprieki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if (i>maks)
                    i=maks;
             setcontent();
            }
        });
        atgal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i--;
                if(i==-1)
                    i=0;
                setcontent();
            }
        });
        setcontent();
    }

    void setcontent() {
        final ArrayList<word3> Tnakvynes = new ArrayList<word3>();
        switch(i)
        {
            case 0:

                Tnakvynes.add(new word3(R.drawable.mzksq, IŠVYKSTATE_IŠ_MAŽEIKIŲ, VAŽIUOJATE_40_KILOMETRŲ_APIE_37_MINUTES_ATVYKSTATE_Į_TELŠIUS, R.drawable.telsiaisq, TELŠIŲ_PANORAMA, "", TELŠIAI, TRUKMĖ_6_30_7_00_VAL_APLANKOTE_ŽEMAITIJOS_SOSTINĘ_TELŠIUS));
                Tnakvynes.add(new word3(R.drawable.meskasq, APLANKOTE_ŽEMAITIJOS_SIMBOLĮ_MEŠKĄ, "", R.drawable.svmbaznyciasq, KITAS_OBJEKTAS_TELŠIŲ_ŠVČ_MERGELĖS_MARIJOS_ĖMIMO_Į_DANGŲ_BAŽNYČIA, GROŽĖDAMIESI_VIENU_IŠ_7_SAUGOMŲ_SENAMIESČIŲ_LIETUVOJE_ATRANDATE_NUOSTABIAUSIAS_TELŠIŲ_MIESTO_MAŽOSIOS_ARCHITEKTŪROS_PUOŠMENAS));
                Tnakvynes.add(new word3(R.drawable.sienassq, DIDŽIOJI_ŽEMAIČIŲ_SIENA, KELIONĘ_TĘSIAME_PĖSČIOMIS, R.drawable.katedrasq, UŽEINATE_Į_DIDINGĄJĄ_ŠV_ANTANO_PADUVIEČIO_KATEDRĄ_GROŽYTĖS_ĮSPŪDINGOMIS_DURIMIS_KURIOSE_MENIŠKAI_PAVAIZDUOTA_ŽEMAITIJOS_KRIKŠTO_ISTORIJA, NUSILEIDŽIATE_Į_PASLAPTINGUOSIUS_KATEDROS_POŽEMIUS));
                Tnakvynes.add(new word3(R.drawable.pozemiaisq, ČIA_PALAIDOTI_3_TELŠIŲ_VYSKUPAI, PO_TO_KELIAUJATE_PAPIETAUTI, R.drawable.maistassq, PAPIETAUTI_GALITE_KAVINĖSE_ANT_KALNELIO_SINCHRONAS_ARBA_SENAMIESTIS, PO_PIETŲ_APLANKOTE_GARSŲJĮ_ŽEMAIČIŲ_MUZIEJŲ_ALKA));
                Tnakvynes.add(new word3(R.drawable.alkasq, EKSPOZICIJOJE_SUKAUPTA_DAUGIAU_KAIP_60_TŪKST_EKSPONATŲ, APLANKIUS_MUZIEJŲ_LAIKĄ_GALITE_PRALEISTI_MASČIO_EŽERO_PAKRANTĖJE_BEI_SKULPTŪRŲ_PARKE, R.drawable.mpakrantesq, PARKE_EKSPONUOJAMI_9_AUTORIŲ_DARBAI, EKSKURSIJA_PO_TELŠIUS_BAIGTA_GRĮŽTATE_ATGAL_Į_MAŽEIKIUS));
                atgal.setVisibility(View.GONE);
                iprieki.setAnimation(blink);
                skamb();
                break;
            case 1:
                iprieki.setAnimation(blink);
                atgal.setAnimation(blink);
                atgal.setVisibility(View.VISIBLE);
                Tnakvynes.add(new word3(R.drawable.mzksq, IŠVYKSTATE_IŠ_MAŽEIKIŲ, VAŽIUOJATE_LINK_TELŠIŲ_APIE_35_KILOMETRUS_ŽIEDE_SUKATE_Į_KAIRĘ_ĮVAŽIUOJATE_Į_A11_KELIĄ_KITAME_ŽIEDE_SUKATE_Į_DEŠINĘ_IR_VAŽIUOJATE_IKI_BIRŽUVĖNŲ, R.drawable.birzuvenaisq, BIRŽUVĖNAI, APŽIŪRITE_VIENINTELĮ_LIETUVOJE_SENOVINIŲ_MOTOCIKLŲ_MUZIEJŲ, TELŠIŲ_RAJ, TRUKMĖ_7_00_VAL));
                Tnakvynes.add(new word3(R.drawable.motomuziejussq, ČIA_EKSPONUOJAMI_PRIEŠKARINIŲ_POKARINIŲ_IR_VIENETINIŲ_MOTOCIKLŲ_MODELIAI_PAGAMINTI_1901_1945_METAIS, APLANKOTE_NAUJAI_ATGIMUSĮ_EUROPOS_SĄJUNGOS_LĖŠOMIS_REKONSTRUOTĄ_BIRŽUVĖNŲ_DVARO_SODYBOS_KOMPLEKSĄ, R.drawable.birzuvenudvarassq, KOMPLEKSĄ_SUDARO_PONŲ_NAMAS_OFICINA_ARKLIDĖ_IR_VEŽIMINĖ, IŠ_BIRŽUVĖNŲ_VAŽIUOJATE_LINK_LUOKĖS_IR_SUKATE_Į_PAŠATRIJOS_KAIMĄ));
                Tnakvynes.add(new word3(R.drawable.satrijasq, ĮKOPIATE_Į_LEGENDOMIS_APIPINTĄ_ŠATRIJOS_KALNĄ, APLANKĘ_ŠATRIJOS_KALNĄ_GRĮŽTATE_Į_LUOKĘ, R.drawable.luokesq, LUOKĖJE_SKANIŲ_PATIEKALŲ_KVIEČIA_PARAGAUTI_KAVINĖ_ŠATRIJOS_LEGENDOS_O_NORINTYS_UŽSISAKYTI_KULINARINIO_PAVELDO_DEGUSTACIJĄ_KVIEČIAMI_Į_KAVINĘ_PREMJERA_TURINČIĄ_KULINARINIO_PAVELDO_FONDO_ŽENKLĄ, IŠ_LUOKĖS_VAŽIUOJATE_Į_RAINIUS));
                Tnakvynes.add(new word3(R.drawable.rainiusq, RAINIŲ_KOPLYČIA_PAMINKLAS_BOLŠEVIKŲ_NUKANKINTIEMS_POLITINIAMS_KALINIAMS_ATMINTI, IŠ_RAINIŲ_VAŽIUOJATE_LINK_JOMANTŲ_MIŠKO, R.drawable.jomantusq, JOMNTŲ_MIŠKO_PAŽINTINIS_TAKAS_GAUSUS_GAMTOS_PAMINKLŲ_ČIA_ĮRENGTOS_ATOKVĖPIO_VIETOS_INFORMACINIAI_STENDAI, KELIONĖ_PO_TELŠIŲ_RAJONĄ_BAIGTA_GRĮŽTATE_Į_MAŽEIKIUS));
                skamb();
                break;
            case 2:
                iprieki.setAnimation(blink);
                atgal.setAnimation(blink);
                Tnakvynes.add(new word3(R.drawable.mzksq , IŠVAŽIUOJATE_IŠ_MAŽEIKIŲ1, KELIONĖ_IKI_VIEKŠNIŲ_APIE_16_MIN,R.drawable.vieksniaisq, VIEKŠNIAI_PAMINKLAS_BIRŽIŠKOMS, PO_TO_300_M_PĖŠČIOMIS_EINATE_IKI_VYTAUTO_DIDŽIOJO_PAMINKLO, MAŽEIKIŲ_RAJONAS, TRUKMĖ_6_00_VAL_APLANKOTE_PAMINKLĄ_BIRŽIŠKOMS_VYTAUTO_DIDŽIOJO_PAMINKLĄ_A_GRIŠKEVIČIAUS_MUZIEJŲ_PAVIRVYTĖS_RENAVO_DAUTARŲ_DVARUS_IR_GRĮŽTATE_PRO_ORLEN_LIETUVA_NAFTOS_PERDIRBIMO_GAMYKLĄ));
                Tnakvynes.add(new word3(R.drawable.vytautosq , PAMINKLAS_YRA_4_M_AUKŠČIO_BETONINIS_JAME_PAVAIZDUOTA_VYTAUTAS_DIDYSIS_TRAKŲ_PILIS_VYTIS_ŠV_ALOYZAS_TRIJŲ_KRYŽIŲ_KALNAS_IR_ŽEMAIČIŲ_SIMBOLIS_MEŠKA_1983_1984_M_IR_1999_M_RESTAURUOTAS, M_EINATE_IKI_A_GRIŠKEVIČIAUS_MEMORIALINIO_MUZIEJAUS,R.drawable.griskeviciaussq , LIETUVOS_AVIACIJOS_PRADININKO_A_GRIŠKEVIČIAUS_MEMORIALINIS_MUZIEJUS, APLANKĘ_MUZIEJŲ_VAŽIUOJATE_APIE_9_MIN_IKI_PAVIRVYTĖS_DVARO));
                Tnakvynes.add(new word3(R.drawable.pavirvytessq , PAVIRVYTĖS_DVARAS_ĮSIKŪRĘS_VIRVYTĖS_UPĖS_DEŠINIAJAME_KRANTE, APŽIŪRĖJĘ_DVARĄ_VAŽIUOJATE_APIE_44_MIN_IKI_RENAVO,R.drawable.rensq , RENAVO_DVARAS, PO_TO_VAŽIUOJATE_21_MIN_IKI_DAUTARŲ));
                Tnakvynes.add(new word3(R.drawable.dautsq , DAUTARŲ_DVARAS, Į_MAŽEIKIUS_GRĮŠTATE_PRO_PIKELIUS_PAKELIUI_PRAVAŽIUODAMI_PRO_NAFTOS_PERDIRBIMO_GAMYKLĄ,R.drawable.naftasq , DIDŽIAUSIA_GAMYKLA_BALTIJOS_ŠALYSE_ORLEN_LIETUVA, NUO_GAMYKLOS_IKI_MAŽEIKIŲ_VAŽIUOJATE_APIE_20_MIN));
                skamb();

                break;
            case 3:
                iprieki.setAnimation(blink);
                atgal.setAnimation(blink);
                Tnakvynes.add(new word3(R.drawable.mzksq , IŠVYKSTATE_IŠ_MAŽEIKIŲ, IKI_NAUJOSIOS_AKMENĖS_KALKAKMENIO_KARJIERO_VAŽIUOJATE_APIE_37_MIN,R.drawable.karjierassq , KALKAKMENIO_KARJIERAS_NORINT_APLANKYTI_BŪTINA_SUSITARTI_IŠ_ANKSTO_ČIA_VAIKŠTANT_ATRODO_KAD_ESATE_TOLI_NUO_LIETUVIŠKŲ_LYGUMŲ_VAIZDAI_LYG_KALNUOSE_LYG_TARPEKLYJE, APLANKĘ_KARJIERĄ_VAŽIUOJATE_Į_PAPILĘ_APIE_24_MIN, AKMENĖ_PLUNGĖ, TRUKMĖ_7_00_8_00_VAL_ŠIOS_KELIONĖS_METU_APLANKOTE_NAUJOSIOS_AKMENĖS_KALKAKMENIO_KARJIERĄ_SIMONO_DAUKANTO_KAPĄ_IR_PAMINKLĄ_PAPILĖS_PENKIOLIKAKAMIENĘ_LIEPĄ_ŠIAUDINĖS_MEDINĘ_BAŽNYČIĄ_BALSIUS_PASIRINKTINAI_OGINSKIO_RŪMUS_IR_ŽEMAIČIŲ_DAILĖS_MUZIEJŲ_PLUNGĖJE_ŠV_MERGELĖS_MARIJOS_ĖMIMO_Į_DANGŲ_BAŽNYČIĄ_SEDOJE));
                Tnakvynes.add(new word3(R.drawable.simonassq , PAPILĖ_SIMONO_DAUKANTO_KAPAS_IR_PAMINKLAS, EINATE_700_M_IKI_PENKIOLIKAKAMIENĖS_LIEPOS,R.drawable.penkiolikasq , PENKIOLIKAKAMIENĖ_LIEPA_VALSTYBINIS_GAMTOS_PAVELDO_OBJEKTAS_JOS_AMŽIUS_APIE_150_METŲ, PO_TO_VAŽIUOJATE_APIE_8_MIN_IKI_ŠIAUDINĖS_KAIMO));
                Tnakvynes.add(new word3(R.drawable.siaudinessq , ŠIAUDINĖS_BAŽNYČIA, VAŽIUODAMI_LINK_PLUNGĖS_GALITE_SUSTOTI_BALSIUOSE,R.drawable.balsiaisq , STOVYKLA_BALSIUSOE_NAUJAI_ĮRENGTAME_BALSIŲ_SLĖNYJE_PASINAUDODAMI_SPECIALIA_ALPINISTINE_ĮRANGA_PARKO_LANKYTOJAI_GALI_IŠBANDYTI_SAVO_JĖGAS_NUSILEIDIMO_TRASOSE_KURIOS_NUTIESTOS_PER_VIRVYTĖS_UPĘ, KELIONĖ_Į_PLUNGĘ_TĘSIAMA_62_2_KM_58_MIN));
                Tnakvynes.add(new word3(R.drawable.orumaisq , PLUNGĖ_OGINSKIO_RŪMAI_SODYBA_UŽIMA_58_3_HA_PARKO_PLOTO, APLANKĘ_OGINSKIO_RŪMUS_ŽEMAIČIŲ_DAILĖS_MUZIEJŲ_VAŽIUOJATE_Į_SEDĄ,R.drawable.sedossvcsq , SEDA_MAŽEIKIŲ_RAJ_ŠV_MERGELĖS_MARIJOS_ĖMIMO_Į_DANGŲ_BAŽNYČIA, GRĮŽTATE_Į_MAŽEIKIUS_KELIONĖ_UŽTRUKS_APIE_1_VAL_57_1_KM));
                skamb();

                break;
            case 4:
                iprieki.setAnimation(blink);
                atgal.setAnimation(blink);
                Tnakvynes.add(new word3(R.drawable.mzksq , IŠVYKSTATE_IŠ_MAŽEIKIŲ, VAŽIUOJATE_APIE_50_MIN_IKI_ŠALTOJO_KARO_MUZIEJAUS_PLATELIŲ_SEN_PLUNGĖS_RAJ,R.drawable.saltojoksq , ŠALTOJO_KARO_MUZIEJUS, APLANKĘ_ŠALTOJO_KARO_MUZIEJŲ_VAŽIUOJATE_LINK_SKUODO_APIE_36_MIN_LANKYTINAS_OBJEKTAS_ORVIDŲ_SODYBA, PLUNGĖ_SKUODAS, TRUKMĖ_7_00_VAL_ŠIOS_KELIONĖS_METU_APLANKOTE_ŠALTOJO_KARO_MUZIEJŲ_ORVIDŲ_SODYBĄ_ŠAUKLIŲ_RIEDULYNĄ_MOSĖDŽIO_AKMENŲ_MUZIEJŲ_APUOLĖS_PILIAKALNĮ_TRUIKINŲ_ŠALTINĮ_Į_ŠAUKLIŲ_RIEDULYNĄ_REKOMENDUOJAMA_VYKTI_NUO_VĖLYVO_PAVASARIO_IKI_RUDENS_KAD_NEBŪTŲ_PATVINĘ));
                Tnakvynes.add(new word3(R.drawable.orvidusq , ORVIDŲ_SODYBA, PO_TO_11_MIN_VAŽIUOJATE_IKI_ŠAUKLIŲ_RIEDULYNO,R.drawable.saukliusq , ŠAUKLIŲ_RIEDULYNAS, PAVAIKŠČIOJĘ_PO_ŠAUKLIŲ_RIEDULYNĄ_APIE_7_MIN_VAŽIUOJATE_IKI_MOSĖDŽIO));
                Tnakvynes.add(new word3(R.drawable.akmenumuziejussq , MOSĖDŽIO_AKMENŲ_MUZIEJUS, IŠ_MOSĖDŽIO_VAŽIUOJATE_IKI_APUOLĖS,R.drawable.apuolesq , APUOLĖS_PILIAKALNIS, PO_TO_9_MIN_VAŽIUOJATE_IKI_TRUIKINŲ_ŠALTINIO));
                Tnakvynes.add(new word3(R.drawable.saltinissq , TRUIKINŲ_ŠALTINIS_ARBA_ŠMITOS_VERSMĖ_HIDROGEOLOGINIS_GAMTOS_PAVELDO_OBJEKTAS, IKI_MAŽEIKIŲ_APIE_47_KM_T_Y_40_MIN_KELIO,R.drawable.mzksq , GRĮŽTATE_Į_MAŽEIKIUS,""));
                iprieki.setVisibility(View.VISIBLE);
                skamb();

                break;
            case 5:
                atgal.setAnimation(blink);
                iprieki.setVisibility(View.GONE);
                Tnakvynes.add(new word3(R.drawable.mzksq , IŠVAŽIUOJATE_IŠ_MAŽEIKIŲ, IKI_KLAIPĖDOS_VAŽIUOJATE_1_VAL_37_MIN,R.drawable.klpzoosq , KLAIPĖDOS_ZOOLOGIJOS_SODAS, PO_TO_VAŽIUOJATE_Į_VENTĘ_APIE_1_VAL, KLAIPĖDA_ŠILUTĖ_PLUNGĖ, TRUKMĖ_9_00_10_00_VAL_ŠIOS_KELIONĖS_METU_APLANKOTE_KLAPĖDOS_ZOOLOGIJOS_SODĄ_VENTĖS_RAGĄ_GALITE_STEBĖTI_ŽIEDUOJAMUS_PAUKŠČIUS_MINIJOS_KAIMĄ_YRA_GALIMYBĖ_PAPLAUKIOTI_VALTIMIS_ŠV_ARKANGELO_MYKOLO_BAŽNYČIĄ_RIETAVE_OGINSKIŲ_DVARO_RŪMUS_PLUNGEJE_NORINT_STEBĖTI_PAUKŠČIŲ_ŽIEDAVIMĄ_Į_VENTĖS_RAGĄ_REKOMENDUOJAMA_VYKTI_ARBA_VĖLYVĄ_PAVASARĮ_ARBA_ANKSTYVĄ_RUDENĮ));
                Tnakvynes.add(new word3(R.drawable.ventesragassq , VENTĖS_RAGAS_PUSIASALIS_PRIE_KURŠIŲ_MARIŲ_VISAI_NETOLI_NEMUNO_UPĖS_ŽIOČIŲ, APLANKĘ_VENTĖS_RAGĄ_APIE_17_MIN_VAŽIUOJATE_Į_MINIJOS_KAIMĄ,R.drawable.minijosksq , MINIJA_ARBA_MINGĖ_ŽVEJŲ_GATVINIS_KAIMAS_ŠILUTĖS_RAJONO_SAVIVALDYBĖJE_MINIJOS_UPE_TURITE_GALIMYBĘ_IŠPLAUKTI_VALTIMI_Į_KURŠIŲ_MARIAS, IŠ_MINIJOS_VAŽIUOJATE_1VAL_16_MIN_IKI_RIETAVO));
                Tnakvynes.add(new word3(R.drawable.rietavooginskiobsq , RIETAVAS_ŠV_ARKANGELO_MYKOLO_BAŽNYČIA, IŠ_RIETAVO_VAŽIUOJATE_31_MIN_IKI_PLUNGĖS,R.drawable.orumaisq , OGINSKIŲ_DVARO_RŪMAI_PLUNGĖJE_ČIA_BUVO_PIRMĄ_KARTĄ_LIETUVOJE_UŽDEGTA_ELEKTROS_LEMPUTĖ, GRĮŽIMAS_IŠ_PLUNGĖS_Į_MAŽEIKIUS_UŽTRUNKA_1_VAL));
                skamb();

                break;
        }

        Adaptoreditor4 adapteris = new Adaptoreditor4(marsrutaugaleru.this, Tnakvynes);
        ListView Listtranslated = (ListView) findViewById(R.id.list);
        Listtranslated.setAdapter(adapteris);
    }
}