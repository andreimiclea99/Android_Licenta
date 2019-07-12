package com.example.timisoara;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.widget.Toast;

public class Notification_reciever extends BroadcastReceiver {
    private static final String TAG ="Notification_reciever" ;

    public void onReceive(Context context, Intent intent){
     Toast.makeText(context,"Your answer is: " ,
             Toast.LENGTH_LONG).show();
     NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
     Intent repeating_intent = new Intent(context,Teatru.class);
     repeating_intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
     PendingIntent pendingIntent = PendingIntent.getActivity(context,100,repeating_intent,PendingIntent.FLAG_UPDATE_CURRENT);

     android.support.v4.app.NotificationCompat.Builder builder =  new NotificationCompat.Builder(context, "M_CH_ID")
             .setContentIntent(pendingIntent)
             .setSmallIcon(android.R.drawable.arrow_up_float)
             .setContentTitle("Titlu")
             .setContentText("text")
             .setPriority(NotificationCompat.PRIORITY_HIGH)
             .setCategory(NotificationCompat.CATEGORY_MESSAGE)
             .setColor(Color.BLUE)
             .setAutoCancel(true);

            notificationManager.notify(100,builder.build());
     Log.d(TAG, "Testulet");
     if (intent.getAction().equals("MY_NOTIFICATION_MESSAGE")) {
         notificationManager.notify(100,builder.build());}
 }
}
