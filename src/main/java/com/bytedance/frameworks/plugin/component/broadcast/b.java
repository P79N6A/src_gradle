package com.bytedance.frameworks.plugin.component.broadcast;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.pm.c;
import java.util.List;

public final class b {
    public static void a(String str, ClassLoader classLoader, List<c> list) {
        boolean z;
        if (list != null && list.size() != 0) {
            PackageManager packageManager = e.a().getPackageManager();
            boolean i = c.i(str);
            for (c next : list) {
                if (!i) {
                    String packageName = e.a().getPackageName();
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName(packageName, next.f2185a));
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 16842752);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                    }
                }
                try {
                    BroadcastReceiver broadcastReceiver = (BroadcastReceiver) classLoader.loadClass(next.f2185a).newInstance();
                    for (IntentFilter registerReceiver : next.f2186b) {
                        e.a().registerReceiver(broadcastReceiver, registerReceiver);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
