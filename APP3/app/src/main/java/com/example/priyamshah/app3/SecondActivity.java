package com.example.priyamshah.app3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
String k=" ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_second);

        Intent in=getIntent();
         k=in.getStringExtra("username");

        TextView t=(TextView)findViewById(R.id.textView);
        t.setText("\t Hello "+ k);}


@Override
        public void finish()
    {
        Intent l=new Intent();
        l.putExtra("name",k.toUpperCase());
        setResult(23,l);
        super.finish();

    }

    }


