package com.bytedance.apm.j;

import android.os.Handler;
import android.os.Looper;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile Handler f19034a = new Handler(Looper.getMainLooper());

    public static Handler a() {
        return f19034a;
    }
}
