package com.tencent.open.d;

import android.content.Context;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static Context f79734a;

    public static final Context a() {
        if (f79734a == null) {
            return null;
        }
        return f79734a;
    }

    public static final String b() {
        if (a() == null) {
            return "";
        }
        return a().getPackageName();
    }

    public static final void a(Context context) {
        f79734a = context;
    }
}
