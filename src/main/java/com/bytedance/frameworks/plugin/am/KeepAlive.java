package com.bytedance.frameworks.plugin.am;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.bytedance.frameworks.plugin.e;

public class KeepAlive extends Service {

    public static final class InnerService extends Service {
        public final IBinder onBind(Intent intent) {
            return null;
        }

        public final void onDestroy() {
            super.onDestroy();
            stopForeground(true);
        }

        public final void onCreate() {
            super.onCreate();
            startForeground(32, new Notification());
            stopSelf();
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        stopForeground(true);
    }

    public static void a() {
        e.a().stopService(new Intent(e.a(), KeepAlive.class));
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 18) {
            startService(new Intent(this, InnerService.class));
        }
        startForeground(32, new Notification());
    }
}
