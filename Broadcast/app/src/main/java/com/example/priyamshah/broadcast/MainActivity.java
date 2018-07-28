package com.example.priyamshah.broadcast;

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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* IntentFilter inf=new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                Toast.makeText(context,"Aeroplane mode on !",Toast.LENGTH_LONG).show();
            }
        },inf);
        IntentFilter inf1=new IntentFilter(Intent.ACTION_POWER_CONNECTED);
        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                Toast.makeText(context,"Charger mode on !",Toast.LENGTH_LONG).show();
            }
        },inf1);*/
        IntentFilter inf1=new IntentFilter("com.say.broadcast");
        inf1.setPriority(1);
        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                Toast.makeText(context,"Receiver 3!",Toast.LENGTH_LONG).show();
            }
        },inf1);


        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                Intent int1=new Intent(Intent.ACTION_DIAL);
                PendingIntent pi=PendingIntent.getActivity(context,101,int1,PendingIntent.FLAG_ONE_SHOT);
                NotificationManager nm=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                Notification note=new Notification.Builder(context)
                        .setContentTitle("Someone called")
                        .setContentText("Whatsapp")
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setContentIntent(pi)
                        .build();
                nm.notify(1,note);
            }
        },inf1);


    }
    public void click(View v)
    {
        sendOrderedBroadcast(new Intent("com.say.broadcast"),null);
    }
}
