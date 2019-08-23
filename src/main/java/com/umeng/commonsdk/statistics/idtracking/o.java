package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;

public class o extends a {

    /* renamed from: b  reason: collision with root package name */
    private Context f80973b;

    public String f() {
        try {
            Class<?> cls = Class.forName("com.umeng.commonsdk.internal.utils.SDStorageAgent");
            if (cls == null) {
                return null;
            }
            return (String) cls.getMethod("getUmtt2", new Class[]{Context.class}).invoke(cls, new Object[]{this.f80973b});
        } catch (Throwable unused) {
            return null;
        }
    }

    public o(Context context) {
        super("umtt2");
        this.f80973b = context;
    }
}
