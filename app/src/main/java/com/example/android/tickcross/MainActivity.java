package com.example.android.tickcross;

import android.app.Activity;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView tickCross;
    private AnimatedVectorDrawable tickToCross;
    private AnimatedVectorDrawable crossToTick;
    private boolean tick = true;
    private AnimatedVectorDrawable heart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tickCross = (ImageView) findViewById(R.id.tick_cross);
        tickToCross = (AnimatedVectorDrawable) getDrawable(R.drawable.avd_tick_to_cross);
        crossToTick = (AnimatedVectorDrawable) getDrawable(R.drawable.avd_cross_to_tick);

//        heart = (AnimatedVectorDrawable) getDrawable(R.drawable.avd_anim);

    }

    public void animate(View view) {
        AnimatedVectorDrawable drawable = tick ? tickToCross : crossToTick;
//        AnimatedVectorDrawable drawable = heart;
        tickCross.setImageDrawable(drawable);
        drawable.start();
        tick = !tick;
    }
}
