package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.ip;
import com.xiaomi.push.service.ag;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f81782a;

    c(Context context) {
        this.f81782a = context;
    }

    public final void run() {
        if (b.a(this.f81782a)) {
            String a2 = b.b(ag.a(this.f81782a).a(ip.AggregationSdkMonitorDepth.a(), 4));
            if (!TextUtils.isEmpty(a2)) {
                MiTinyDataClient.upload(this.f81782a, "monitor_upload", "call_stack", 1, a2);
                b.b(this.f81782a);
            }
        }
    }
}
