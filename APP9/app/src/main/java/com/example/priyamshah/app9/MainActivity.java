package com.example.priyamshah.app9;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

public class MainActivity extends AppCompatActivity {
String array[]={"apple","mango","gauva"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //Create Layout using xml and modify with java
       /* LayoutInflater inflater=(LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        final LinearLayout lm=(LinearLayout)inflater.inflate(R.layout.activity_main,null);
        Button b=new Button(this);
        b.setText("Click Here");
        b.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        b.setPadding(20,20,20,20);
        b.setGravity(Gravity.CENTER);
        lm.addView(b);
        b.setOnClickListener(new View.OnClickListener() {

                                 @Override
                                 public void onClick(View v) {
                                     EditText t1 = (EditText) lm.findViewById(R.id.editText);
                                     EditText t2 = (EditText) lm.findViewById(R.id.editText2);
                                     Toast.makeText(getApplicationContext(), t1.getText().toString() + t2.getText().toString(), Toast.LENGTH_LONG).show();

                                 }
                             });*/
        setContentView(R.layout.ls);
        ListView lv=(ListView)findViewById(R.id.list_view);
       // lv.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,array));
        lv.setAdapter(new MyArrayAdapter(this,R.layout.linearimage,array));
        /* //Create Layout using java
            LinearLayout layout=new LinearLayout(this);
            layout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            layout.setOrientation(LinearLayout.VERTICAL);
            final EditText et=new EditText(this);
            et.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, WRAP_CONTENT));

            Button b=new Button(this);
            b.setText("Click Here");
            b.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
            b.setPadding(20,20,20,20);
            b.setGravity(Gravity.CENTER);
            layout.addView(et);
            layout.addView(b);

            setContentView(layout);
            b.setOnClickListener(new View.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                           String o= et.getText().toString();
                            Toast.makeText(MainActivity.this,o, Toast.LENGTH_LONG).show();

                    }


            });*/

    }
    class MyArrayAdapter extends ArrayAdapter<String>{
        int id;
        MyArrayAdapter(Context context,int id,String array[])
        {

            super(context,id,array);
        this.id=id;
        }
        @Override
        public View getView(int position,View convertView,ViewGroup parent)
        {
            LayoutInflater inflater=(LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
            LinearLayout v=(LinearLayout)inflater.inflate(id,null);


            ImageView img=(ImageView)v.findViewById(R.id.imageView2);
            img.setImageResource(R.mipmap.ic_launcher);

            TextView t=(TextView)v.findViewById(R.id.textView2);
            t.setText(array[position]);
            v.setBackgroundColor(Color.BLUE);

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String s=((TextView)v.findViewById(R.id.textView2)).getText().toString();
                    Toast.makeText(getContext(),s,Toast.LENGTH_SHORT).show();
                }
            });
            return v;
        }
    }
}

