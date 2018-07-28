package com.example.priyamshah.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    TextView textView;Intent int1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        IntentFilter inf1 = new IntentFilter("com.say.broadcast");
        int1 = new Intent(this,secondActivity.class);
        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {

                PendingIntent pi = PendingIntent.getActivity(context, 101, int1, PendingIntent.FLAG_ONE_SHOT);
                NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                Notification note = new Notification.Builder(context)
                        .setContentTitle("Whatsapp")
                        .setContentText("Hey there i am messaging you!")
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setContentIntent(pi)
                        .build();
                nm.notify(1, note);
            }
        }, inf1);

    }

    public void send(View v) {
        sendBroadcast(new Intent("com.say.broadcast"), null);
    }
    }

