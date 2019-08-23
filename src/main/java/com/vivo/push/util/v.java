package com.vivo.push.util;

import android.content.Context;

public final class v extends a {

    /* renamed from: b  reason: collision with root package name */
    private static v f81689b;

    public static synchronized v b() {
        v vVar;
        synchronized (v.class) {
            if (f81689b == null) {
                f81689b = new v();
            }
            vVar = f81689b;
        }
        return vVar;
    }

    public final void a(Context context) {
        if (this.f81651a == null) {
            this.f81651a = context;
            a(context, "com.vivo.push_preferences");
        }
    }
}
