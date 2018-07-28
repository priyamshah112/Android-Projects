package com.example.priyamshah.app6;


import android.content.Intent;
import android.graphics.Bitmap;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent();
        img = (ImageView) findViewById(R.id.imageView);
    }

    public void click(View v) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        //intent.putExtra(MediaStore.EXTRA_OUTPUT,"data");
        startActivityForResult(intent, 20);
    }

    @Override
    protected void onActivityResult(int req, int res, Intent intent) {

        Bitmap photo = (Bitmap) intent.getExtras().get("data");
        img.setImageBitmap(photo);

    }
}