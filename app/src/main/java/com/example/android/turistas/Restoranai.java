package com.example.android.turistas;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

public class Restoranai extends AppCompatActivity {
    public static final String BRAUKIAME_Į_ŠONĄ_NORĖDAMI_PAMATYTI_KITŲ_MIESTŲ_MAITINIMO_ĮSTAIGAS = "Braukiame į šoną norėdami pamatyti kitų miestų maitinimo įstaigas";
    public static final String ARTAIMOKYMAI = "ARTAIMOKYMAI";
    boolean i;
    int a = 0;
    ImageView fng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restoranai);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        i = getIntent().getBooleanExtra(ARTAIMOKYMAI, false);
        fng = (ImageView) findViewById(R.id.finger);
        fng.setVisibility(View.GONE);
        if (i == true) {
            fng.setVisibility(View.VISIBLE);
            move();
        } else {
            fng.setVisibility(View.GONE);
        }
        // Set the content of the activity to use the activity_main.xml layout file
        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        swiperis adapter = new swiperis(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);
        toolbar();

    }

    private void move() {
        TranslateAnimation cloud_moving = new TranslateAnimation(
                Animation.ABSOLUTE, 1450,
                Animation.ABSOLUTE, 10,
                Animation.ABSOLUTE, 0,
                Animation.ABSOLUTE, 0
        );

        cloud_moving.setDuration(1000);
        cloud_moving.setFillAfter(false);
        fng.setAnimation(cloud_moving);
        cloud_moving.setRepeatCount(5);
        cloud_moving.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                Toast.makeText(Restoranai.this, BRAUKIAME_Į_ŠONĄ_NORĖDAMI_PAMATYTI_KITŲ_MIESTŲ_MAITINIMO_ĮSTAIGAS, Toast.LENGTH_LONG).show();
                Toast.makeText(Restoranai.this, BRAUKIAME_Į_ŠONĄ_NORĖDAMI_PAMATYTI_KITŲ_MIESTŲ_MAITINIMO_ĮSTAIGAS, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                a++;
                if (a == 5) {
                    fng.setVisibility(View.GONE);
                    Intent intent = new Intent(Restoranai.this, TelsiuRestoranai.class);

                    startActivity(intent);
                }
            }
        });
    }

    private void toolbar() {
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        Toolbar myChildToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myChildToolbar);
        ImageView profil = (ImageView) findViewById(R.id.profilio);
        ActionBar ab = getSupportActionBar();

        ab.setDisplayHomeAsUpEnabled(true);
        final Drawable upArrow = getResources().getDrawable(R.drawable.up);
        upArrow.setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);

    }
}