package com.example.android.turistas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class aerodromas extends AppCompatActivity {

    public static final String PAKALNĖS_G_5_TELŠIAI_87122 = "Pakalnės g. 5, Telšiai 87122";
    public static final String HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q = "http://maps.google.co.in/maps?q=";
    public static final String pakalnes5url = "https://www.google.com/search?client=firefox-b-ab&ei=LCj-WZHjF8f76ATWyKnYDg&q=Aerodromas+Tel%C5%A1iuose&oq=Aerodromas+Tel%C5%A1iuose&gs_l=psy-ab.3...1266.3542.0.3721.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.3Q6PdeYgvTM&gfe_rd=cr&dcr=0";
    public static final String TEL = "tel";
    private MediaPlayer mMediaPlayer;

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
        mMediaPlayer = MediaPlayer.create(aerodromas.this, R.raw.garsas);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aerodromas);

        ImageView adress = (ImageView)findViewById(R.id.adreso);
        ImageView tel = (ImageView)findViewById(R.id.telefono);
        adress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String str_location = PAKALNĖS_G_5_TELŠIAI_87122;
                String map = HTTP_MAPS_GOOGLE_CO_IN_MAPS_Q + str_location;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                startActivity(i);
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String phone = getString(R.string.pakalnes5nr);
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(TEL, phone, null));
                startActivity(intent);
            }
        });
        ImageView googlesearch = (ImageView)findViewById(R.id.google);
        googlesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skamb ();
                String daugiau = pakalnes5url;
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(daugiau));
                startActivity(i);
            }
        });
    }
}
