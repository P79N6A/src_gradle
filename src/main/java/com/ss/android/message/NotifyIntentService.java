package com.ss.android.message;

import android.app.IntentService;
import android.app.Notification;
import android.content.Intent;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.b.h;
import com.ss.android.pushmanager.setting.b;

public class NotifyIntentService extends IntentService {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29803a;

    public void onHandleIntent(Intent intent) {
    }

    public NotifyIntentService() {
        super("NotifyIntentService");
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f29803a, false, 17857, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29803a, false, 17857, new Class[0], Void.TYPE);
            return;
        }
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        super.onDestroy();
    }

    public void onCreate() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f29803a, false, 17856, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29803a, false, 17856, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        try {
            if (Build.VERSION.SDK_INT >= 18 && b.a().s()) {
                if (h.c() && h.b()) {
                    z = true;
                }
                if (!z) {
                    startForeground(1, new Notification.Builder(getApplicationContext()).setSmallIcon(2130840575).build());
                }
            }
        } catch (Throwable unused) {
        }
    }
}
