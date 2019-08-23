package com.ss.android.article.base.feature.plugin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.frameworks.plugin.f.g;
import com.ss.android.h.c;
import com.ss.android.h.f;

public class PluginReportReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            if (intent.getAction().equals("com.bytedance.frameworks.plugin.ACTION_REPORTER")) {
                Bundle extras = intent.getExtras();
                if (extras != null && !extras.isEmpty()) {
                    extras.getInt("status");
                    extras.getString("message");
                    extras.getString("packageName");
                    extras.getInt("versionCode");
                    extras.getString("duration");
                    c cVar = f.a(context).f29128e;
                }
            }
        } catch (Throwable th) {
            g.a("WTF...", th);
        }
    }
}
