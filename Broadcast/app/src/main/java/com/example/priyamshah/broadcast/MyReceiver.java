package com.example.priyamshah.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver(){

    }
    @Override
    public void onReceive(Context context, Intent intent) {
       Toast toast= Toast.makeText(context,"Receiver 1",Toast.LENGTH_LONG);
       toast.show();
    }

}
