package com.example.priyamshah.app4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String k=" ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent in=getIntent();
        k=in.getStringExtra("username");

        TextView t=(TextView)findViewById(R.id.textView);
        t.setText("\t Hello "+ k);}


    @Override
    public void finish()
    {
        Intent l=new Intent();
        l.putExtra("name",k.toUpperCase()+"From 2nd App");
        setResult(23,l);
        super.finish();

    }
}
