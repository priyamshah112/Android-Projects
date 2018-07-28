package com.example.priyamshah.service;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.priyamshah.myserviceapplication.MyInterface;

public class MainActivity extends AppCompatActivity {
TextView textView;
//MyService myService;
    MyInterface m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Intent in=new Intent(this,MyService.class);
        Intent in=new Intent();
        in.setClassName("com.example.priyamshah.myserviceapplication","com.example.priyamshah.myserviceapplication.MyService1");

        bindService(in,new ServiceConnection(){

            @Override
            public void onServiceConnected(ComponentName name, IBinder service) {
//                MyService.MyBinder binder=(MyService.MyBinder)(service);
//                myService=binder.getService();
               m= MyInterface.Stub.asInterface(service);
            }

            @Override
            public void onServiceDisconnected(ComponentName name) {

            }
        },BIND_AUTO_CREATE);
        textView =(TextView)findViewById(R.id.textview);
    }
//   public void getCount(View v)
//   {
//       Intent in=new Intent(this,MyService.class);
//      startService(in);
//   }
    public void getCount(View v)
    {

        try {
            textView.setText(m.getCount()+"");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
