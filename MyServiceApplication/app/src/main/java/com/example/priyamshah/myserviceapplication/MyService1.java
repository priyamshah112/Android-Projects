package com.example.priyamshah.myserviceapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MyService1 extends Service {
    public MyService1() {
    }
    int count=100;

    @Override
    public IBinder onBind(Intent intent) {
       return new MyInterface.Stub(){

           @Override
           public int getCount() throws RemoteException {
               return ++count;
           }
       };


}}
