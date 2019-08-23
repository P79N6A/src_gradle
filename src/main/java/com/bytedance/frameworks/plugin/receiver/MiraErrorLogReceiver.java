package com.bytedance.frameworks.plugin.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.f.g;

public class MiraErrorLogReceiver extends BroadcastReceiver {
    public static void a(String str, Throwable th) {
        Intent intent = new Intent("com.bytedance.frameworks.plugin.ACTION_SEND_LOG_TO_MAIN_PROCESS");
        intent.putExtra("EXTRA_MESSAGE", str);
        intent.putExtra("EXTRA_THROWABLE", th);
        e.a().sendBroadcast(intent);
    }

    public void onReceive(Context context, Intent intent) {
        if (context != null && intent != null) {
            String action = intent.getAction();
            String stringExtra = intent.getStringExtra("EXTRA_MESSAGE");
            Throwable th = (Throwable) intent.getSerializableExtra("EXTRA_THROWABLE");
            if ("com.bytedance.frameworks.plugin.ACTION_SEND_LOG_TO_MAIN_PROCESS".equals(action)) {
                g.a(stringExtra, th);
            }
        }
    }
}
