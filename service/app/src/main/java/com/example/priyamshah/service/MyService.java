package com.example.priyamshah.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }
    int count=0;

    //@Override
//    public int onStartCommand(Intent intent,int flag,int startId)
//    {
//        count++;
//        Toast.makeText(this,"Counter"+count,Toast.LENGTH_LONG).show();
//        return START_REDELIVER_INTENT;
//
//    }
public int getCount()
    {
        return ++count;
    }
    class MyBinder extends Binder{
        MyService getService()
        {
            return MyService.this;
        }
    }
    @Override
    public IBinder onBind(Intent intent) {
       return new MyBinder();
    }
}
