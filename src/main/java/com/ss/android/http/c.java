package com.ss.android.http;

import android.content.Context;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    private static c f29158b;

    /* renamed from: a  reason: collision with root package name */
    public PushMultiProcessSharedProvider.b f29159a = PushMultiProcessSharedProvider.a(this.f29160c);

    /* renamed from: c  reason: collision with root package name */
    private Context f29160c;

    public final int a() {
        return this.f29159a.a("http_monitor_port", 0);
    }

    public final boolean b() {
        if (a() > 1024) {
            return true;
        }
        return false;
    }

    private c(Context context) {
        this.f29160c = context.getApplicationContext();
    }

    public static synchronized c a(Context context) {
        c cVar;
        synchronized (c.class) {
            if (f29158b == null) {
                f29158b = new c(context);
            }
            cVar = f29158b;
        }
        return cVar;
    }
}
