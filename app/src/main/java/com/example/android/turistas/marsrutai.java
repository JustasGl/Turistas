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
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class marsrutai extends AppCompatActivity {

    public static final String IREIKSME = "IREIKSME";
    public static final String HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_BIW_958_BIH_954_EI_O1_EIWSVN_O_Z_YG_ABU440_Y_Q_MAR_C5_A1RUTAI_PO_C5_BDEMAITIJA_OQ_MAR_C5_A1RUTAI_PO_C5_BDEMAITIJA_GS_L_PSY_AB_3_2793_2793_0_2947_1_1_0_0_0_0_145_145_0J1_1_0_0_1_1_64_PSY_AB_0_0_0_0_I5GJ_PZCH1_E_GFE_RD_CR_DCR_0 = "https://www.google.com/search?client=firefox-b-ab&biw=958&bih=954&ei=O1EIWsvnO-zYgAbu440Y&q=Mar%C5%A1rutai+po+%C5%BDemaitija&oq=Mar%C5%A1rutai+po+%C5%BDemaitija&gs_l=psy-ab.3...2793.2793.0.2947.1.1.0.0.0.0.145.145.0j1.1.0....0...1.1.64.psy-ab..0.0.0....0._I5gjPZch1E&gfe_rd=cr&dcr=0";
    public static final String HTTPS_DRIVE_GOOGLE_COM_OPEN_ID_1_DO9_KFBKNT0_IFTCQS_PQ_HIT_FDH_OEVC1M_USP_SHARING = "https://drive.google.com/open?id=1-DO9KFBKNt0IftcqsPqHIT-FdhOEvc1m&usp=sharing";
    public static final String HTTPS_DRIVE_GOOGLE_COM_OPEN_ID_1J_KT_B1_OUHX_NZTUO_ER6_KEGB_VQG_3_H_GT3_USP_SHARING = "https://drive.google.com/open?id=1jKtB1OuhxNZTuoER6_kegbVQG-3H-gt3&usp=sharing";
    public static final String HTTPS_DRIVE_GOOGLE_COM_OPEN_ID_16DU6S7FK_EH9J206_U83L_A5_O_L_SE5O_T_V_X_USP_SHARING = "https://drive.google.com/open?id=16du6s7fkEH9j206U83lA5O-lSE5oT_vX&usp=sharing";
    public static final String HTTPS_DRIVE_GOOGLE_COM_OPEN_ID_1_CLW3_JHDNO8_JOEGX_URX_NRODZH_HI_CC_NBBG_USP_SHARING = "https://drive.google.com/open?id=1CLw3JHDNo8JOegxUrxNrodzhHiCcNBBg&usp=sharing";
    public static final String HTTPS_DRIVE_GOOGLE_COM_OPEN_ID_1D_T7_GV4_PEZR5U_KDIJPUHR_WTXNEE_TZQ_YZ_USP_SHARING = "https://drive.google.com/open?id=1dT7Gv4_PEZr5uKDIJPUHrWTxneeTZqYz&usp=sharing";
    public static final String HTTPS_DRIVE_GOOGLE_COM_OPEN_ID_1_MGQ_OB_B8BCK_GA_CYD_A6_ZMMNI_UD_RYIRG3_USP_SHARING = "https://drive.google.com/open?id=1MGqOb_B8bck-GaCYdA6ZmmniUdRyirg3&usp=sharing";
    public static final String GAMTA = "Gamta ";
    public static final String ARCHITEKTŪRA = "Architektūra";
    public static final String GAMTA1 = "Gamta";
    public static final String MUZIEJAI = "Muziejai";
    public static final String BAŽNYČIOS = "Bažnyčios";
    public static final String PAMINKLAI = "Paminklai";
    public static final String TELŠIAI = "Telšiai";
    public static final String MAŽEIKIAI = "Mažeikiai";
    Vibrator vibrator;
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
        mMediaPlayer = MediaPlayer.create(marsrutai.this, R.raw.garsas);
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

        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        final ArrayList<word2> marsrutai = new ArrayList<word2>();
        marsrutai.add(new word2(R.drawable.mzk_tls, MAŽEIKIAI, TELŠIAI));
        marsrutai.add(new word2(R.drawable.mzk_tls2, MAŽEIKIAI, TELŠIAI));
        marsrutai.add(new word2(R.drawable.mzk_dvarai, PAMINKLAI, MUZIEJAI));
        marsrutai.add(new word2(R.drawable.mzk_baznycios, GAMTA1, BAŽNYČIOS));
        marsrutai.add(new word2(R.drawable.zemaitijos_muziejai, MUZIEJAI, GAMTA1));
        marsrutai.add(new word2(R.drawable.zemaitijos_gamta, ARCHITEKTŪRA, GAMTA));
        marsrutai.add(new word2(R.drawable.daugiaup, "", ""));
        Adaptoreditor3 adapteris = new Adaptoreditor3(marsrutai.this, marsrutai);
        ListView Listtranslated = (ListView) findViewById(R.id.list);
        Listtranslated.setAdapter(adapteris);
        Listtranslated.setLongClickable(true);
        Listtranslated.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int pos, long id) {
                skamb();
                vibrator.vibrate(200);
                switch (pos) {
                    case 0:

                        String map = HTTPS_DRIVE_GOOGLE_COM_OPEN_ID_1_MGQ_OB_B8BCK_GA_CYD_A6_ZMMNI_UD_RYIRG3_USP_SHARING;
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                        startActivity(i);
                        break;
                    case 1:

                        String map1 = HTTPS_DRIVE_GOOGLE_COM_OPEN_ID_1D_T7_GV4_PEZR5U_KDIJPUHR_WTXNEE_TZQ_YZ_USP_SHARING;
                        Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse(map1));
                        startActivity(i1);
                        break;
                    case 2:

                        String map2 = HTTPS_DRIVE_GOOGLE_COM_OPEN_ID_1_CLW3_JHDNO8_JOEGX_URX_NRODZH_HI_CC_NBBG_USP_SHARING;
                        Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse(map2));
                        startActivity(i2);
                        break;
                    case 3:

                        String map3 = HTTPS_DRIVE_GOOGLE_COM_OPEN_ID_16DU6S7FK_EH9J206_U83L_A5_O_L_SE5O_T_V_X_USP_SHARING;
                        Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse(map3));
                        startActivity(i3);
                        break;
                    case 4:

                        String map4 = HTTPS_DRIVE_GOOGLE_COM_OPEN_ID_1J_KT_B1_OUHX_NZTUO_ER6_KEGB_VQG_3_H_GT3_USP_SHARING;
                        Intent i4 = new Intent(Intent.ACTION_VIEW, Uri.parse(map4));
                        startActivity(i4);
                        break;
                    case 5:

                        String map5 = HTTPS_DRIVE_GOOGLE_COM_OPEN_ID_1_DO9_KFBKNT0_IFTCQS_PQ_HIT_FDH_OEVC1M_USP_SHARING;
                        Intent i5 = new Intent(Intent.ACTION_VIEW, Uri.parse(map5));
                        startActivity(i5);
                        break;
                }

                return true;
            }
        });
        Listtranslated.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if (position == 6) {
                    String daugiau = HTTPS_WWW_GOOGLE_COM_SEARCH_CLIENT_FIREFOX_B_AB_BIW_958_BIH_954_EI_O1_EIWSVN_O_Z_YG_ABU440_Y_Q_MAR_C5_A1RUTAI_PO_C5_BDEMAITIJA_OQ_MAR_C5_A1RUTAI_PO_C5_BDEMAITIJA_GS_L_PSY_AB_3_2793_2793_0_2947_1_1_0_0_0_0_145_145_0J1_1_0_0_1_1_64_PSY_AB_0_0_0_0_I5GJ_PZCH1_E_GFE_RD_CR_DCR_0;
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                    startActivity(i);
                } else {
                    Intent intent = new Intent(marsrutai.this, marsrutaugaleru.class);
                    intent.putExtra(IREIKSME, position);
                    startActivity(intent);
                }
            }
        });
    }
}
