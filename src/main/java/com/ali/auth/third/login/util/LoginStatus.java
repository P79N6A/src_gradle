package com.ali.auth.third.login.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.ali.auth.third.core.trace.SDKLogger;
import com.ali.auth.third.core.util.CommonUtils;
import java.util.concurrent.atomic.AtomicBoolean;

public class LoginStatus {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static AtomicBoolean f5044a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private static Context f5045b;

    /* renamed from: c  reason: collision with root package name */
    private static BroadcastReceiver f5046c;

    private static void b() {
        if (f5045b != null && f5046c != null) {
            Intent intent = new Intent("NOTIFY_LOGIN_STATUS_CHANGE");
            intent.putExtra("currentProcess", CommonUtils.getCurrentProcessName());
            intent.putExtra("isLogining", f5044a.get());
            intent.setPackage(f5045b.getPackageName());
            f5045b.sendBroadcast(intent);
        }
    }

    public static synchronized boolean compareAndSetLogining(boolean z, boolean z2) {
        boolean compareAndSet;
        synchronized (LoginStatus.class) {
            compareAndSet = f5044a.compareAndSet(z, z2);
            if (!compareAndSet || !z || !z2) {
                b();
            }
        }
        return compareAndSet;
    }

    public static void init(Context context) {
        f5045b = context;
        f5046c = new a();
        f5045b.registerReceiver(f5046c, new IntentFilter("NOTIFY_LOGIN_STATUS_CHANGE"));
    }

    public static boolean isLogining() {
        return f5044a.get();
    }

    public static void resetLoginFlag() {
        SDKLogger.w("login.LoginStatus", "reset login status");
        if (f5044a.compareAndSet(true, false)) {
            b();
        }
    }
}
