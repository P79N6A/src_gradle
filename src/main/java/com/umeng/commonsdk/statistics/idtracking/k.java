package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;

public class k extends a {

    /* renamed from: b  reason: collision with root package name */
    private Context f80969b;

    public String f() {
        try {
            Class<?> cls = Class.forName("com.umeng.commonsdk.internal.utils.SDStorageAgent");
            if (cls == null) {
                return null;
            }
            return (String) cls.getMethod("getUmtt5", new Class[]{Context.class}).invoke(cls, new Object[]{this.f80969b});
        } catch (Throwable unused) {
            return null;
        }
    }

    public k(Context context) {
        super("umtt5");
        this.f80969b = context;
    }
}
