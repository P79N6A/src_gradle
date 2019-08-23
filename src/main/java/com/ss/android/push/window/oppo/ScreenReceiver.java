package com.ss.android.push.window.oppo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.Logger;

public class ScreenReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            String action = intent.getAction();
            Logger.debug();
            if ("android.intent.action.USER_PRESENT".equals(action) && c.a(context).a() && c.a(context).m) {
                c.a(context).c();
            }
        } catch (Exception unused) {
            Logger.debug();
        }
    }
}
