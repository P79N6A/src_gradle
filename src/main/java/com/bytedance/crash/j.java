package com.bytedance.crash;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.crash.runtime.a;
import com.bytedance.crash.runtime.b;
import com.bytedance.crash.runtime.k;
import java.util.concurrent.ConcurrentHashMap;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    static Context f19482a = null;

    /* renamed from: b  reason: collision with root package name */
    static long f19483b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static String f19484c = "default";

    /* renamed from: d  reason: collision with root package name */
    public static boolean f19485d;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: e  reason: collision with root package name */
    static a f19486e;

    /* renamed from: f  reason: collision with root package name */
    public static volatile ConcurrentHashMap<Integer, String> f19487f;
    public static volatile int g;
    public static volatile String h;
    private static b i = new b();
    private static b j = new b();
    private static k k = null;

    public static a a() {
        return f19486e;
    }

    public static b b() {
        return j;
    }

    public static Context d() {
        return f19482a;
    }

    public static b e() {
        return i;
    }

    public static long f() {
        return f19483b;
    }

    public static k c() {
        if (k == null) {
            synchronized (j.class) {
                k = new k(f19482a);
            }
        }
        return k;
    }
}
