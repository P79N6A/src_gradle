package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;

public class l extends a {

    /* renamed from: b  reason: collision with root package name */
    private Context f80970b;

    public String f() {
        try {
            Class<?> cls = Class.forName("com.umeng.commonsdk.internal.utils.SDStorageAgent");
            if (cls == null) {
                return null;
            }
            return (String) cls.getMethod("getUmtt4", new Class[]{Context.class}).invoke(cls, new Object[]{this.f80970b});
        } catch (Throwable unused) {
            return null;
        }
    }

    public l(Context context) {
        super("umtt4");
        this.f80970b = context;
    }
}
