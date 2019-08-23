package com.umeng.message;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.umeng.message.common.UmengMessageDeviceConfig;
import com.umeng.message.proguard.h;

public class NetworkReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        boolean isOnline = UmengMessageDeviceConfig.isOnline(context);
        boolean c2 = h.c(context, "com.umeng.message.UmengLocationService");
        if (!isOnline && c2) {
            Intent intent2 = new Intent();
            intent2.setAction("com.umeng.message.lbs.action");
            intent2.setPackage(context.getPackageName());
            intent2.putExtra("stopTimer", true);
        }
        if (isOnline && c2) {
            Intent intent3 = new Intent();
            intent3.setAction("com.umeng.message.lbs.action");
            intent3.setPackage(context.getPackageName());
        }
    }
}
