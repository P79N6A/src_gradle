package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;

public class m extends a {

    /* renamed from: b  reason: collision with root package name */
    private Context f80971b;

    public String f() {
        try {
            Class<?> cls = Class.forName("com.umeng.commonsdk.internal.utils.SDStorageAgent");
            if (cls == null) {
                return null;
            }
            return (String) cls.getMethod("getUmtt1", new Class[]{Context.class}).invoke(cls, new Object[]{this.f80971b});
        } catch (Throwable unused) {
            return null;
        }
    }

    public m(Context context) {
        super("umtt1");
        this.f80971b = context;
    }
}
