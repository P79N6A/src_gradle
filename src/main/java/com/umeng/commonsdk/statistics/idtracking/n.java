package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;

public class n extends a {

    /* renamed from: b  reason: collision with root package name */
    private Context f80972b;

    public String f() {
        try {
            Class<?> cls = Class.forName("com.umeng.commonsdk.internal.utils.SDStorageAgent");
            if (cls == null) {
                return null;
            }
            return (String) cls.getMethod("getUmtt3", new Class[]{Context.class}).invoke(cls, new Object[]{this.f80972b});
        } catch (Throwable unused) {
            return null;
        }
    }

    public n(Context context) {
        super("umtt3");
        this.f80972b = context;
    }
}
