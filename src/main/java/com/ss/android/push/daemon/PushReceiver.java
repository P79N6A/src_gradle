package com.ss.android.push.daemon;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class PushReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        d.a(context);
    }
}
