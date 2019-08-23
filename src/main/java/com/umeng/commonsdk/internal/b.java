package com.umeng.commonsdk.internal;

import android.content.Context;

public class b {

    /* renamed from: b  reason: collision with root package name */
    private static b f80743b;

    /* renamed from: a  reason: collision with root package name */
    private Context f80744a;

    /* renamed from: c  reason: collision with root package name */
    private c f80745c;

    public c a() {
        return this.f80745c;
    }

    private b(Context context) {
        this.f80744a = context;
        this.f80745c = new c(context);
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (b.class) {
            if (f80743b == null) {
                f80743b = new b(context.getApplicationContext());
            }
            bVar = f80743b;
        }
        return bVar;
    }
}
