package com.example.priyamshah.listener;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import static android.graphics.Color.BLUE;
import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;
import static android.graphics.Color.red;
import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {
SeekBar r,g,b;

View v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SeekBar r=(SeekBar)findViewById(R.id.seekBar);
        final SeekBar g=(SeekBar)findViewById(R.id.seekBar2);
        final SeekBar b=(SeekBar)findViewById(R.id.seekBar3);
        v=(View) findViewById(R.id.layout);
       // r.setBackgroundColor(RED);
        //g.setBackgroundColor(GREEN);
       // b.setBackgroundColor(BLUE);
        r.setProgress(0);
        g.setProgress(0);
        b.setProgress(0);
       // v.setBackgroundColor(rgb(r.getProgress(),g.getProgress(),b.getProgress()));
        r.setMax(255);
        g.setMax(255);
        b.setMax(255);
        r.getProgressDrawable().setColorFilter(Color.RED, PorterDuff.Mode.SRC_IN);
        r.getThumb().setColorFilter(Color.RED, PorterDuff.Mode.SRC_IN);

        g.getProgressDrawable().setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_IN);
        g.getThumb().setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_IN);

        b.getProgressDrawable().setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);
        b.getThumb().setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);
        /*
        r.setMin(0);
        g.setMin(0);
        b.setMin(0);
         */


        r.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                                         @Override
                                         public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                                             v.setBackgroundColor(rgb(r.getProgress(), g.getProgress(), b.getProgress()));


                                         }

                                         @Override
                                         public void onStartTrackingTouch(SeekBar seekBar) {

                                         }

                                         @Override
                                         public void onStopTrackingTouch(SeekBar seekBar) {

                                         }
                                     }

                                      );
        g.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                                         @Override
                                         public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                                             v.setBackgroundColor(rgb(r.getProgress(), g.getProgress(), b.getProgress()));
                                         }

                                         @Override
                                         public void onStartTrackingTouch(SeekBar seekBar) {

                                         }

                                         @Override
                                         public void onStopTrackingTouch(SeekBar seekBar) {

                                         }
                                     }

        );
        b.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                                         @Override
                                         public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                                             v.setBackgroundColor(rgb(r.getProgress(), g.getProgress(), b.getProgress()));
                                         }

                                         @Override
                                         public void onStartTrackingTouch(SeekBar seekBar) {

                                         }

                                         @Override
                                         public void onStopTrackingTouch(SeekBar seekBar) {

                                         }
                                     }

        );




    }

}
