package com.example.priyamshah.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Intent int1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Intent i=new Intent(Telephony.Sms.Intents.ACTION_CHANGE_DEFAULT, Uri.parse("com.example.priyamshah.notification"));

        IntentFilter inf = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {



                    for (SmsMessage smsMessage : Telephony.Sms.Intents.getMessagesFromIntent(intent)) {
                        String messageBody = smsMessage.getMessageBody();
                       Toast.makeText(context, messageBody, Toast.LENGTH_LONG).show();
                        TextView t=(TextView)findViewById(R.id.textView);
                        t.setText(messageBody);
                    }

            }
        }, inf);
    }
}
