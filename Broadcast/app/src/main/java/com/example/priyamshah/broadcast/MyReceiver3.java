package com.example.priyamshah.broadcast;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver3 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        //throw new UnsupportedOperationException("Not yet implemented");
       // NotificationManager nm=(NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        Notification note=new Notification.Builder(context)
                .setContentTitle("Someone called")
                .setContentText("Whatsapp")
                .setSmallIcon(R.mipmap.ic_launcher)

                .build();
       // nm.notify(1,note);

    }
}
