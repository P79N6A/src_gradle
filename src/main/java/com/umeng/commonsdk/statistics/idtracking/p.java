package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;

public class p extends a {

    /* renamed from: b  reason: collision with root package name */
    private Context f80974b;

    public String f() {
        try {
            Class<?> cls = Class.forName("com.umeng.commonsdk.internal.utils.SDStorageAgent");
            if (cls == null) {
                return null;
            }
            return (String) cls.getMethod("getUmtt0", new Class[]{Context.class}).invoke(cls, new Object[]{this.f80974b});
        } catch (Throwable unused) {
            return null;
        }
    }

    public p(Context context) {
        super("umtt0");
        this.f80974b = context;
    }
}
