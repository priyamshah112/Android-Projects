package com.example.priyamshah.mytestapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.graphics.Color;

import static android.graphics.Color.rgb;

public class MyMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_main);
    }
    public void click(View v)
    {
        EditText t=(EditText) findViewById(R.id.editText2);
        EditText p=(EditText) findViewById(R.id.editText3);
        EditText q=(EditText) findViewById(R.id.editText4);
        //t.setText("Hello \t"+t.getText().toString()+" !");
        int i=Integer.parseInt(t.getText().toString());
        int j=Integer.parseInt(p.getText().toString());
        int k=Integer.parseInt(q.getText().toString());

        int m=rgb(i,j,k);
       View v1=findViewById(R.id.layout);
       //View v1=this.getWindow().getDecorView();
        v1.setBackgroundColor(m);

    }

}
