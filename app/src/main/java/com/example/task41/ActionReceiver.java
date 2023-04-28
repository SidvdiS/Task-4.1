package com.example.task41;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ActionReceiver extends BroadcastReceiver {

    public void onReceive(Context context, Intent intent) {
        System.out.println("Stop Button Pressed!");
        MainActivity.stop = true;
        //This is used to close the notification tray
        Intent it = new Intent(Intent.ACTION_CLOSE_SYSTEM_DIALOGS);
        context.sendBroadcast(it);
    }
}
