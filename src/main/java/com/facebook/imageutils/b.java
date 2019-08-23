package com.facebook.imageutils;

import com.facebook.soloader.SoLoader;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static a f2352a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f2353b;

    public interface a {
        void a(String str);
    }

    public static void a(boolean z) {
        f2353b = z;
    }

    public static void a(String str) {
        if (f2353b) {
            SoLoader.loadLibrary(str);
        } else if (f2352a != null) {
            f2352a.a(str);
        } else {
            System.loadLibrary(str);
        }
    }
}
