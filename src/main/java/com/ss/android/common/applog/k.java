package com.ss.android.common.applog;

import com.ss.a.b.e;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private static final String f28178a = k.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f28179b = false;

    static {
        try {
            e.a(GlobalContext.getContext(), "cms");
        } catch (Exception unused) {
        }
    }

    public static synchronized void a() {
        synchronized (k.class) {
            if (!f28179b) {
                f28179b = true;
            }
        }
    }
}
