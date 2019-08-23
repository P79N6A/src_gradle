package com.ss.android.ugc.aweme.main;

public final class by {

    /* renamed from: a  reason: collision with root package name */
    private static int f54667a;

    public static synchronized int a() {
        int i;
        synchronized (by.class) {
            i = f54667a;
        }
        return i;
    }

    public static synchronized void b() {
        synchronized (by.class) {
            f54667a++;
        }
    }

    public static synchronized void c() {
        synchronized (by.class) {
            f54667a--;
        }
    }
}
