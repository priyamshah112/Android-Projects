package com.example.priyamshah.gallery1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;

import static android.os.Environment.DIRECTORY_PICTURES;

public class MainActivity extends AppCompatActivity {
    GridView gv;
    File path = new File(Environment.DIRECTORY_PICTURES);
    File[] imageIDs =path.listFiles();

    /*Integer[] imageIDs = {
                 R.mipmap.ic_launcher,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher,R.mipmap.ic_launcher_round
                ,R.mipmap.ic_launcher,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher,R.mipmap.ic_launcher_round
        };*/

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            gv = (GridView) findViewById(R.id.grid_view);
            gv.setAdapter(new ImageAdapterGridView(this));



        }

        public class ImageAdapterGridView extends BaseAdapter {
             Context context;

            public ImageAdapterGridView(Context c) {
                context = c;
            }

            public int getCount() {
                return imageIDs.length;
            }

            public Object getItem(int position) {
                return null;
            }

            public long getItemId(int position) {
                return 0;
            }

            public View getView(int position, View convertView, ViewGroup parent) {
                ImageView img;

                if (convertView == null) {
                    img = new ImageView(context);
                    img.setLayoutParams(new GridView.LayoutParams(130, 130));
                    img.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    img.setPadding(16, 16, 16, 16);
                } else {
                    img = (ImageView) convertView;
                }
                Bitmap myBitmap = BitmapFactory.decodeFile(imageIDs[position].getAbsolutePath());
                img.setImageBitmap(myBitmap);
                return img;
            }
        }
    }


