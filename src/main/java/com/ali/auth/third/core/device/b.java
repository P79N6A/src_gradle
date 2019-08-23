package com.ali.auth.third.core.device;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.ss.android.ugc.aweme.q.c;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f4926a;

    b(Context context) {
        this.f4926a = context;
    }

    public final void run() {
        try {
            SharedPreferences.Editor edit = c.a(this.f4926a, "auth_sdk_device", 0).edit();
            edit.putString("deviceId", DeviceInfo.deviceId);
            if (Build.VERSION.SDK_INT >= 9) {
                edit.apply();
            } else {
                edit.commit();
            }
        } catch (Throwable unused) {
        }
    }
}
