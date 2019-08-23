package com.taobao.accs.a;

import android.content.Context;
import android.content.Intent;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.k;

public class a {
    public static final String TAG = "a";

    public static void a(Context context, Intent intent, boolean z) {
        if (context == null || intent == null) {
            ALog.e(TAG, "dispatchIntent context or intent is null", new Object[0]);
            return;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            if (k.a(applicationContext)) {
                ALog.i(TAG, "dispatchIntent bind service start", "intent", intent.toString());
                applicationContext.bindService(intent, new b(intent, z, applicationContext), 1);
                return;
            }
            ALog.i(TAG, "dispatchIntent start service ", new Object[0]);
            applicationContext.startService(intent);
        } catch (Exception e2) {
            ALog.e(TAG, "dispatchIntent method call with exception ", e2.toString());
        }
    }
}
