package com.bytedance.apm.internal;

import android.content.SharedPreferences;
import com.bytedance.apm.c;
import com.bytedance.apm.core.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f2038a;

    /* renamed from: com.bytedance.apm.internal.a$a  reason: collision with other inner class name */
    static class C0140a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19033a = new a((byte) 0);
    }

    public static a a() {
        return C0140a.f19033a;
    }

    private a() {
        this.f2038a = d.a(c.a(), "monitor_config");
    }

    /* synthetic */ a(byte b2) {
        this();
    }
}
