package com.example.priyamshah.app3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);
         t=(EditText) findViewById(R.id.editText);
    }
    public void submit(View v)
    {

        String s=t.getText().toString();
        Intent intent=new Intent(this,SecondActivity.class);
        //Intent intent=new Intent("say.hello");
        //Intent intent=new Intent(Intent.ACTION_DIAL);
       // Intent intent=new Intent(Intent.ACTION_SCREEN_OFF);
        intent.putExtra("username",s);
        startActivityForResult(intent,21);


    }
    @Override
    protected void onActivityResult(int req,int res,Intent i)
    {
        String p=i.getStringExtra("name");
        t.setText(p);
    }
}
