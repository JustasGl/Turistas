package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String SPUSTELKITE_TRUMPIAU_IR_ATSIDARYS_REKOMENDUOJAMŲ_RESTORANŲ_SĄRAŠAS = "Spustelkite trumpiau ir atsidarys rekomenduojamų restoranų sąrašas";
    public static final String KAIP_NAUDOTIS_PROGRAMA = "Kaip naudotis programa?";
    public static final String HTTPS_DRIVE_GOOGLE_COM_DRIVE_FOLDERS_1_KXCT_BTT_BCQIQ4IA_LVL_BJD6_R8_VSN_XLGYG_USP_SHARING = "https://drive.google.com/drive/folders/1KXctBttBCqiq4iaLVlBJD6R8VSnXlgyg?usp=sharing";
    public static final String HTTPS_DRIVE_GOOGLE_COM_OPEN_ID_18X_F22_QIH_QPT_DQA_R9_S8_KG8ZG69_M_USP_SHARING = "https://drive.google.com/open?id=18xF22QihQptDqaR9S8-Kg8zg69M&usp=sharing";
    public static final String HTTPS_DRIVE_GOOGLE_COM_OPEN_ID_1_ZMP_YRD_IURV_TXTD_YLG8DBU_BFQA_S_JJIF_USP_SHARING = "https://drive.google.com/open?id=1ZmpYrdIURvTxtdYLg8dbuBFQaS-_Jjif&usp=sharing";
    public static final String HTTPS_WWW_BOOKING_MAP_COM_HOTEL_PUSYNO_NAMAI_4_TIRKSLIAI_LITHUANIA = "https://www.booking-map.com/hotel-pusyno-namai-4-tirksliai-lithuania/";
    public static final String HTTPS_DRIVE_GOOGLE_COM_OPEN_ID_1Y_IMGQTY_L5E_WE2_JJI_ZPBI_ZQOAJ_A_USP_SHARING = "https://drive.google.com/open?id=1yIMGQtyL5eWE2JJiZpbi-ZQOAjA&usp=sharing";
    public static final String SPUSTELKITE_ILGIAU_IR_ATSIDARYS_ŽEMĖLAPIS_KURIAME_SUŽYMĖTI_OBJEKTAI = "Spustelkite ilgiau ir atsidarys žemėlapis, kuriame sužymėti objektai";
    public static final String KELINTOSUMA = "KELINTOSUMA";
    public static final String ARTAIMOKYMAI = "ARTAIMOKYMAI";
    Vibrator vibrator;
    boolean tiesa;
    int skaiciuoklis = 1;
    int kelintas = 0;
    boolean baigesi = true;
    RelativeLayout zemgid;
    ImageView vietos, pernakvoti, linksmybes, restoranai, mapas, finger;
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

    private void startZoomAnimation() {
        if (skaiciuoklis == 1) {
            ViewGroup view = (ViewGroup) findViewById(R.id.realitivasrestoranu);
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in_animation);
            view.startAnimation(animation);
            finger.setImageResource(R.drawable.finger);
            animation.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {

                }

                @Override
                public void onAnimationEnd(Animation animation) {

                    if (kelintas < 99) {
                        kelintas++;
                        if (kelintas % 14 != 0)
                            startZoomAnimation();
                        if (kelintas % 7 == 0) {
                            kelintas++;
                            Intent intent = new Intent(MainActivity.this, Restoranai.class);
                            intent.putExtra(ARTAIMOKYMAI, true);
                            startActivity(intent);
                            mMediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.garsas);
                            mMediaPlayer.start();
                            mMediaPlayer.setOnCompletionListener(mCompletionListener);
                        }
                        if (kelintas % 13 == 0)
                            if (kelintas % 13 == 0) {
                                movevack();
                                String daugiau = HTTPS_DRIVE_GOOGLE_COM_OPEN_ID_1Y_IMGQTY_L5E_WE2_JJI_ZPBI_ZQOAJ_A_USP_SHARING;
                                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                                startActivity(i);
                                vibrator.vibrate(200);
                                mMediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.garsas);
                                mMediaPlayer.start();
                                mMediaPlayer.setOnCompletionListener(mCompletionListener);
                                kelintas = 100;
                            }
                    }
                }

                @Override
                public void onAnimationRepeat(Animation animation) {
                }
            });
        }
    }

    private void fadein() {
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        finger.setAnimation(anim);
        move();
    }

    private void move() {
        TranslateAnimation cloud_moving = new TranslateAnimation(
                Animation.ABSOLUTE, 1000,
                Animation.ABSOLUTE, 0,
                Animation.ABSOLUTE, 500,
                Animation.ABSOLUTE, 100
        );

        cloud_moving.setDuration(1500);
        cloud_moving.setFillAfter(true);
        finger.setAnimation(cloud_moving);
    }

    private void movevack() {

        finger.setImageResource(R.drawable.empty);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        finger = (ImageView) findViewById(R.id.finger);
        finger.setVisibility(View.GONE);
        vietos = (ImageView) findViewById(R.id.lankytinosvietos);
        pernakvoti = (ImageView) findViewById(R.id.nakvyne);
        linksmybes = (ImageView) findViewById(R.id.laisvalaikis);
        restoranai = (ImageView) findViewById(R.id.Restoranai);
        mapas = (ImageView) findViewById(R.id.map);
        kelintas = 0;
        zemgid = (RelativeLayout) findViewById(R.id.zgidas);
        tiesa = getIntent().getBooleanExtra(KELINTOSUMA, false);
        if (tiesa) {
            Toast.makeText(MainActivity.this, SPUSTELKITE_ILGIAU_IR_ATSIDARYS_ŽEMĖLAPIS_KURIAME_SUŽYMĖTI_OBJEKTAI, Toast.LENGTH_LONG).show();
            Toast.makeText(MainActivity.this, SPUSTELKITE_ILGIAU_IR_ATSIDARYS_ŽEMĖLAPIS_KURIAME_SUŽYMĖTI_OBJEKTAI, Toast.LENGTH_SHORT).show();
            finger.setVisibility(View.VISIBLE);
            finger.setImageResource(R.drawable.finger);
            skaiciuoklis = 1;
            kelintas = 9;
            startZoomAnimation();
        }
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        restoranai.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                String daugiau = HTTPS_DRIVE_GOOGLE_COM_OPEN_ID_1Y_IMGQTY_L5E_WE2_JJI_ZPBI_ZQOAJ_A_USP_SHARING;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
                vibrator.vibrate(200);
                mMediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.garsas);
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
                return false;
            }
        });
        restoranai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movevack();
                skaiciuoklis = 0;
                Intent intent = new Intent(MainActivity.this, Restoranai.class);
                startActivity(intent);
                mMediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.garsas);
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
                skaiciuoklis++;
            }
        });
        pernakvoti.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                String daugiau = HTTPS_WWW_BOOKING_MAP_COM_HOTEL_PUSYNO_NAMAI_4_TIRKSLIAI_LITHUANIA;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
                vibrator.vibrate(200);
                mMediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.garsas);
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
                return false;
            }
        });
        vietos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movevack();
                skaiciuoklis = 0;
                Intent intent = new Intent(MainActivity.this, Lanktyvtinos_vietos.class);
                startActivity(intent);
                mMediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.garsas);
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });
        vietos.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                String daugiau = HTTPS_DRIVE_GOOGLE_COM_OPEN_ID_1_ZMP_YRD_IURV_TXTD_YLG8DBU_BFQA_S_JJIF_USP_SHARING;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
                vibrator.vibrate(200);
                mMediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.garsas);
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
                return false;
            }
        });
        pernakvoti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movevack();
                skaiciuoklis = 0;
                Intent intent = new Intent(MainActivity.this, Nakvynes.class);
                startActivity(intent);
                mMediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.garsas);
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mCompletionListener);

            }
        });
        linksmybes.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                String daugiau = HTTPS_DRIVE_GOOGLE_COM_OPEN_ID_18X_F22_QIH_QPT_DQA_R9_S8_KG8ZG69_M_USP_SHARING;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
                mMediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.garsas);
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
                vibrator.vibrate(200);
                return false;
            }
        });
        linksmybes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movevack();
                skaiciuoklis = 0;
                Intent intent = new Intent(MainActivity.this, Linksmybes.class);
                startActivity(intent);
                mMediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.garsas);
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });
        zemgid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movevack();
                skaiciuoklis = 0;
                Intent intent = new Intent(MainActivity.this, zgidas.class);
                startActivity(intent);
                mMediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.garsas);
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });

        mapas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movevack();
                skaiciuoklis = 0;
                mMediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.garsas);
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
                Intent intent = new Intent(MainActivity.this, marsrutai.class);
                startActivity(intent);

            }
        });
        mapas.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                String daugiau = HTTPS_DRIVE_GOOGLE_COM_DRIVE_FOLDERS_1_KXCT_BTT_BCQIQ4IA_LVL_BJD6_R8_VSN_XLGYG_USP_SHARING;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
                mMediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.garsas);
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
                vibrator.vibrate(200);
                return false;
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.info) {
            if (kelintas > 99) {
                Intent intent = new Intent(MainActivity.this, apptut.class);
                startActivity(intent);
            } else {
                skaiciuoklis = 1;
                startZoomAnimation();
                finger.setVisibility(View.VISIBLE);
                fadein();
                Toast.makeText(MainActivity.this, KAIP_NAUDOTIS_PROGRAMA, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, SPUSTELKITE_TRUMPIAU_IR_ATSIDARYS_REKOMENDUOJAMŲ_RESTORANŲ_SĄRAŠAS, Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, SPUSTELKITE_TRUMPIAU_IR_ATSIDARYS_REKOMENDUOJAMŲ_RESTORANŲ_SĄRAŠAS, Toast.LENGTH_SHORT).show();
            }
        }
        if (item.getItemId() == R.id.settings) {
            Intent intent = new Intent(MainActivity.this, apieapp.class);
            startActivity(intent);
        }
        if (item.getItemId() == R.id.kaip) {
            Intent intent = new Intent(MainActivity.this, apptut.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}