package com.taobao.agoo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.taobao.accs.client.a;

public class AgooCommondReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            intent.setClassName(context, a.a(context.getPackageName()));
            com.taobao.accs.a.a.a(context, intent, true);
        } catch (Throwable unused) {
        }
    }
}