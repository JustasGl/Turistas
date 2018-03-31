package com.example.android.turistas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

public class TelsiuRestoranai extends AppCompatActivity {
    public static final String KELINTOSUMA = "KELINTOSUMA";
    public static final String GRĮŽTAME_ATGAL = "Grįžtame atgal";
    ImageView fk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new TelsiuRestoranai_fragment())
                .commit();
        Toast.makeText(TelsiuRestoranai.this, GRĮŽTAME_ATGAL, Toast.LENGTH_LONG).show();
        fk = (ImageView) findViewById(R.id.fkimg);
        move();
    }

    private void move() {
        TranslateAnimation cloud_moving = new TranslateAnimation(
                Animation.ABSOLUTE, 0,
                Animation.ABSOLUTE, 0,
                Animation.ABSOLUTE, 0,
                Animation.ABSOLUTE, 0
        );

        cloud_moving.setDuration(3000);
        cloud_moving.setFillAfter(true);
        fk.setAnimation(cloud_moving);
        cloud_moving.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                Toast.makeText(TelsiuRestoranai.this, GRĮŽTAME_ATGAL, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(TelsiuRestoranai.this, MainActivity.class);
                intent.putExtra(KELINTOSUMA, true);
                startActivity(intent);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}