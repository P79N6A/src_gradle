package com.mapbox.mapboxsdk;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static volatile boolean f26462a;

    public static void a(String str) {
        if (f26462a) {
            throw new c(str);
        }
    }

    public static void a(Exception exc) {
        if (f26462a) {
            throw new c(String.format("%s", new Object[]{exc}));
        }
    }

    public static synchronized void a(boolean z) {
        synchronized (b.class) {
            f26462a = z;
        }
    }

    public static void a(String str, Exception exc) {
        if (f26462a) {
            throw new c(String.format("%s - %s", new Object[]{str, exc}));
        }
    }
}
