package com.example.priyamshah.converter;

import android.provider.MediaStore;
import android.renderscript.Float4;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText a;
Button b1;
RadioButton c,f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText a=(EditText)findViewById(R.id.editText1);
        Button b1=(Button)findViewById(R.id.button1);
        RadioButton c=(RadioButton)findViewById(R.id.radio0);
        RadioButton f=(RadioButton)findViewById(R.id.radio1);
    }
    void Convert(View v)
    {
        if(c.isChecked())
        {
           float n= Float.parseFloat(a.getText().toString());
           float ans=((n*9)/5)+32;
           a.setText(ans+"");
        }
        else
        {
            float n= Float.parseFloat(a.getText().toString());
            float ans=((n-32)*5)/9;
            a.setText(ans+"");
        }
    }




}