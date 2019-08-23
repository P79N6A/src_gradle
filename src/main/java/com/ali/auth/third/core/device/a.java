package com.ali.auth.third.core.device;

import android.content.Context;
import com.ali.auth.third.core.trace.SDKLogger;
import com.ss.android.ugc.aweme.q.c;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f4925a;

    a(Context context) {
        this.f4925a = context;
    }

    public final void run() {
        try {
            DeviceInfo.deviceId = c.a(this.f4925a, "auth_sdk_device", 0).getString("deviceId", "");
            SDKLogger.e("", "DeviceInfo.deviceId = " + DeviceInfo.deviceId);
        } catch (Throwable unused) {
        }
    }
}
